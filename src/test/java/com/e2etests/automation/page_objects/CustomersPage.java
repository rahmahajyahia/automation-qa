package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class CustomersPage {
	
	@FindBy(how = How.XPATH, using = "//body[1]/div[3]/aside[1]/div[1]/div[4]/div[1]/div[1]/nav[1]/ul[1]/li[4]/a[1]/p[1]")
	public static WebElement customers;
	
	public CustomersPage() {
		PageFactory.initElements(Setup.getDriver(), this);
	}
	
	public void clickOnCustomers() {
		customers.click();
	}

}
