package com.smarttrip.dao;

import com.smarttrip.domain.Comment;
import java.util.List;

public interface CommentMapper {
    int deleteByPrimaryKey(String commentId);

    int insert(Comment record);

    Comment selectByPrimaryKey(String commentId);

    List<Comment> selectAll();

    int updateByPrimaryKey(Comment record);
}