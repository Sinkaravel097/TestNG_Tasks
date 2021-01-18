package org.execution;

import org.base.Base;
import org.pojo.classes.Question4Pojo;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Question4 extends Base {

	@BeforeClass
	private void launchBrowser() {
		chrome();
	}
	
	@Test
	private void tc1() throws InterruptedException {
		launchUrl("https://www.flipkart.com/account/login");
		
		maxWindow();
				
		Question4Pojo q4 = new Question4Pojo();
				
		javaSendKeys(q4.getEmailOrPh(), "vishal@gmail.com");
		
		System.out.println("Entered User Name : "+javaGetAttribute(q4.getEmailOrPh()));
		
		javaSendKeys(q4.getPassword(), "vishal");
		
		System.out.println("Entered Password : "+javaGetAttribute(q4.getPassword()));
				
		clickAny(q4.getLoginBtn());
		
	}
}
