package com.e2etests.automation.step_definitions;

import com.e2etests.automation.page_objects.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition {

	public LoginPage loginPage;

	public LoginStepDefinition() {
		loginPage = new LoginPage();
	}

	@Given("Je me connecte sur l'application NopCommerce")
	public void jeMeConnecteSurLApplicationNopCommerce() {
		loginPage.goToUrl();
	}

	@When("Je saisis l'adresse mail {string}")
	public void jeSaisisLAdresseMail(String email) {
		loginPage.fillUsername(email);
	}

	@When("Je saisis le mot de passe {string}")
	public void jeSaisisLeMotDePasse(String password) {
		loginPage.fillPassword(password);
	}

	@When("Je clique sur le bouton Login")
	public void jeCliqueSurLeBoutonLogin() {
		loginPage.clickOnLogin();
	}

	@Then("Je me redirige vers la page home")
	public void jeMeRedirigeVersLaPageHome() {
	}

}
