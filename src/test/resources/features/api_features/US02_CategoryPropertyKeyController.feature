@US02_API
Feature: Category Properties Key Controller

  @ApiAdminHayriye
  Scenario: TC01 | Post Category Properties Key Controller Test
    Given Category Properties icin URL duzenlenir
    And Category Properties icin payload duzenlenir
    When Category Properties icin POST request gonderilir ve Response alinir
    Then Category Properties icin Status kodunun 200 oldugu dogrulanir
    And Category Properties icin Response body dogrulanir

  @ApiAdminHayriye
  Scenario: TC02 | Get Category Properties Key Controller Test
    Given Get Category Properties icin URL duzenlenir
    And Get Category Properties icin expected data duzenlenir
    When Get Category Properties icin GET request gonderilir ve response alinir
    Then Get Category Properties icin Status kodunun 200 oldugu dogrulanir
    And Get Category Properties icin Response body dogrulanir

  @ApiAdminHayriye
  Scenario: TC03 | Put Category Properties Key Controller Test
    Given Put Category Properties icin URL duzenlenir
    And Put Category Properties icin payload duzenlenir
    When Put Category Properties icin PUT request gonderilir ve response alinir
    Then Put Category Properties icin Status kodunun 200 oldugu dogrulanir
    And Put Category Properties icin Response body dogrulanir

  @ApiAdminHayriye
  Scenario: TC04 | Delete Category Properties Key Controller Test
    Given Delete Category Properties icin URL duzenlenir
    When Delete Category Properties icin DELETE request gonderilir ve response alinir
    Then Delete Category Properties icin Status kodunun 200 oldugu dogrulanir