package MavenTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Blogs {
	WebDriver driver;

	public Blogs(WebDriver driver) {
		this.driver = driver;	
	}

	public  void Blogs() throws InterruptedException {
	  Thread.sleep(3000);
		   driver.findElement(By.xpath("//a[@class='nav-link']")).click();
		 
			
		//	 wait.until(ExpectedConditions.elementToBeClickable(Blogbutton));
		   JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollBy(0,350)", "");
			Thread.sleep(3000);
		
			js.executeScript("window.scrollBy(0,350)", "");
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,350)", "");
			Thread.sleep(3000);
			js.executeScript("window.scrollBy(0,350)", "");
			
			Thread.sleep(1000);
			driver.close();
					
				
				
}}