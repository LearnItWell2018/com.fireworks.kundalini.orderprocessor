package com.fireworks.kundalini.orderprocessor.db.crud;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.fireworks.kundalini.orderprocessor.pojo.comments.Comments;

public interface CommentsRepository extends MongoRepository<Comments, String> {

	public List<Comments> findBycustomerMail(String customerMail);

}