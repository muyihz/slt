package com.slt.wechat.entity;

public class Menu {
	
	public Menu() {	
		super();
	}
	
	public Menu(Button[] button) {
		super();
		this.button = button;
	}

	private Button[]  button;

	public Button[] getButton() {
		return button;
	}

	public void setButton(Button[] button) {
		this.button = button;
	}
}
