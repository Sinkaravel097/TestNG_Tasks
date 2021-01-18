package org.execution;

import org.base.Base;
import org.pojo.classes.Question14Pojo;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Question15 extends Base{
	
	@DataProvider(name="Authentication")
	public Object[][] credentials() {
		return new Object[][] {
			{"vishal30071997@gmail.com","vishal"}
		};
	}
	
	@BeforeClass
	private void launchBrowser() {
		chrome();
	}
	
	@Test(dataProvider="Authentication")
	private void test(String email, String pass) {
		launchUrl("https://mail.google.com/");
		maxWindow();
		Question14Pojo q14 = new Question14Pojo();
		findEle(q14.getEmail(), email);
		javaClick(q14.getNext());
	}
	
	

}
