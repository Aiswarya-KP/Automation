package selenium_demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
		//driver.findElement(By.id("checkbox1")).click();
		List <WebElement> Checkboxes=driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		int size = Checkboxes.size();
		System.out.println(size);
		for(int i=0;i<size;i++)
		{
			String text=Checkboxes.get(i).getAttribute("value");
			if(text.equalsIgnoreCase("Cricket"))
			{
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				Checkboxes.get(i).click();
			}
		}
		
	}

	}


