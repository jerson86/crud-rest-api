package com.test.demo.services;

import com.test.demo.model.User;
import com.test.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    public UserServiceImpl(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<User> findAll() {
        List<User> list = new ArrayList<>();
        repository.findAll().forEach(list::add);
        return list;
    }

    @Override
    public Optional<User> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public User save(User user) {
        return repository.save(user);
    }

    @Override
    public Optional<User> update(Long id, User user) {
        return repository.findById(id).map(existing -> {
            existing.setName(user.getName());
            existing.setEmail(user.getEmail());
            return repository.save(existing);
        });
    }

    @Override
    public boolean deleteById(Long id) {
        return repository.findById(id).map(u -> {
            repository.deleteById(id);
            return true;
        }).orElse(false);
    }
}
