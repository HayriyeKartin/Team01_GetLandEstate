@US21
Feature: US21 GetLandEstate sayfasında Admin Contact Mesajları Testi

  Background:
    Given kullanici URL e gider
    When login butonuna tiklar
    And Email ve password bilgileri ile login olur
    And Contact messages sayfasına gider

  Scenario: TC01 Contact Mesajlari gorebilmeli ve silebilmeli
    And Mesaj listesi goruntulenir
    And Bir mesaji secer ve siler
    Then Mesajin silindigini dogrular

  Scenario: TC02 Contact Mesajlari okundu olarak isaretleyebilmeli
  And Okunmamis mesajlari kontrol eder
  And Bir mesaji secer ve okundu olarak isaretler
  Then Mesajin okundu olarak isaretlendigini dogrular


  Scenario: TC03 Contact Mesajlar icerisinde arama yapabilmeli
  And Arama cubuguna gecerli bir sorgu girer
  And Arama butonuna tiklar
  Then Arama sonuclari goruntulenir

Scenario: TC04 Okunan ve okunmayan mesajlar icerisinde tarih araligi vererek arama yapabilmeli
  And Filtre ikonuna tiklar
  And Bir tarih araligi secer
  And Apply Filters butonuna tiklar
  Then Arama sonuclari goruntulenir

