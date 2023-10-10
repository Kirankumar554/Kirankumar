package org.com.dragdropandalerts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmAlert {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Drivers\\chromedriver-win64\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver(); 
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/alerts");
			
			WebElement confirmclick = driver.findElement(By.xpath("//*[@id='confirmButton']"));
			confirmclick.click();
			
			Alert al = driver.switchTo().alert();
			String text = al.getText();
			System.out.println(text);
			
			Thread.sleep(4000);
			al.accept();
			
			WebElement result = driver.findElement(By.xpath("//*[@id='confirmResult']"));
			String resulttext = result.getText();
			System.out.println(resulttext);
	}

}
