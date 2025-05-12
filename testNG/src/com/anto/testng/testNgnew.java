package com.anto.testng;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameters;

public class testNgnew {
	
	@AfterTest  
	//delete cookies
	public void aftertest() {
		System.out.println("Test AfterTestNG");	
	}
	
	@Test
	public void test() {
		
		System.out.println("Hi anto");
		}
	
	@Test
	public void test1() {
		
		System.out.println("Hi anto");
		}
	
	@Test
	public void test2() {
		
		System.out.println("Hi anto");
	}
@BeforeTest
//clean up data
public void beforetest() {
	System.out.println("Test Before TestNG");
}


@BeforeMethod
public void beforemethod() {
	System.out.println("Test the beforemethod");
}

}


