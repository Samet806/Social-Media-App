package com.project.questapp.requests;

public class CommentUpdateRequest {
	
	private String text;
	
	
	public void setText(String text)
	{
		this.text=text;
	}
	public String getText()
	{
		return this.text;
	}

}
