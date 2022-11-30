package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WokringWithLinks2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "J:\\automation\\CD104\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://www.leafground.com/links.xhtml");//In get() we can't do refreshing page or moving to other pages.
		
		
		WebElement homePage = driver.findElement(By.linkText(""));
		homePage.click();
		
		driver.navigate().back(); //Used to moveback to the links page again from homepage
		
		WebElement whereThisLinkRouteTo = driver.findElement(By.partialLinkText(""));
		String where = whereThisLinkRouteTo.getAttribute("href");
		System.out.println("The Link is going to:" + where);
		
		WebElement brokenLink = driver.findElement(By.linkText(""));
		brokenLink.click();
		
		String title = driver.getTitle();
		if(title.contains("404")) {
			System.out.println("link is broken");
		}
		
		driver.navigate().back();
		
		
		
		/*IF A PAGE IS REFRESHED OR MOVED TO NEXT OR PREVIOUS PAGE THE DOM WILL GET CHANGED SO EVERYTIME WE SHOULD GET ELEMENT DETAILS EVEN 
		IF WE HAVE ALREADY IN OUR CODE*/
		
		homePage.click(); //this wont wotk it will throw stale exception

		WebElement homePage1 = driver.findElement(By.linkText(""));
		homePage1.click(); //This will work, again we wont get stale exception 
		
	}

}
