package com.ssafy.di;

import org.springframework.stereotype.Component;

public class Laptop implements Computer {
	public String getInfo() {
		return "랩탑";
	}
}
