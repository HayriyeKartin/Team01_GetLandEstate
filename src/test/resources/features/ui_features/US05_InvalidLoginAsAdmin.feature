@invalid
Feature: Admin yetkisi ile gecersiz login Testi

  Background:
    Given kullanici "http://getlandestate.com/" gider
    When kullanici login butonuna tiklar

  Scenario Outline: TC01 Kullanici sayfaya Admin olarak gecersiz email ve password ile login olunamamali
    When gecersiz "<email>" ve "<password>" bilgilerini girer
    And LOGIN butonuna tiklar
    Then uyari mesaji goruntulenir ve login olunamadigini dogrular
    And sayfayi kapatir
    Examples:
      | email    | password  |
      | deneme@g | deneme123 |


