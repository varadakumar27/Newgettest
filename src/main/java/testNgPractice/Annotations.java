package testNgPractice;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import listener.ITestListenerDemo;

public class Annotations extends ITestListenerDemo {
	
	@BeforeSuite
	public void beforessuit(){
		System.out.println("befor suite");
	}
	@BeforeTest
		public void beforetest(){
			System.out.println("befor test");
		}
	@BeforeMethod
			public void beforemethod(){
				System.out.println("befor method");
			}
			@Test(groups="test1")
				public void test(){
					System.out.println("befor test1");
	}
	
			@Test(groups="test1")
			public void test1(){
				System.out.println("befor test2");
}
			@Test(groups="test2")
			public void test2(){
				System.out.println("befor test");
}
			@AfterMethod
				public void aftermethod(){
				System.out.println("after method");

				}
				@AfterTest
				public void aftertest(){
				System.out.println("after test");

				}
				@AfterSuite
				public void aftersuit(){
				System.out.println("after suite");

				}



}
