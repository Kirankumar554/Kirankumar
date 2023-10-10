package org.com.shoping;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShoppingApple {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Drivers\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.apple.com/");
		
		WebElement iPhone =driver.findElement(By.xpath("//*[@id='globalnav-list']/li[2]/div/div/div[4]/ul/li[1]/a/span[1]"));
		
		Actions act = new Actions(driver);
		act.moveToElement(iPhone).perform();
		
		Thread.sleep(15000);
		driver.findElement(By.xpath("//*[@id='globalnav-submenu-link-iphone']/div/div/div[1]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id='main']/section[1]/div/div[2]/a")).click();
		
		
	}
}
