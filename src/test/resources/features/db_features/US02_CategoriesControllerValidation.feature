@DB02 # US_02 categories gulsum #
Feature: Categories Dogrulama

  Scenario: Kayitli Categories Dogrulama Testi
    Given Database baglantisi kurulur
    And Beklenen categories datalari duzenlenir
    When Kayitli categories datalari icin query gonderilir
    Then Kayitli categories sutun isimleri ve bilgileri dogrulanir