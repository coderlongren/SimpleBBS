package com.coderlong.mapper;

import java.util.List;

import com.coderlong.po.Reply;

public interface ReplyMapper {
	//����һ�� �ظ�
	public void addReply(Reply reply);
	//ͨ������ID �г����ظ� 
	public List<Reply> listReplyByPostId(int postId);
	// ɾ���ظ� ���ݻظ���ID
	public void deleteReplyById(int postId);
	//��ѯ�ظ� ���� �ظ���ID
	public Reply findReplyByReplyId(int replyId);
}
