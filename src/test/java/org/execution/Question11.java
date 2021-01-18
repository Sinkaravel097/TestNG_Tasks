package org.execution;

import org.base.Base;
import org.pojo.classes.FbLoginPojo;
import org.pojo.classes.Question3Pojo;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Question11 extends Base {
	
	@BeforeClass
	private void launchBrowser() {
		chrome();
	}
	
	@Test(groups="sanity")
	private void tc1() throws InterruptedException {
		launchUrl("https://www.facebook.com/");
		maxWindow();
		FbLoginPojo fb = new FbLoginPojo();
		findEle(fb.getUserEmail(), "java@gmail.com");
		findEle(fb.getUserPassword(), "Java");
		clickAny(fb.getLogin());
		Thread.sleep(3000);
	}
	
	@Test(groups="smoke")
	private void tc2() {
		launchUrl("https://www.facebook.com/");
		maxWindow();
		FbLoginPojo fb = new FbLoginPojo();
		findEle(fb.getUserEmail(), "selenium@gmail.com");
		findEle(fb.getUserPassword(), "Selenium");
		clickAny(fb.getLogin());
	}

}
