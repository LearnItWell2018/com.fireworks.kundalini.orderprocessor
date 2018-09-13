package com.fireworks.kundalini.orderprocessor.service;

import java.util.List;

import com.fireworks.kundalini.orderprocessor.pojo.comments.Comments;

public interface ICommentsService {

	public List<Comments> getAllComments();

	public void saveComment(Comments comments);
}
