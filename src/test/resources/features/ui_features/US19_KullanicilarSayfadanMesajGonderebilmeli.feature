@US19
Feature: Kullanicilar Sayfadan Mesaj Gonderebilmeli

  Background:
    Given kullanici web sayfasina gider
    When kullanici contact butonuna tiklar

  @US19TC01
  Scenario Outline: TC01 Kullanicilar sayfadan mesaj gonderebilmeli
    When kullanici istenilen bilgileri girer "<firstname>","<lastname>","<email>","<message>"
    And ben robot degilim kutucuguna tiklar
    And send butonuna tiklar
    Then mesajin gonderildigi dogrulanir
    Examples:
      | firstname | lastname | email                | message   |
      | hayriye   | customer | customer@hayriye.com | Merhaba   |

  @US19TC02
  Scenario: TC02 Kullanicilar sayfadan mesaj gonderebilmeli
    Then firstname alanina iki karakterden kucuk bir deger girer ve uyari alindigi dogrulanir
    And lastname alanina iki karakterden kucuk bir deger girer ve uyari alindigi dogrulanir
    And email formatina uygun mail adresi girilmediginde uyari metninin goruntulendigi dogrulanir


  @US19TC03
  Scenario: TC03 Kullanicilar sayfadan mesaj gonderebilmeli (Negatif)
    Then kuyruklu a sembolu kullanilmadan email girildiginde uyari metninin goruntulendigi dogrulanir

  @US19TC04
  Scenario: TC04 Kullanicilar sayfadan mesaj gonderebilmeli (Negatif)
    Then nokta sembolu kullanilmadan email girildiginde uyari metninin goruntulendigi dogrulanir