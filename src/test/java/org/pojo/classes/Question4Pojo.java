package org.pojo.classes;

import org.base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Question4Pojo extends Base {
	
	public Question4Pojo() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(xpath="//span[text()='Enter Email/Mobile number']")
	private WebElement emailOrPh;
	
	@FindBy(xpath="//span[text()='Enter Password']")
	private WebElement password;
	
	@FindBy(xpath="(//span[text()='Login'])[2]")
	private WebElement loginBtn;
	
	

	public WebElement getEmailOrPh() {
		return emailOrPh;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

}
