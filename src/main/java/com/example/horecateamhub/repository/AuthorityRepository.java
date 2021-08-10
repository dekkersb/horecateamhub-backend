package com.example.horecateamhub.repository;

import com.example.horecateamhub.model.Authority;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorityRepository extends JpaRepository<Authority, String> {
    String getAuthorityByUsername(String username);
}
