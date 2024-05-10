@US06DB
Feature:
  Scenario: cities sutun isimlerini ve bilgilerini doğrula

    Given US06 DataBase baglantisi  kurulur
    And US06 Beklenen categories datalari duzenlenir
    When US06 Kayitli cities datalari icin query gonderilir
    Then US06 Kayitli categories sutun isimleri ve bilgileri dogrulanir