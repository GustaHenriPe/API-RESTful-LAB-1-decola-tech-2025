package com.dio.decola_tech_2025.domain.service.impl;

import com.dio.decola_tech_2025.domain.Repository.UserRepository;
import com.dio.decola_tech_2025.domain.model.User;
import com.dio.decola_tech_2025.domain.service.UserService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;

    @Override
    public User findById(Long id) {
        return repository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Transactional
    @Override
    public User create(User user) {
        if (user.getId() != null && repository.existsById(user.getId())) {
            throw new IllegalArgumentException("User ID already exists");
        }
        if (repository.existsByAccountNumber(user.getAccount().getNumber())) {
            throw new IllegalArgumentException("This account number already exists");
        }
        return repository.save(user);
    }
}