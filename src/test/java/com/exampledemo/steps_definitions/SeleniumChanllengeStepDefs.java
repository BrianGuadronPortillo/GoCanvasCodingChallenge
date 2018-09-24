package com.exampledemo.steps_definitions;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Iterator;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

import com.exampledemo.pages.AppPage;
import com.exampledemo.pages.HomePage;
import com.exampledemo.pages.LoginPage;
import com.exampledemo.pages.PublishPage;
import com.exampledemo.pages.TemplatePage;
import com.exampledemo.utilities.BrowserUtility;
import com.exampledemo.utilities.ConfigurationReader;
import com.exampledemo.utilities.Driver;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SeleniumChanllengeStepDefs {
	
	
	AppPage appPage = new AppPage();
	String username = ConfigurationReader.getProperty("username");
	String password = ConfigurationReader.getProperty("password");
	String actual;
	String expected;
	
	
	@Given("user logs in using valid username and password")
	public void user_logs_in_using_valid_username_and_password() {
		LoginPage loginPage = new LoginPage();
		loginPage.LogIn.click();
	    loginPage.email.sendKeys(username);
	    loginPage.password.sendKeys(password+ Keys.ENTER);
	    
	}

	@Given("the user clicks on Create App")
	public void the_user_clicks_on_Create_App() {
		
		HomePage homepage = new HomePage();
		homepage.createApp.click();
	    
	}

	@Given("the user selects the template {string}")
	public void the_user_selects_the_template(String blank) {
	   TemplatePage templatePage = new TemplatePage();
	   templatePage.start.click();
	}

	@Given("fills all required field information")
	public void fills_all_required_field_information() {
	    
	    appPage.giveAppName.click();
	    appPage.giveAppName.sendKeys("Brian");
	    appPage.giveScreenname.click();
	    appPage.giveScreenname.sendKeys("SDET");
	    BrowserUtility.waitFor(2);
	    appPage.field.click();
	    appPage.shortText.click();
	    assertTrue(appPage.shortTextBox.isDisplayed());
	    appPage.shortTextBox.sendKeys("that was easy!");
	}

	@When("the user saves the changes to template")
	public void the_user_saves_the_changes_to_template() {
	    appPage.save.click();
	    BrowserUtility.waitFor(2);
	    appPage.publishToDevice.click();
	}

	@Then("the user should be able to publish the template")
	public void the_user_should_be_able_to_publish_the_template() {
	    PublishPage publishPage = new PublishPage();
	    publishPage.next.click();
	    publishPage.checkBox.click();
	    publishPage.publish.click();
	}

}
