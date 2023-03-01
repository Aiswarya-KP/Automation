package selenium_demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class AssertionTitle {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aiswa\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/web-table-element.php");
		String title=driver.getTitle();
	    //Assert.assertEquals("Web Table Elements",title );
		//System.out.println(title);
		//Assert.assertNull(null);
		//System.out.println("Web Table Elements");
		Assert.assertNotNull(null);
		System.out.println("java");

	}

}
