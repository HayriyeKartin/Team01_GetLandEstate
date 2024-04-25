@US03
Feature: US03
  @profile
  Scenario: TC01
    Given Kullanici "http://www.getlandestate.com/" sayfasina gider
    When Sag ust kisimdaki Login butonuna tiklayarak giris ekranina ulasir.
    And Email ve Password alanlarina gerekli veri girisini yapar.
    And Login butonuna tiklayarak basarili bir sekilde giris saglar.
    And Sag ustteki profil butonuna tiklayarak acilan menuden My Profile butonuna tiklar.
    And Gelen ekranda profil bilgilerini gorebildigini dogrular.
    And Herhangi bir profil bilgisinde degisiklik yaparak update butonuna basar.
    And Profil bilgisindeki guncellemenin gerceklestigini dogrular.
    And Mevcut ekranda Change Password butonuna tiklayarak sifre degistirme ekranina ulasir.
    And Gereken bilgileri doldurarak Change butonuna basar ve sifrenin degistirildigini dogrular.
    @profile2
    Scenario: TC02
      Given Kullanici "http://www.getlandestate.com/" sayfasina gider
      When Sag ust kisimdaki Login butonuna tiklayarak giris ekranina ulasir.
      And Email ve Password alanlarina gerekli veri girisini yapar.
      And Login butonuna tiklayarak basarili bir sekilde giris saglar.
      And Sag ustteki profil butonuna tiklayarak acilan menuden My Profile butonuna tiklar.
      And Acilan sayfadan Profile Photo butonuna tiklayarak profil fotografi ekleme ekranina ulasir.
      And Select butonuna tiklayarak acilan ekrandan bir fotograf secer ve Done a basarak ekler.
      And Save butonuna tiklayarak eklenen fotografi kaydeder ve eklendigini dogrular.
      And Mevcut sayfadan Delete Account butonuna tiklayarak hesap silme ekranina ulasir.
      And Mevcut sifresini girer ve alt kisimdaki Delete Account butonuna tiklayarak hesabini siler.