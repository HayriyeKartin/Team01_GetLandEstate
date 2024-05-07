@DB_US10
Feature: DB_US10 Confirmation_Token Data Dogrulama
  Background:
    Given Database baglantisi kurulur

  Scenario: TC01 | Confirmation_Token sutun isimlerini dogrulama
    And Kayitli confirmation_token sutun isimlerini almak icin query gonderilir
    Then Kayitli confirmation_token sutun isimleri dogrulanir


  Scenario: TC02 | Confirmation_Token sutun bilgilerini dogrulama
    And Kayitli confirmation_token sutun bilgilerini almak icin query gonderilir
    Then Kayitli confirmation_token sutun bilgileri dogrulanir
