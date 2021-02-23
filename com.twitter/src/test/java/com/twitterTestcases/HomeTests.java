package com.twitterTestcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.twitter.HomePage;
import com.twitter.LoginPage;
import com.twitter.MainPage;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomeTests {

	// Variables
	private WebDriver driver;
	private com.twitter.LoginPage loginPage;
	private com.twitter.HomePage homePage;
	private com.twitter.MainPage mainPage;

	// TestData
	private String username = "ayavoistask@getnada.com";
	private String password = "testTASK1234";
	private String tweetText = "My first Tweet";
	private String maxCharsText = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
	private String exceededMaxCharsText = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
	
	@Test
	public void f() {
		homePage.NavigateAndclickOnLogin();
		loginPage.Login(username, password);
		
	}
	
	@Test
	public void assertTweet() {
		homePage.NavigateAndclickOnLogin();
		loginPage.Login(username, password);
		mainPage.insertChars(tweetText);
		mainPage.clickTweetBtn();
	}

	@Test
	public void exceededMaxCharsText() {
		homePage.NavigateAndclickOnLogin();
		loginPage.Login(username, password);
		mainPage.insertChars(exceededMaxCharsText);
		mainPage.clickTweetBtn();
	}
	
	@Test
	public void assertMaxChars() {
		homePage.NavigateAndclickOnLogin();
		loginPage.Login(username, password);
		mainPage.insertChars(maxCharsText);
		mainPage.clickTweetBtn();
	}
	
	
	
	@Test
	public void assertaddImg() {
		homePage.NavigateAndclickOnLogin();
		loginPage.Login(username, password);
		mainPage.addImg("C:\\Users\\Lenovo\\Downloads\\The-general-structure-and-organization-of-ISO-90012015.png");
		mainPage.clickTweetBtn();
	}
	
	
	
	@BeforeClass
	public void setupClass() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		loginPage = new LoginPage(driver);
		homePage = new HomePage(driver);
		mainPage = new MainPage(driver);

	}

}
