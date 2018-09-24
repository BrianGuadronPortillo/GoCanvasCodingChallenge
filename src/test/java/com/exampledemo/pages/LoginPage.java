package com.exampledemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.exampledemo.utilities.Driver;

public class LoginPage {
		public LoginPage() {
			PageFactory.initElements(Driver.getDriver(), this);
		}
		
		
		
		
		
		
		@FindBy(linkText = "Log In")
		public WebElement LogIn;

		@FindBy(id = "login")
		public WebElement email;

		@FindBy(id = "password")
		public WebElement password;

		@FindBy(id = "btn_Log In")
		public WebElement logInButton;

	

	
}
