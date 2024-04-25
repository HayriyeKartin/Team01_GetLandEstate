@US11
Feature: US10 Customer Satilik ilan Arama Testi
  Background:
    Given customer web sayfasina gider
    When login butonuna tiklar
    And customer olarak email girer
    And customer olarak password girer
    And giris icin login butonuna tiklar

  @saleHouse
  Scenario: TC01 Customer satilik ev ilani arayabilmeli

    When sale butonuna tiklar
    And house butonuna tiklar
    And buyutec ikonuna tiklar
    Then house ile ilgili Sale seceneklerinin geldigini dogrular
    And sayfayi kapatir

  @saleVilla
  Scenario: TC02 Customer satilik villa ilani arayabilmeli

    When sale butonuna tiklar
    And villa butonuna tiklar
    And buyutec ikonuna tiklar
    Then villa ile ilgili Sale seceneklerinin geldigini dogrular
    And sayfayi kapatir

  @saleApartment
  Scenario: TC03 Customer satilik apartman ilani arayabilmeli

    When sale butonuna tiklar
    And searchBox alanina apartment yazar
    And buyutec ikonuna tiklar
    Then apartman ile ilgili Sale seceneklerinin geldigini dogrular
    And sayfayi kapatir

  @saleOffice
  Scenario: TC04 Customer satilik ofis ilani icin ozel arama yapabilmeli

    And buyutec ikonuna tiklar
    When price range bilgilerini girer
    And advert type dropdowndan Sale secer
    And category dropdowndan Office secer
    And country dropdowndan Turkiye secer
    And city dropdowndan Aydin secer
    And alttaki search butonuna tiklar
    Then ofis ile ilgili Sale seceneklerinin geldigini dogrular
    And sayfayi kapatir

  @saleLand
  Scenario: TC05 Customer satilik arsa ilani icin ozel arama yapabilmeli

    When searchBox alanina land yazar
    And buyutec ikonuna tiklar
    When price range bilgilerini girer
    And advert type dropdowndan Sale secer
    And category dropdowndan Land secer
    And country dropdowndan Turkiye secer
    And city dropdowndan Osmaniye secer
    And district dropdowndan Bahce secer
    And alttaki search butonuna tiklar
    Then land ile ilgili Sale seceneklerinin geldigini dogrular
    And sayfayi kapatir

  @saleShop
  Scenario: TC06 Customer satilik isyeri ilani icin ozel arama yapabilmeli ve ilani secebilmeli
    When searchBox alanina shop yazar
    And buyutec ikonuna tiklar
    When price range bilgilerini girer
    And advert type dropdowndan Sale secer
    And category dropdowndan Shop secer
    And country dropdowndan Turkiye secer
    And city dropdowndan Ankara secer
    And district dropdowndan Mamak secer
    And alttaki search butonuna tiklar
    Then shop ile ilgili Sale seceneklerinin geldigini dogrular
    And satilik isyeri ilan resmine tiklar
    Then satilik isyeri ilanini secebildigini dogrular

  @saleRealEstatePicture
  Scenario: TC07 Customer sectigi satilik emlak ile alakali resim gorebilmeli

    When searchBox alanina shop yazar
    And buyutec ikonuna tiklar
    When price range bilgilerini girer
    And advert type dropdowndan Sale secer
    And category dropdowndan Shop secer
    And country dropdowndan Turkiye secer
    And city dropdowndan Ankara secer
    And district dropdowndan Mamak secer
    And alttaki search butonuna tiklar
    Then shop ile ilgili Sale seceneklerinin geldigini dogrular
    And satilik isyeri ilan resmine tiklar
    Then sectigi satilik emlagin resmini gordugunu dogrular

  @saleRealEstateDescription
  Scenario: TC08 Customer sectigi satilik emlak ile alakali Description bilgilerini gorebilmeli

    When searchBox alanina shop yazar
    And buyutec ikonuna tiklar
    When price range bilgilerini girer
    And advert type dropdowndan Sale secer
    And category dropdowndan Shop secer
    And country dropdowndan Turkiye secer
    And city dropdowndan Ankara secer
    And district dropdowndan Mamak secer
    And alttaki search butonuna tiklar
    Then shop ile ilgili Sale seceneklerinin geldigini dogrular
    And satilik isyeri ilan resmine tiklar
    Then sectigi satilik emlak ile ilgili description gordugunu dogrular

  @saleRealEstateDetails
  Scenario: TC09 Customer sectigi satilik emlak ile alakali details bilgilerini gorebilmeli

    When searchBox alanina shop yazar
    And buyutec ikonuna tiklar
    When price range bilgilerini girer
    And advert type dropdowndan Sale secer
    And category dropdowndan Shop secer
    And country dropdowndan Turkiye secer
    And city dropdowndan Ankara secer
    And district dropdowndan Mamak secer
    And alttaki search butonuna tiklar
    Then shop ile ilgili Sale seceneklerinin geldigini dogrular
    And satilik isyeri ilan resmine tiklar
    Then sectigi satilik emlak ile ilgili details bilgilerini gordugunu dogrular
    And sayfayi kapatir

  @saleRealEstateLocation
  Scenario: TC10 Customer sectigi satilik emlak ile alakali location bilgilerini gorebilmeli

    When searchBox alanina shop yazar
    And buyutec ikonuna tiklar
    When price range bilgilerini girer
    And advert type dropdowndan Sale secer
    And category dropdowndan Shop secer
    And country dropdowndan Turkiye secer
    And city dropdowndan Ankara secer
    And district dropdowndan Mamak secer
    And alttaki search butonuna tiklar
    Then shop ile ilgili Sale seceneklerinin geldigini dogrular
    And satilik isyeri ilan resmine tiklar
    Then sectigi satilik emlak ile ilgili location bilgilerini gordugunu dogrular
    And sayfayi kapatir

  @saleManageContactInformation
  Scenario: TC11 Customer sectigi satilik emlak icin ilanı verenin iletisim bilgilerini görebilmeli

    When searchBox alanina shop yazar
    And buyutec ikonuna tiklar
    When price range bilgilerini girer
    And advert type dropdowndan Sale secer
    And category dropdowndan Shop secer
    And country dropdowndan Turkiye secer
    And city dropdowndan Ankara secer
    And district dropdowndan Mamak secer
    And alttaki search butonuna tiklar
    Then shop ile ilgili Sale seceneklerinin geldigini dogrular
    And satilik isyeri ilan resmine tiklar
    Then sectigi satilik emlak ile ilgili iletisim bilgilerini gordugunu dogrular
    And sayfayi kapatir

  @customerTourRequestSale
  Scenario: TC12 Customer randevu isteklerini gorebilmeli
    When profil resmine tiklar
    And My Tour Requests sekmesini tiklar
    And MY TOUR REQUEST yazisini gorur
    And MY REQUESTS butonuna tiklar
    Then randevu isteklerini gordugunu dogrular
    And sayfayi kapatir

  @customerTourRequestStatusSale
  Scenario: TC13 Customer randevu istegi onaylandiginda ve reddedildiginde gorebilmeli
    When profil resmine tiklar
    And My Tour Requests sekmesini tiklar
    And MY TOUR REQUEST yazisini gorur
    And MY REQUESTS butonuna tiklar
    Then randevu isteklerininin onay veya red durumunu gordugunu dogrular
    And sayfayi kapatir

  @customerTourRequestDateTimeSale
  Scenario: TC14 Customer tarih ve saat girerek satilik ilan icin randevu isteginde bulunabilmeli

    When searchBox alanina shop yazar
    And buyutec ikonuna tiklar
    When price range bilgilerini girer
    And advert type dropdowndan Sale secer
    And category dropdowndan Shop secer
    And country dropdowndan Turkiye secer
    And city dropdowndan Ankara secer
    And district dropdowndan Mamak secer
    And alttaki search butonuna tiklar
    Then shop ile ilgili Sale seceneklerinin geldigini dogrular
    And satilik isyeri ilan resmine tiklar
    And sale tour date bilgisi girer
    And sale tour time bilgisi girer
    And submit tour request butonuna tiklar
    Then TourRequest created successfully metnini gordugunu dogrular

  @priceMininvalidSale
  Scenario: TC15 Customer satilik isyeri ilani icin price olarak min negatif deger ile genel arama yapamamali
    When sale butonuna tiklar
    And searchBox alanina shop yazar
    And buyutec ikonuna tiklar
    And price range min bilgisine eksi bir girer
    And alttaki search butonuna tiklar
    Then shop ile ilgili Sale seceneklerinin listelenmedigini dogrular

