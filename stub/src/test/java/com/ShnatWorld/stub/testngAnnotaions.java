package com.ShnatWorld.stub;
import org.junit.BeforeClass;
import org.junit.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
public class testngAnnotaions {
	//test case 1
	@Test
	public void testCase1(){
		System.out.println("in test case 1");
		
	}
	// test case 2
	@Test
	public void testCase2(){
		System.out.println("in test case 2");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("in before method");
		
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("in after method");
	}
	
	@BeforeClass
	public void afterclass() {
		System.out.println("in before class");
	}
    @AfterClass
    public void afterClass() {
    	System.out.println("in after class");
    }
    
    @BeforeTest
    public void beforeTest(){
    	System.out.println("in before test");
    }
    
    @AfterTest
    public void aftertest() {
    	System.out.println("in after test");
    }
    @BeforeSuite
    public void beforeSuite() {
    	System.out.println("in before test");
    }
    @AfterSuite
    public void afterSuite() {
    	System.out.println("'in afterSuite");
    }
}
