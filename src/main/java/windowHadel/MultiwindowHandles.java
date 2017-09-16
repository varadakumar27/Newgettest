package windowHadel;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class MultiwindowHandles {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		try{
			driver.get("http://testleaf.herokuapp.com/");
		
		System.out.println(driver.findElementByXPath("//*[@id='post-153']/div[2]/div/ul/li[11]/a/h5").getText());
	 	driver.findElementByXPath("//*[@id='post-153']/div[2]/div/ul/li[11]/a/h5").click();
		
		driver.findElementById("home").click();
		System.out.println(driver.findElementById("home").getText());
		System.out.println(driver.getWindowHandles().size());
		Set<String> mainwindow = driver.getWindowHandles();
		
		for(String first1window : mainwindow){
			driver.switchTo().window(first1window);
		}//ends forecah
		
		String window1st =driver.getCurrentUrl();
		System.out.println(window1st);
		System.out.println(driver.getWindowHandles().size() + "First window size");
		
		if(window1st.equals("http://testleaf.herokuapp.com/home.html")){
			System.out.println(driver.findElementByXPath("//*[@id='post-153']/div[2]/div/ul/li[11]/a/h5").getText());
			driver.findElementByXPath("//*[@id='post-153']/div[2]/div/ul/li[11]/a/h5").click();
			driver.findElementByXPath("//*[@id='contentblock']/section/div[2]/div/div/button").click();
			driver.getWindowHandles().size();
			
		}
		else {
			System.out.println("Wrong window landed");
		}
		
		
		}//Ends try block
		
		catch(Exception e){
			System.out.println(e);
		
				}
		
		finally{
			Thread.sleep(2000);
			driver.quit();
			System.out.println("From Finally Browser closed successfully");
		}
		
		}
	
		
	

}
