package Selenium;

import java.io.File;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithAutoComAndDownloading {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "J:\\automation\\CD104\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/Autocompletion.xhtml");	
		
		//Code wont work
		
		//AutoCompletion
		
		WebElement input = driver.findElement(By.id("tags"));
		input.sendKeys("s");
		Thread.sleep(3000);
		List<WebElement> optionsList = driver.findElements(By.xpath("//*[]/li"));
		for (WebElement webElement : optionsList) {
			if (webElement.getText().equals("Selenium"))
			webElement.click();
			break;
		}
		
		//Download
		driver.get("https://www.leafground.com/Download.xhtml");
		WebElement downloadLink = driver.findElement(By.linkText("Download.xls"));
		downloadLink.click();
		Thread.sleep(3000);
		
		//working with local drive files
		File fileLocation = new File("C:\\downlods");
		File[] totalFiles =fileLocation.listFiles();
		for (File file : totalFiles) {
			if (file.getName().equals("Download.xls")) {
				System.out.println("File is downloaded");
			}
		}
		
		
		
		
	}

}
