package selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aiswa\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		String title=driver.getTitle();
		System.out.println(title);
		WebElement element=driver.findElement(By.id("Skills"));
		Select dropdown=new Select(element);  
		dropdown.selectByIndex(3);
		System.out.println(driver.findElement(By.id("Skills")).getAttribute("value"));

	}

}
