package selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class ActionDemo {

  public static void main(String[] args) 
  {
       System.setProperty("webdriver.chrome.driver","C:\\Users\\aiswa\\Downloads\\chromedriver_win32 (1)\\ChromeDriver\\chromedriver.exe\"");
       WebDriver driver=new ChromeDriver();
       driver.manage().window().maximize();
       driver.get("https://www.amazon.in/");
       String title=driver.getTitle();
       System.out.println(title);
       Actions builder=new Actions(driver);
       WebElement w=driver.findElement(By.id("nav-link-accountList-nav-line-1"));
		//Action=builder.moveToElement(w).build();
		//Action b=builder.moveToElement(w).build();
		//b.perform();
       w.click();
       WebElement s=driver.findElement(By.id("ap_email"));
       Action series=builder.moveToElement(s).click().keyDown(s,Keys.SHIFT).sendKeys(s,"hello").keyUp(s,Keys.SHIFT).build();
       series.perform();
	}

}
