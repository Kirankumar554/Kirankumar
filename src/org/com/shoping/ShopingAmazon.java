package org.com.shoping;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShopingAmazon {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Drivers\\chromedriver-win64\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		WebElement search = driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']"));
		search.sendKeys("Realme mobiles");
		
		WebElement submit = driver.findElement(By.xpath("//*[@id='nav-search-submit-button']"));
		submit.click();
		
	}
}
