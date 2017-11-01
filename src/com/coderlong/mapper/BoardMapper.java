package com.coderlong.mapper;

import java.util.List;

import com.coderlong.po.Board;

/**
 * ���� Dao
 * @author Administrator
 *
 */
public interface BoardMapper {
	//���Ӱ�� 
	public void addBoard(Board board);
	//�г����еİ�� 
	public List<Board> listBoard();
	// ���ݰ���г����е� ���� 
	public Board listAllPostsOfBoard(int boardId);
	// ���� ���ID ��ѯ��� 
	public Board findBoardByBoardId(int boardId);
	//����  ������ֲ�ѯ ��� 
	public Board findBoardByBoardName(String boardName);
	// ���°�� 
	public void updateBoardByBoard(Board board);
	// ɾ����� 
	public void deleteBoardById(int boardId);
}
