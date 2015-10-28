package com.smarttrip.service.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.smarttrip.dao.CommentMapper;
import com.smarttrip.domain.Comment;
import com.smarttrip.service.ICommentService;

/**
 * ICommentService的实现类. <br/>
 * date: 2015年10月15日 10:19 <br/>
 *
 * @author 1361200381@qq.com
 */
@Service("commentService")
@Transactional
public class CommentService implements ICommentService{
	
	private Logger logger = LoggerFactory.getLogger(CommentService.class);
	@Autowired
	private CommentMapper commentMapper;
	
	/**
	 * 插入.
	 * @see com.smarttrip.service.ICommentService#insert(com.smarttrip.domain.Comment)
	 */
	@Override
	public int insert(Comment comment) {
		if(comment == null){
			logger.error("Comment不能为null");
			throw new NullPointerException("Comment不能为null");
		}
		int result = commentMapper.insert(comment);
		return result;
	}
	
	/**
	 * 删除.
	 * @see com.smarttrip.service.ICommentService#deleteByPrimaryKey(java.lang.String)
	 */
	@Override
	public int deleteByPrimaryKey(String commentId) {
		if(commentId == null  ||  commentId.equals("")){
			logger.error("commentId不能为空");
			throw new NullPointerException("commentId不能为空");
		}
		int count = commentMapper.deleteByPrimaryKey(commentId);
		return count;
	}
	
	/**
	 * 更新.
	 * @see com.smarttrip.service.ICommentService#updateByPrimaryKey(com.smarttrip.domain.Comment)
	 */
	@Override
	public int updateByPrimaryKey(Comment comment) {
		if(comment == null){
			logger.error("Comment不能为null");
			throw new NullPointerException("Comment不能为null");
		}
		int count = commentMapper.updateByPrimaryKey(comment);
		return count;
	}
	
	/**
	 * 查询.
	 * @see com.smarttrip.service.ICommentService#selectByPrimaryKey(java.lang.String)
	 */
	@Override
	public Comment selectByPrimaryKey(String commentId) {
		if(commentId == null  ||  commentId.equals("")){
			logger.error("commentId不能为空");
			throw new NullPointerException("commentId不能为空");
		}
		Comment comment = commentMapper.selectByPrimaryKey(commentId);
		return comment;
	}
	
	@Override
	public List<Comment> selectByRouteId(String routeId){
		if (routeId == null || routeId.equals("")){
			logger.error("routeId不能为空");
			throw new NullPointerException("routeId不能为空");
		}
		List<Comment> record = commentMapper.selectByRouteId(routeId);
		return record;
	}
	
	@Override
	public int deleteCommentByVisitorId(String visitorId, String[] commentIds) {
		if(visitorId == null  ||  visitorId.equals("")||commentIds ==null||commentIds.equals("")){
			logger.error("visitorId或commentIds不能为空");
			throw new NullPointerException("visitorId或commentIds不能为空");
		}
		int count = commentMapper.deleteCommentByVisitorId(visitorId,commentIds);
		return count;
	}
		
}
