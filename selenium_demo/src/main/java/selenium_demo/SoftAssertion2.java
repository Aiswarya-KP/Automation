package selenium_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.SoftAssert;



public class SoftAssertion2 {
	public static void main(String args[]) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aiswa\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		SoftAssert softAssertion=new SoftAssert();
		softAssertion.assertEquals(title, "Google");
		System.out.println(title);
		softAssertion.assertAll();
		driver.close();

	}

}



