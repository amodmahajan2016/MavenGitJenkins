package Package1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class TC_001 {

	@Test
	public void demoTestCase001()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Organised\\Selenium_Frameworks\\FrameworkByMukesh\\exefiles\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.quit();
	}
}
