@rememberme
Feature: Je souhaite cliquer sur la case a cocher remember me
  
  En tant que utilisateur, je souhaite cliquer sur la case a cocher remember me

  Scenario: Je souhaite cliquer sur la case a cocher remember me
    Given Je me connecte sur l'application NopCommerce
    When Je saisis l'adresse mail "admin@yourstore.com"
    When Je saisis le mot de passe "admin"
    When Je clique sur la case a cocher remember me