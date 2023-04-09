package com.admin.service;

import com.admin.dao.pojo.Tag;
import com.admin.vo.Result;

import java.util.List;

public interface TagService {
    Result selectAll();


    Result addTag(String nickname);

    List<Tag> selectByArticleId(Long id);

    Result selectCount();
}
