package com.ssafy.board.test;

import com.ssafy.board.model.dao.BoardDao;
import com.ssafy.board.model.dao.BoardDaoImpl;
import com.ssafy.board.model.dto.Board;

public class BoardTest {
	public static void main(String[] args) {
		BoardDao dao = BoardDaoImpl.getInstance();
		
//		//전부 가져와
//		for(Board b : dao.selectAll()) {
//			System.out.println(b);
//		}
//		System.out.println(dao.selectOne(3));
		
//		//등록
//		Board board = new Board("어떻게 살아야 할까", "으윽", "젠장");
//		dao.insertBoard(board);
		
//		//삭제
//		dao.deleteBoard(5);
		
//		//수정을 하기 위한 기본 데이터가 확보된 상태
//		Board board = dao.selectOne(4);
//		
//		board.setTitle("낙낙");
//		board.setContent("mgrmg");
//		
//		dao.updateBoard(board);
		
		//게시글 조회수 올리기
		Board board = dao.selectOne(4);
		
		dao.updateViewCnt(board.getId());
		
		for(Board b : dao.selectAll()) {
			System.out.println(b);
		}
	}
}


