package com.ssafy.board.model.service;

import java.util.List;

import com.ssafy.board.model.dto.Board;

public interface BoardService {	//service는 사용자 친화적 메서드명 dao는 db친화적 메서드명
	//게시글 전체 조회
	public List<Board> getBoardList();
	//게시글 상세 조회
	public Board readBoard(int id);	//dao에서 viewCount 증가, 게시글 조회
	//게시글 작성
	public void writeBoard(Board board);	
	//게시글 삭제
	public void removeBoard(int id);
	//게시글 수정
	public void modifyBoard(Board board);
}
