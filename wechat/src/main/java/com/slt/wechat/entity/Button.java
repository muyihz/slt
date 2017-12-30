package com.slt.wechat.entity;

public class Button {
	private String name;
	private String type;
	private String key;
	private String url;
	private SubButton[] sub_button;
	
	public Button() {
		super();
	}
	
	
	public Button(String name, String type, String key, String url, SubButton[] sub_button) {
		super();
		this.name = name;
		this.type = type;
		this.key = key;
		this.url = url;
		this.sub_button = sub_button;
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
	public SubButton[] getSub_button() {
		return sub_button;
	}
	public void setSub_button(SubButton[] sub_button) {
		this.sub_button = sub_button;
	}
	
}
