package com.coderlong.mapper;

import java.util.List;

import com.coderlong.po.Post;

public interface PostMapper {
	//增加文章 
	public void addPost(Post post);
	//查询文章 
	public Post findPostByPostId(int postId);
	// 列出所有的文章 
	public List<Post> listAllPostInfo();
	//删除文章 
	public void deletePostById(int postId);
	//更新文章 
	public void updatePostByPost(Post post);
}
