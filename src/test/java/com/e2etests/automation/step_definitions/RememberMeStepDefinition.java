package com.e2etests.automation.step_definitions;

import com.e2etests.automation.page_objects.RememberMePage;

import io.cucumber.java.en.When;

public class RememberMeStepDefinition {
	
	public RememberMePage rememberMePage;
	public RememberMeStepDefinition() {
		rememberMePage = new RememberMePage();
	}

	@When("Je clique sur la case a cocher remember me")
	public void jeCliqueSurLaCaseACocherRememberMe() {
		rememberMePage.clickOnCheckboxRememberMe();
	}




}
