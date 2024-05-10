@DB_US04
Feature: DB_US04 Contacts Data Dogrulama
  Background:
    Given Database baglantisi kurulur

  Scenario: TC01 | Contacts sutun isimlerini dogrulama
    And Kayitli contacts sutun isimlerini almak icin query gonderilir
    Then Kayitli contacts sutun isimleri dogrulanir


  Scenario: TC02 | Contacts sutun bilgilerini dogrulama
    And Kayitli contacts sutun bilgilerini almak icin query gonderilir
    Then Kayitli contacts sutun bilgileri dogrulanir