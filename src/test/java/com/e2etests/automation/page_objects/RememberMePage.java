package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class RememberMePage {

	@FindBy(how = How.ID, using = "RememberMe")
	public static WebElement checkboxRememberMe;

	public RememberMePage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}

	public void clickOnCheckboxRememberMe() {
		checkboxRememberMe.click();
	}

}
