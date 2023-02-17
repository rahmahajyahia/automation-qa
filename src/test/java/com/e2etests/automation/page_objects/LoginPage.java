package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class LoginPage {

	private ConfigFileReader configFileReader;

	@FindBy(how = How.ID, using = "Email")
	public static WebElement username;

	@FindBy(how = How.ID, using = "Password")
	public static WebElement password;

	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Log in')]")
	public static WebElement loginBtn;

	public LoginPage() {
		PageFactory.initElements(Setup.getDriver(), this);
		this.configFileReader = new ConfigFileReader();
	}

	public void goToUrl() {
		Setup.getDriver().get(configFileReader.getProperties("home.url"));
	}

	public void fillUsername(String name) {
		username.clear();
		username.sendKeys(name);
	}

	public void fillPassword(String passw) {
		password.clear();
		password.sendKeys(passw);
	}

	public void clickOnLogin() {
		loginBtn.click();
	}

}
