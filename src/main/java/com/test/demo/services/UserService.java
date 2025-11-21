package com.test.demo.services;

import com.test.demo.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> findAll();
    Optional<User> findById(Long id);
    User save(User user);
    Optional<User> update(Long id, User user);
    boolean deleteById(Long id);
}
