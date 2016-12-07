package com.korzilone.security.dao;

import com.korzilone.security.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by a.korzilova on 02.12.2016.
 */
public interface RoleDAO extends JpaRepository<Role, Long> {
}
