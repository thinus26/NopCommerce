package org.pack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeDriverLaunch {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/thinusstanley/Downloads/chromedriver");
		
		
		WebDriver driver =new ChromeDriver();
	    driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-chrome-driver/3.141.59");
	}
	

}
