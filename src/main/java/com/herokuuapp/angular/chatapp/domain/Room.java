package com.herokuuapp.angular.chatapp.domain;

public class Room {
     private long roomId;
     private String roomName;
     private Type roomType;
     private String roomDetails;
     private String roomIcon;
	
	
	public Room(long roomId, String roomName, Type roomType, String roomDetails, String roomIcon) {
		super();
		this.roomId = roomId;
		this.roomName = roomName;
		this.roomType = roomType;
		this.roomDetails = roomDetails;
		this.roomIcon = roomIcon;
	}
	public Room() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getRoomId() {
		return roomId;
	}
	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public Type getRoomType() {
		return roomType;
	}
	public void setRoomType(Type roomType) {
		this.roomType = roomType;
	}
	public String getRoomDetails() {
		return roomDetails;
	}
	public void setRoomDetails(String roomDetails) {
		this.roomDetails = roomDetails;
	}
	public String getRoomIcon() {
		return roomIcon;
	}
	public void setRoomIcon(String roomIcon) {
		this.roomIcon = roomIcon;
	}
     
     
}
