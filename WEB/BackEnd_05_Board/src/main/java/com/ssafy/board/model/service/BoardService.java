package com.ssafy.board.model.service;

import java.util.List;

import com.ssafy.board.model.dto.Board;

//확장성이나 기타 등등을 위해 서비스를 인터페이스로 만들기
//컨트롤러에서 doWrite 할 때 CRUD??
public interface BoardService {
	//전체 글 가져와
	public abstract List<Board> getList();
	//게시글 하나 가져와	(상세보기?!)
	public abstract Board getBoard(int id);
	//게시글 작성
	public abstract void writeBoard(Board board);
	//게시글 수정
	public abstract void modifyBoard(Board board);	//사용자 친화적 이름 : update 대신 modify, update는 db 할 때 쓴다
	//게시글 삭제
	public abstract void removeBoard(int id);
}
