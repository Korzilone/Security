package com.korzilone.security.service;

import com.korzilone.security.model.User;

/**
 * Created by a.korzilova on 02.12.2016.
 */
public interface UserService {
    void save(User user);
    User findByUsername(String username);
}
