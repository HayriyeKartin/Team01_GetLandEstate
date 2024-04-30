@US07
Feature: Kullanıcı(Manager) Sayfada Satilik Ilan Verebilmelidir Testi

  Background:
    Given kullanici web sayfasina gider
    When kullanici manager olarak giris yapmak icin login butonuna tiklar
    And kullanici manager email ve password bilgileri ile login olur
    And Back to Site butonuna tiklar
    And Create Property butonuna tiklar

  @US07TC01
  Scenario: TC01 Common Information, Address Information, Properties bilgilerini girebilmeli
    And Common Information bilgilerini girer
    And Address Information bilgilerini girer
    And Properties Information bilgilerini girer
    Then Common Information, Address Information, Properties bilgilerinin girilebildigini dogrular
    And sayfayi kapatir

  @US07TC02
  Scenario: TC02 Title boş bırakıldığında "Enter a title", Description boş bırakıldığında "Enter a description" uyarı metni gelmeli
    And Common Information bolumunde Title ve Description alanlarini bos birakir
    Then Enter a title ve Enter a description uyari metinlerinin goruldugunu dogrular
    And sayfayi kapatir

  @US07TC03
  Scenario: TC03 Adress bilgisi boş bırakıldığında "newAdvertPageTranslations.requiredAddress" uyarı metni gelmeli
    And Address Information bolumunde Address alani bos birakilir
    Then newAdvertPageTranslations.requiredAddress uyari metninin goruldugunu dogrular
    And sayfayi kapatir

  @US07TC04
  Scenario: TC04 Kullanici ilan icin resim ekleyebilmeli
    And Drag and drop the images or click here yazan alana tiklanarak ya da surukleyip  birakarak resim yukler
    Then Resim yuklendigini dogrular
    And sayfayi kapatir

  @US07TC05
  Scenario: TC05 Boyutu 3(uc) MB tan buyuk resim eklediginde "Each image should be a maximum of 3(uc) MB" uyari metni gelmeli
    And Drag and drop the images or click here yazan alana tiklanarak ya da surukleyip  birakarak boyutu uc MB tan buyuk olacak sekilde resim yukler
    Then Each image should be a maximum of uc MB uyari metninin goruldugunu dogrular
    And sayfayi kapatir

  @US07TC06
  Scenario: TC06 Tüm bilgiler doldurulmadan Create butonuna tıklanılmamalı("Title" alani bos birakilir)
    And Common Information bolumunde Title alanini bos birakir, diger tum alanlara gerekli datalari girer
    And Address Information bilgilerini girer
    And Properties Information bilgilerini girer
    And Drag and drop the images or click here yazan alana tiklanarak ya da surukleyip  birakarak resim yukler
    Then Create butonuna tiklanmadigini dogrular
    And sayfayi kapatir

  @US07TC07
  Scenario: TC07 Tüm bilgiler doldurulmadan Create butonuna tıklanılmamalı("Description" alani bos birakilir)
    And Common Information bolumunde Description alanini bos birakir, diger tum alanlara gerekli datalari girer
    And Address Information bilgilerini girer
    And Properties Information bilgilerini girer
    And Drag and drop the images or click here yazan alana tiklanarak ya da surukleyip  birakarak resim yukler
    Then Create butonuna tiklanmadigini dogrular
    And sayfayi kapatir

  @US07TC08
  Scenario: TC08 Tüm bilgiler doldurulmadan Create butonuna tıklanılmamalı("Price" alani bos birakilir)
    And Common Information bolumunde Price alanini bos birakir, diger tum alanlara gerekli datalari girer
    And Address Information bilgilerini girer
    And Properties Information bilgilerini girer
    And Drag and drop the images or click here yazan alana tiklanarak ya da surukleyip  birakarak resim yukler
    Then Create butonuna tiklanmadigini dogrular
    And sayfayi kapatir

  @US07TC09
  Scenario: TC09 Tüm bilgiler doldurulmadan Create butonuna tıklanılmamalı("Advert Type" alaninda secim yapilmaz)
    And Common Information bolumunde Advert Type alaninda secim yapilmaz, diger tum alanlara gerekli datalari girer
    And Address Information bilgilerini girer
    And Properties Information bilgilerini girer
    And Drag and drop the images or click here yazan alana tiklanarak ya da surukleyip  birakarak resim yukler
    Then Create butonuna tiklanmadigini dogrular
    And sayfayi kapatir

  @US07TC10
  Scenario: TC10 Tüm bilgiler doldurulmadan Create butonuna tıklanılmamalı("Category" alaninda secim yapilmaz)
    And Common Information bolumunde Category alaninda secim yapilmaz, diger tum alanlara gerekli datalari girer
    And Address Information bilgilerini girer
    And Properties Information bilgilerini girer
    And Drag and drop the images or click here yazan alana tiklanarak ya da surukleyip  birakarak resim yukler
    Then Create butonuna tiklanmadigini dogrular
    And sayfayi kapatir

  @US07TC11
  Scenario: TC11 Tüm bilgiler doldurulmadan Create butonuna tıklanılmamalı("Country" alaninda secim yapilmaz)
    And Common Information bilgilerini girer
    And Address Information bolumunde Country alaninda secim yapilmaz, diger tum alanlara gerekli datalari girer
    And Properties Information bilgilerini girer
    And Drag and drop the images or click here yazan alana tiklanarak ya da surukleyip  birakarak resim yukler
    Then Create butonuna tiklanmadigini dogrular
    And sayfayi kapatir

  @US07TC12
  Scenario: TC12 Tüm bilgiler doldurulmadan Create butonuna tıklanılmamalı("City" alaninda secim yapilmaz)
    And Common Information bilgilerini girer
    And Address Information bolumunde City alaninda secim yapilmaz, diger tum alanlara gerekli datalari girer
    And Properties Information bilgilerini girer
    And Drag and drop the images or click here yazan alana tiklanarak ya da surukleyip  birakarak resim yukler
    Then Create butonuna tiklanmadigini dogrular
    And sayfayi kapatir

  @US07TC13
  Scenario: TC13 Tüm bilgiler doldurulmadan Create butonuna tıklanılmamalı("District" alaninda secim yapilmaz)
    And Common Information bilgilerini girer
    And Address Information bolumunde District alaninda secim yapilmaz, diger tum alanlara gerekli datalari girer
    And Properties Information bilgilerini girer
    And Drag and drop the images or click here yazan alana tiklanarak ya da surukleyip  birakarak resim yukler
    Then Create butonuna tiklanmadigini dogrular
    And sayfayi kapatir

  @US07TC14
  Scenario: TC14 Tüm bilgiler doldurulmadan Create butonuna tıklanılmamalı("Address" alani bos birakilir)
    And Common Information bilgilerini girer
    And Address Information bolumunde Address alani bos birakilir, diger tum alanlara gerekli datalari girer
    And Properties Information bilgilerini girer
    And Drag and drop the images or click here yazan alana tiklanarak ya da surukleyip  birakarak resim yukler
    Then Create butonuna tiklanmadigini dogrular
    And sayfayi kapatir

  @US07TC15
  Scenario: TC15 Tüm bilgiler doldurulmadan Create butonuna tıklanılmamalı("Size" alani bos birakilir)
    And Common Information bilgilerini girer
    And Address Information bilgilerini girer
    And Properties bolumunde Size alani bos birakilir, diger tum alanlara gerekli datalari girer
    And Drag and drop the images or click here yazan alana tiklanarak ya da surukleyip  birakarak resim yukler
    Then Create butonuna tiklanmadigini dogrular
    And sayfayi kapatir

  @US07TC16
  Scenario: TC16 Tüm bilgiler doldurulmadan Create butonuna tıklanılmamalı("Bedrooms" alani bos birakilir)
    And Common Information bilgilerini girer
    And Address Information bilgilerini girer
    And Properties bolumunde Bedrooms alani bos birakilir, diger tum alanlara gerekli datalari girer
    And Drag and drop the images or click here yazan alana tiklanarak ya da surukleyip  birakarak resim yukler
    Then Create butonuna tiklanmadigini dogrular
    And sayfayi kapatir

  @US07TC17
  Scenario: TC17 Tüm bilgiler doldurulmadan Create butonuna tıklanılmamalı("Bathrooms" alani bos birakilir)
    And Common Information bilgilerini girer
    And Address Information bilgilerini girer
    And Properties bolumunde Bathrooms alani bos birakilir, diger tum alanlara gerekli datalari girer
    And Drag and drop the images or click here yazan alana tiklanarak ya da surukleyip  birakarak resim yukler
    Then Create butonuna tiklanmadigini dogrular
    And sayfayi kapatir

  @US07TC18
  Scenario: TC18 Tüm bilgiler doldurulmadan Create butonuna tıklanılmamalı("Garage" alaninda secim yapilmaz)
    And Common Information bilgilerini girer
    And Address Information bilgilerini girer
    And Properties bolumunde Garage alaninda secim yapilmaz, diger tum alanlara gerekli datalari girer
    And Drag and drop the images or click here yazan alana tiklanarak ya da surukleyip  birakarak resim yukler
    Then Create butonuna tiklanmadigini dogrular
    And sayfayi kapatir

  @US07TC19
  Scenario: TC19 Tüm bilgiler doldurulmadan Create butonuna tıklanılmamalı("Year of Build" alani bos birakilir)
    And Common Information bilgilerini girer
    And Address Information bilgilerini girer
    And Properties bolumunde Year of Build alani bos birakilir, diger tum alanlara gerekli datalari girer
    And Drag and drop the images or click here yazan alana tiklanarak ya da surukleyip  birakarak resim yukler
    Then Create butonuna tiklanmadigini dogrular
    And sayfayi kapatir

  @US07TC20
  Scenario: TC20 Tüm bilgiler doldurulmadan Create butonuna tıklanılmamalı("Furniture" alaninda secim yapilmaz)
    And Common Information bilgilerini girer
    And Address Information bilgilerini girer
    And Properties bolumunde Furniture alaninda secim yapilmaz, diger tum alanlara gerekli datalari girer
    And Drag and drop the images or click here yazan alana tiklanarak ya da surukleyip  birakarak resim yukler
    Then Create butonuna tiklanmadigini dogrular
    And sayfayi kapatir

  @US07TC21
  Scenario: TC21 Tüm bilgiler doldurulmadan Create butonuna tıklanılmamalı("Maintenance Fee" alani bos birakilir)
    And Common Information bilgilerini girer
    And Address Information bilgilerini girer
    And Properties bolumunde Maintenance Fee alani bos birakilir, diger tum alanlara gerekli datalari girer
    And Drag and drop the images or click here yazan alana tiklanarak ya da surukleyip  birakarak resim yukler
    Then Create butonuna tiklanmadigini dogrular
    And sayfayi kapatir

  @US07TC22
  Scenario: TC22 Tüm bilgiler doldurulmadan Create butonuna tıklanılmamalı("Terrace" alaninda secim yapilmaz)
    And Common Information bilgilerini girer
    And Address Information bilgilerini girer
    And Properties bolumunde Terrace alaninda secim yapilmaz, diger tum alanlara gerekli datalari girer
    And Drag and drop the images or click here yazan alana tiklanarak ya da surukleyip  birakarak resim yukler
    Then Create butonuna tiklanmadigini dogrular
    And sayfayi kapatir

  @US07TC23
  Scenario: TC23 Tüm bilgiler doldurulmadan Create butonuna tıklanılmamalı("Drag and drop the images or click here" alani bos birakilir)
    And Common Information bilgilerini girer
    And Address Information bilgilerini girer
    And Properties Information bilgilerini girer
    And Drag and drop the images or click here alani bos birakilir
    Then Create butonuna tiklanmadigini dogrular
    And sayfayi kapatir

  @US07TC24
  Scenario: TC24 Create butonuna tıklanarak ilan oluşturulmalı
    And Common Information bilgilerini girer
    And Address Information bilgilerini girer
    And Properties Information bilgilerini girer
    And Drag and drop the images or click here yazan alana tiklanarak ya da surukleyip  birakarak resim yukler
    And Create butonuna tiklar
    Then ilan olusturuldugunu dogrular
    And sayfayi kapatir

  @US07TC25
  Scenario: TC25 Create butonuna tıklanarak ilan oluşturulmalı(Country="Deutschland" ve City "Auvergne")
    And Common Information bilgilerini girer
    And Address Information alaninda Country Deutschland ve City Auvergne bilgilerini girer
    And Properties Information bilgilerini girer
    And Drag and drop the images or click here yazan alana tiklanarak ya da surukleyip  birakarak resim yukler
    And Create butonuna tiklar
    Then District alaninda secim yapilamadigindan ilan olusturulamadigini dogrular
    And sayfayi kapatir





















