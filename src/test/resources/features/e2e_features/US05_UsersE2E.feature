@US05UserE2E
Feature: E2E User testi

  @UI
  Scenario Outline: User Register Testi
    Given kullanici web sitesine girer
    When register linkine tiklar
    And firstname kutusuna "<firstname>" yazar
    And lastname kutusuna "<lastname>" yazar
    And phone Number kutusuna "<phonenumber>" yazar
    And email kutusuna "<email>" yazar
    And enter Password kutusuna "<password>" yazar
    And confirm Password kutusuna "<password>" yazar
    And Terms Of Use onay kutusunu secer
    And register butonuna tiklar
    Then kayit isleminin basarili oldugunu dogrular
    And sayfayi kapatir
    Examples:
      | firstname | lastname | phonenumber    | email             | password  |
      | tester    | gulsum   | (555) 777-9999 | tester@gulsum.com | Gulsum61! |

  @ApiAdmin
  Scenario: TC02 Get User Testi
    Given Kayitli user ID bilgisi alinir
    Given Get user icin URL duzenlenir
    And Get user icin expected data duzenlenir
    When Get user icin GET request duzenlenir
    Then Get user icin Status kodunun 200 oldugu dogrulanir
    And Get user icin Response body dogrulanir


  Scenario: TC03 DB User Register Dogrulama
    Given Database baglantisi kurulur
    When Kayitli user sutun isimlerini almak icin query gonderilir
    Then Kayitli user sutun isimleri dogrulanir
    And Kayitli user datalarini almak icin query gonderilir
    Then Kayitli user datalari dogrulanir


  @ApiAdmin
  Scenario: TC04 Patch User Role Update Testi
    Given Patch user icin URL duzenlenir
    And Patch user icin expected data duzenlenir
    When Patch user icin PATCH request duzenlenir
    Then Patch user icin Status kodunun 200 oldugu dogrulanir
    And Patch user icin Response body dogrulanir


  Scenario: TC05 DB User Role Dogrulama
    Given Database baglantisi kurulur
    When Kayitli user role bilgisini almak icin query gonderilir
    Then Kayitli user role bilgisi dogrulanir


  @E2EAdmin
  Scenario: TC06 Kendi Hesabini Silme Testi
    Given Kayitli hesabi silmek icin URL duzenlenir
    When Kayitli hesabi silmek icin DELETE request gonderilir ve response alinir
    Then Kayitli hesabi silmek icin Status kodunun 200 oldugu dogrulanir


  Scenario: TC07 DB User Delete Dogrulama
    Given Database baglantisi kurulur
    When Kayitli user bilgisini almak icin query gonderilir
    Then Kayitli user silindigi dogrulanir