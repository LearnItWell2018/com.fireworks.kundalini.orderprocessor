package com.fireworks.kundalini.orderprocessor.rest;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.fireworks.kundalini.orderprocessor.pojo.comments.Comments;
import com.fireworks.kundalini.orderprocessor.service.ICommentsService;

@Path("comments")
@Component
public class CommentsController {

	@Autowired
	ICommentsService commentsService;
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Comments> getAllComments() {
		return commentsService.getAllComments();
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	public void saveComments(Comments comments) {
		commentsService.saveComment(comments);
	}
	
}
