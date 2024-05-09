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