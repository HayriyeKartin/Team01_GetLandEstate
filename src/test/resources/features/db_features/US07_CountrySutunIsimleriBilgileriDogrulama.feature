@DBUS07Country
Feature:Country Sutun İsimleri ve bilgileri Dogrulama
  @DBUS07CountryTC01
  Scenario:TC_01 Country Sutun İsimlerini Dogrulama
    Given Database baglantisi kurulur suleyman
    And Country isimleri datasi duzenlenir
    When Country İsimleri datasini almak icin query gonderilir
    Then Country isimleri dogrulanir
  @DBUS07CountryTC02
  Scenario:TC_02 Sutun Bilgilerini Dogrulama
    Given Database baglantisi kurulur suleyman
    And Country Bilgileri datasi duzenlenir
    When Country bilgileri datasini almak icin query gonderilir
    Then Country bilgileri dogrulanir