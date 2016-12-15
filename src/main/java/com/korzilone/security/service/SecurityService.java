package com.korzilone.security.service;

/**
 * Created by a.korzilova on 02.12.2016.
 * Service for Security.
 */
public interface SecurityService {
    String findLoggedInUsername();
    void autoLogin(String username, String password);
}
