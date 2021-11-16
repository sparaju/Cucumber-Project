package page;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BackgroundTestPage {
	
	
	
WebDriver driver;
	
	public BackgroundTestPage(WebDriver driver) {
		this.driver = driver; 
	}
	
	//Elements Library
	@FindBy(how = How.XPATH, using = "//body[@style='background-color: white;']")
	WebElement WhiteBackgroundColor; 
	@FindBy(how = How.XPATH, using = "//body[@style='background-color: skyblue;']")
	WebElement SkyBlueBackgroundColor; 
	
	public void waitForBlue() { 
		waitForElement(SkyBlueBackgroundColor,driver);
	}

	private void waitForElement(WebElement skyBlueBackgroundColor, WebDriver driver) {
		
	}
	

}
