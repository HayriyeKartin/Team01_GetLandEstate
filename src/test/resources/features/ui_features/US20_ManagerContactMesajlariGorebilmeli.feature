@US20
Feature: Manager Contact Mesajları görebilmeli

  Background:
    Given kullanici web sayfasina gider
    And ContactMessages butonuna tiklar

  @US20TC01
  Scenario: TC01 Contact mesajlari görebilmeli ve silebilmeli
    Then gelen mesaja tiklar ve mesajin goruntulendigini dogrular
    Then gelen mesaji siler ve mesajin silindigini dogrular
    And sayfayi kapatir

  @US20TC02
  Scenario: TC02 Contact mesajları okundu olarak işaretleyebilmeli
    When gelen mesaja tiklar
    And mark as read ikonuna tiklar
    Then mesajin okundu olarak isaretlendigini dogrular
    And sayfayi kapatir

  @US20TC03
  Scenario: TC03 Contact mesajları içerisinde arama yapabilmeli
    When arama kutusuna gecerli bir deger girer ve arama butonuna tiklar
    Then arama sonucunun goruntulendigini dogrular
    And sayfayi kapatir

  @US20TC04
  Scenario: TC04 Okunan mesajlar içerisinde tarih aralığı vererek arama yapabilmeli
    When filtreleme ikonuna tiklar
    And okunan mesajlari secer
    And baslangic ve bitis tarihi secer
    And Apply Filters butonuna tiklar
    Then filtreleme sonuclarinin goruntulendigini dogrular
    And sayfayi kapatir

  @US20TC05
  Scenario: TC05 Okunmayan mesajlar içerisinde tarih aralığı vererek arama yapabilmeli
    When filtreleme ikonuna tiklar
    And okunmayan mesajlari secer
    And baslangic ve bitis tarihi secer
    And Apply Filters butonuna tiklar
    Then filtreleme sonuclarinin goruntulendigini dogrular
    And sayfayi kapatir