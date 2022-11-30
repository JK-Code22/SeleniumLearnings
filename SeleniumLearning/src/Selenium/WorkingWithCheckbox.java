package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCheckbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "J:\\automation\\CD104\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		WebElement java = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[1]/div[3]/div/div/table/tbody/tr/td[1]/div/div[2]"));
		java.click();
		WebElement boxdis = driver.findElement(By.id("j_idt87:j_idt102_input"));
		boolean checkdis = boxdis.isEnabled();	
		System.out.println(checkdis);
	}

}