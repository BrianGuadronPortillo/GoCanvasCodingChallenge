package com.exampledemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.exampledemo.utilities.Driver;

public class AppPage {
	
	public AppPage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(xpath = "//input[@id='formName']")
	public WebElement giveAppName;
	
	@FindBy(xpath = "//div[@id='screen-name']/div[1]")
	public WebElement giveScreenname;
	
	@FindBy(xpath = "//i[@class='fa fa-list flip-h']")
	public WebElement field;
	
	@FindBy(xpath = "//ul[@class='palette']/li[1]")
	public WebElement shortText;
	
	@FindBy(xpath = "//textarea[@editable][1]")
	public WebElement shortTextBox;
	
	@FindBy(xpath = "//span[@ng-hide='saveInProgress']")
	public WebElement save;
	
	@FindBy(xpath = "//*[@id=\"drag_containment\"]/div[1]/div[3]/a[2]")
	public WebElement publishToDevice;
	

}
