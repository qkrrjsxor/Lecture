package com.ssafy.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class MainController {
	//파일이나 클래스 경로 등 리소스를 로드하는 데 사용하는 인터페이스
//	@Autowired		//이렇게 하기보다 좀더 안전하게
	private final ResourceLoader resourceLoader;
	
//	@Autowired 		//생성자가 하나일 땐 생략해도
	public MainController(ResourceLoader resourceLoader) {
		// TODO Auto-generated constructor stub
		this.resourceLoader = resourceLoader;
	}
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/singleFileForm")
	public String singleFileForm() {
		return "singleFileForm";		//view Resolver가 /singleFileForm.jsp 로 잡는다
	}
	
	@PostMapping("/singleFileUpload")
	public String singleFileUpload(@RequestParam("file") MultipartFile file, Model model) {
		
		//파일이 있는지 , 용량이 존재하는지 검사
		if(file != null && file.getSize()>0) {
			String fileName = file.getOriginalFilename();	//파일명
			Resource resource = resourceLoader.getResource("resources/upload");
			
		}
		
		return "result";		//view Resolver가 /result.jsp 로 잡는다
	}
}
