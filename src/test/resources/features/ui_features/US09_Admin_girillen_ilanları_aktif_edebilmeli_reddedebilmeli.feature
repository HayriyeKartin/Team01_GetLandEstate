@US09
Feature: Admin girilen ilanları aktif edebilmeli reddedebilmeli

  Background:
    Given kullanici "http://www.getlandestate.com/" sitesine gider
    When giriş yap butonuna tıklar
    And admin olarak giriş yapar
    And kontrol panelinden ilanlar kısmına tıklar

   @US09TC01
  Scenario: TC01 Admin ilan araması yapabilmeli
    And ara butonuna tıklar
    Then ilan araması yapılabildiği doğrulanır
    And Sayfayı kapatır
  @US09TC02
  Scenario: : TC02 Admin kiralık ilan araması yapabilmeli
    And ilan türünü kiralık seçer
    And ara butonuna tıklar
    Then ilan araması yapılabildiği doğrulanır iki
    And Sayfayı kapatır
  @US09TC03
  Scenario: : TC03 Admin satılık ilan araması yapabilmeli
    And ilan türünü satılık seçer
    And ara butonuna tıklar
    Then ilan araması yapılabildiği doğrulanır üç
    And Sayfayı kapatır
  @US09TC04
  Scenario:TC04 Admin ilan aramayı Search kısmına ilan ismi girip diğer kısımları default bırakarak arama yapabilmeli
    And ara kısmına ilan ismi girer
    And ara butonuna tıklar
    Then ilan araması yapılabildiği doğrulanırDört
    And Sayfayı kapatır
  @US09TC05
  Scenario: TC05 Admin ilan arama kısmında başlangıç fiyatını negatif sayı girdiğinde uyarı vermeli
    And başlangıç fiyatını negatif girer
    Then başlangıç fiyatı sıfır ve daha büyük olmalı uyarısı alır
    And Sayfayı kapatır
  @US09TC06
  Scenario: TC06 Admin ilan arama kısmında başlangıç fiyatına pozitif bir değer girerek arama yapabilmeli
    And başlangıç fiyatını pozitif bir değer girer
    And ara butonuna tıklar
    Then ilan araması yapılabildiği doğrulanır
    And Sayfayı kapatır
  @US09TC0708
   Scenario Outline: TC07,TC08 Admin ilan arama kısmımda bitiş fiyatı 0 ve negatif girdiğinde uyarı vermeli
     And bitiş fiyatını "<0-negatif>" girer
     Then bitiş fiyatı pozitif olmalı uyarısı alır
     And Sayfayı kapatır
     Examples:
       | 0-negatif |
       |      0    |
       |     -1      |
  @US09TC09
   Scenario: TC09 Admin ilan arama kısmında bitiş fiyatına fiyatına pozitif bir değer girebilmeli
     And bitiş fiyatına pozitif değer girer
     And ara butonuna tıklar
     Then ilan araması yapılabildiği doğrulanır
     And Sayfayı kapatır
  @US09TC10
   Scenario: TC10 Admin ilan arama kısmında başlangıç  fiyatı bitiş fiyatından yüksek girildiğinde uyarı vermeli
     And kontrol panelinden ilanlar kısmına tıklar
     And başlangıç fiyatını bitiş fiyatından daha büyük girer
     And  ara butonuna tıklar
     Then başlangıç fiyatını bitiş fiyatından daha büyük olamaz uyarısı alır
     And Sayfayı kapatır
  @US09TC11
   Scenario: TC11 Admin ilan arama kısmında ilan durum kısmını aktif seçip diger kısımları default bıraktığında arama yapabilmeli
     And durum kısmını aktif şeçer
     And ara butonuna tıklar
     Then ilan araması yapılabildiği doğrulanır aktif
     And Sayfayı kapatır
  @US09TC12
    Scenario: TC12 Admin ilan arama kısmında ilan durum kısmını beklemede seçip diger kısımları default bıraktığında arama yapabilmeli
      And durum kısmını beklemede şeçer
      And ara butonuna tıklar
      Then ilan araması yapılabildiği doğrulanır beklemede
      And Sayfayı kapatır
  @US09TC13
     Scenario: TC13 Admin ilan arama kısmında ilan durum kısmını reddedildi seçip diger kısımları default bıraktığında arama yapabilmeli
       And durum kısmını reddedildi  şeçer
       And ara butonuna tıklar
       Then ilan araması yapılabildiği doğrulanır reddedildi
       And Sayfayı kapatır
  @US09TC14
  Scenario: TC14 Admin ilan arama kısmında ilan kategori türünü ev seçip diger kısımları default bıraktığında arama yapabilmeli
    And kategori kısmından evi seçer
    And ara butonuna tıklar
    Then ilan araması yapılabildiği doğrulanır ondört
    And Sayfayı kapatır
  @US09TC15
  Scenario: TC15 Admin ilan arama kısmında ilan kategori türünü apartman seçip diger kısımları default bıraktığında arama yapabilmeli
    And kategori kısmından apartmanı seçer
    And ara butonuna tıklar
    Then ilan araması yapılabildiği doğrulanır onbeş
    And Sayfayı kapatır
  @US09TC16
  Scenario: TC16 Admin ilan arama kısmında ilan kategori türünü ofis seçip diger kısımları default bıraktığında arama yapabilmeli
    And kategori kısmından ofisi seçer
    And ara butonuna tıklar
    Then ilan araması yapılabildiği doğrulanır onaltı
    And Sayfayı kapatır
  @US09TC17
  Scenario: TC17 Admin ilan arama kısmında ilan kategori türünü villa seçip diger kısımları default bıraktığında arama yapabilmeli
    And kategori kısmından villayı seçer
    And ara butonuna tıklar
    Then ilan araması yapılabildiği doğrulanır onyedi
    And Sayfayı kapatır
  @US09TC18
  Scenario: TC18 Admin ilan arama kısmında ilan kategori türünü arsa seçip diger kısımları default bıraktığında arama yapabilmeli
    And kategori kısmından arsayı seçer
    And ara butonuna tıklar
    Then ilan araması yapılabildiği doğrulanır onsekiz
    And Sayfayı kapatır
  @US09TC19
  Scenario: TC19 Admin ilan arama kısmında ilan kategori türünü mağaza seçip diger kısımları default bıraktığında arama yapabilmeli
    And kategori kısmından mağazayı seçer
    And ara butonuna tıklar
    Then ilan araması yapılabildiği doğrulanır ondokuz
    And Sayfayı kapatır

  @US09TC20
     Scenario: TC20 Admin ilanları güncelleyebilmeli
       And ara kısmına arayacağı ilanı yazar
       And ara butonuna tıklar
       And çıkan ilandan düzenle kısmına tıklar
       And başlık kısmını değiştirir
       And güncelle butonuna tıklar
       Then  güncelleme doğrulama yapılır
       And Sayfayı kapatır
  @US09TC21
       Scenario: TC21 Admin ilanları kabul  edebilmeli
         And ara kısmına arayacağı ilanı yazar
         And ara butonuna tıklar
         And çıkan ilandan düzenle kısmına tıklar
         And durum kısmını aktif yapar
         And güncelle butonuna tıklar
         Then güncelleme doğrulama yapılır
         And Sayfayı kapatır
  @US09TC22
  Scenario: TC22 Admin ilanları red edebilmeli
    And ara kısmına arayacağı ilanı yazar
    And ara butonuna tıklar
    And çıkan ilandan düzenle kısmına tıklar
    And durum kısmını red yapar
    And güncelle butonuna tıklar
    Then güncelleme doğrulama yapılır
    And Sayfayı kapatır



















