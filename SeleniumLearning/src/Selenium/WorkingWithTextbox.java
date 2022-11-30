package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithTextbox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "J:\\automation\\CD104\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.get("https://leafground.com/input.xhtml;jsessionid=node01sgssxi6uvfwoo9wpk2fvoz9022532.node0");
		driver.get("https://webapps.tekstac.com/Cargo_Shipping_Cost/");
//		WebElement emailbox = driver.findElement(By.id("j_idt88:name"));
//		emailbox.sendKeys("Jana krishnan");
//		
//		WebElement appendbox = driver.findElement(By.xpath("//*[@id=\"j_idt88:j_idt91\"]"));
//		appendbox.sendKeys("Coimbatore");
//		
//		WebElement disabledBox = driver.findElement(By.name("j_idt88:j_idt93"));
//		boolean enabled = disabledBox.isEnabled();
//		System.out.println(enabled);
//		
//		WebElement clearBox = driver.findElement(By.name("j_idt88:j_idt95"));
//		clearBox.clear();
//		
//		WebElement getTextBox = driver.findElement(By.name("j_idt88:j_idt97"));
//		String value = getTextBox.getAttribute("value");
//		System.out.println(value);
		
		driver.findElement(By.id("weight")).sendKeys("200");
		driver.findElement(By.id("air")).click();
		driver.findElement(By.id("calculate")).click();
		String msg1 = driver.findElement(By.id("result")).getText();
		System.out.println(msg1);
		if (msg1 ==  "Dear Customer, your total shipping cost is $200") {
			System.out.println("pass");
		}
	}

}
