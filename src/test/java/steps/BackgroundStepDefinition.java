package steps;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.LoadColorPage;
import page.BackgroundTestPage;
import util.BrowserFactory;

public class BackgroundStepDefinition{
	
	WebDriver driver; 
	LoadColorPage loadColorPage; 
	BackgroundTestPage backgroundTestPage;
	
	@Before
	public void beforeStart() { 
		driver = BrowserFactory.init();
		loadColorPage = PageFactory.initElements(driver, LoadColorPage.class);
		backgroundTestPage = PageFactory.initElements(driver, BackgroundTestPage.class);
	}
	
	@Given ("^User is on the TechFios dummy page$")
	public void user_is_on_the_Techfios_dummy_page() {
		
	}
	//\"([^\"]*)\ used for quotations
	@When ("^User enters the page$")
	public void user_enters_the_page() throws InterruptedException { 

	}
	
	@When ("^User clicks on Set SkyBlue Background button$")
	public void user_clicks_on_set_skyblue_background_button() throws InterruptedException {
		loadColorPage.task();
		
	}
	
	@Then ("^User should be able to see a new page color$")
	public void user_should_be_able_to_see_a_new_page_color() {
		boolean verifyColorBlue = driver.getTitle().equalsIgnoreCase("background-color: skyblue;");
		assertTrue(verifyColorBlue);
	}
	
	@Given ("^User has changed the background once$")
	public void user_has_changed_the_background_once() {
		
	}
	
	@When ("^User clicks on Set White Background$")
	public void user_clicks_on_Set_White_Background() throws InterruptedException {
		loadColorPage.task();
	}
	
	@Then ("^User should be able to see the default background$")
	public void user_should_be_able_to_see_the_default_background() {
		boolean verifyColorWhite = driver.getTitle().equalsIgnoreCase("background-color: white;");
		assertTrue(verifyColorWhite);
	}
	
	@After
	public void runDone() { 
		loadColorPage.close();
	}
	
}


