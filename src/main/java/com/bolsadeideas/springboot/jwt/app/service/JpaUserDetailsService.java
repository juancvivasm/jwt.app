package com.bolsadeideas.springboot.jwt.app.service;

import com.bolsadeideas.springboot.jwt.app.entity.Role;
import com.bolsadeideas.springboot.jwt.app.entity.User;
import com.bolsadeideas.springboot.jwt.app.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service("jpaUserDetailsService")
@Transactional(readOnly = true)
public class JpaUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    private Logger logger = LoggerFactory.getLogger(JpaUserDetailsService.class);

    public JpaUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User usuario = userRepository.findByUsername(username);
        if(usuario == null){
            logger.error("Error Login: El usuario: "+username+" no existe");
            throw new UsernameNotFoundException("Username: "+username+" no existe en el sistema!");
        }

        List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
        for (Role role: usuario.getRoles()) {
            logger.info("Role: ".concat(role.getAuthority()));
            authorities.add(new SimpleGrantedAuthority(role.getAuthority()));
        }
        if(authorities.isEmpty()){
            logger.error("Error Login: El usuario: "+username+" no tiene roles asignados !");
            throw new UsernameNotFoundException("Username: "+username+" no tiene roles asignados !");
        }

        return new org.springframework.security.core.userdetails.User(usuario.getUsername(), usuario.getPassword(), usuario.getEnabled(), true, true, true, authorities);
    }
}
