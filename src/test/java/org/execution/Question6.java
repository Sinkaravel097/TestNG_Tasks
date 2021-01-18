package org.execution;

import org.base.Base;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Question6 extends Base {
	
	@Parameters("browser")
	@Test
	private void tc1(String browserName) throws InterruptedException {
		
		if (browserName.equals("chrome")) {
			chrome();
			
		} else if (browserName.equals("firefox")) {
			firefox();
		}else{
			edge();
		}
		
		launchUrl("http://www.greenstechnologys.com/");
		maxWindow();

	}
	
	

}
