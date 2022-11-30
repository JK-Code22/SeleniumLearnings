package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WorkingWithDropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "J:\\automation\\CD104\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/select.xhtml;jsessionid=node01qegnl66c6xo01o7iv338jf62y38433.node0");
		
		WebElement dd1 = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select"));
		Select select = new Select(dd1);
		select.selectByIndex(1);
		Thread.sleep(3000);
//		select.selectByValue("2");
//		Thread.sleep(3000);
		select.selectByVisibleText("Cypress");
		
		//find list of options
		List<WebElement> ListOfOptions = select.getOptions();
		 int size = ListOfOptions.size();
		 System.out.println(size);
		 
		 //Using sendkeys
		 dd1.sendKeys("Playwright");
		 
		 //Choosing multiple options
		 WebElement multiselect = driver.findElement(By.xpath("//*[@id=\"j_idt87\"]/div/div[1]/div[1]/div/div/select"));
		 Select multiSelect2 = new Select(multiselect);
		 multiSelect2.selectByIndex(1);
		 Thread.sleep(3000);
		 multiSelect2.selectByIndex(2);
		 Thread.sleep(3000);
		 multiSelect2.selectByIndex(3);
		 Thread.sleep(3000);
		 multiSelect2.selectByIndex(4);
		 
	
	
	}

}
