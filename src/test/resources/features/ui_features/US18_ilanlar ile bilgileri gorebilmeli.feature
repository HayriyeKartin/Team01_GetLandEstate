
@US18
Feature: US18 Getland Testi02
  Scenario Outline: TC-01 Sayfadaki bir ilanı görmek için istekte bulunabilmeli
    Given Kullanici "http://getlandestate.com/" sayfasina gider
    When Kullanici login butonuna tiklar
    Then Kullanici "<email>" ve "<password>" ile login olur
    And Back To Site butonuna tiklar
    And Kullanici ev kategorisine tiklar
    And Kullanici liste de sekizinci ilana tiklar
    And Kullanici sayfanin tur ayarla icerdigini test eder
    And Kullanici tarih alanina deger girer
    And Kullanici saat alanina deger girer
    And Kullanici Tur talebi gönder butonuna tiklar
    And Kullanici  bilgi mesajı alir
    And sayfayi kapatir
    Examples:
      | email                | password |
      | iamhafsa94@gmail.com | Hafsa.46 |



  Scenario Outline : TC-02 Kendi verdiği ilanların gezme isteklerini görebilmeli, kabul edebilmeli ve reddedebilmeli
    Given Kullanici "http://getlandestate.com/" sayfasina gider
    When Kullanici login butonuna tiklar
    Then Kullanici "<email>" ve "<password>" ile login olur
    And Back To Site butonuna tiklar
    And Kullanici profile sekmesine tiklar
    And Kullanici Tur taleplerim  sekmesine tiklar
    And Kullanici Tur cevaplarim sekmesine tiklar
    And Kullanici ilan istegini gorebilmeli
    And Kullanici red butonunu dogrular
    And Kullanici kabul butonunu dogrular
    Examples:
      | email                | password |
      | iamhafsa94@gmail.com | Hafsa.46 |




