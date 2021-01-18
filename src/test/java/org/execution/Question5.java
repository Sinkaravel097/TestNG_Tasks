package org.execution;

import java.io.IOException;

import org.base.Base;
import org.pojo.classes.Question5Pojo;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Question5 extends Base{
	
	@BeforeClass
	private void launchBrowser() {
		chrome();
	}
	
	@Test
	private void tc2() throws IOException {
		launchUrl("https://demoqa.com/automation-practice-form/");
		maxWindow();
		implicitTime();
		Question5Pojo q5 = new Question5Pojo();
		sendText(q5.getFirstname(), readExcel(1, 0));
		findEle(q5.getFirstname(), readExcel(1, 0));
		findEle(q5.getLastName(), readExcel(1, 1));
		findEle(q5.getEmail(), readExcel(1, 2));
		javaClick(q5.getGender());
		findEle(q5.getNumber(), readExcel(1, 3));
		javaSendKeys(q5.getSub(), readExcel(1, 4));
		Object jg = javaGetAttribute(q5.getSub());
		System.out.println("Subject : "+jg);
		scrollUpAndDown(q5.getHobbies());
		javaClick(q5.getHobbies());
		findEle(q5.getAddress(), readExcel(1, 5));
		clickAny(q5.getSubmit());
		
		String textGet = textGet(q5.getSuccessful());
		if (textGet.contains("Thanks")) {
			System.out.println("Valid Inputs");
		}

	}
	

}
