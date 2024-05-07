@US03_DB
Feature: Category Property Value Data Dogrulama

  Background:
    Given Database baglantisi kurulur

  Scenario: TC01 | Category Property Value Sutun Isimlerini Dogrulama Testi
    When Category Property Value sutun isimlerini almak icin query gonderilir
    Then Category Property Value sutun isimleri dogrulanir

  Scenario: TC02 | Category Property Value Sutun Bilgilerini Dogrulama Testi
    When Category Property Value sutun bilgilerini almak icin query gonderilir
    Then Category Property Value sutun bilgilerini dogrulanir