package com.coderlong.mapper;

import java.util.List;

import com.coderlong.po.Reply;

public interface ReplyMapper {
	//增加一个 回复
	public void addReply(Reply reply);
	//通过文章ID 列出来回复 
	public List<Reply> listReplyByPostId(int postId);
	// 删除回复 根据回复的ID
	public void deleteReplyById(int postId);
	//查询回复 根据 回复的ID
	public Reply findReplyByReplyId(int replyId);
}
