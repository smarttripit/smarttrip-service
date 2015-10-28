package com.smarttrip.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.smarttrip.domain.Comment;

public interface CommentMapper {
    int deleteByPrimaryKey(String commentId);

    int insert(Comment record);

    Comment selectByPrimaryKey(String commentId);

    List<Comment> selectAll();

    int updateByPrimaryKey(Comment record);
    
    List<Comment> selectByRouteId(String productId);
    
    int deleteCommentByVisitorId(@Param("visitorId")String visitorId, @Param("commentIds")String[] commentIds);
}