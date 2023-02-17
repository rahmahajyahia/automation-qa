@login
Feature: Je souhaite tester la page de la connexion
  En tant que utilsateur, je souhaite tester la page de la connexion

  Scenario: Je souhaite tester l'authentification
    Given Je me connecte sur l'application NopCommerce
    When Je saisis l'adresse mail "admin@yourstore.com"
    When Je saisis le mot de passe "admin"
    When Je clique sur le bouton Login
    Then Je me redirige vers la page home
