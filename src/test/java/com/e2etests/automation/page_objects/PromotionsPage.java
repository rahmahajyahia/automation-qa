package com.e2etests.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.e2etests.automation.utils.Setup;

public class PromotionsPage {
	@FindBy(how = How.XPATH, using = "//body/div[3]/div[1]/section[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
	public static WebElement promotions;
	
	public PromotionsPage () {
		PageFactory.initElements(Setup.getDriver(), this);
		}
		
		public void clickonPromotions () {
			promotions.click();
		}
	

}
