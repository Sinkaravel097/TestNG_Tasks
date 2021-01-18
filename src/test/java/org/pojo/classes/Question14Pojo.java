package org.pojo.classes;

import org.base.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Question14Pojo extends Base {
	
	public Question14Pojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='identifierId']")
	private WebElement email;
	
	@FindBy(xpath="//span[text()='Next']")
	private WebElement next;

	public WebElement getEmail() {
		return email;
	}

	public WebElement getNext() {
		return next;
	}

}
