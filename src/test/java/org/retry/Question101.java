package org.retry;

import org.base.Base;
import org.pojo.classes.Question3Pojo;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Question101 extends Base{
	
	@BeforeClass
	private void launchBrowser() {
		chrome();
	}
	
	@Test(retryAnalyzer=Failed.class)
	private void tc1() {
		launchUrl("https://demoqa.com/automation-practice-form/");
		maxWindow();
		implicitTime();
		Question3Pojo q3 = new Question3Pojo();
		findEle(q3.getFirstname(), "Vishal");
		findEle(q3.getLastName(), "S");
		findEle(q3.getEmail(), "vishal@gmail.com");
		Assert.assertTrue(false, "Assert Failed Please Check The Code");
		javaClick(q3.getGender());
		findEle(q3.getNumber(), "0000000000");
		javaSendKeys(q3.getSub(), "12345678");
		Object jg = javaGetAttribute(q3.getSub());
		System.out.println("Subject : "+jg);
		scrollUpAndDown(q3.getHobbies());
		javaClick(q3.getHobbies());
		findEle(q3.getAddress(), "I Dont Know Address");
		clickAny(q3.getSubmit());
	}

}
