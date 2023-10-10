package org.com.windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WhFlipkart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Drivers\\chromedriver-win64\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver(); 
				driver.manage().window().maximize();
				driver.get("https://www.flipkart.com/");
				
				WebElement close = driver.findElement(By.xpath("/html/body/div[3]/div/span"));
				close.click();
				
				WebElement search = driver.findElement(By.xpath("//input[@type='text']"));
				search.sendKeys("realme 10 Pro+ 5G");
				
				WebElement searchbtn = driver.findElement(By.xpath("//button[@type='submit']"));
				searchbtn.click();
				
				String parent = driver.getWindowHandle();
				System.out.println("Parent ID: "+parent);
				driver.findElement(By.className("_2kHMtA")).click();
				
				Set<String> child = driver.getWindowHandles();
				System.out.println("Child ID: "+child);
				
				String title = driver.getTitle();
				System.out.println("Parent Title: "+title);
				
				
				for (String str : child) {
					
					if (!str.equals(parent)) {
						driver.switchTo().window(str);
						
						String title1 = driver.getTitle();
						System.out.println("Child Title: "+title1);
						
						WebElement cart = driver.findElement(By.className("_1KOMV2"));
						cart.click();
						
//						Thread.sleep(20000);
//						driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div/div/div/div[3]/div/div[3]/div[2]/div")).click();						
//						String alertMessage= driver.switchTo().alert().getText();
//						System.out.println(alertMessage);
					}
					
				}
			Thread.sleep(5000);
			driver.close();
			
			
	}
}