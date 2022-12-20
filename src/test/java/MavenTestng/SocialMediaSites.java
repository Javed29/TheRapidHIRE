package MavenTestng;



import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class SocialMediaSites  {
	WebDriver driver;


	public SocialMediaSites(WebDriver driver) {
		this.driver = driver;
	}

	public void SocialMediaSites()  throws InterruptedException       {

		
		Thread.sleep(5000);

	
		WebElement twitter = driver.findElement(By.xpath("//li[@class='twit']"));
		twitter.click();
		Thread.sleep(6000);
		
		driver.navigate().to("https://therapidhire.com/");
		WebElement insta = driver.findElement(By.xpath("//li[@class='insta']"));
		insta.click();
		Thread.sleep(6000);
		
		driver.navigate().to("https://therapidhire.com/");
		WebElement linke = driver.findElement(By.xpath("//li[@class='linke']"));
		linke.click();
		Thread.sleep(6000);
		
    	driver.navigate().to("https://therapidhire.com/");
		WebElement face = driver.findElement(By.xpath("//li[@class='facebook']"));
		face.click();
		Thread.sleep(6000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(1000));
        wait.until(ExpectedConditions.numberOfWindowsToBe(6));
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		String parentWindow = it.next();
		String childWindow = it.next();
		String childWindow1 = it.next();
		String childWindow2 = it.next();
		String childWindow3 = it.next();
		String childWindow4 = it.next();
		driver.switchTo().window(parentWindow);
		driver.switchTo().window(childWindow).close();
		driver.switchTo().window(childWindow1).close();
		driver.switchTo().window(childWindow2).close();
		driver.switchTo().window(childWindow3).close();
		driver.switchTo().window(childWindow4).close();
		driver.switchTo().window(parentWindow);
		
		
	
		
	//	driver.close();
	// driver.quit();
	

	}		  
}



