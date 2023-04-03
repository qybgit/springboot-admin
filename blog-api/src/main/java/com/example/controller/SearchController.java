package com.example.controller;

import com.example.service.SearchService;
import com.example.vo.Result;
import com.example.vo.params.Search;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController

public class SearchController {
    @Resource
    SearchService searchService;

    @PostMapping("/search")
    public Result search(@RequestBody Search search){
        return searchService.search(search.getText());
    }
}
