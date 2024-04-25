@US10
Feature: US10 Customer Kiralik ilan Arama Testi
  Background:
    Given customer web sayfasina gider
    When customer login butonuna tiklar
    And customer olarak email girer
    And customer olarak password girer
    And giris icin login butonuna tiklar

  @rentHouse
  Scenario: TC01 Customer kiralik ev ilani arayabilmeli

    When rent butonuna tiklar
    And house butonuna tiklar
    And buyutec ikonuna tiklar
    Then house ile ilgili Rent seceneklerinin geldigini dogrular
    And sayfayi kapatir

  @rentVilla
  Scenario: TC02 Customer kiralik villa ilani arayabilmeli

    When rent butonuna tiklar
    And villa butonuna tiklar
    And buyutec ikonuna tiklar
    Then villa ile ilgili Rent seceneklerinin geldigini dogrular


  @rentApartment
  Scenario: TC03 Customer kiralik apartman ilani arayabilmeli
    When rent butonuna tiklar
    And searchBox alanina apartment yazar
    And buyutec ikonuna tiklar
    Then apartman ile ilgili Rent seceneklerinin geldigini dogrular
    And sayfayi kapatir

  @rentOffice
  Scenario: TC04 Customer kiralik ofis ilani icin ozel arama yapabilmeli

    And buyutec ikonuna tiklar
    When price range bilgilerini girer
    And advert type dropdowndan Rent secer
    And category dropdowndan Office secer
    And country dropdowndan Turkiye secer
    And city dropdowndan Ankara secer
    And alttaki search butonuna tiklar
    Then ofis ile ilgili Rent seceneklerinin geldigini dogrular
    And sayfayi kapatir

  @rentLand
  Scenario: TC05 Customer kiralik arsa ilani icin ozel arama yapabilmeli

    When searchBox alanina land yazar
    And buyutec ikonuna tiklar
    When price range bilgilerini girer
    And advert type dropdowndan Rent secer
    And category dropdowndan Land secer
    And country dropdowndan Turkiye secer
    And city dropdowndan Kocaeli secer
    And district dropdowndan Darica secer
    And alttaki search butonuna tiklar
    Then land ile ilgili Rent seceneklerinin geldigini dogrular
    And sayfayi kapatir

  @rentShop
  Scenario: TC06 Customer kiralik isyeri ilani icin ozel arama yapabilmeli ve ilani secebilmeli
    When searchBox alanina shop yazar
    And buyutec ikonuna tiklar
    When price range bilgilerini girer
    And advert type dropdowndan Rent secer
    And category dropdowndan Shop secer
    And country dropdowndan Turkiye secer
    And city dropdowndan Batman secer
    And district dropdowndan Kozluk secer
    And alttaki search butonuna tiklar
    Then shop ile ilgili Rent seceneklerinin geldigini dogrular
    And kiralik isyeri ilan resmine tiklar
    Then kiralik isyeri ilanini secebildigini dogrular


  @rentRealEstatePicture
  Scenario: TC07 Customer sectigi kiralik emlak ile alakali resim gorebilmeli

    When searchBox alanina shop yazar
    And buyutec ikonuna tiklar
    When price range bilgilerini girer
    And advert type dropdowndan Rent secer
    And category dropdowndan Shop secer
    And country dropdowndan Turkiye secer
    And city dropdowndan Batman secer
    And district dropdowndan Kozluk secer
    And alttaki search butonuna tiklar
    Then shop ile ilgili Rent seceneklerinin geldigini dogrular
    And kiralik isyeri ilan resmine tiklar
    Then sectigi kiralik emlagin resmini gordugunu dogrular
    And sayfayi kapatir

  @rentRealEstateDescription
  Scenario: TC08 Customer sectigi kiralik emlak ile alakali Description bilgilerini gorebilmeli

    When searchBox alanina shop yazar
    And buyutec ikonuna tiklar
    When price range bilgilerini girer
    And advert type dropdowndan Rent secer
    And category dropdowndan Shop secer
    And country dropdowndan Turkiye secer
    And city dropdowndan Batman secer
    And district dropdowndan Kozluk secer
    And alttaki search butonuna tiklar
    Then shop ile ilgili Rent seceneklerinin geldigini dogrular
    And kiralik isyeri ilan resmine tiklar
    Then sectigi kiralik emlak ile ilgili description gordugunu dogrular


  @rentRealEstateDetails
  Scenario: TC09 Customer sectigi kiralik emlak ile alakali details bilgilerini gorebilmeli

    When searchBox alanina shop yazar
    And buyutec ikonuna tiklar
    When price range bilgilerini girer
    And advert type dropdowndan Rent secer
    And category dropdowndan Shop secer
    And country dropdowndan Turkiye secer
    And city dropdowndan Batman secer
    And district dropdowndan Kozluk secer
    And alttaki search butonuna tiklar
    Then shop ile ilgili Rent seceneklerinin geldigini dogrular
    And kiralik isyeri ilan resmine tiklar
    Then sectigi kiralik emlak ile ilgili details bilgilerini gordugunu dogrular
    And sayfayi kapatir

  @rentRealEstateLocation
  Scenario: TC10 Customer sectigi kiralik emlak ile alakali location bilgilerini gorebilmeli

    When searchBox alanina shop yazar
    And buyutec ikonuna tiklar
    When price range bilgilerini girer
    And advert type dropdowndan Rent secer
    And category dropdowndan Shop secer
    And country dropdowndan Turkiye secer
    And city dropdowndan Batman secer
    And district dropdowndan Kozluk secer
    And alttaki search butonuna tiklar
    Then shop ile ilgili Rent seceneklerinin geldigini dogrular
    And kiralik isyeri ilan resmine tiklar
    Then sectigi kiralik emlak ile ilgili location bilgilerini gordugunu dogrular
    And sayfayi kapatir

  @rentManageContactInformation
  Scenario: TC11 Customer sectigi kiralik emlak icin ilanı verenin iletisim bilgilerini görebilmeli

    When searchBox alanina shop yazar
    And buyutec ikonuna tiklar
    When price range bilgilerini girer
    And advert type dropdowndan Rent secer
    And category dropdowndan Shop secer
    And country dropdowndan Turkiye secer
    And city dropdowndan Batman secer
    And district dropdowndan Kozluk secer
    And alttaki search butonuna tiklar
    Then shop ile ilgili Rent seceneklerinin geldigini dogrular
    And kiralik isyeri ilan resmine tiklar
    Then sectigi kiralik emlak ile ilgili iletisim bilgilerini gordugunu dogrular
    And sayfayi kapatir

  @customerTourRequestRent
  Scenario: TC12 Customer randevu isteklerini gorebilmeli
    When profil resmine tiklar
    And My Tour Requests sekmesini tiklar
    And MY TOUR REQUEST yazisini gorur
    And MY REQUESTS butonuna tiklar
    Then randevu isteklerini gordugunu dogrular
    And sayfayi kapatir

  @customerTourRequestStatusRent
  Scenario: TC13 Customer randevu istegi onaylandiginda ve reddedildiginde gorebilmeli
    When profil resmine tiklar
    And My Tour Requests sekmesini tiklar
    And MY TOUR REQUEST yazisini gorur
    And MY REQUESTS butonuna tiklar
    Then randevu isteklerininin onay veya red durumunu gordugunu dogrular
    And sayfayi kapatir

  @customerTourRequestDateTimeRent
  Scenario: TC14 Customer tarih ve saat girerek kiralik ilan icin randevu isteginde bulunabilmeli

    When searchBox alanina shop yazar
    And buyutec ikonuna tiklar
    When price range bilgilerini girer
    And advert type dropdowndan Rent secer
    And category dropdowndan Shop secer
    And country dropdowndan Turkiye secer
    And city dropdowndan Batman secer
    And district dropdowndan Kozluk secer
    And alttaki search butonuna tiklar
    Then shop ile ilgili Rent seceneklerinin geldigini dogrular
    And kiralik isyeri ilan resmine tiklar
    And rent tour date bilgisi girer
    And rent tour time bilgisi girer
    And submit tour request butonuna tiklar
    Then TourRequest created successfully metnini gordugunu dogrular

  @priceMininvalidRent
  Scenario: TC15 Customer kiralik isyeri ilani icin price olarak min negatif deger ile genel arama yapamamali
    When rent butonuna tiklar
    And searchBox alanina shop yazar
    And buyutec ikonuna tiklar
    And price range min bilgisine eksi bir girer
    And alttaki search butonuna tiklar
    Then shop ile ilgili Rent seceneklerinin listelenmedigini dogrular

  @priceMaxinvalidRent
  Scenario: TC16 Customer kiralik isyeri ilani icin price olarak max negatif deger ile genel arama yapamamali
    When rent butonuna tiklar
    And searchBox alanina villa yazar
    And buyutec ikonuna tiklar
    And price range max bilgisine eksi bir girer
    And alttaki search butonuna tiklar
    Then villa ile ilgili Rent seceneklerinin listelenmedigini dogrular





