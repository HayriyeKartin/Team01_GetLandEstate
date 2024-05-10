@E2E_Contact
Feature: Contact Message Controller E2E Test

  @US19TC01
  Scenario Outline: TC01 Kullanicilar sayfadan mesaj gonderebilmeli
    Given kullanici web sayfasina gider
    When kullanici contact butonuna tiklar
    When kullanici istenilen bilgileri girer "<firstname>","<lastname>","<email>","<message>"
    And ben robot degilim kutucuguna tiklar
    And send butonuna tiklar
    Then mesajin gonderildigi dogrulanir
    And sayfayi kapatir
    Examples:
      | firstname | lastname | email                | message                  |
      | Arzu      | Contact  | arzu@contact.com     | API testi icin message   |

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