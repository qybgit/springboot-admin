package com.admin.dao.mapper;

import com.admin.dao.pojo.Article;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SearchMapper {
    @Select("select * from my_article where title like concat('%',#{text},'%')")
    List<Article> search(String text);
}
