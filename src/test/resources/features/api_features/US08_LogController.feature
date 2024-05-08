@ApiUS08LogController
Feature: API Log Controller Testleri
  @ApiUS08LogControllerAdmin
  Scenario: TC01 | Admin Get Request ile log kayıtlarını çekebilmeli
    Given Admin log kontroller icin URL düzenler
    And Admin log kontroller için expected data düzenler
    When Admin log kontroller icin GET request gönderir
    Then Admin log kontroller icin Response Body doğrular

  @ApiUS08LogControllerCustomer
  Scenario: TC02 | Customer Get Request ile log kayıtlarını görememeli
    Given Customer log kontroller icin URL düzenler
    And Customer log kontroller için expected data düzenler
    When Customer log kontroller icin GET request gönderir
    Then Customer log kontroller icin status kod doğrulaması yapar

  @ApiUS08LogControllerManagerTC03
  Scenario: TC03 | Manager Get Request ile kendine ait log kayıtlarını çekebilmeli
    Given Manager kendi log kayıtları icin URL düzenler
    And Manager kendi log kayıtları için expected data düzenler
    When Manager kendi log kayıtları icin GET request gönderir
    Then Manager kendi log kayıtları icin status code doğrular

  @ApiUS08LogControllerManagerTC04
  Scenario: TC04 | Manager Get Request ile başkasına ait log kayıtlarını çekememeli
    Given Manager başkasının log kayıtları icin URL düzenler
    And Manager başkasının log kayıtları için expected data düzenler
    When Manager başkasının log kayıtları icin GET request gönderir
    Then Manager başkasının log kayıtları icin status code doğrular


