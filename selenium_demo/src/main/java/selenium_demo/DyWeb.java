package selenium_demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DyWeb {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aiswa\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/web-table-element.php");

		List<WebElement> column=driver.findElements(By.xpath("//table[@class='dataTable']/thead/tr/th"));
		System.out.println(column.size());
		
		List<WebElement> row=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr"));
		System.out.println(row.size());
		String companyName;
		for(int i=1;i<=row.size();i++)
		{
		WebElement CompanyNameElement= driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td[1]"));
		companyName= CompanyNameElement.getText();
		if(companyName.equals("Bata India"))
		{
				
		System.out.println(companyName);
		System.out.println("Current Price is: "+driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+i+"]/td[4]")).getText());
		break;
		}
		
		
		

	}}}




	


