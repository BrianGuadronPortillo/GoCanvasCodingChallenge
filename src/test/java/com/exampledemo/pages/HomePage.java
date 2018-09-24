package com.exampledemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.exampledemo.utilities.Driver;

public class HomePage {
	
	
		public HomePage() {
			PageFactory.initElements(Driver.getDriver(), this);
		}
		
		
		
		@FindBy(linkText = "Create App")
		public WebElement createApp;
		
		@FindBy(xpath = "//div[@class='appcues-actions ']/div/a")
		public WebElement maybeLater;
		
		

}
