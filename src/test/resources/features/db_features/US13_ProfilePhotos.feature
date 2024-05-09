@DB
Feature: profile_photos sutun isimlerini ve bilgilerini doğrula
  Scenario: profile_photos sutun isimlerini ve bilgilerini doğrulama testi
    Given Database baglantisi kurulur.
    And Profile_photos Beklenen sutun isimleri ve bilgilerin datasi duzenlenir
    When Profile_photos Tablo sutun isimlerini ve bilgilerini almak icin query gonderilir
    Then Profile_photos Sutun isimleri dogrulanir
    Then Profile_photos Bilgileri dogrulanir