@US09AdvertE2E
  Feature: E2E Advert testi
    @US09AdvertE2ETC01
    Scenario: TC01 Admin ilanları red edebilmeli
      Given kullanici "http://www.getlandestate.com/" sitesine gider
      When giriş yap butonuna tıklar
      And admin olarak giriş yapar
      And kontrol panelinden ilanlar kısmına tıklar
      And ara kısmına arayacağı ilanı yazar
      And ara butonuna tıklar
      And çıkan ilandan düzenle kısmına tıklar
      And durum kısmını red yapar
      And güncelle butonuna tıklar
      Then güncelleme doğrulama yapılır
      And Sayfayı kapatır

    @US09AdvertE2ETC02
      Scenario:TC02 GET Adverts Admin Request ile Dogrulama Testi
        Given Admin Adverts kontroller icin URL düzenler
        And Admin Adverts kontroller için expected data düzenler
        When Admin Adverts kontroller icin GET request gönderir
        Then Admin Adverts kontroller icin Response Body doğrular