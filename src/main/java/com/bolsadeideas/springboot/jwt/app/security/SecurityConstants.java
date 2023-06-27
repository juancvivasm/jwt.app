package com.bolsadeideas.springboot.jwt.app.security;

public class SecurityConstants {
    public static final String SECRET = "oursecretkey";
    public static final long EXPIRATION_TIME = 60_000; // 1min. (864_000_000) Milsegundo -> 10 days
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_UP_URL = "/api/user/create";
}