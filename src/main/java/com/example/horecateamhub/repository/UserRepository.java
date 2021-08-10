package com.example.horecateamhub.repository;

import com.example.horecateamhub.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
