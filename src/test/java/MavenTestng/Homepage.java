package MavenTestng;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
//import org.openqa.selenium.interactions.Actions;

public class Homepage{
	WebDriver driver;


	public Homepage(WebDriver driver) {
		this.driver = driver;	
	}

	public void Homepage() throws InterruptedException {

		Thread.sleep(8000);

		// driver.findElement(By.xpath("(//*[local-name()='a' and @href='/services'])[5]")).click();
		
		
		
		
		
		
      
		//	driver.findElement(By.xpath("(//*[local-name()='a' and @href='/services'])[5]")).click();
		//	driver.findElement(By.xpath("//*[local-name()='a' and @href='/services'])[3]")).click();
		//	driver.findElement(By.xpath("(//a[@class='readon blue-slide'])[1]")).click();
		Thread.sleep(1000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,400)", "");  
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,400)", "");  
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,400)", "");  
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,650)", "");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(0,400)", "");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@href='/'])[2]")).click();

		Thread.sleep(5000);
		js.executeScript("window.scrollBy(372,4702)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//*[local-name()='a' and @href='/aboutus'])[2]")).click();

		Thread.sleep(5000);
		js.executeScript("window.scrollBy(151,3090)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//li/a[@href='termsofservices']")).click();
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(147,3105)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@href='/services'])[2]")).click();
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(151,3090)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@href='/technology'])[2]")).click();
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(151,3090)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@href='/team'])[2]")).click();
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(151,3090)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/sitemap']")).click();
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(151,3090)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@href='/privacy'])[2]")).click();
		Thread.sleep(8000);
		js.executeScript("window.scrollBy(322,6125)", "");
		Thread.sleep(2000);
		js.executeScript("window.scrollBy(322,4100)", "");
		Thread.sleep(8000);
		driver.findElement(By.xpath("(//a[@href='/faq'])[2]")).click();
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(151,3090)", "");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//a[@href='/letsconnect'])[2]")).click();
		Thread.sleep(5000);
		js.executeScript("window.scrollBy(151,3090)", "");
		Thread.sleep(2000);

		driver.findElement(By.xpath("//i[@class='fa fa-map-marker']")).click();
		Thread.sleep(10000);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String ParentWindow = it.next();
		String ChildWindow = it.next();
		driver.switchTo().window(ParentWindow);
		Thread.sleep(5000);
		//	driver.findElement(By.xpath("//a[@href='mailto:info@therapidhire.com']")).click();
		//	Thread.sleep(10000);

		WebElement password1 = driver.findElement(By.xpath("//input[@class='add-email']"));
		password1.sendKeys("rahul14534@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@class='subbtn']")).click();
		Thread.sleep(8000);
		WebElement scrollUp = driver.findElement(By.cssSelector("button[aria-label='Scroll to top']"));
		scrollUp.click();
		Thread.sleep(1000);

		WebDriverWait waits = new WebDriverWait(driver, Duration.ofSeconds(1000));
		wait.until(ExpectedConditions.numberOfWindowsToBe(2));
		Set<String> handless = driver.getWindowHandles();
		Iterator<String> its = handles.iterator();
		String ParentWindow1 = it.next();
		//		String ChildWindow1 = it.next();
		driver.switchTo().window(ParentWindow1);
		//		driver.switchTo().window(ChildWindow1).close();



		//	driver.close();

		//	Thread.sleep(1000);
		//	driver.quit();

	}}

