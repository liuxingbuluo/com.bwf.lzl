package com.bwf.page;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UserPage {
	List<WebElement> reg_input_list = new ArrayList<>();
	private WebDriver driver;
	@FindBy(xpath="//input[@name='username']")
	private WebElement input_username;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement input_password;
	
	@FindBy(xpath="//input[@name='confirm_password']")
	private WebElement input_confirm_password;
	
	@FindBy(xpath="//input[@name='submit']")
	private WebElement login_now;
	
	@FindBy(css="div.boxCenterList > div > p")
	private WebElement login_result_text;
	
	@FindBy(id="username")
	private WebElement reg_username_input;
	
	@FindBy(xpath="//input[@name='email']")
	private WebElement reg_email_input;
	
	@FindBy(id="password1")
	private WebElement reg_password_input;
	
	@FindBy(id="conform_password")
	private WebElement reg_confirm_password_input;
	
	@FindBy(xpath="//input[@name='extend_field5']")
	private WebElement reg_phone_input;
	
	@FindBy(xpath="//input[@class='us_Submit_reg']")
	private WebElement register_submit;
	
	
	public UserPage() {
		// TODO Auto-generated constructor stub
	}
	
	public UserPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		reg_input_list.add(reg_username_input);
		reg_input_list.add(reg_email_input);
		reg_input_list.add(reg_password_input);
		reg_input_list.add(reg_confirm_password_input);
		reg_input_list.add(reg_phone_input);
	}
	
	public void InputUsername(String username) {
		input_username.sendKeys(username);
	}
	
	public void InputPassword(String password) {
		input_password.sendKeys(password);
	}
	/**
	 * 对注册信息输入内容
	 * @param index
	 * @param content
	 */
	public void input_reg_info(int index,String content) {
		reg_input_list.get(index-1).sendKeys(content);
	}
	
	public void Login_Click() {
		login_now.click();
	}
	
	public void Register_Submit_Click() {
		register_submit.click();
	}
	public void getAlert(WebDriver driver,String expectedText) {
		Alert alert = driver.switchTo().alert();
		String alert_result = alert.getText();
		alert.accept();
		assertTrue(alert_result.contains(expectedText));
	}
	
	public void getTextResult(String expectedText) {
		
		String actualresult = login_result_text.getText();

		assertEquals(expectedText, actualresult);
	}
	
	/**
	 * 检查点，检查第几项的文字提示信息是否匹配
	 * @param index
	 * @param expectedText
	 */
	public void assert_input_tip(int index,String expectedText) {	
		String actual_Text = reg_input_list.get(index-1).findElement(By.xpath("../span")).getText();
		assertTrue(actual_Text.contains(expectedText));
	}

}
