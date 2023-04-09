package com.admin.service;

import com.admin.dao.pojo.Category;
import com.admin.vo.Result;

public interface CategoryService {
    Category findById(int category_id);


    Result findAll();
}
