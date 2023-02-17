package com.e2etests.automation.step_definitions;

import com.e2etests.automation.page_objects.LogoutPage;

import io.cucumber.java.en.When;

public class LogoutDefinition {

	public LogoutPage logoutpage;

	public LogoutDefinition() {
		logoutpage = new LogoutPage();

	}

	@When("Je clique sur logout")
	public void jeCliqueSurLogout() {
		logoutpage.clicOnLogout();

	}

}
