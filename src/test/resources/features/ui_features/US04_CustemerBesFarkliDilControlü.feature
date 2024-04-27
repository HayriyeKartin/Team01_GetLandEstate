
@US04
  Feature:Custemer sayfayı 5 farkli dilde  görüntüleyebilmelidir
    Background:
      Given Kullanici getLandEstate sayfasina gider
      When Login butonuna tiklar
      And Email ve Password bilgileriyle login olur


    @B1
   Scenario: TC01 Default olarak sayfa dili English olarak gelir

     Then Sayfa dili default olarak English oldugunu dogrular
     And sayfayi kapatir

    @B2
    Scenario: TC02 Sayfa dili Türkçe olarak secilir
      And Sayfa dilini Türkçe olarak secer
      Then Sayfa dilinin Türkçe oldugunu dogrular
      And sayfayi kapatir

     @B3
    Scenario: TC03 Sayfa dili Français olarak secilir
      And Sayfa dilini Français olarak secer
      Then Sayfa dilinin Français oldugunu dogrular
      And sayfayi kapatir

      @B4
   Scenario: TC04 Sayfa dili Deutsch olarak secilir
     And Sayfa dilini Deutsch olarak secer
     Then Sayfa dilinin Deutsch oldugunu dogrular
     And sayfayi kapatir

     @B5
    Scenario: TC05 Sayfa dili Espanol olarak secilir
      And Sayfa dilini Espanol olarak secer
      Then Sayfa dilinin Espanol oldugunu dogrular
      And sayfayi kapatir
