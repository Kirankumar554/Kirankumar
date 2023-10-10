package org.com.checkandradio;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Check extends DriversBrowsers{

	public static void launch (String url) {
		driver.get(url);
	}
	
	public static void maximize() {
		driver.manage().window().maximize();
	}
	public static void clickHome() {
		WebElement click1 = driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/span/button"));
		click1.click();
	}
	public static void clickDesktop() {
		WebElement click2 = driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li/span/button"));
		click2.click();
	}
	public static void clickNotes() {
		WebElement click3 = driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li/ol/li/span/label/span"));
		click3.click();
	}
	public static void clickDocuments() {
		WebElement click4 = driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[2]/span/button"));
		click4.click();
	}
	public static void clickWorkspace() {
		WebElement click5 = driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[2]/ol/li/span/button"));
		click5.click();
	}
	public static void clickReact() {
		WebElement click6 = driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[2]/ol/li/ol/li[1]/span/label"));
		click6.click();
	}
//	public static void clickVeu() {
//		WebElement click7 = driver.findElement(By.xpath("//*[@id='tree-node']/ol/li/ol/li[2]/ol/li/ol/li[3]/span/label/span"));
//		click7.click();
//	}
	
	public static void main(String[] args) throws InterruptedException {
		browser("firefox");
		launch("https://demoqa.com/checkbox");
		maximize();
		Thread.sleep(5000);
		clickHome();
		clickDesktop();
		clickNotes();
		clickDocuments();
		clickWorkspace();
		Thread.sleep(10000);
		clickReact();
		//clickVeu();
	}
}
