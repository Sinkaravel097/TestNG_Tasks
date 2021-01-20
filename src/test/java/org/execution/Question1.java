package org.execution;

import org.base.Base;
import org.pojo.classes.Question1Pojo;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Question1 extends Base{
	
	
	@BeforeClass
	private void launchBrowser() {
		chrome();
	}
	
	@Parameters({"emailield","passwordfield"})
	@Test
	private void tc1(@Optional("vishal@gmail.com")String email, String pass) throws Exception {
		
		launchUrl("https://www.facebook.com/");
		maxWindow();
		
		Thread.sleep(3000);
		
		Question1Pojo f = new Question1Pojo();
		
		findEle(f.getEmail(), email);
		findEle(f.getPassword(), pass);
		clickAny(f.getLogin());
		
		String textGet = textGet(f.getLoginFailed());
		
		if (textGet.contains("The password that you've entered is incorrect. Forgotten password?")) {
			
			System.out.println("Please Enter The Valid Username And Password");

		}

	}
	

}
