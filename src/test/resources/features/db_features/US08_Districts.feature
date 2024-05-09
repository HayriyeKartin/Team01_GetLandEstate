
  @DBUS_08
    Feature: Districts sutun Dogrulama
      Background:
        Given Database baglantisi kurulur.

      Scenario: TC01 Sutun isimlerini dogrulama
        And Kayitli districts sutun isimleri almak icin query gonderilir
        Then Districts sutun isimleri dogrulanir


      Scenario: TC02 ID'le kayit dogrulama
        And Kayitli districts bilgilerini almak icin query gonderilir
        Then Districts bilgiler  dogrulanir
