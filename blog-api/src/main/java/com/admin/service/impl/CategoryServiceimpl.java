package com.admin.service.impl;
import com.admin.dao.mapper.CategoryMapper;
import com.admin.dao.pojo.Article;
import com.admin.dao.pojo.Category;
import com.admin.service.CategoryService;
import com.admin.vo.Result;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CategoryServiceimpl implements CategoryService {
    @Resource
    CategoryMapper categoryMapper;

    /**
     * 通过id查分类
     * @param category_id
     * @return
     */
    @Override
    public Category findById(int category_id) {
        Category category=categoryMapper.findById(category_id);
        return category;
    }

    /**
     * all分类
     * @return
     */
    @Override
    public Result findAll() {
        List<Category> categories=categoryMapper.selectAll();
        return Result.success(categories) ;
    }


    public List<Article> selectArticle(int id) {
        List<Article> article=categoryMapper.selectArticle(id);
        return article;
    }
}
