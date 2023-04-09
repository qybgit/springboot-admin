package com.admin.controller;

import com.admin.service.SearchService;
import com.admin.vo.Result;
import com.admin.vo.params.Search;
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
