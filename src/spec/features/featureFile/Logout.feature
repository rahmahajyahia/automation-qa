@logout
Feature: je souhaite deconnecté sur l'application NopCommerce
  entant que utilisateure je souhaite deconnecté sur l'application NopCommerce

  Scenario: je souahite deconnecté sur l'application NopCommerce
    Given Je me connecte sur l'application NopCommerce
    When Je saisis l'adresse mail "admin@yourstore.com"
    When Je saisis le mot de passe "admin"
    When Je clique sur le bouton Login
    When Je clique sur logout
