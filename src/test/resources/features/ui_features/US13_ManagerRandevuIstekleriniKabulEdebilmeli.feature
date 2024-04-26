@US13
Feature:

  Background:
    Given kullanici web sayfasina gider
    When kullanici login butonuna tiklar
    And kullanici email ve password bilgileriylen login olur
    And Back to Site butonuna tiklar
    And kullanici profil sekmesine tiklar
    And kullanici tur istekleri sekmesine tiklar
    And kullanici my responses basligina tiklar

  @US13TC01
  Scenario: TC01 Kullanici verdigi ilanlara ait randevu isteklerini gorebilmeli
    Then kullanici randevu isteginin goruntulendigini dogrular

  @US13TC01
  Scenario: TC02 Kullanici verdigi ilana ait randevu isteklerini red ve kabul edebilmeli
    And kullanici randevu istegini reddeder
    And kullanici randevu isteginin reddini onaylar
    Then kullanici randevu isteginin reddini dogrular
    And kullanici randevu istegini kabul eder
    And kullanici randevu isteginin kabulunu onaylar
    Then kullanici randevu isteginin kabulunu dogrular
    And sayfayi kapatir