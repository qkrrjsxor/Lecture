package com.ssafy.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ssafy.mvc.model.dto.User;

@Controller
public class UserController {

	@GetMapping("/regist")
	public String registform() {
		return "regist";
	}
	
		
//	@PostMapping("/regist")
//	public String regist(@RequestParam("id")String id, @RequestParam("pw") String pw) {
//		User user = new User(id,pw);
//		System.out.println(user);
//		return "result";
//	}
	
	//이런식으로 하면 위 처럼 귀찮게 안해도 User 객체 만들어진다?
	@PostMapping("/regist")
	public String regist(@ModelAttribute User user) {
		System.out.println(user);
		return "result";
	}
		
}
