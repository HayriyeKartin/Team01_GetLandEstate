@US09_API
Feature: Favorites Controller

  @ApiAdminMehmet
  Scenario: TC01 | Get Favorites Controller Test
    Given Get Favorites icin URL duzenlenir
    And Get Favorites icin expected data duzenlenir
    When Get Favorites icin GET request gonderilir ve response alinir
    Then Get Favorites icin Status kodunun 200 oldugu dogrulanir
    And Get Favorites icin Response body dogrulanir

  @ApiAdminMehmet
  Scenario: TC02 | Delete Favorites Controller Testi
    Given Delete Favorites icin URL duzenlenir
    When Delete Favorites icin DELETE request gonderilir ve response alinir
    Then Delete Favorites icin Status kodunun 200 oldugu dogrulanir