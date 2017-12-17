package com.bwf.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {
	@FindBy(linkText="���¼")
	private WebElement login_link;
	
	@FindBy(linkText="���ע��")
	private WebElement register_link;
	
	public MainPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void login_click() {
		login_link.click();
	}
	
	public void register_click() {
		register_link.click();
	}
}
