package com.ssafy.board.model.service;

import java.util.List;

import com.ssafy.board.model.dto.Board;
import com.ssafy.board.model.repository.BoardRepository;
import com.ssafy.board.model.repository.BoardRepositoryImpl;

//싱글턴으로 만들어야함
public class BoardServiceImpl implements BoardService {

	private static BoardService service = new BoardServiceImpl();
	
	//의존성 주입
	private BoardRepository repository = BoardRepositoryImpl.getInstance();
	
	
	private BoardServiceImpl() {}	//기본 생성자
	
	public static BoardService getInstance() {
		return service;
	}
	
	//////////////////////////////////////////
	@Override
	public List<Board> getList() {
		// TODO Auto-generated method stub
		return repository.selectAll();
	}

	@Override
	public Board getBoard(int id) {
		// TODO Auto-generated method stub
		//조회수도 증가
		repository.updateViewCnt(id);
		return repository.selectOne(id);
	}

	@Override	
	public void writeBoard(Board board) {
		repository.insertBoard(board);

	}

	@Override
	public void modifyBoard(Board board) {
		// TODO Auto-generated method stub
		repository.updateBoard(board);

	}

	@Override
	public void removeBoard(int id) {
		repository.deleteBoard(id);

	}

}
