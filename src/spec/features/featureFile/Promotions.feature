@promtions
Feature: je souhaite cliquer sur promtions
  entant que utilisateur je souhaite cliquer sur promotions

  Scenario: je souhaite cliquer sur promtions
    Given Je me connecte sur l'application NopCommerce
    When Je saisis l'adresse mail "admin@yourstore.com"
    When Je saisis le mot de passe "admin"
    When Je clique sur le bouton Login
    When Je clique sur promtions
