package selenium_demo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aiswa\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	       WebDriver driver=new ChromeDriver();
	       driver.manage().window().maximize();
	       driver.get("https://www.amazon.in/");
	       String title=driver.getTitle();
	       System.out.println(title); 
	       driver.findElement(By.id("nav-link-accountList-nav-line-1")).click();
	       WebElement w=driver.findElement(By.id("ap_email"));
	       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	       wait.until(ExpectedConditions.visibilityOf(w));
			driver.findElement(By.id("ap_email")).sendKeys("AishuuSheeja55");
	}

}
