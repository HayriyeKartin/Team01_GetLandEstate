@US14
Feature:

  Background:
    Given kullanici web sayfasina gider
    When Kullanici login butonuna tiklar
    And kullanici email ve password bilgileriylen login olur

  @US14TC01
  Scenario: TC01 Kullanici kendine ait olmayan bir ilan icin randevu olusturabilmeli
    And kullanici menuden tour request sekmesine tiklar
    And kullanici arama kutusuna tur talabi gonderilicek ilani yazar
    And kullanici arama butonuna tiklar
    And kullanici tur talebi gonderilecek ilani secer
    And kullanici tur tarihi ve tur suresini secer
    And kullanici submit a tour request butonuna tiklar
    Then kullanici tur talebinin gonderildigini dogrular

  @US14TC02
  Scenario: TC02 Kullanici olusturdugu randevunun kabul veya reddedildigini gorebilmeli
    And Back to Site butonuna tiklar
    And kullanici profil sekmesine tiklar
    And kullanici tur istekleri sekmesine tiklar
    And kullanici My Requests basligina tiklar
    Then kullanici tur talebinin onaylanip onaylanmadigini dogrular
    And sayfayi kapatir