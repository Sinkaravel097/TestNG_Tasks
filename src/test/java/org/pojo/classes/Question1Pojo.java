package org.pojo.classes;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Question1Pojo extends Base{
	
	public Question1Pojo() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(id="u_0_b")
	private WebElement login;
	
	@FindBy(xpath="//div[contains(text(),'entered is incorrect')]")
	private WebElement loginFailed;
	
	

	public WebElement getLoginFailed() {
		return loginFailed;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}

}
