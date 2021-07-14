package com.example.horecateamhub.controller;

import com.example.horecateamhub.model.DashboardComment;
import com.example.horecateamhub.service.DashboardCommentService;
import com.example.horecateamhub.service.DashboardCommentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = {"*"} )
@RestController
@RequestMapping("/dashboardcomment")
public class DashboardCommentController {
    private DashboardCommentService dashboardCommentService;

    @Autowired
    public DashboardCommentController(DashboardCommentService dashboardCommentService) {
        this.dashboardCommentService = dashboardCommentService;
    }

    @GetMapping
    public List<DashboardComment> findAll() {
        return dashboardCommentService.findAll();
    }

    @PostMapping
    public DashboardComment save(@RequestBody DashboardComment dashboardComment) {
        return dashboardCommentService.save(dashboardComment);
    }
}
