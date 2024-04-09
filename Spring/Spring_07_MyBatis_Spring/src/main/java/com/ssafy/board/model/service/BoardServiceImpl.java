package com.ssafy.board.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.board.model.dao.BoardDao;
import com.ssafy.board.model.dto.Board;

@Service	//해당 클래스를 bean으로 등록하고, 컨트롤러에서 필요하다면 의존성 주입까지
public class BoardServiceImpl implements BoardService{

	private final BoardDao boardDao;	//service에 dao 의존성 주입?
	
	@Autowired
	public BoardServiceImpl(BoardDao boardDao) {	
		//BoardDao 구현체를 안만들었는데 어떻게 주입하지? -> 어제는 getMapper로 만들어 주었고, 오늘은 스프링 mapper scan으로 bean 등록하여 처리
		this.boardDao = boardDao;
	}
	
	@Override
	public List<Board> getBoardList() {
		return boardDao.selectAll();
	}

	@Override
	public Board readBoard(int id) {
		System.out.println(id+"번 게시글을 읽어옵니다");
		Board board = boardDao.selectOne(id);
		boardDao.updateViewCnt(id);
		return board;
	}

	@Override
	public void writeBoard(Board board) {
		System.out.println("게시글 작성합니다");
		boardDao.insertBoard(board);
	}

	@Override
	public void removeBoard(int id) {
		System.out.println(id+"번 게시글을 삭제하겠습니다");
		boardDao.deleteBoard(id);
	}

	@Override
	public void modifyBoard(Board board) {
		System.out.println("게시글 수정");
		boardDao.updateBoard(board);
	}

}
