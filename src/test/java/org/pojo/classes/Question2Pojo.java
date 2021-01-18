package org.pojo.classes;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Question2Pojo extends Base {

	public Question2Pojo() {
		PageFactory.initElements(driver, this);
	}
	
	
	
	@FindBy(id="signin-block")
	private WebElement account;
	
	@FindBy(xpath="//li[text()='Sign In/Sign Up']")
	private WebElement signIn;
	
	@FindBy(xpath="//iframe[@class='modalIframe']")
	private WebElement frame;
	
	@FindBy(id="mobileNoInp")
	private WebElement mobileTxtField;
	
	
	
	public WebElement getFrame() {
		return frame;
	}

	public WebElement getMobileTxtField() {
		return mobileTxtField;
	}

	public WebElement getAccount() {
		return account;
	}

	public WebElement getSignIn() {
		return signIn;
	}
	
	
}
