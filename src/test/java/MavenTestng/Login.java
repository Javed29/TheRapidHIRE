package MavenTestng;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Login  {
	WebDriver driver;

	public Login(WebDriver driver) {
		this.driver = driver;	
	}

	public void LoginPage()  throws InterruptedException  {
		
	
		
		driver.findElement(By.xpath("//a[contains(@class,'loginbtn')]")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3000));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,550)", "");
		WebElement signup  = driver.findElement(By.xpath("//a[@href='/Signup']"));  
		wait.until(ExpectedConditions.elementToBeClickable(signup)) ;
		try {
			signup.click();
		}
		catch (ElementClickInterceptedException e) {
			System.out.println("Dom not refreshed excutor needed");
			js.executeScript("arguments[0].click();", signup);
		}
		WebElement fullname = driver.findElement(By.xpath("//input[@name='fname']"));
		fullname.sendKeys("javed VAG");

		WebElement email = driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys("javed.beg@therapidhire.com");

		WebElement phone1 = driver.findElement(By.xpath("//input[@type='tel']"));
		phone1.sendKeys("8982475535");

		WebElement occupation = driver.findElement(By.xpath("//select[@class='form-select occu']"));

		Select s =new Select(occupation);
		s.selectByVisibleText("Student");




		js.executeScript("window.scrollBy(0,1000)", "");

		WebElement password1 = driver.findElement(By.xpath("//input[@name='password']"));
		password1.sendKeys("#Equifax2014");

		WebElement cpassword1 = driver.findElement(By.xpath("//input[@placeholder='Confirm Password']"));
		cpassword1.sendKeys("#Equifax2014");

		WebElement address2 = driver.findElement(By.xpath("//textarea[@class='form-control']"));
		address2 .sendKeys("i am javed from indore mp ");


		By createaccount  = By.xpath("//input[@value='Create Account']");
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(createaccount));
			wait.until(ExpectedConditions.visibilityOfElementLocated(createaccount));
			wait.until(ExpectedConditions.elementToBeClickable(createaccount)) ;
			driver.findElement(createaccount).click();
		}
		catch (ElementClickInterceptedException e) {
			WebElement createaccount1  = driver.findElement(By.xpath("//input[@value='Create Account']"));  js.executeScript("arguments[0].click();", createaccount1);
		}

		Thread.sleep(8000);

		driver.findElement(By.xpath("//a[@class='loginbtn']")).click();

		WebElement title = driver.findElement(By.xpath("//h2[@class='title ']"));

		boolean cross = title.isDisplayed();
		System.out.println(cross);

		Thread.sleep(5000);
		
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,350)", "");
		
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Javed.beg@therapidhire.com");
		Thread.sleep(1000);
		
		
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("#Equifax2014");
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='readon submit'] ")).click();
		Thread.sleep(5000);
		
	}
}
