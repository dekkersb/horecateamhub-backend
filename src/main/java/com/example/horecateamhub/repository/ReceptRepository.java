package com.example.horecateamhub.repository;

import com.example.horecateamhub.model.Recept;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReceptRepository extends JpaRepository<Recept, Long> {
 List<Recept> findAllByGlutenIsFalseOrderByNameAsc();
 List<Recept> findAllByType(String type);
 List<Recept> findByOrderByNameAsc();

}
