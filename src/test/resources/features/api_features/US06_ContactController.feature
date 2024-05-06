@APIARZU
Feature: API Contact Controller Tests

  @ApiCustomerArzu
  Scenario: TC01 | Contact Message Test
    Given Contact Message icin URL duzenlenir
    And Contact Message icin payload duzenlenir
    When Contact Message icin POST request gonderilir ve Response alinir
    Then Contact Message icin Status kodunun 200 oldugu dogrulanir
    And Contact Message icin Response body dogrulanir

  @ApiAdminArzu
  Scenario: TC02 | Get Contact Message id Test
    Given Get Contact Message icin URL duzenlenir
    And  Get Contact Message icin expected data duzenlenir
    When Get Contact Message icin GET request gonderilir ve response alinir
    Then Get Contact Message icin Status kodunun 200 oldugu dogrulanir
    And  Get Contact Message icin Response body dogrulanir

  @ApiAdminArzu
  Scenario: TC03 | Patch Contact Message id Test
    Given Patch Contact Message icin URL duzenlenir
    And  Patch Contact Message icin expected data duzenlenir
    When Patch Contact Message icin GET request gonderilir ve response alinir
    Then Patch Contact Message icin Status kodunun 200 oldugu dogrulanir
    And  Patch Contact Message icin Response body dogrulanir

  @ApiAdminArzu
  Scenario: TC04 | Delete Contact Message id Test
    Given Delete Contact Message icin URL duzenlenir
    When Delete Contact Message icin GET request gonderilir ve response alinir
    Then Delete Contact Message icin Status kodunun 200 oldugu dogrulanir
    And  Delete Contact Message icin Response body dogrulanir
