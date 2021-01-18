package org.execution;

import org.base.Base;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Question8 extends Base {
	
	@BeforeClass
	private void launchBrowser() {
		chrome();
	}
	
	@Test
	private void tc1() {
		launchUrl("http://www.greenstechnologys.com/");
		maxWindow();
	}
	

}
