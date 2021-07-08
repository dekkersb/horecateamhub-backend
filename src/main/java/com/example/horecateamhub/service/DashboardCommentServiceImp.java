package com.example.horecateamhub.service;

import com.example.horecateamhub.model.DashboardComment;
import com.example.horecateamhub.repository.DashboardCommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DashboardCommentServiceImp implements DashboardCommentService {

    @Autowired
    DashboardCommentRepository dashboardCommentRepository;

    @Override
    public DashboardComment saveDashboardComment (DashboardComment dashboardComment) {
        dashboardCommentRepository.save(dashboardComment);
        return dashboardComment;
    }
}
