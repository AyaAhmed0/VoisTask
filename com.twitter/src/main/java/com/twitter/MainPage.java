package com.twitter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MainPage {
	
	//Variables
	private WebDriver driver;

	
	//Elements
	By statusText= By.xpath("//div[@class='DraftEditor-editorContainer']//div/span/br");
	By tweetBtn= By.xpath("//span[. = 'Tweet']");
	By addImgBtn = By.xpath("//input[contains(@accept, 'image/jpeg,image/png,image/webp,image/gif,video/mp4,video/quicktime,video/webm')]");
	
	//Constructor
	public MainPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Actions
	public void insertChars(String tweetText) {
		driver.findElement(statusText).sendKeys(tweetText);
	}
	
	public void clickTweetBtn() {
		driver.findElement(tweetBtn).click();
	}
	
	public void addImg(String imgSrc) {
		driver.findElement(addImgBtn).sendKeys(imgSrc);
	}
}
