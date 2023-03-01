package selenium_demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\aiswa\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe\"");
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\aiswa\\Downloads\\geckodriver-v0.32.0-win32\\ngeckodriver.exe");
		WebDriver driver=new ChromeDriver();
	
		driver.manage().window().maximize();
		//driver.get("https://www.chrome.com/");
		driver.get("https://www.linkedin.com/");
		String title=driver.getTitle();
		System.out.println(title);
		driver.findElement(By.id("session_key")).sendKeys("aiswaryakp2k@gmail.com");
		driver.findElement(By.id("session_password")).sendKeys("AishuuSheeja55");
		driver.findElement(By.xpath("//*[@id=\"main-content\"]/section[1]/div/div/form/button")).click();
		driver.findElement(By.xpath("//input[@class='input__input' and @id='session_key']")); 
		driver.findElement(By.linkText("Join now")).click();
		driver.findElement(By.partialLinkText("sign ")).click();   //sign in
		driver.findElement(By.xpath("//a[contains(text(),'See All Topics')]/parent::*/following-sibling::li[2]"));
		driver.navigate().back();
		
		
	}

}
