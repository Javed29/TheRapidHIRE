package MavenTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class Letsconnect   {
	WebDriver driver;

	public Letsconnect(WebDriver driver) {
		this.driver = driver;	
	}

	public void Letsconnectpage()  throws InterruptedException  {
		driver.findElement(By.xpath("//a[@class='enquirebtn']")).click();
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Javed");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("javed9931@gmail.com");
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8947455535");
        driver.findElement(By.xpath("//input[@name ='website']")).sendKeys("ecom webd devlopment");
        driver.findElement(By.xpath("//textarea[@id='message']")).sendKeys("i need for devlopment");
        JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,450)", "");
		
		 Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@type='submit']")).click();
        
        Thread.sleep(6000);
        js.executeScript("window.scrollBy(0,450)", "");
        
     //   Thread.sleep(6000);
        
        
	}}
