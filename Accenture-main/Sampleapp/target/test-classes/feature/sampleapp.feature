#Author: fcosta_zo@yahoo.com.br

Feature: Escolha automotiva
   Eu como usuario quero acessar o site do sampleapp para escolher veiculo

  
  Background: Acessar o site sampleapp
  	Given que eu esteja no site "http://sampleapp.tricentis.com/101/app.php"
  
  
  Scenario: Fazer escolha
    When fazer os cadastro com os dados validos
    Then valido a informacao
    

 