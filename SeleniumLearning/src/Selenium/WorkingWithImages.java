package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithImages {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "J:\\automation\\CD104\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/image.xhtml");
	
		WebElement firstImage = driver.findElement(By.xpath(""));
		
		firstImage.click();
		
		WebElement brokenImage = driver.findElement(By.xpath(""));
		//To check whether the image is broken use natural width css property
		
		if(brokenImage.getAttribute("naturalWidth").equals("0")) {
			System.out.println("the image is broken");
		}else {
			System.out.println("The image is  not broken");
		}
	}

}
