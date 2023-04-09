package com.admin.controller;

import com.admin.service.CommentService;
import com.admin.vo.Result;
import com.admin.vo.params.CommentParam;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@RequestMapping("comment")
@CrossOrigin(origins = "*")
public class CommentController {
    @Resource
    CommentService commentService;

    @RequestMapping("add")
    @CrossOrigin(origins = "*")
    public Result add(@RequestBody CommentParam commentParam) {

        return commentService.addComment(commentParam);
    }
}
