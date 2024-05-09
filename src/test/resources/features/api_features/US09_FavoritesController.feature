<<<<<<< HEAD
@US09_API
Feature: Favorites Controller

  Scenario: TC01 | Get Favorites Controller Test
    Given Get Favorites icin URL duzenlenir
    And Get Favorites icin expected data duzenlenir
    When Get Favorites icin GET request gonderilir ve response alinir
    Then Get Favorites icin Status kodunun 200 oldugu dogrulanir
    And Get Favorites icin Response body dogrulanir

  Scenario: TC02 | Delete Favorites Controller Test
    Given Delete Favorites icin URL duzenlenir
    When Delete Favorites icin DELETE request gonderilir ve response alinir
    Then Delete Favorites icin Status kodunun 200 oldugu dogrulanir
=======
@API
Feature: API Favorites Controller (Get-Delete)
  
@ApiManagerMehmet
Scenario: Favorites Auth Testi
Given Get Favorites Auth icin URL duzenlenir
And Get Favorites Auth icin expected data duzenlenir
When Get Favorites Auth icin GET request gonderilir ve response alinir
Then Get Favorites Auth icin Status kodunun 200 oldugu dogrulanir
And Get Favorites Auth icin Response body dogrulanir


  @ApiCustomerMehmet
Scenario: Favorites Auth Testi
>>>>>>> master
