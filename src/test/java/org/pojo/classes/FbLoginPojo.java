package org.pojo.classes;

import java.util.List;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class FbLoginPojo extends Base {
	
	public FbLoginPojo() {
		
		PageFactory.initElements(driver, this);
	}
	
	@CacheLookup
	@FindBy(id="email")
	private WebElement userEmail;
	
	@CacheLookup
	@FindBy(id="pass")
	private WebElement userPassword;
	
	@CacheLookup
	@FindBy(id="u_0_b")
	private WebElement login;

	public WebElement getUserEmail() {
		return userEmail;
	}

	public WebElement getUserPassword() {
		return userPassword;
	}

	public WebElement getLogin() {
		return login;
	}
	
//	@FindBys({
//		@FindBy(id="email"),
//		@FindBy(name="email")
//	})
//	private List<WebElement> user;


}
