package MavenTestng;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class contactus {
	WebDriver driver;

	public contactus(WebDriver driver) {
		this.driver = driver;	
	}
	public void Contactus()  throws InterruptedException  {
		driver.findElement(By.xpath("//a[@href='/getaenquiry']")).click();
		driver.findElement(By.xpath("(//a[@href=\"/team\"])[1]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(6000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,450)", "");
		Thread.sleep(6000);
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(6000);
		WebElement scrollUp = driver.findElement(By.cssSelector("button[aria-label='Scroll to top']"));
		scrollUp.click();	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@href='/getaenquiry']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@href='/faq'])[1]")).click();
		JavascriptExecutor jss = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		Thread.sleep(3000);
     	JavascriptExecutor jsss = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,350)", "");
		
		driver.findElement(By.xpath("//a[@href='/getaenquiry']")).click();
		driver.findElement(By.xpath("//a[@href='/workwithus']")).click();

		JavascriptExecutor jssss = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		Thread.sleep(1000);
		JavascriptExecutor jsssss = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,400)", "");
		
		Thread.sleep(1000);
		JavascriptExecutor js2 = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		Thread.sleep(1000);
		js.executeScript("window.scrollBy(0,400)", "");
		
		driver.findElement(By.xpath("//a[@href='/applyjava']")).click();
		Thread.sleep(3000);
		js.executeScript("window.scrollBy(0,550)", "");
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Javed");
		js.executeScript("window.scrollBy(0,350)", "");
		
		driver.findElement(By.xpath("//input[@placeholder='Email Address']")).sendKeys("javed.beg@therapidhire.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("8982455535");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@name='position']")).sendKeys("management");
		js.executeScript("window.scrollBy(0,300)", "");
     	Thread.sleep(1000);
    // 	WebElement choosefile = driver.findElement(By.xpath("//input[@type='file']"));
     	WebElement choosefile = driver.findElement(By.cssSelector("span[class='wpcf7-form-control-wrap resume']"));
     	choosefile.click();
     	Thread.sleep(2000);
     	
		choosefile.sendKeys("D:/Javed_latest.pdf");	
		
		Thread.sleep(2000);
		


	}}

