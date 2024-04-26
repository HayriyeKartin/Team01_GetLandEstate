
@US18
Feature: US018 GetlandEstate sayfasinda manager ilanlar ile ilgili yapilan işlemler

  Scenario : TC-01 Sayfadaki bir ilani görmek için istekte bulunabilmeli
    Given Kullanici getLandEstate web sayfasina gider
    When Sayfanin sag ust bolumundeki Login butonuna tiklayarak giris ekranina ulasir.
    Then Kullanici ilgili alanlara Email ve Enter password bilgisini yazar ve giris yapar.
    And Acilan sayfada soldaki menuden Back to Site butonuna tiklar.
    And Kullanici acilan sayfada Properties bolumune tiklar
    And Kullanici acilan sayfada istedigi ilani secer
    And Kullanici sayfanin sag kismindaki Schedule a tour bolumunden gun ay yil ve saat bolumlerini doldurur
    And islemler tamamlandiktan sonra Submit a tour request butonuna tiklar
    And Kullanici bilgi mesajini aldigini dogrular


  Scenario: TC-02 Kendi verdiği ilanlarin gezme isteklerini görebilmeli, kabul edebilmeli ve reddedebilmeli

    Given Kullanici getLandEstate web sayfasina gider
    When Sayfanin sag ust bolumundeki Login butonuna tiklayarak giris ekranina ulasir.
    Then Kullanici ilgili alanlara Email ve Enter password bilgisini yazar ve giris yapar.
    And Acilan sayfada soldaki menuden Back to Site butonuna tiklar.
    And Kullanici sag ust kisimdaki profil bolumune tiklar ve My Tour Requests'e tiklar
    And Acilan pencerede My Responses bolumune tiklar
    And Kullanici sayfada ilan oldugunu dogrular
    And Kullanici red butonunu dogrular
    And Kullanici onay butonunu dogrular

