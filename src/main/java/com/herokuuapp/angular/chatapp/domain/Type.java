package com.herokuuapp.angular.chatapp.domain;

public class Type {
    private long typeId;
    private String typeName;
	public Type() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Type(long typeId, String typeName) {
		super();
		this.typeId = typeId;
		this.typeName = typeName;
	}
	public long getTypeId() {
		return typeId;
	}
	public void setTypeId(long typeId) {
		this.typeId = typeId;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
    
    
}
