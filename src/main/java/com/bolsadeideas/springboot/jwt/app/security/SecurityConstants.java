package com.bolsadeideas.springboot.jwt.app.security;

public class SecurityConstants {
    public static final String SECRET = "0ur5ecretKeyF0r5ignThisPr0jectUsingJwtMustBeL0ngEn0ughT0W0rkJC42";
    public static final long EXPIRATION_TIME = 60_000; // 1min. (864_000_000) Milsegundo -> 10 days
    public static final String TOKEN_PREFIX = "Bearer ";
    public static final String HEADER_STRING = "Authorization";
    public static final String SIGN_IN = "/api/login";
    public static final String SIGN_UP_URL = "/api/user/create";
}
