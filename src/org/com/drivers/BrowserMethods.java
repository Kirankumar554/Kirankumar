package org.com.drivers;

public class BrowserMethods extends Drivers{

	public static void launch (String url) {
		driver.get(url);
	}
	
	public static void maximize() {
		driver.manage().window().maximize();
	}
	
	public static void title() {
		String tit = driver.getTitle();
		System.out.println("Title: "+tit);
	}
	
	public static void currentUrl() {
		String cUrl = driver.getCurrentUrl();
		System.out.println("Current URL: "+cUrl);
	}
	
	public static void quit() {
		driver.quit();
	}
	
	public static void enabled() {
		
	}
	
	public static void main(String[] args) throws InterruptedException {
	
		browser("chrome");
		launch("https://www.javatpoint.com/");
		maximize();
		title();
		currentUrl();
		Thread.sleep(5000);
		quit();
				
	}
}
