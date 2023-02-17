package com.e2etests.automation.step_definitions;

import com.e2etests.automation.page_objects.CustomersPage;

import io.cucumber.java.en.When;

public class CustomersDefinition {
	
	public CustomersPage customersPage;
	public CustomersDefinition() {
		customersPage = new CustomersPage();
	}
	
	@When("Je clique sur le module customers")
	public void jeCliqueSurLeModuleCustomers() {
		customersPage.clickOnCustomers();
	}




}
