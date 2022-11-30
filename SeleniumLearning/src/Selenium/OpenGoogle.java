package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

	public static void main(String[] args) {
		//Open chrome browser
		//Navigate Google home page
		//System.setProperty("webdriver.chrome.driver", "J:\\automation\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
		//3rd code
		//Open google
		//Search keyword
		//Navigate to Wikipedia related to the keyword

		driver.findElement(By.name("q")).sendKeys("Coimbatore"+Keys.ENTER);
		driver.quit();
	}
}