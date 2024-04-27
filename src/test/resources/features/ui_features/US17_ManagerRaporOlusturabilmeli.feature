@US17
Feature: Manager Rapor Olusturabilmeli

  Background:
    Given kullanici web sayfasina gider
    When login butonuna tiklar
    And kullanici giris bilgileriyle login olur
    And menuden reports secenegine tiklar

  @US17TC01
  Scenario Outline: TC01 İlanların; start date, end date, category, advert type ve status bilgilerine göre rapor oluşturabilmeli
    When ADVERTS basligi altindaki "<startDate>", "<endDate>", category, advertType, status alaninda gecerli secim yapilir
    And adverts excel ikonuna tiklanir
    Then Success mesajinin goruntulendigi dogrulanir
    And sayfayi kapatir
    Examples:
      | startDate  | endDate    |
      | 01.04.2024 | 30.04.2024 |

  @US17TC02
  Scenario: TC02 Popüler ilanların raporunu oluşturabilmeli
    When MOST POPULAR PROPERTIES basligi altinda Amount alanina gecerli bir deger girilir
    And amount excel ikonuna tiklanir
    Then Success mesajinin goruntulendigi dogrulanir
    And sayfayi kapatir

  @US17TC03
  Scenario: TC03 Kullanıcı bilgilerine göre rapor oluşturabilmeli
    When USERS basligi altindaki rollerden biri secilir
    And users excel ikonuna tiklanir
    Then Success mesajinin goruntulendigi dogrulanir
    And sayfayi kapatir

  @US17TC04
  Scenario Outline: TC04 Tur isteklerine (TOUR REQUESTS) göre rapor oluşturabilmeli
    When TOUR REQUESTS basligi altindaki "<startDate>", "<endDate>", "<status>" alaninda gecerli secim yapilir
    And tourRequest excel ikonuna tiklanir
    Then Success mesajinin goruntulendigi dogrulanir
    And sayfayi kapatir
    Examples:
      | startDate  | endDate    | status   |
      | 26.04.2024 | 30.04.2024 | Approved |
