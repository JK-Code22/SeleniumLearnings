package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithRadioBtn {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "J:\\automation\\CD104\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/radio.xhtml");
		
		//Absolute xpath (starts from root node, single slash)
		WebElement unselected = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[2]/div/div/div/div/div[1]/div/div[2]"));
		WebElement selected = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[2]/div/div/div/div/div[2]/div/div[2]/span"));
		boolean status1 = unselected.isSelected();	
		boolean status2 = selected.isSelected();
		System.out.println(status1);
		System.out.println(status2);
		
		WebElement below20 = driver.findElement(By.xpath("/html/body/div[1]/div[5]/div[2]/form/div/div[2]/div[2]/div/div/div/div/div[1]/label"));
		
		below20.click();		}

}
