package Login_page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

@Test
public class Main_class {

	public void login_form() throws InterruptedException
	{


	WebDriver driver=new FirefoxDriver();
	//Login Page
	driver.get("https://portal-test.bridge.ac.ke/");
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
	
	driver.findElement(By.xpath(".//*[@id='bia-login']")).click();
		
	driver.findElement(By.id("UserName")).sendKeys("test_manager1");
		
	driver.findElement(By.id("Password")).sendKeys("test123");
	
	driver.findElement(By.xpath("//input[@value='Log On']")).click();
	
	
	//Click on Billing tab
	
	driver.findElement(By.linkText("Billing")).click();
	
	Thread.sleep(2000);
	
	
	//Click on Siblings button
	driver.findElement(By.linkText("Siblings")).click();
	
	
	WebDriverWait wait = new WebDriverWait(driver, 50);
	
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));
	
//	System.out.println(driver.findElement(By.xpath("//input[@type='text']")).isDisplayed());
		
//	driver.findElement(By.xpath("//input[@type='text']")).isEnabled();
//	driver.findElement(By.xpath("//input[@type='text']")).click();
	
	
	//*****Search using unique text or national id****
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ruhi");
  
	//*****Click on Verify button of searched record
	driver.findElement(By.xpath("//input[@value='Verify']")).click();
	
    //***** Click on Confirm button
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Confirm National Id']")));
	
	System.out.println(driver.findElement(By.xpath("//input[@value='Confirm National Id']")).isDisplayed());
	driver.findElement(By.xpath("//input[@value='Confirm National Id']")).isDisplayed();
	driver.findElement(By.xpath("//input[@value='Confirm National Id']")).isEnabled();
	
	driver.findElement(By.xpath("//input[@value='Confirm National Id']")).click();
	
	
	//*****
	
	}
}