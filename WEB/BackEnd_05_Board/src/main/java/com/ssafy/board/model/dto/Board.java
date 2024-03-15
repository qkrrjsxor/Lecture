package com.ssafy.board.model.dto;

import java.util.Date;

public class Board {
	private static int no = 1;	//클래스 변수, 데이터베이스 쓰지 않고 Board 싱글턴 객체 자체 내부 클래스 변수
	
	private int id;
	private String title;
	private String writer;
	private String content;
	private int viewCnt;
	private String regDate;	//Date 자료형 아니라 String으로 하면 데이터베이스 관리할떄? 편하다
	
	public Board() {}
	
	public Board(String title, String writer, String content) {
		super();
		this.id = no++;
		this.title = title;
		this.writer = writer;
		this.content = content;
		//this.viewCnt = 0;
		this.regDate = new Date().toString();;
	}

	@Override
	public String toString() {
		return "Board [id=" + id + ", title=" + title + ", writer=" + writer + ", content=" + content + ", viewCnt="
				+ viewCnt + ", regDate=" + regDate + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getViewCnt() {
		return viewCnt;
	}

	public void setViewCnt(int viewCnt) {
		this.viewCnt = viewCnt;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	
	
}
