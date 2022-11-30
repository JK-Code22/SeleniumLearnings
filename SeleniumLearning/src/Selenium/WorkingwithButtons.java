package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class WorkingwithButtons {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "J:\\automation\\CD104\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml;jsessionid=node01sgssxi6uvfwoo9wpk2fvoz9022532.node0");
		
		
		//BUTTON DISBLE
		WebElement disabledButton = driver.findElement(By.id("j_idt88:j_idt92"));
		boolean verifyBtnDis = disabledButton.isEnabled();
		System.out.println(verifyBtnDis);
		
		
		//BUTTON POSITION
		WebElement positionButton = driver.findElement(By.id("j_idt88:j_idt94"));
		Point getPosition = positionButton.getLocation();
		int x = getPosition.getX();
		int y = getPosition.getY();
		System.out.println("X value:"+ x +" "+ "Y value:" + y); 
		
		//BUTTON COLOR
		WebElement colorButton = driver.findElement(By.id("j_idt88:j_idt96"));
		String color = colorButton.getCssValue("background");
		System.out.println(color);
		
		//BUTTON HEIGHT AND WIDTH
		WebElement hwButton = driver.findElement(By.id("j_idt88:j_idt98"));
		int height = hwButton.getSize().getHeight();
		int width = hwButton.getSize().getWidth();
		System.out.println("Height is:"  + height + "width is:" + width);
		
		//BUTTON HOVER COLOR
				Actions action = new Actions(driver);
				WebElement hoverButtoncolor = driver.findElement(By.id("j_idt88:j_idt100"));
				action.moveToElement(hoverButtoncolor).perform();
				boolean hoverColorChange = hoverButtoncolor.equals(hoverButtoncolor.getCssValue("background-color"));
				System.out.println(hoverColorChange); 
		//BUTTON NAVIGATION TO HOMEPAGE
		WebElement homeButton = driver.findElement(By.id("j_idt88:j_idt90"));
		homeButton.click();

}


	}