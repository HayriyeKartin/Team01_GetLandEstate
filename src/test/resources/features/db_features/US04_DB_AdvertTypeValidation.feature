@DB04
Feature: Advert Type Dogrulama
  Scenario: Kayitli Advert Types Dogrulama Testi
    Given Database connection kurulur
    And Beklenen Advert Type datasi duzenlenir
    When Kayitli Advert Type datasini almak icin query gonderilir
    Then Kayitli Advert Type datasi dogrulanir