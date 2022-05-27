package com.testng.practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNgPractice1Test extends TestNgBasicConfigAnnotationPracticeTest{
	@Test(groups="sanity")

	public void practice1Test() {
		Reporter.log("TestNgPractice1Test-->Test1", true);
	}
	@Test(groups="regression")
public void practice2Test() {
	Reporter.log("TestNgPractice1Test-->Test2", true);
}
	@Test(groups="regression")
	
public void practice3Test() {
	Reporter.log("TestNgPractice1Test-->Test3", true);
}
}
