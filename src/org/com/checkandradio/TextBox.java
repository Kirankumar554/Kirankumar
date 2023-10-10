package org.com.checkandradio;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

public class TextBox extends DriversBrowsers{

	public static void launch (String url) {
		driver.get(url);
	}
	
	public static void maximize() {
		driver.manage().window().maximize();
	}
	public static void userName() {
		WebElement uname = driver.findElement(By.xpath("//*[@id='userName']"));
		uname.sendKeys("Kirankumar Bharathi");
	}
	public static void userEmail() {
		WebElement uemail = driver.findElement(By.xpath("//*[@id='userEmail']"));
		uemail.sendKeys("kirankumar.bharathi@gmail.com");
	}
	public static void currentAddress() {
		WebElement cAddress = driver.findElement(By.xpath("//*[@id='currentAddress']"));
		cAddress.sendKeys("Porur, Chennai");
	}
	public static void permanentAddress() {
		WebElement pAddress = driver.findElement(By.xpath("//*[@id='permanentAddress']"));
		pAddress.sendKeys("Arani, Thiruvannamalai");
	}
//	public static void submit() throws InterruptedException {
//		WebElement sub = driver.findElement(By.xpath("//*[@id='submit']"));
//		Thread.sleep(20000);
//		sub.click();
//	}
	
	public static void fullScreenshot (String url) throws IOException {
		File from = ((FirefoxDriver)driver).getFullPageScreenshotAs(OutputType.FILE);
		File to = new File(url);
		Files.copy(from, to);
	}
	
	public static void main(String[] args) throws InterruptedException, IOException{
		
		browser("firefox");
		launch("https://demoqa.com/text-box");
		maximize();
		Thread.sleep(2000);
		userName();
		userEmail();
		currentAddress();
		permanentAddress();
		//submit();
		fullScreenshot("C:\\Users\\ADMIN\\Desktop\\Daily Activities\\Test.png");
		
	}
}
