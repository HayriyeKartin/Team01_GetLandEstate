@US18_DB
Feature: Favori Ilanlarin Sutun Isimlerini ve Bilgilerini Dogrulama

  Background:
    Given Database baglantisi kurulur

  Scenario: TC01 | Favori Ilanlarin Sutun Isimlerini Dogrulama Testi
    When Favori ilanlarin sutun isimlerini almak icin query gonderilir
    Then Favori ilanlarin sutun isimleri dogrulanir

  Scenario: TC02 | Favori Ilanlarin Sutun Bilgilerini Dogrulama Testi
    When Favori ilanlarin sutun bilgilerini almak icin query gonderilir
    Then Favori ilanlarin sutun bilgileri dogrulanir