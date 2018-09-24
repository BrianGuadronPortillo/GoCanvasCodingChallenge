package com.exampledemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.exampledemo.utilities.Driver;

public class TemplatePage {
	
	public TemplatePage() {
		PageFactory.initElements(Driver.getDriver(), this);
	}
	
	@FindBy(id = "start-tamplate")
	public WebElement start;

}
