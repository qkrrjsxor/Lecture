package com.ssafy.board.model.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.ssafy.board.model.dto.Board;

//싱글턴으로
public class BoardRepositoryImpl implements BoardRepository {
	//DB와 연결되어 해당 로직을 호출
	private static BoardRepository repository = new BoardRepositoryImpl();
	
	//데이터베이스 지금으로선 모르고 없으니까 메모리를 DB라고 생각하고 저장,처리
	private List<Board> list = new ArrayList<>(); 	//리스트 관리 -> 반복문으로 체크하면서 가져온다
	private Map<Integer, Board> boardsMap = new HashMap<>(); //맵으로 관리 -> id로 바로 가져온다
	
	
	private BoardRepositoryImpl() {};	//기본 생성자
	
	public static BoardRepository getInstance() {
		return repository;
	}
	
	@Override
	public List<Board> selectAll() {
		// TODO Auto-generated method stub
		return list;	//이렇게 바로 리스트 넘기거나
		
//		List<Board> tmp = new ArrayList<>();
//		for( int i : boardsMap.keySet()) {
//			tmp.add(boardsMap.get(i));
//		}
//		return tmp; 	//이렇게 boardsMap 키값을 조회하며 List에 넣어서 반환하거나

//		return (List<Board>)boardsMap.values();		//이렇게 boardsMap의 value메서드로 collection 받아서 리스트ㅗㄹ 캐스트해서 반환하거나
		
	}

	@Override
	public Board selectOne(int id) {
		//map으로 햇으면 바로 id로 가져오면됨
		
		for(Board b : list) {
			if(b.getId()==id)
				return b;
		}
		return null;
	}

	@Override
	public void insertBoard(Board board) {
//		boardsMap.put(board.getId(), board);	//id를 key로
		list.add(board);						//혹은 리스트로 저장
	}

	@Override
	public void updateBoard(Board board) {
//		boardsMap.put(board.getId(),board);		//map으로 했으면 이렇게
		
		for(int i =0; i< list.size(); i++) {
			if(list.get(i).getId()==board.getId()) {
				list.remove(i);
				list.add(i, board);
			}
		}
	}

	@Override
	public void deleteBoard(int id) {
		// boardsMap.remove(id);	map으로 했으면 바로 id로 지움
		
		for(int i =0; i<list.size(); i++) {
			if(list.get(i).getId()==id)
				list.remove(i);
		}
		
	}

	@Override
	public void updateViewCnt(int id) {
		// TODO Auto-generated method stub
		//Board b = boardsMap.get(id);  	map으로 했으면  
		
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i).getId()==id) {
				list.get(i).setViewCnt(list.get(i).getViewCnt()+1);
			}
		}
		
	}

}
