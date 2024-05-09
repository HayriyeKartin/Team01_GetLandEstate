@APIAdUS5SY
Feature: API User Controller Testleri

  @APIAdminUS5SY
  Scenario: TC01 | User Register Testi
    Given User Register icin URL duzenlenir
    And User Register icin payload duzenlenir
    When User Register icin POST request gonderilir ve Response alinir
    Then User Register icin Status kodunun 200 oldugu dogrulanir
    And User Register icin Response body dogrulanir


  @APIAdminUS5SY
  Scenario: TC02 | Get User Testi
    Given Get User icin URL duzenlenir
    And Get User icin expected data duzenlenir
    When Get User icin GET request duzenlenir
    Then Get User icin Status kodunun 200 oldugu dogrulanir
    And Get User icin Response body dogrulanir

  @ApiCustomerSY #ApiAdmin deseydik admin hesabını silecekti#
  Scenario: TC03 | Kendi Hesabini Silme Testi
    Given Kendi hesabini silmek icin URL duzenlenir
    When Kendi hesabini silmek icin DELETE request gonderilir ve response alinir
    Then Kendi hesabini silmek icin Status kodunun 200 oldugu dogrulanir