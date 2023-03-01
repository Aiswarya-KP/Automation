package selenium_demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoAutomation {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aiswa\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//input[@ng-model='FirstName']")).sendKeys("Aiswarya");
		driver.findElement(By.xpath("//input[@ng-model='LastName']")).sendKeys("KP");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Kizhakkedath Parambu");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("aiswaryakp2k@gmail.com");
		driver.findElement(By.xpath("//input[@ng-model='Phone']")).sendKeys("8138821082");
		
		List <WebElement> Radio=driver.findElements(By.xpath("//input[@type='radio']"));
		int size=Radio.size();
		System.out.println(size);
		for(int i=0;i<size;i++)
		{
			String text=Radio.get(i).getAttribute("value");
			if(text.equalsIgnoreCase("FeMale"))
			{
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				Radio.get(i).click();
			}
		}
		driver.findElement(By.id("checkbox2")).click();
		WebElement element=driver.findElement(By.id("Skills"));
		Select dropdown=new Select(element);
		dropdown.selectByIndex(3);
		System.out.println(driver.findElement(By.id("Skills")).getAttribute("value"));
		
		WebElement yearbox=driver.findElement(By.id("yearbox"));
		Select dropanddown=new Select(yearbox);
		dropanddown.selectByValue("2000");
		
		WebElement month=driver.findElement(By.xpath("//select[@placeholder='Month']"));
		Select dropdown1=new Select(month);
		dropdown1.selectByValue("5");
		
		driver.findElement(By.xpath("//input[@ng-model='Password']")).sendKeys("Aishuuarjuu19");
		driver.findElement(By.xpath("//input[@ng-model='CPassword']")).sendKeys("Aishuuarjuu19");
		driver.findElement(By.id("submitbtn")).click();
		}
  
}
