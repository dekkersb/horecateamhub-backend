package com.example.horecateamhub.controller;

import com.example.horecateamhub.model.DashboardComment;
import com.example.horecateamhub.service.DashboardCommentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {"*"} )
@RestController
@RequestMapping("/dashboardcomment")
public class DashboardCommentController {

    @Autowired
    DashboardCommentServiceImp dashboardCommentServiceImp;

    @PostMapping
    public ResponseEntity<Object> saveDashboardComment(@RequestBody DashboardComment dashboardComment) {
        dashboardCommentServiceImp.saveDashboardComment(dashboardComment);
        return ResponseEntity.ok ("toegevoegd");
    }
}
