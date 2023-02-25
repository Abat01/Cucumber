@scenario_outline
  Feature: uture: search_feature
  Background: google_search
  Given user must got to be google

  Scenario Outline: search_test
    When kullanici "<product>" için arama yapar
    Then sonuclarin "<product>" icerdigini dogrula
    Then close the application

    Examples: data
    |product|
    |iphone|
    |tesla |
    |flower|

    |headphones|





