package com.coderlong.mapper;

import java.util.List;

import com.coderlong.po.Post;

public interface PostMapper {
	//�������� 
	public void addPost(Post post);
	//��ѯ���� 
	public Post findPostByPostId(int postId);
	// �г����е����� 
	public List<Post> listAllPostInfo();
	//ɾ������ 
	public void deletePostById(int postId);
	//�������� 
	public void updatePostByPost(Post post);
}
