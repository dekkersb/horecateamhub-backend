package com.example.horecateamhub.controller;

import com.example.horecateamhub.model.DashboardComment;
import com.example.horecateamhub.service.DashboardCommentService;
import com.example.horecateamhub.service.DashboardCommentServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.text.DateFormat;
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

//    @PostMapping
//    public DashboardComment save(@RequestBody DashboardComment dashboardComment) {
//        return dashboardCommentService.save(dashboardComment);
//    }

    @PostMapping("/new_comment")
    public ResponseEntity<Object> saveComment(@RequestParam String gebruiker,
                                              @RequestParam String comment,
                                              @RequestParam String date)
{
        try {
            DashboardComment dashboardComment = new DashboardComment();
            dashboardComment.setGebruiker(gebruiker);
            dashboardComment.setComment(comment);
            dashboardComment.setDate(date);


            dashboardCommentService.save(dashboardComment);

            return ResponseEntity.noContent().build();
        } catch (Exception exception) {
            return new ResponseEntity<>(HttpStatus.I_AM_A_TEAPOT);
        }
    }
}
