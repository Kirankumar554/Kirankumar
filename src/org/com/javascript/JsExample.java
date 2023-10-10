package org.com.javascript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExample {
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Drivers\\chromedriver-win64\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver(); 
				driver.manage().window().maximize();
				driver.get("https://www.amazon.in/");
				
				JavascriptExecutor java = (JavascriptExecutor) driver;
				java.executeScript("document.getElementById('twotabsearchtextbox').setAttribute('value','realme 10 Pro+ 5G')");
				
				java.executeScript("document.getElementById('nav-search-submit-button').click()");
				
				WebElement realme = driver.findElement(By.xpath("//span[contains(text(),'realme 10 Pro 5G (Dark Matter, 128 GB) (8 GB RAM)')]"));
				java.executeScript("arguments[0].click()", realme);
				
				
	}
}
