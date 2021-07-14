package com.example.horecateamhub.service;

import com.example.horecateamhub.model.DashboardComment;
import com.example.horecateamhub.repository.DashboardCommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DashboardCommentServiceImp implements DashboardCommentService {

    private DashboardCommentRepository dashboardCommentRepository;

    @Autowired
    public DashboardCommentServiceImp (DashboardCommentRepository dashboardCommentRepository) {
        this.dashboardCommentRepository = dashboardCommentRepository;
    }

    @Override
    public List<DashboardComment> findAll() {
    return dashboardCommentRepository.findAll();
    }

    @Override
    public DashboardComment save(DashboardComment dashboardComment) {
        return dashboardCommentRepository.save(dashboardComment);
    }
}
