package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class OpenGoogleWithFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "J:\\automation\\geckodriver.exe");
		WebDriver driver =  new FirefoxDriver();
		driver.get("http://www.google.com");
		driver.close();
		//We use quit for now
	}

}
