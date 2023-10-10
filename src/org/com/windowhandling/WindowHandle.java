package org.com.windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class WindowHandle {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Drivers\\geckodriver-v0.33.0-win64\\geckodriver.exe");
				
				WebDriver driver = new FirefoxDriver(); 
				driver.manage().window().maximize();
				driver.get("https://the-internet.herokuapp.com/");
				
				driver.findElement(By.xpath("//a[contains(text(),'A/B Testing')]")).click();
				
				String parent = driver.getWindowHandle();
				System.out.println(parent);
				driver.findElement(By.linkText("Elemental Selenium")).click();
				
				Set<String> child = driver.getWindowHandles();
				System.out.println(child);
				
				String title = driver.getTitle();
				System.out.println(title);
				
				Thread.sleep(5000);
				for (String str : child) {
					
					if(!str.equals(parent)) {
						driver.switchTo().window(str);
						
						String title1 = driver.getTitle();
						System.out.println(title1);
						
						
						WebElement email = driver.findElement(By.id("email"));
						email.sendKeys("kiran@gmail.com");
						
						String val = email.getAttribute("value");
						System.err.println(val);
						
						WebElement language = driver.findElement(By.xpath("//select[@name='fields[programming_language]']"));
						Select s1 = new Select(language);
						s1.selectByVisibleText("Java");
						
						WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));
						submit.click();
						
						WebElement thankyou = driver.findElement(By.xpath("//h1[contains(text(),'Thank you! ')]"));
						String thank = thankyou.getText();
						System.out.println(thank);
						
					}
					
				}
				Thread.sleep(5000);
			driver.close();
			
			
	}

}
