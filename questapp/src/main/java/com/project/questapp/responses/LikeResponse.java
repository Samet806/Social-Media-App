package com.project.questapp.responses;

import com.project.questapp.entities.Like;

public class LikeResponse {
	private Long id;
	private Long postId;
	private Long userId;
	
	public LikeResponse(Like entity)
	{
		this.id=entity.getId();
		this.userId=entity.getUser().getId();
		this.postId=entity.getPost().getId();
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getPostId() {
		return postId;
	}
	public void setPostId(Long postId) {
		this.postId = postId;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}


}
