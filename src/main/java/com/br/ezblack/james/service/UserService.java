package com.br.ezblack.james.service;

import com.br.ezblack.james.model.User;
import com.br.ezblack.james.repository.RepositoryGreeting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class UserService {

    @Autowired
    private RepositoryGreeting repositoryGreeting;

    public List<User> getAllUsers() {
        return repositoryGreeting.findAll();
    }

    public Optional<User> getUserById(Long id) {
        return repositoryGreeting.findById(id);
    }

    public User createUser(User user) {
        return repositoryGreeting.save(user);
    }

    public Optional<User> updateUser(Long id, User user) {
        return repositoryGreeting.update(id, user);
    }

    public boolean deleteUser(Long id) {
        return repositoryGreeting.delete(id);
    }
}