package org.com.dragdropandalerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DdUsingName {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Drivers\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver(); 
			driver.manage().window().maximize();
			driver.get("https://jqueryui.com/");
			
			WebElement drop = driver.findElement(By.linkText("Droppable"));
			drop.click();
			
			WebElement frame = driver.findElement(By.className("demo-frame"));
			System.out.println(frame);
			
			driver.switchTo().frame(frame);
			WebElement from = driver.findElement(By.xpath("//*[@id='draggable']"));
			WebElement to = driver.findElement(By.xpath("//*[@id='droppable']"));
			 
			Actions act = new Actions(driver);
			act.clickAndHold(from).moveToElement(to).release(to).build().perform();
	}

}
