package com.twitter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	//Variables
	private WebDriver driver;
	private String URl= "https://twitter.com/";
	
	//Elements
	private By loginBtn = By.xpath("//a[@href='/login']");
	
	//Constructor
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Actions
	public void NavigateAndclickOnLogin() {
		driver.get(URl);
		driver.findElement(loginBtn).click();
	}
}
