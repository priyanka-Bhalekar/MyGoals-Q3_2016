package Login_page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

@Test
public class Login {
    
	
	public void Login()
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://portal-test.bridge.ac.ke/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().pageLoadTimeout(100, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath(".//*[@id='bia-login']")).click();
		
		
		driver.findElement(By.id("UserName")).sendKeys("test_manager1");
		
		
		driver.findElement(By.id("Password")).sendKeys("test123");
		
		driver.findElement(By.xpath("//input[@value='Log On']")).click();
		
	}

}
