@US05

Feature: US05 Admin yetkisi ile costumer kullanici bilgilerini gorebilme ve degistirme Testi

  Background:
    Given kullanici "http://getlandestate.com/" gider
    When kullanici login butonuna tiklar
    And kullanici email ve password bilgileri ile login olur

  @login
  Scenario: TC01 Sayfaya Admin olarak giris yapabilmeli
    When Back To Site butonuna tiklar
    Then login oldugu dogrulanir
    And sayfayi kapatir

  @ui
  Scenario Outline: TC02 Arama kutusunda kullanici aratilarak,olusturulan kullanici bilgileri gorulebilmeli(Name,Email,Phone,Role)
    When Users kutusuna tiklar
    And arama kutusunda verilen bilgileri aratir "<name>", "<email>", "<phone>", "<role>"
    Then kullanici bilgilerinin goruntulendigi dogrulanir
    And sayfayi kapatir
    Examples:
      | name     | email              | phone          | role     |
      | customer | rebelvamp@mail.com | (966) 778-1000 | CUSTOMER |

  @update
  Scenario: TC03 Kullanici bilgilerini guncelleyebilmeli
    When Users kutusuna tiklar
    And arama kutusunda "rebelvamp@mail.com" aratilir
    And kullanici bilgileri duzenleme iconuna tiklar
    And kullanici yeni bilgilerini girer
    And UPDATE butonuna tiklar
    Then user bilgilerinin guncellendigini dogrular
    And sayfayi kapatir

  @manager
  Scenario: TC04 Manager, Customer ve Admin rolu atanabilmeli
    When Users kutusuna tiklar
    And arama kutusunda "rebelvamp@mail.com" aratilir
    And kullanici bilgileri duzenleme iconuna tiklar
    And Roles seceneginden MANAGER butonunu secer
    Then UPDATE butonuna tiklar ve rolun atandigini dogrular
    And sayfayi kapatir

  @costumer
  Scenario: TC05 Manager, Customer ve Admin rolu atanabilmeli
    When Users kutusuna tiklar
    And arama kutusunda "rebelvamp@mail.com" aratilir
    And kullanici bilgileri duzenleme iconuna tiklar
    And Roles seceneginden CUSTOMER butonunu secer
    Then UPDATE butonuna tiklar ve rolun atandigini dogrular
    And sayfayi kapatir

  @admin
  Scenario: TC06 Manager, Customer ve Admin rolu atanabilmeli
    When Users kutusuna tiklar
    And arama kutusunda "rebelvamp@mail.com" aratilir
    And kullanici bilgileri duzenleme iconuna tiklar
    And Roles seceneginden ADMIN butonunu secer
    Then UPDATE butonuna tiklar ve rolun atandigini dogrular
    And sayfayi kapatir


  @delete
  Scenario: TC07 Olusturulan kullanici silinebilmeli
    When Users kutusuna tiklar
    And arama kutusunda "rebelvamp@mail.com" aratilir
    And kullanici bilgileri duzenleme iconuna tiklar
    And DELETE butonuna tiklar
    And "Are you sure you want to delete the user?" sorusunu goruntuler
    And YES butonuna tiklar
    Then "User deleted successfully" yazisini gorur ve kullanicinin silindigini dogrular
    And sayfayi kapatir

