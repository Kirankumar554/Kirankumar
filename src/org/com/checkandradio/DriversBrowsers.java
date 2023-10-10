package org.com.checkandradio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriversBrowsers {

	static WebDriver driver;
	public static WebDriver browser (String name) {
		
		if(name.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\Drivers\\chromedriver-win64\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(name.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\ADMIN\\Drivers\\edgedriver_win64\\msedgedriver.exe");
			driver = new EdgeDriver();
		}
		else if(name.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\ADMIN\\Drivers\\geckodriver-v0.33.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			
			
		}
		return driver;
	}
}
