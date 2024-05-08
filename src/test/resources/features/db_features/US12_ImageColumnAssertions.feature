@US12DB
Feature:
  Scenario: images sutun isimlerini ve bilgilerini doğrula

    Given DataBase baglantisi  kurulur
    And Beklenen images datalari duzenlenir
    When Kayitli images datalari icin query gonderilir
    Then Kayitli images sutun isimleri ve bilgileri dogrulanir