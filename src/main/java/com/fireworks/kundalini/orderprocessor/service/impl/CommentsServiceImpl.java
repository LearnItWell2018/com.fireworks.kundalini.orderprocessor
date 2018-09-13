package com.fireworks.kundalini.orderprocessor.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fireworks.kundalini.orderprocessor.db.crud.CommentsRepository;
import com.fireworks.kundalini.orderprocessor.pojo.comments.Comments;
import com.fireworks.kundalini.orderprocessor.service.ICommentsService;

@Service
public class CommentsServiceImpl implements ICommentsService {

	@Autowired
	CommentsRepository commentsRepository;
	
	@Override
	public List<Comments> getAllComments() {
		return commentsRepository.findAll();
	}

	@Override
	public void saveComment(Comments comments) {
		commentsRepository.save(comments);
	}
}
