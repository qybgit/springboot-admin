package com.admin.service;

import com.admin.vo.Result;
import com.admin.vo.params.ArticleParam;
import com.admin.vo.params.PageParams;


public interface ArticleService {

    Result findAllArticle(PageParams params);

    Result selectArticleByTagId(Long id);

    Result selectArticle(int id);

    Result findArticle(Long id);

    Result addArticle(ArticleParam articleParam);

    Result articleCount();

    Result alls();
}
