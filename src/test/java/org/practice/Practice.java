package org.practice;

import org.base.Base;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Practice extends Base {
	
	@Test(priority=20)
	private void tc1() {		
		System.out.println("Test 1");
	}
	
	@Test(priority=-20, enabled=false)
	private void tc2() {
		System.out.println("Test 2");
	}
	
	@Test(enabled=false)
	private void tc3() {
		System.out.println("Test 3");
	}
	
	@Test(priority=0)
	private void tc4() {
		System.out.println("Test 4");
	}
	
	@Test
	private void tc5() {
		System.out.println("Test 5");

	}
	
	@Test(priority=1, invocationCount=3)
	private void tc6() {
		System.out.println("Test 6");
	}

}
