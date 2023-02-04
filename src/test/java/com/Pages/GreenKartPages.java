package com.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class GreenKartPages {
	
	public GreenKartPages(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//*[@name='userName']")
	private static WebElement username;

	@FindBy(how = How.XPATH, using = "//*[@name='password']")
	private static WebElement password;

	@FindBy(how = How.XPATH, using = "//*[@value='Submit']")
	private static WebElement submitButton;
	
	@FindBy(how = How.XPATH, using = "//table/tbody/tr/td/table/tbody/tr/td/h3")
	private static WebElement verification;

	public WebElement getUsername() {
		return username;
	}

	public void setUsername(WebElement username) {
//		NewToursPages.username = username;

	}

	public WebElement getPassword() {
		return password;
	}

	public void setPassword(WebElement password) {
//		NewToursPages.password = password;

	}
	public WebElement getSubmitButton() {
		return submitButton;
	}

	public static void setSubmitButton(WebElement submitButton) {
//		NewToursPages.submitButton = submitButton;
	}

	public WebElement getVerification() {
		return verification;
	}

	public void setVerification(WebElement verification) {
//		NewToursPages.verification = verification;
	}

}

