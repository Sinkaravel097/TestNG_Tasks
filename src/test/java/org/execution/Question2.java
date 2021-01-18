package org.execution;

import org.base.Base;
import org.pojo.classes.Question2Pojo;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class Question2 extends Base{
	
	@BeforeClass
	private void launchBrowser() {
		firefox();
	}
	
	@Parameters({"phno"})
	@Test
	private void tc1(String ph) throws InterruptedException {
		
		launchUrl("https://www.redbus.in/");
		
		maxWindow();
		
		implicitTime();
		
		Question2Pojo r = new Question2Pojo();
		
		clickAny(r.getAccount());
		
		clickAny(r.getSignIn());
		
		switchToFrameUsingElement(r.getFrame());
		
		findEle(r.getMobileTxtField(), ph);
		
	}

}
