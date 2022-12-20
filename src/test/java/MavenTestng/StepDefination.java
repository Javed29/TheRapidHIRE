package MavenTestng; 

import org.checkerframework.checker.units.qual.Time;
import org.junit.experimental.theories.suppliers.TestedOn;
import org.junit.rules.TestName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.TestNG;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.TestInstance;
import org.testng.internal.annotations.TestAnnotation;

import com.google.common.annotations.VisibleForTesting;

import junit.framework.TestCase;

public class StepDefination {
	
	WebDriver driver;
	SocialMediaSites socialMediaSites;
	StepDefination stepDefination;
	Login login;
	Letsconnect letsconnect;
	contactus Contactus;
	WeAre weare;
	Homepage homepage;
	Blogs blogs;
	@BeforeTest
	
	
	public void Setup() throws InterruptedException {
		 driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 socialMediaSites = new SocialMediaSites(driver);
		 login  = new Login(driver);
		 Contactus = new contactus(driver);
		 letsconnect = new Letsconnect(driver);
		 weare = new WeAre(driver);
		 homepage =new Homepage(driver);
		 blogs = new Blogs(driver);
		 driver.get("https://WWW.therapidhire.com/");
		 driver.findElement(By.xpath("//button[@class='readoncookie']")).click();
		
       	 
	}
//     @Test(priority=1 )
//	public void SocialMediaSites() throws InterruptedException {
//		socialMediaSites.SocialMediaSites();
//		
//	}
//     
//     @Test(priority=2)
//     public void LoginFunctionality() throws InterruptedException {
//    	 login.LoginPage(); 
//     }
//      
//    
//     @Test(priority=3)
//     public void Letsconnect() throws InterruptedException {
//    	 letsconnect.Letsconnectpage();
//     }
    
     @Test(priority=0)
     public void contactus()throws  InterruptedException {
    	 Contactus.Contactus();
    }
   
//	@Test(priority=5)
//   public void WeAre()throws  InterruptedException {
//		weare.WeArepage();
//		
//     }
//	@Test(priority=3)
//	 public void Homepage()throws  InterruptedException {
//		 homepage.Homepage();
//	
//}
//    
//	@Test(priority=6)
//	 public void Blogs()throws  InterruptedException {
//		 blogs.Blogs();
//		 
//}
		 
}
 
      
     
       
    
  
