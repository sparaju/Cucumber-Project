package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.BasePage;
import page.BackgroundTestPage;

public class BrowserFactory extends BasePage {
	
	static WebDriver driver; 
	static String browser;
	static String url;
	
	
	public static void readConfig() {
		
		Properties prop = new Properties();
		
		try {
			InputStream input = new FileInputStream("src\\main\\java\\config\\config.properties");
			prop.load(input);
			browser = prop.getProperty("browser");
			System.out.println("Browser used: " + browser);
			url = prop.getProperty("url");
		}catch(IOException e) {
			e.getStackTrace();
			
		}
	}
	
	public static WebDriver init() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.get("https://techfios.com/test/101/index.php");
		return driver;
	}
	
	public static void tearDown() throws InterruptedException {
		Thread.sleep(10000);
		driver.close();
		driver.quit();
	}

}
