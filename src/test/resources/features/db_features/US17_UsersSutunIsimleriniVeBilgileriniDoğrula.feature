Feature:
  @US17_DB
  Scenario: DB users sutun isimlerini ve bilgilerini dogrulama

    Given DataBase baglantisi  kurulur
    And Beklenen USERS datalari duzenlenir
    When Kayitli USERS  datalari icin query gonderilir
    Then Kayitli USERS  sutun isimleri ve bilgileri dogrulanir