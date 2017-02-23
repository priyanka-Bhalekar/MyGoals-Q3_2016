package Login_page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

@Test
public class Sibling_Pending extends Login {
	
	public void Pending_tab() throws InterruptedException
	{
//	.//div[@class='container']//*[text()='Pending']
	WebDriver driver=new FirefoxDriver();
	
		
     driver.findElement(By.linkText("Billing")).click();
	
	Thread.sleep(2000);
	
	driver.findElement(By.linkText("Siblings")).click();
	
	
	WebDriverWait wait = new WebDriverWait(driver, 50);
	
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='text']")));
	
	
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("ruhi");
  
	driver.findElement(By.xpath("//input[@value='Verify']")).click();
	

	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@value='Confirm National Id']")));
	
	System.out.println(driver.findElement(By.xpath("//input[@value='Confirm National Id']")).isDisplayed());
	driver.findElement(By.xpath("//input[@value='Confirm National Id']")).isDisplayed();
	driver.findElement(By.xpath("//input[@value='Confirm National Id']")).isEnabled();
	
	driver.findElement(By.xpath("//input[@value='Confirm National Id']")).click();
	}

	
}
