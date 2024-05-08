@ApiUS12CountryController
Feature: API Countries Controller Testleri
  @ApiUS12CountryControllerAdmin
  Scenario: TC01 | Admin Get Request ile Countries kayıtlarını çekebilmeli
    Given Admin Countries kontroller icin URL düzenler
    And Admin Countries kontroller için expected data düzenler
    When Admin Countries kontroller icin GET request gönderir
    Then Admin Counries kontroller icin Response Body doğrular

  @ApiUS12CountryControllerCustomer
  Scenario: TC02 | Customer Get Request ile Countries kayıtlarını çekememeli
    Given Customer Countries kontroller icin URL düzenler
    And Customer Countries kontroller için expected data düzenler
    When Customer Countries kontroller icin GET request gönderir
    Then Customer Countries kontroller icin status code doğrulaması yapar

  @ApiUS12CountryControllerManager
  Scenario: TC03 | Manager Get Request ile Countries kayıtlarını çekebilmemi
    Given Mangager Countries kontroller icin URL düzenler
    And Manager Countries kontroller için expected data düzenler
    When Manager Countries kontroller icin GET request gönderir
    Then Manager Countries kontroller icin status code doğrulaması yapar