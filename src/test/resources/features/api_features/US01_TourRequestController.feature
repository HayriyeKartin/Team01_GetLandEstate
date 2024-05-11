@API_US01
Feature: US01 Tour Request Controller Testleri

  @FatihCustomer
  Scenario: TC01 Tour Request Olusturma Testi
    Given Tour Request Olusturmak icin URL duzenlenir
    And Tour Request Olusturmak icin payload duzenlenir
    When Tour Request Olusturmak icin POST request gonderilir ve Response alinir
    Then Tour Request Olusturmak icin Status kodunun 200 oldugu dogrulanir
    And Tour Request Olusturmak icin Response body dogrulanir

  @FatihCustomer
  Scenario: TC02 Tour Request Put Testi
    Given Tour Request Put icin URL duzenlenir
    And Tour Request Put icin payload duzenlenir
    When Tour Request Put icin PUT request gonderilir ve Response alinir
    Then Tour Request Put icin Status kodunun 200 oldugu dogrulanir
    And Tour Request Put icin Response body dogrulanir

  @FatihCustomer
  Scenario: TC03 Tour Request Decline Testi
    Given Tour Request Decline icin URL duzenlenir
    And Tour Request Decline icin expected data duzenlenir
    When Tour Request Decline icin GET request gonderilir ve response alinir
    Then Tour Request Decline icin Status kodunun 200 oldugu dogrulanir
    And Tour Request Decline icin response body dogrulanir

  @FatihCustomer
  Scenario: TC04 Tour Request Approve Testi
    Given Tour Request Approve icin URL duzenlenir
    And Tour Request Approve icin expected data duzenlenir
    When Tour Request Approve icin GET request gonderilir ve response alinir
    Then Tour Request Approve icin Status kodunun 200 oldugu dogrulanir
    And Tour Request Approve icin response body dogrulanir

  @FatihCustomer
  Scenario: TC05 Tour Request Cancel Testi
    Given Tour Request Cancel icin URL duzenlenir
    And Tour Request Cancel icin expected data duzenlenir
    When Tour Request Cancel icin GET request gonderilir ve response alinir
    Then Tour Request Cancel icin Status kodunun 200 oldugu dogrulanir
    And Tour Request Cancel icin response body dogrulanir

  @FatihCustomer
  Scenario: TC06 Tour Request Delete Testi
    Given Tour Request Delete icin URL duzenlenir
    And Tour Request Delete icin expected data duzenlenir
    When Tour Request Delete icin Delete request gonderilir ve response alinir
    Then Tour Request Delete icin Status kodunun 200 oldugu dogrulanir
    And Tour Request Delete icin response body dogrulanir

  @FatihCustomer
  Scenario: TC07 Tour Request Page Testi
    Given Tour Request Page icin URL duzenlenir
    When Tour Request Page icin GET request gonderilir ve response alinir
    Then Tour Request Page icin Status kodunun 200 oldugu dogrulanir
    And Tour Request Page icin response body dogrulanir

  @FatihAdmin
  Scenario: TC08 Tour Request AdminCount Testi
    Given Tour Request AdminCount icin URL duzenlenir
    When Tour Request AdminCount icin GET request gonderilir ve response alinir
    Then Tour Request AdminCount icin Status kodunun 200 oldugu dogrulanir
    And Tour Request AdminCount icin response body dogrulanir






