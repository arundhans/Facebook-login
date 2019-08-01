
import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;



public class Login {
	static WebDriver driver; 
	@Given("User should launch the browser.")
	public void user_should_launch_the_browser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ardm\\Desktop\\Java\\Facebooklogin\\src\\Refernce jar\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
	    
	}

	@Given("User should enter the Facebook url in the address bar.")
	public void user_should_enter_the_Facebook_url_in_the_address_bar() {
		driver.get("https://www.facebook.com/");
	}

	//@When("User should enter the Username and Password.")
	//public void user_should_enter_the_Username_and_Password() {
	@When("User should enter the Username and Password")
	public void user_should_enter_the_Username_and_Password(DataTable data) {
		List <List<String>> a = data.asLists(String.class);
		driver.findElement(By.id("email")).sendKeys(a.get(2).get(0));
		driver.findElement(By.id("pass")).sendKeys(a.get(1).get(1));
		
	}

	@When("User should click on the Login button.")
	public void user_should_click_on_the_Login_button() {
		driver.findElement(By.id("loginbutton")).click();
	}

	@Then("User should be navigated to the FB home screen.")
	public void user_should_be_navigated_to_the_FB_home_screen() {
	Assert.assertTrue(driver.findElement(By.xpath("//div[text()='Arun Achu']")).isDisplayed());
		driver.quit();		    
	}



}
