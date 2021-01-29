package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNameTest {
	
	WebDriver driver = null;
	
	@Test
	public void nameTest() {
		
		System.out.println("name is " + System.getProperty("foo"));
		System.out.println("colour is " + System.getProperty("colour"));
		String projectPath = "C:/Kiran/Selenium_Workspace_practice/Parameter";
		System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(System.getProperty("site"));
		driver.close();
	}
	

}
