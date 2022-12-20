package MavenTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class WeAre {
	WebDriver driver;


	public WeAre(WebDriver driver) {
		this.driver = driver;	
	}
	public  void WeArepage() throws InterruptedException {
		this.driver = driver;	
		driver.findElement(By.cssSelector("a[href='#']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@href='/aboutus'])[1]")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(3000);
       
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(3000);

		JavascriptExecutor jsss = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(3000);

		JavascriptExecutor jssss = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,450)", "");
		Thread.sleep(3000);	
		driver.findElement(By.cssSelector("a[href='#']")).click();
		Thread.sleep(4000);	
		driver.findElement(By.xpath("(//a[@href='/services'])[1]")).click();
		Thread.sleep(4000);
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(3000);
		
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 400)", "");
		Thread.sleep(3000);
		JavascriptExecutor js3 = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 400)", "");
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("a[href='#']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@href=\"/technology\"])[1]")).click();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(3000);
	
		js.executeScript("window.scrollBy(0,500)", "");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,700)", "");
		Thread.sleep(4000);
		
		
	}}



