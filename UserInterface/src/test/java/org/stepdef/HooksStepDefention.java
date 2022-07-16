package org.stepdef;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class HooksStepDefention {
	RemoteWebDriver driver;

//	@Before
//	public void beforeLogin() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		driver.get("http://letcode.in/buttons\"");
//
//	}
//      @After
//	public void afterLogin() throws IOException {
//		File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
//		File des = new File("./snaps/img.png");
//		FileHandler.copy(screenshotAs,des);
//		
//		driver.close();
//
//	}
//
//	@Given("user is on amazon seller page on  chrome browser")
//	public void user_is_on_amazon_seller_page_on_chrome_browser() {
//		WebDriverManager.chromedriver().setup();
//		driver = new ChromeDriver();
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//		driver.get("http://letcode.in/buttons\"");
//	}

	@When("user enter user name and password")
	public void user_enter_user_name_and_password() {
		System.out.println("user enter user name and password");
	}

	@And("user click login button")
	public void user_click_login_button() {
		System.out.println("user click login button");
	}

	@Then("user validating home page visible or not")
	public void user_validating_home_page_visible_or_not() {
		System.out.println("user click login button");
	}


}
