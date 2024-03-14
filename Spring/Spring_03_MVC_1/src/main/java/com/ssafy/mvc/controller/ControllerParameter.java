package com.ssafy.mvc.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpServletRequest;

@Controller		//컨트롤러 등록
public class ControllerParameter {
	
	@GetMapping("/test1")	// 요청 경로 :test1 이라는 get요청은 여기로 들어온다
	public String test1() {	//반환타입 : String 	ModelAndView 객체 만들 필요 없이 알아서 그 객체로 넘어간다.
		
		//반환타입이 String이라는 뜻은 해당 값이 ViewName 이다. 알아서 지정이 된다
		return "test1";		//뷰 리졸버가 잡아다가  /WEB-INF/view/test1.jsp 로 바꾼다
	}
	
	
	//데이터를 실어서 보내고 싶은데, ModelAndView로 하긴 싫어
	@GetMapping("/test2-1")
	public String test2_1(Model model) {
		model.addAttribute("msg","데이터21");
		return "test2";
	}
	
	@GetMapping("/test2-2")
	public String test2_2(Map<String,Object> model) {
		model.put("msg","데이터22");
		return "test2";
	}
	
	
	//파라미터로 값을 가져오고 싶다  --> 근데 이건 옛날 방식
	@GetMapping("/test3")
	public String test3(Model model, HttpServletRequest request) {
		
		String id= request.getParameter("id");
		model.addAttribute("id",id);
		return "test3";
	}
	
	//이 방식이 좀더최신
	@GetMapping("/test3-1")
	public String test3_1(Model model, @RequestParam("id") String id, @RequestParam(value="pw", defaultValue = "1234") String pw) {
		
		model.addAttribute("id", id);
		return "test3";
	}
}
