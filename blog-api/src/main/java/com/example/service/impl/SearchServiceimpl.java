package com.example.service.impl;

import com.example.dao.mapper.SearchMapper;
import com.example.dao.pojo.Article;
import com.example.service.SearchService;
import com.example.vo.ArticleVo;
import com.example.vo.Result;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SearchServiceimpl implements SearchService {
    @Resource
    ArticleServiceimpl articleServiceimpl;
    @Resource
    SearchMapper mapper;
    @Override
    public Result search(String text) {
        if (StringUtils.isBlank(text)){
            return Result.success(null);
        }
        List<Article> articleList=mapper.search(text);
        List<ArticleVo> articleVoList=articleServiceimpl.copyList(articleList,false,false,false);
        if (articleVoList==null||articleVoList.size()<1)
            return Result.success(null);
        return Result.success(articleVoList);
    }
}
