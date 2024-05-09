
@DBUS_05
Feature: Daily Reports sutun Dogrulama
  Background:
    Given Database baglantisi kurulur.

  Scenario: TC01 Sutun isimlerini dogrulama
    And Kayitli daily_reports sutun isimleri almak icin query gonderilir
    Then Daily_Reports sutun isimleri dogrulanir


  Scenario: TC02 ID'le kaiyt dogrulama
    And Kayitli daily_reports bilgilerini almak icin query gonderilir
    Then Daily_Reports bilgiler  dogrulanir