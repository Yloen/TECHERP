package com.tech.ssm.domain;

public class Menu {

	private String menu_code;
	private String menu_name;
	
	public String getMenu_code() {
		return menu_code;
	}
	public void setMenu_code(String menu_code) {
		this.menu_code = menu_code;
	}
	public String getMenu_name() {
		return menu_name;
	}
	public void setMenu_name(String menu_name) {
		this.menu_name = menu_name;
	}
	@Override
	public String toString() {
		return "Menu [menu_code=" + menu_code + ", menu_name=" + menu_name + "]";
	}
}
