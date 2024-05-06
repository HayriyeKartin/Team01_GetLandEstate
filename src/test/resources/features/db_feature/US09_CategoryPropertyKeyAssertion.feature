@US09_DB
Feature: Category Property Key Data Dogrulama

  Background:
    Given Database baglantisi kurulur

  Scenario: TC01 | Category Property Key Sutun Isimlerini Dogrulama Testi
    And Category Property Key sutun isimleri icin data duzenlenir
    When Category Property Key sutun isimlerini almak icin query gonderilir
    Then Category Property Key sutun isimleri dogrulanir

  Scenario: TC02 | Category Property Key Sutun Bilgilerini Dogrulama Testi
    When Category Property Key sutun bilgilerini almak icin query gonderilir
    Then Category Property Key sutun bilgilerini dogrulanir