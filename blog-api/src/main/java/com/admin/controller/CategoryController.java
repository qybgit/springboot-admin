package com.admin.controller;

import com.admin.service.ArticleService;
import com.admin.service.CategoryService;
import com.admin.vo.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("category")
public class CategoryController {
    @Resource
    ArticleService articleService;
    @Resource
    CategoryService categoryService;

    /**
     * 分类id查文章
     * @param id
     * @return
     */
    @RequestMapping("{id}")
    public Result selectArticle(@PathVariable("id") int id){
        return articleService.selectArticle(id);
    }

    /**
     * 查找所有分类
     * @return
     */
    @GetMapping("all")
    public Result selectCategory(){
        return categoryService.findAll();
    }
}
