package com.bolsadeideas.springboot.jwt.app.security;

import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

public class CustomHeaderValidatorFilter extends OncePerRequestFilter {

    private static final Logger log = LoggerFactory.getLogger
            (CustomHeaderValidatorFilter.class);

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        log.info("Custom filter called...");
        String header = request.getHeader(SecurityConstants.HEADER_STRING);
        log.info(header);

        if (header == null || !header.startsWith(SecurityConstants.TOKEN_PREFIX)) {
            filterChain.doFilter(request, response);
            return;
        }

    }
}
