package com.mohammedkhadeer.blog.services;

import com.mohammedkhadeer.blog.payloads.CommentDto;

public interface CommentService {

	CommentDto createComment(CommentDto commentDto, Integer postId);

	void deleteComment(Integer commentId);

}
