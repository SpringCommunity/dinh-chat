package com.herokuuapp.angular.chatapp.domain;

public class OutputMessage {
	private String time;
	private String from;
	private String text;
	public OutputMessage() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OutputMessage(String time, String from, String text) {
		super();
		this.time = time;
		this.from = from;
		this.text = text;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	
	
}
