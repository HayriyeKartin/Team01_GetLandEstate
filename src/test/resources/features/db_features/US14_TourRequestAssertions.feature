@DB_US14
Feature: Tour Request Data Dogrulama Testleri
@US14_TC01
  Scenario: TC01 Tour Request Sutun Isimlerini Dogrulama Testi
    Given Database baglantisi kurulur
    When Kayitli tour request sutun isimlerini almak icin query gonderilir
    Then Kayitli tour request sutun isimleri dogrulpanir

  @US14_TC02
  Scenario: TC02 Tour Request Sutun Bilgilerini Dogrulama Testi
    Given Database baglantisi kurulur
    When Kayitli tour request sutun bilgilerini almak icin query gonderilir
    Then Kayitli tour request sutun bilgileri dogrulanir
