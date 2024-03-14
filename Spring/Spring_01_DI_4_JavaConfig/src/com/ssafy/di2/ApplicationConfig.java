package com.ssafy.di2;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//Javaconfig는 별토 java file로 config 설정해준다. @configuration으로 annotation
@Configuration
@ComponentScan(basePackages = {"com.ssafy.di2"})
public class ApplicationConfig {

}
