package com.ssafy.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//Javaconfig는 별토 java file로 config 설정해준다. @configuration으로 annotation
@Configuration
public class ApplicationConfig {
	
	@Bean
	public Desktop desktop() {
		return new Desktop();
	}
	
	@Bean
	public Laptop laptop() {
		return new Laptop();
	}
	
	@Bean
	public Programmer programmer() {
		//생성자 주입, 설정자 주입 둘다 ok
		Programmer p = new Programmer(desktop());
		return p;
	}

}
