package com.twitter;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	
	//Variables
	private WebDriver driver;
 
	
	
	//Elements
	By usernameField = By.xpath("(//div[@class='css-901oao r-1awozwy r-18jsvk2 r-6koalj r-1qd0xha r-1b6yd1w r-16dba41 r-ad9z0x r-bcqeeo r-13qz1uu r-qvutc0'])[1]/input");
	By passwordField = By.xpath("(//div[@class='css-901oao r-1awozwy r-18jsvk2 r-6koalj r-1qd0xha r-1b6yd1w r-16dba41 r-ad9z0x r-bcqeeo r-13qz1uu r-qvutc0'])[2]/input");
	
	//Constructor
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	//Actions
	public void Login(String userName, String password) {
		driver.findElement(usernameField).sendKeys(userName);
		driver.findElement(passwordField).sendKeys(password + Keys.ENTER);
	}
	
}
