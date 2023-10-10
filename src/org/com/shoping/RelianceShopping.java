package org.com.shoping;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelianceShopping {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Drivers\\chromedriver-win64\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.reliancedigital.in/");
		
		
	}

}
