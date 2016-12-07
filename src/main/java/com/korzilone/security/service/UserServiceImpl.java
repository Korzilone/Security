package com.korzilone.security.service;

import com.korzilone.security.dao.RoleDAO;
import com.korzilone.security.dao.UserDAO;
import com.korzilone.security.model.Role;
import com.korzilone.security.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by a.korzilova on 02.12.2016.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDAO userDAO;
    @Autowired
    private RoleDAO roleDAO;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        Set<Role> roles = new HashSet<Role>();
        roles.add(roleDAO.getOne(1L));
        user.setRoles(roles);
        userDAO.save(user);
    }

    public User findByUsername(String username) {
        return userDAO.findByUserName(username );
    }
}
