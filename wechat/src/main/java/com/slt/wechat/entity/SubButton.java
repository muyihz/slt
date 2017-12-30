package com.slt.wechat.entity;

public class SubButton {
	private String name;
	private String type;
	private String key;
	private String url;
	
	
	
	public SubButton(String name, String type, String key, String url) {
		super();
		this.name = name;
		this.type = type;
		this.key = key;
		this.url = url;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
}
