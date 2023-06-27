package com.bolsadeideas.springboot.jwt.app.repository;

import com.bolsadeideas.springboot.jwt.app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User findByUsername(String username);

}
