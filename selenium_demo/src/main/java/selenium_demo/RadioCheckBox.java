package selenium_demo;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioCheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aiswa\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.automationtesting.in/Register.html");
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
  break;
  }}
  List <WebElement> Radio=driver.findElements(By.xpath("//input[@type='radio']"));
	int size1 = Radio.size();
	System.out.println(size1);
	for(int i=0;i<size1;i++)
	{
		String text=Radio.get(i).getAttribute("value");
		if(text.equalsIgnoreCase("FeMale"))
		{
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
			Radio.get(i).click();
			
	}
	
}

}
		

}
