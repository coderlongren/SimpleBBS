package com.coderlong.mapper;

import java.util.List;

import com.coderlong.po.Board;

/**
 * 板块的 Dao
 * @author Administrator
 *
 */
public interface BoardMapper {
	//增加板块 
	public void addBoard(Board board);
	//列出所有的板块 
	public List<Board> listBoard();
	// 根据板块列出所有的 帖子 
	public Board listAllPostsOfBoard(int boardId);
	// 根据 板块ID 查询板块 
	public Board findBoardByBoardId(int boardId);
	//根据  板块名字查询 板块 
	public Board findBoardByBoardName(String boardName);
	// 更新板块 
	public void updateBoardByBoard(Board board);
	// 删除板块 
	public void deleteBoardById(int boardId);
}
