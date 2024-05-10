
@API_US06

Feature: Contact-Controller Tests


  @ApiCustomerArzu @PostContactMessage
  Scenario: TC01 | Post/Contact-messages ile Yeni iletisim mesaji olusturulur
    Given Mesaj olusturmak icin Url duzenlenir
    And Yeni mesaj icin payload duzenlenir
    When Yeni mesaj icin POST request gonderilir ve Response alinir
    Then Yeni mesaj icin Status kodunun 200 oldugu dogrulanir
    And Yeni mesaj icin Response body dogrulanir

  @ApiAdminArzu
  Scenario: TC02 | Get/Contanct-messages ile butun mesajlar arasindan bu feature da post edilen mesaji bulup id si alınır
    Given Mesajlari cagirmak icin Url duzenlenir
    Given Mesajlari cagirmak icin request gönderilir ve Response alinir
    Then  Gelen mesaj icin Status kodun 200 oldugu dogrulanir
    Then Gelen mesajlar arasindan bir önceki post isleminde gonderilen mesaj bulunur dogrulanir id si alinir

  @ApiAdminArzu
  Scenario: TC03 | Get/Contact-messages/{id} Id numarasi ile mesaji cagirilir
    Given Mesaji cagirmak icin Url duzenlenir
    And  Mesaji cagirmak icin GET request gönderilir ve Response alinir
    Then Gelen mesaj icin Status kodun 200 oldugu dogrulanir
    And Gelen mesajin Response body si dogrulanir

  @ApiAdminArzu
  Scenario: TC04 | Delete/Contact-messages/{id} ile olusturulan mesaj id si ile silinir
    Given Mesaji silmek icin URL duzenlenir
    And Mesaji silmek icin DELETE request gonderilir
    Then Gelen mesaj icin Status kodun 200 oldugu dogrulanir
    And Body ile gelen "Contact message deleted successfully." yazisi dogrulanir