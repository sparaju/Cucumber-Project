package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
public static WebDriver driver;
	
	public static void waitForElement(WebElement element, WebDriver driver) {
		WebDriverWait waiting = new WebDriverWait(driver, 15);
		waiting.until(ExpectedConditions.visibilityOf(element));
	}
}
