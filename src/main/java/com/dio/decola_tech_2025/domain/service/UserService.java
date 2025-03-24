package com.dio.decola_tech_2025.domain.service;

import com.dio.decola_tech_2025.domain.model.User;

public interface UserService {
    User findById(Long id);
    User create(User user);
}
