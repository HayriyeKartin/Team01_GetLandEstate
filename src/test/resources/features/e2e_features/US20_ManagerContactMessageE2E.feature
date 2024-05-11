@E2E_ContactManager
Feature: Manager Contact Message Controller E2E Test

  Scenario: TC01 Contact mesajlari görebilmeli
    Given kullanici web sayfasina gider
    And ContactMessages butonuna tiklar
    Then gelen mesaja tiklar ve mesajin goruntulendigini dogrular
    And sayfayi kapatir

  @ApiAdminArzu
  Scenario: TC02 | Get/Contanct-messages ile butun mesajlar arasindan bu feature da post edilen mesaji bulup id si alınır
    Given Mesajlari cagirmak icin Url duzenlenir
    Given Mesajlari cagirmak icin request gönderilir ve Response alinir
    Then  Gelen mesaj icin Status kodun 200 oldugu dogrulanir
    Then Gelen mesajlar arasindan bir önceki post isleminde gonderilen mesaj bulunur dogrulanir id si alinir

  @DB_US04
  Scenario: TC01 | Contacts sutun isimlerini dogrulama
    Given Database baglantisi kurulur
    And Kayitli contacts sutun isimlerini almak icin query gonderilir
    Then Kayitli contacts sutun isimleri dogrulanir