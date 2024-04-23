@US08
Feature: US08 Getland Testi

  Scenario Outline: TC-01 Ilanlari gorebilmeli, guncelleyebilmeli ve silebilmeli
    Given Kullanici "http://getlandestate.com/" sayfasina gider
    When Kullanici login butonuna tiklar
    Then Kullanici "<email>" ve "<password>" ile login olur
    And Back To Site butonuna tiklar
    And Kullanici profile sekmesine tiklar
    And Kullanici ilanlarim sekmesine tiklar
    And Kullanici sayfada ilan oldugunu dogrular
    And Kullanici ilani guncelle sekmesine tiklar
    And Kullanici ilani guncellendigini dogrular
    And Kullanici ilani siler
    And Kullanici ilanin silebildigini dogrular
    And sayfayi kapatir

    Examples:
      | email                | password |
      | iamhafsa94@gmail.com | Hafsa.46 |

  Scenario Outline: TC-02 Ilanları ile ilgili Date Published, Status ve View-Like-Tour bilgilerini görebilmeli
    Given Kullanici "http://getlandestate.com/" sayfasina gider
    When Kullanici login butonuna tiklar
    Then Kullanici "<email>" ve "<password>" ile login olur
    And Back To Site butonuna tiklar
    And Kullanici profile sekmesine tiklar
    And Kullanici ilanlarim sekmesine tiklar
    And Kullanici sayfanin Yayinlama Tarihi icerdigini dogrular
    And Kullanici sayfanin Durum icerdigini dogrular
    And Kullanici sayfanin Goruntuleme-Begeni-Tur icerdigini dogrular

    Examples:
      | email                | password |
      | iamhafsa94@gmail.com | Hafsa.46 |