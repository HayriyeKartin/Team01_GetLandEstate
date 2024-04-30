@US12
Feature: Kayitli olmayan kullanici satilik ve kiralik ilan arayabilmeli

  Background:
    Given kullanici "http://getlandestate.com/" gider


  Scenario: TC01 Kullanici search kismindan kiralık ev secip genel arama yapabilmeli
    When Rent secenegini secer
    And arama kutusuna "House" girer
    And emlak tipi olarak House secer
    And search iconuna tiklar
    Then ilgili kiralik ilan sonuclarinin geldigini dogrular
    And sayfayi kapatir


  Scenario: TC02 Kullanici search kismindan kiralik apartman secip genel arama yapabilmeli
    When Rent secenegini secer
    And emlak tipi olarak APARTMENT secer
    And search iconuna tiklar
    Then ilgili kiralik ilan sonuclarinin geldigini dogrular
    And sayfayi kapatir


  Scenario: TC03 Kullanici search kismindan kiralik ofis secip genel arama yapabilmeli
    When Rent secenegini secer
    And arama kutusuna "Office" girer
    And emlak tipi olarak OFFICE secer
    And search iconuna tiklar
    Then ilgili kiralik ilan sonuclarinin geldigini dogrular
    And sayfayi kapatir


  Scenario: TC04 Kullanici search kismindan satilik villa secip genel arama yapabilmeli
    When Sale secenegini secer
    And arama kutusuna "Villa" girer
    And emlak tipi olarak VILLA secer
    And search iconuna tiklar
    Then ilgili kiralik ilan sonuclarinin geldigini dogrular
    And sayfayi kapatir


  Scenario: TC05 Kullanici search kismindan satilik arsa secip genel arama yapabilmeli
    When Sale secenegini secer
    And arama kutusuna "Land" girer
    And emlak tipi olarak LAND secer
    And search iconuna tiklar
    Then ilgili kiralik ilan sonuclarinin geldigini dogrular
    And sayfayi kapatir


  Scenario: TC06 Kullanici search kismindan satilik shop secip genel arama yapabilmeli
    When Sale secenegini secer
    And  arama kutusuna "Shop" girer
    And kullanici emlak tipi olarak SHOP secer
    And search iconuna tiklar
    Then ilgili kiralik ilan sonuclarinin geldigini dogrular
    And sayfayi kapatir


  Scenario Outline: TC07 Price Range, Advert Type, Category, Country, City, District bolumlerini girerek ozel arama yapabilmeli
    When search iconuna tiklar
    And price range degerlerini girer
    And ilan arama kategorilerini doldurur "<advertType>", "<category>", "<country>", "<city>", "<district>"
    And search butonuna tiklar
    Then ozel arama yapilarak ilanin goruldugunu dogrular
    And sayfayi kapatir
    Examples:
      | advertType | category | country | city    | district |
      | Sale       | Villa    | Türkiye | Trabzon | Sürmene  |


  Scenario: TC08 Sectigi emlak ile alakali resim, Description, DETAILS, LOCATION bilgilerini gorebilmeli
    When kullanici emlak tipi secer
    And search iconuna tiklar
    And cikan ilk ilana tiklar
    And ilan resmini goruntuler
    And description bilgilerini goruntuler
    And details bilgilerini goruntuler
    Then location bilgileri goruldugunu dogrular
    And sayfayi kapatir


  Scenario Outline: TC09 Ilan verenin iletisim bilgileri tiklandiginda "Don't have an account? Create one now!" uyari metni gelmeli
    When Rent secenegine tiklar ve emlak tipini secer
    And search iconuna tiklar
    And price range bilgilerini girerG
    And ilan arama kategorilerini doldurur "<advert Type>", "<category>", "<country>", "<city>", "<district>"
    And cikan ilk ilana tiklar
    And contact number ve send mail kutusunda goz sembolune tiklar
    Then "Don't have an account? Create one now!" metnini gordugunu dogrular
    And sayfayi kapatir
    Examples:
      | advert Type | category | country | city  | district |
      | Sale        | Office   | Türkiye | Aydın | All      |


  Scenario: TC10 Tarih ve saat girerek ilan icin randevu isteginde bulunabilmeli
    When Sale secenegine tiklar ve emlak tipini secer
    And search iconuna tiklar
    And cikan ilk ilana tiklar
    And Tour Date kutusuna tarih girilir
    And Tour Time kutusunda saat secilir
    And Submit a tour request butonuna tiklar
    And "Log in for tour request" ve "Don't have an account? Create one now!" uyari mesajlarini goruntuler
    Then Kayit yapilmadan randevu istegi yapilamadigini dogrular
    And sayfayi kapatir

  Scenario: TC11 "Create one now!" metnine tiklayarak register sayfasina yonlendirilmeli
    When Sale secenegine tiklar ve emlak tipini secer
    And search iconuna tiklar
    And cikan ilk ilana tiklar
    And Tour Date kutusuna tarih girilir
    And Tour Time kutusunda saat secilir
    And Submit a tour request butonuna tiklar
    And Create one now metnine tiklar
    Then register sayfasinin acildigini dogrular
    And sayfayi kapatir