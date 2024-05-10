@US05UserE2E
Feature: E2E User testi

  Scenario: TC01 Admin kullaniciya Manager, Customer ve Admin rolu atayabilmeli
    Given kullanici "http://getlandestate.com/" gider
    When kullanici login butonuna tiklar
    And kullanici email ve password bilgileri ile login olur
    And Users kutusuna tiklar
    And arama kutusunda "rebelvamp@mail.com" aratilir
    And kullanici bilgileri duzenleme iconuna tiklar
    And Roles seceneginden MANAGER butonunu secer
    Then UPDATE butonuna tiklar ve rolun atandigini dogrular
    And sayfayi kapatir

  Scenario: TC02 GET Users Admin Request ile Dogrulama Testi
    Given Get User icin URL duzenlenir
    And Get User icin expected data duzenlenir
    When Get User icin GET request duzenlenir
    Then Get User icin Status kodunun 200 oldugu dogrulanir
    And Get User icin Response body dogrulanir

  Scenario: TC03 DB Data Dogrulama
    Given DataBase baglantisi  kurulur
    And Beklenen USERS datalari duzenlenir
    When Kayitli USERS  datalari icin query gonderilir
    Then Kayitli USERS  sutun isimleri ve bilgileri dogrulanir

