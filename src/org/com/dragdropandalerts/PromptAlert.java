package org.com.dragdropandalerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/alerts");
		
		
		WebElement promptclick = driver.findElement(By.xpath("//*[@id='promtButton']"));
		promptclick.sendKeys(Keys.DOWN);
		promptclick.sendKeys(Keys.DOWN);
		Thread.sleep(2000);
		promptclick.click();
		

		Alert al = driver.switchTo().alert();
		String text = al.getText();
		System.out.println(text);
		al.sendKeys("Kirankumar Bharathi");
		
		Thread.sleep(5000);
		al.accept();
		
		WebElement result = driver.findElement(By.xpath("//*[@id='promptResult']"));
		String resulttext = result.getText();
		System.out.println(resulttext);
	}

}
