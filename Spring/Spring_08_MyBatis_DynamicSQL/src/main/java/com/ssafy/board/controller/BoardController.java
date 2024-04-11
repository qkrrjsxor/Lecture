package com.ssafy.board.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ssafy.board.model.dto.Board;
import com.ssafy.board.model.dto.SearchCondition;
import com.ssafy.board.model.service.BoardService;

@Controller
public class BoardController {
	
	private final BoardService boardService;
	
//	@Autowired 생성자 하나이면 안써도 된다
	public BoardController(BoardService boardService) {
		this.boardService = boardService;
	}
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/list")
	public String list(Model model) {
		//String 반환형의 의미는 view name을 반환하겟다는 뜻
		
		//서비스에서 boards를 가져와야겠다
		List<Board> boards = boardService.getBoardList();
		model.addAttribute("list", boards);
		return "/board/list";
	}
	
	@GetMapping("/detail")
	public String detail(Model model, @RequestParam("id") int id) {
		Board board = boardService.readBoard(id);
		model.addAttribute("board",board);
		return "/board/detail";
	}
	
	@GetMapping("/writeform")
	public String writeform() {
		return "/board/writeform";
	}
	
	@PostMapping("/write")
	public String write(@ModelAttribute Board board) {	//@ModelAttribute는 해당 객체를 만들어서 가지고있다가 맞는 요청이 들어오면 팍팍 넣어준다??
		System.out.println("등록 전 " + board);
		boardService.writeBoard(board);
		System.out.println("등록 후 " + board);
		
//		//글 쓴 후 목록으로 가겠다, 리다이렉트로
//		return "redirect:list";
		//글 쓴후 상세페이지로 가보자
		return "redirect:detail?id="+board.getId();
	}
	
	@GetMapping("/delete")
	public String delete(@RequestParam("id") int id) {
		boardService.removeBoard(id);
		return "redirect:list";
	}
	
	@GetMapping("/updateform")
	public String updateform(Model model, @RequestParam("id")int id) {
		model.addAttribute("board", boardService.readBoard(id));
		return "/board/updateform";
	}
	
	@PostMapping("/upadate")
	public String update(@ModelAttribute Board board) {
		boardService.modifyBoard(board);
		return "redirect:detail?id="+board.getId();
	}

	@GetMapping("/search")
	public String search(@ModelAttribute SearchCondition searchCondition, Model model) {
		model.addAttribute("list", boardService.search(searchCondition));
		return "/board/list";
	}
}


