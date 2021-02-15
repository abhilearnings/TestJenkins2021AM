package test1.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestJenkins {
	
	@Test
	public void invokebrowser(){
		
		System.setProperty("webdriver.chrome.driver", ".//BrowsersDrivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://cookbook.seleniumacademy.com/bmicalculator.html");
		driver.getTitle();
	}

}
