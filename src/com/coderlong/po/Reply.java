package com.coderlong.po;

import java.sql.Timestamp;

public class Reply {
	// reply attr 
	private int replyId;
    private int replyPostId;
    private String replyUserName;
    private String replyContent;
    private int replyGoodCount;
    private int replyBadCount;
    private Timestamp replyCreateTime;
	public int getReplyId() {
		return replyId;
	}
	public void setReplyId(int replyId) {
		this.replyId = replyId;
	}
	public int getReplyPostId() {
		return replyPostId;
	}
	public void setReplyPostId(int replyPostId) {
		this.replyPostId = replyPostId;
	}
	public String getReplyUserName() {
		return replyUserName;
	}
	public void setReplyUserName(String replyUserName) {
		this.replyUserName = replyUserName;
	}
	public String getReplyContent() {
		return replyContent;
	}
	public void setReplyContent(String replyContent) {
		this.replyContent = replyContent;
	}
	public int getReplyGoodCount() {
		return replyGoodCount;
	}
	public void setReplyGoodCount(int replyGoodCount) {
		this.replyGoodCount = replyGoodCount;
	}
	public int getReplyBadCount() {
		return replyBadCount;
	}
	public void setReplyBadCount(int replyBadCount) {
		this.replyBadCount = replyBadCount;
	}
	public Timestamp getReplyCreateTime() {
		return replyCreateTime;
	}
	public void setReplyCreateTime(Timestamp replyCreateTime) {
		this.replyCreateTime = replyCreateTime;
	}
    
}
