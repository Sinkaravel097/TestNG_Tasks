package org.execution;

import org.base.Base;
import org.pojo.classes.Question3Pojo;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Question12 extends Base {
	
	public static Question3Pojo q3;
	
	@BeforeClass
	private void launchBrowser() {
		chrome();
	}
	
	@Test
	private void tc1() {
		launchUrl("https://demoqa.com/automation-practice-form/");
		maxWindow();
		implicitTime();
	}
	
	@Test
	private void tc2() {
		q3 = new Question3Pojo();
		findEle(q3.getFirstname(), "Vishal");
	}
	
	@Test
	private void tc3() {
		q3 = new Question3Pojo();
		findEle(q3.getLastName(), "S");
	}
	
	@Test
	private void tc4() {
		q3 = new Question3Pojo();
		findEle(q3.getEmail(), "vishal@gmail.com");
	}

	@Test
	private void tc5() {
		q3 = new Question3Pojo();
		javaClick(q3.getGender());
		findEle(q3.getNumber(), "0000000000");
	}
	
	@Test
	private void tc6() {
		q3 = new Question3Pojo();
		javaSendKeys(q3.getSub(), "12345678");
		Object jg = javaGetAttribute(q3.getSub());
		System.out.println("Subject : "+jg);
		scrollUpAndDown(q3.getHobbies());
		javaClick(q3.getHobbies());
	}
	
	@Test
	private void tc7() {
		q3 = new Question3Pojo();
		findEle(q3.getAddress(), "I Dont Know Address");
		clickAny(q3.getSubmit());
	}
}
