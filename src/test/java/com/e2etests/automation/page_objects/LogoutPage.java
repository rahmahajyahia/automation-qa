package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class LogoutPage {

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Logout')]")
	public static WebElement logout;

	public LogoutPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}

	public void clicOnLogout() {
		logout.click();
	}

}
