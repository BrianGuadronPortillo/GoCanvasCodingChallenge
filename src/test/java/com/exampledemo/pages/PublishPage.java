package com.exampledemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.exampledemo.utilities.Driver;

public class PublishPage {
	
	public PublishPage() {
		PageFactory.initElements(Driver.getDriver()	, this);
	}
	
	@FindBy(xpath = "//button[@class='btn cvs-prim-btn']")
	public WebElement next;
	
	@FindBy(xpath = "(//label[@class='icheckbox'])[1]")
	public WebElement checkBox;
	
	@FindBy(xpath = "//button[@ng-show='!publishing']")
	public WebElement publish;
	
	

}
