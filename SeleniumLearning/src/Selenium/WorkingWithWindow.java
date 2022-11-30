package Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WorkingWithWindow {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "J:\\automation\\CD104\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/window.xhtml");
		
		//Switching between windows
		//Switch to used only for 
		//Switch to alert
		//Switch to frame
		//Switch to window

		String oldWindow = driver.getWindowHandle();
		
		WebElement firstBtn = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[1]/button/span"));
		firstBtn.click();
		
		Set<String> handles = driver.getWindowHandles();
		
		for (String newWindows : handles) {//foreach
			
			driver.switchTo().window(newWindows);
		}
		
		WebElement settings = driver.findElement(By.xpath("//*[@id=\"layout-config-button\"]/i"));
		settings.click();
		Thread.sleep(3000);
		driver.close(); // It will close the targeted windows
		driver.switchTo().window(oldWindow);
		
		
		WebElement multipleWin = driver.findElement(By.id("j_idt88:j_idt91"));
		multipleWin.click();
		Thread.sleep(3000);
		int noOfWin = driver.getWindowHandles().size();
		System.out.println(noOfWin);
		
		
		
		WebElement closeWin = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[1]/button/span[2]"));
		closeWin.click();
		Thread.sleep(3000);
		Set<String> newWindowHandles = driver.getWindowHandles();
		
		for (String allWin : newWindowHandles) {
			if(!allWin.equals(oldWindow)) {
				driver.switchTo().window(allWin);
				driver.close();
				}
			driver.quit(); //Close all the windows invoked by the driver 		
			}
		
	}

}
