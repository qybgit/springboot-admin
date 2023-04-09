package com.admin.service;

import com.admin.vo.CommentVo;
import com.admin.vo.Result;
import com.admin.vo.params.CommentParam;

import java.util.List;

public interface CommentService {
    List<CommentVo> findCommentByArticleId(long id);

    Result addComment(CommentParam commentParam);

}
