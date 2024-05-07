Feature:
  @US01_DB
  Scenario: DB Tablo isimlerini dogrulama

    Given DataBase baglantisi  kurulur
    And Beklenen Tablo isimleri datalari duzenlenir
    When Kayitli Tablo isimleri  datalari icin query gonderilir
    Then Kayitli Tablo isimleri dogrulanir