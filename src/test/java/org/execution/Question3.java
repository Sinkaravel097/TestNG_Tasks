package org.execution;

import org.base.Base;
import org.pojo.classes.Question3Pojo;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Question3 extends Base{
	
	@BeforeClass
	private void launchBrowser() {
		edge();
	}
	
	@Parameters({"firstname","lastname","email","number"})
	@Test
	private void tc1(String firstName, String lastName,String email,String num) {
		launchUrl("https://demoqa.com/automation-practice-form/");
		maxWindow();
		implicitTime();
		Question3Pojo q3 = new Question3Pojo();
		findEle(q3.getFirstname(), firstName);
		findEle(q3.getLastName(), lastName);
		findEle(q3.getEmail(), email);
		javaClick(q3.getGender());
		findEle(q3.getNumber(), num);
		javaSendKeys(q3.getSub(), "12345678");
		Object jg = javaGetAttribute(q3.getSub());
		System.out.println("Subject : "+jg);
		scrollUpAndDown(q3.getHobbies());
		javaClick(q3.getHobbies());
		findEle(q3.getAddress(), "I Dont Know Address");
		clickAny(q3.getSubmit());
		
		String textGet = textGet(q3.getSuccessful());

		if (textGet.contains("Thanks for submitting the form")) {
			System.out.println("Valid Inputs");
		}

	
	}

}
