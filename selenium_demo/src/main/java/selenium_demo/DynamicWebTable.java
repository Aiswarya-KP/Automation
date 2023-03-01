package selenium_demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWebTable {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aiswa\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		String title=driver.getTitle();
		System.out.println(title);
		List <WebElement> column=driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
		System.out.println(column.size());
		
		List <WebElement> row=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println(row.size());
		
		String name;
		for(int i=1;i<=row.size();i++)
		{
			name=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]td[1]")).getText();
			System.out.println(name);
		}
		
		
		

	}

}
