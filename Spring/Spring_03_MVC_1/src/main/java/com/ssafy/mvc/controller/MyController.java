package com.ssafy.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller // 컨트롤러도 컨텍스트의 일종? 컨텍스트 스캔으로 등록한다
public class MyController { // spring은 pojo 스타일을 추가해서 extend 안한다
	@RequestMapping("/")
	public String index() {
		return "index";

	}

//	@RequestMapping("home") 이거는 get, request 둘다 처리해버린다
	@RequestMapping(value = "home", method = RequestMethod.GET)
	public ModelAndView homeHandle1() {
		ModelAndView mav = new ModelAndView(); // 뷰의 이름을 저장할 수 있는 객체
		// 데이터를 실어서 보내보자 (키/밸류 )
		mav.addObject("msg", "Welcome to Spring(GET)");

		// view 이름을 결정해야해 -> 포워딩 한 것과 같음
		mav.setViewName("home"); // mav라는 바구니에 msg를 담아서 home이란 이름으로 간다 보낸다
		// 뷰리졸버가 /~~/home.jsp 로 보낸다

		return mav;
	}
	
	@RequestMapping(value = "home", method = RequestMethod.POST)
	public ModelAndView homeHandle2() {
		ModelAndView mav = new ModelAndView(); // 뷰의 이름을 저장할 수 있는 객체
		// 데이터를 실어서 보내보자 (키/밸류 )
		mav.addObject("msg", "Welcome to Spring(POST)");

		// view 이름을 결정해야해 -> 포워딩 한 것과 같음
		mav.setViewName("home"); // mav라는 바구니에 msg를 담아서 home이란 이름으로 간다 보낸다
		// 뷰리졸버가 /~~/home.jsp 로 보낸다

		return mav;
	}
}
