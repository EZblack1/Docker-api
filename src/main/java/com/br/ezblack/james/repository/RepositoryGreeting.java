package com.br.ezblack.james.repository;

import com.br.ezblack.james.model.User;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class RepositoryGreeting {
    private final Map<Long, User> users = new HashMap<>();
    private Long nextId = 1L;

    public List<User> findAll() {
        return new ArrayList<>(users.values());
    }

    public Optional<User> findById(Long id) {
        return Optional.ofNullable(users.get(id));
    }

    public User save(User greeting) {
        greeting.setId(nextId++);
        users.put(greeting.getId(), greeting);
        return greeting;
    }

    public Optional<User> update(Long id, User user) {
        if (users.containsKey(id)) {
            user.setId(id);
            users.put(id, user);
            return Optional.of(user);
        }
        return Optional.empty();
    }

    public boolean delete(Long id) {
        return users.remove(id) != null;
    }
}