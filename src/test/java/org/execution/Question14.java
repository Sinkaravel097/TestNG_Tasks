package org.execution;

import org.base.Base;
import org.pojo.classes.Question14Pojo;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Question14 extends Base {

	@BeforeClass
	private void launchBrowser() {
		edge();
	}

	@Parameters({ "username", "password" })
	@Test
	private void tc1(String email, String pass) {
		launchUrl(
				"https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&ss=1&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
		maxWindow();
		Question14Pojo q14 = new Question14Pojo();
		findEle(q14.getEmail(), email);
		javaClick(q14.getNext());
	}

}
