@API
Feature: API Report Controller Testi
#Manager user token olusturamadigi icin test admin user ile yapilmistir
  @ApiAdminGulsum
  Scenario: TC01| Get User Testi
    Given Report Controller icin URL duzenlenir
    When Report Controller icin GET request gonderilir ve response alinir
    Then Report Controller icin Status kodunun 200 oldugu dogrulanir