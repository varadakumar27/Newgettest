package iFramePrctice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import listener.ITestListenerDemo;

public class Iframeprctic extends ITestListenerDemo  {
	@Test
	public void ifram() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		try{
		driver.get("http://testleaf.herokuapp.com/");
		driver.findElementByXPath("//*[@id='post-153']/div[2]/div/ul/li[10]/a").click();
		
		int size = driver.findElements(By.tagName("iframe")).size();
	    // prints the total number of frames inside outer frame           
	    System.out.println("Total Main Frames --" + size);
	   
	    //In Main 1st frame
	    driver.switchTo().frame(0);
	    System.out.println(driver.findElementByXPath("//*[@id='Click']").getText());
	    
	    int size1 = driver.findElements(By.tagName("iframe")).size();
	    // prints the total number of frames inside the frame           
	    System.out.println("Total Frames inside the 0 --" + size1);
	    
	    driver.findElementById("Click").click();
	  	driver.switchTo().defaultContent();
	  
	  	//In Main 2nd frame
	  		driver.switchTo().frame(1);
	  		int size2 = driver.findElements(By.tagName("iframe")).size();
		    // prints the total number of frames inside the frame           
		    System.out.println("Total Frames in side the 01 --" + size2);
		  
		   //In Main 2nd frame in 1st frame
		    driver.switchTo().frame(0);
		    int size10 = driver.findElements(By.tagName("iframe")).size();
		    // prints the total number of frames inside the frame           
		    System.out.println("Total Frames in side the 1.0 --" + size10);
		    
		    driver.findElementById("Click1").click();
		  	driver.switchTo().defaultContent();
		 
		driver.switchTo().frame(2);
		int size20 = driver.findElements(By.tagName("iframe")).size();
	    // prints the total number of frames inside the frame           
	    System.out.println("Total Frames in side the 2.0 --" + size20);
	    
	    
		
	}
	catch (Exception e)
{
		System.out.println(e);
		driver.quit();
	}
	finally{
		  Thread.sleep(2000);
		driver.quit();
		System.out.println("Browser Closed succesfully");
	}
	}

}