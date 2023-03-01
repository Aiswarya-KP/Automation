package selenium_demo;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assertions {

	public static void main(String[] args) 
	{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aiswa\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		
		driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id='checkbox1']")).isSelected());      //True
		
		//driver.findElement(By.xpath("//input[@id='checkbox1']"));
		//Assert.assertFalse(driver.findElement(By.xpath("//input[@id='checkbox1']")).isSelected());     //False
		
	}

}
