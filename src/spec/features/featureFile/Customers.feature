@customers
Feature: je souahite cliquer sur le customers
  entant que utilisateur je souahite cliquer sur le customers

  Scenario: je souahite cliquer sur le customers
    Given Je me connecte sur l'application NopCommerce
    When Je saisis l'adresse mail "admin@yourstore.com"
    When Je saisis le mot de passe "admin"
    When Je clique sur le bouton Login
    When Je clique sur le module customers
