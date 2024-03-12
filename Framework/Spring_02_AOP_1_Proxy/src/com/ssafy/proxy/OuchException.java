package com.ssafy.proxy;

public class OuchException extends RuntimeException{

	//Exception : checked Exception
	//Runtime Exception : unchecked Exception
	private static final long serialVersionUID = 1L;
	
	public void handleException() {
		System.out.println("병원간다");
	}
	
}
