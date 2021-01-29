package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MultiBrowserTest {

	WebDriver driver = null;
	String projectPath = System.getProperty("user.dir");

	@BeforeTest
	public void browserTest() {
		System.out.println(projectPath);
		System.out.println(System.getProperty("browserName"));

		if(System.getProperty("browserName").equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", projectPath+"/drivers/chromedriver_version88.exe");	
			driver = new ChromeDriver();
		} else if(System.getProperty("browserName").equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", projectPath+"/drivers/geckodriver.exe");	
			driver = new FirefoxDriver();
		} else if(System.getProperty("browserName").equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.internetexplorer.driver", projectPath+"/drivers/iedriver.exe");	
			driver = new InternetExplorerDriver();
		}
	}

	@Test
	public void openGoogle() throws Exception {
		driver.get("https://maven.apache.org/surefire/maven-surefire-plugin/examples/testng.html");
		Thread.sleep(2000);
	}

	@AfterTest
	public void tearDown() {

		driver.close();
		driver.quit();
	}
	



}
