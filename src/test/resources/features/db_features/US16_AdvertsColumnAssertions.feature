Feature: Adverts sutun isimlerini ve bilgilerini doğrulama
  Background:
    Given : Database baglantisi kurulur
  @DbAdverts
  Scenario: TC01 Advets sutun isimlerini dogulama
    And  Adverts sutun isimleri icin query gönderilir
    Then  Adverts sutun isimleri dogrulanir

  @DbAdverts
  Scenario: TC02 Kayitli bir Adverts bilgisini dogrulama
    And  Kayitli Advert datasini almak icin query gönderilir
    Then Kayitli Advert datasinin bilgilileri dogrulanir