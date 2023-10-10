package org.com.seleniummaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumEdge {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\ADMIN\\Drivers\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver(); 
		driver.get("https://www.javatpoint.com/");
		//driver.manage().window().fullscreen();
		driver.manage().window().maximize();

		String title = driver.getTitle();
		System.out.println("Title: "+title);
		
		int length = title.length();
		System.out.println("Length of the title: "+length);
		
		String currentUrl = driver.getCurrentUrl();
		System.out.println("Current URL: "+ currentUrl);
		
//		String pageSource = driver.getPageSource();
//		System.out.println("Page Source: "+ pageSource);
//		Thread.sleep(5000);
		
		driver.navigate().to("https://www.youtube.com/");
		Thread.sleep(5000);
		
		driver.navigate().back();
		Thread.sleep(5000);
		
		driver.navigate().forward();
		Thread.sleep(5000);
		
		driver.navigate().refresh();
		
		driver.quit();
		
	}

}
