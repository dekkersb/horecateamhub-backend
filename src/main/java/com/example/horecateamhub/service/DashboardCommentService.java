package com.example.horecateamhub.service;

import com.example.horecateamhub.model.DashboardComment;

import java.util.List;

public interface DashboardCommentService {
    List<DashboardComment> findAll();
    DashboardComment save(DashboardComment dashboardComment);
}
