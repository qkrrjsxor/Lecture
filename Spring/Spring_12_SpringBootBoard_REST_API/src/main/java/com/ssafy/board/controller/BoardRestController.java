package com.ssafy.board.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.board.model.dto.Board;
import com.ssafy.board.model.service.BoardService;

//이친구 REST controller로 쓸래요
@RestController
@RequestMapping("/api-board")
public class BoardRestController {
	//의존성 주입
	private final BoardService boardService;
	
	//생성자로 주입
//	@Autowired		생성자가 하나뿐이라 없어도 자동으로 된다~
	public BoardRestController(BoardService boardService) {
		this.boardService = boardService;
	}
	
	//게시글 조회
	//jackson 의존성 Springboot가 이미 가지고 있어서 따로 추가 안해도 java객체를 json으로 바꿔준다
	@GetMapping("/board")
	public ResponseEntity<?> list(){
		List<Board> list = boardService.getBoardList();
		
		return new ResponseEntity<List<Board>>(list, HttpStatus.OK);
	}
	
	//게시글 상세 조회
	@GetMapping("/board/{id}")
	public ResponseEntity<?> detail(@PathVariable("id") int id){
		Board board = boardService.readBoard(id);
		
		//board가 null이면 예외처리
		if(board == null) {
			return new ResponseEntity<String>("NO Content", HttpStatus.NOT_FOUND);
		}
		return new ResponseEntity<Board>(board, HttpStatus.OK);
	}
	
	//게시글 등록(Form 형식으로 넘어왔을 때)
	@PostMapping("/board")
	public ResponseEntity<?> write(@ModelAttribute Board board){
		boardService.writeBoard(board);
		//등록이 되어있는지 눈으로 Talend API 보려고 이렇게 보낸거
		//실제로 프론트에게 보낼때는 크게 의미는 없다. ID만 보내서 디테일 쏘던지 바로 목록으로 가면 필요없다
		//insert, update, delete -> 반환값이 int 형의 값이 넘어온다 ( 바뀐 행의 갯수)
		return new ResponseEntity<Board>(board, HttpStatus.CREATED);
	}
	
	//게시글 수정
	@PutMapping("/board/{id}")
	public ResponseEntity<Void> update(@PathVariable("id") int id){
		
	}
}
