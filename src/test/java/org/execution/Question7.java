package org.execution;

import org.base.Base;
import org.pojo.classes.Question4Pojo;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question7 extends Base {
	
	@Parameters("browser")
	@Test
	private void tc1(String browserName) {
		
		if (browserName.equals("chromebrowser")) {
			chrome();
		} else if (browserName.equals("firefoxbrowser")) {
			firefox();	
		}
		else {	
			edge();
		}	
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
