package dropDown;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe" );
		ChromeDriver driver=new ChromeDriver();
		
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	try{
		driver.get("http://testleaf.herokuapp.com/");
		driver.findElementByLinkText("Drop down").click();
		Select select = new Select(driver.findElementById("dropdown1"));
		
		List <WebElement> numselect= select.getOptions();
		int dropdowncount =numselect.size();
		System.out.println(dropdowncount);
		
		select.selectByValue("1");
		Thread.sleep(2000);
		select.selectByVisibleText("Appium"); 
		Thread.sleep(2000);
		select.selectByIndex(4);
	}
	
	catch(Exception e){
		System.out.println(e);
		
	}
	finally{
		Thread.sleep(3000);
		
		driver.quit();
			System.out.println("Browser closed");
	}
		
	}

}
