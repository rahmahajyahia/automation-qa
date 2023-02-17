package com.e2etests.automation.step_definitions;

import com.e2etests.automation.page_objects.PromotionsPage;

import io.cucumber.java.en.When;

public class PromotionsDefinition {
	public PromotionsPage promotionspage;

	public PromotionsDefinition() {

		promotionspage = new PromotionsPage();

	}

	@When("Je clique sur promtions")
	public void jeCliqueSurPromtions() {
		promotionspage.clickonPromotions();

	}

}
