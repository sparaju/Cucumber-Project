package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoadColorPage {
	
	WebDriver driver; 
	
	public LoadColorPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Elements Library 
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[1]") 
	WebElement SkyBlueBackgroundButton;
	@FindBy(how = How.XPATH, using = "//*[@id=\"extra\"]/button[1]")
	WebElement WhiteBackgroundButton;
	
	//methods to interact with the elements 
	public void task() throws InterruptedException { 
		SkyBlueBackgroundButton.click();
		Thread.sleep(5000);
		WhiteBackgroundButton.click();
		Thread.sleep(2000);
	}
	
	public String getPageColor() { 
		System.out.println(driver.getTitle());
		return driver.getTitle();
	}
	
	public void close() { 
		driver.quit(); 
		driver.close();
	}
}
