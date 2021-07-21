package com.example.horecateamhub.repository;

import com.example.horecateamhub.model.DashboardComment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DashboardCommentRepository extends JpaRepository<DashboardComment, Long> {

}
