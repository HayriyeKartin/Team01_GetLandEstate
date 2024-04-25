@US02
  Feature: US02
    @login1
    Scenario: TC01
      Given Kullanici "http://www.getlandestate.com/" sayfasina gider
      When Sag ust kisimdaki Login butonuna tiklayarak giris ekranina ulasir.
      And Email ve Password alanlarina gerekli veri girisini yapar.
      And Login butonuna tiklayarak basarili bir sekilde giris saglar.

    @login2
    Scenario: TC02
      Given Kullanici "http://www.getlandestate.com/" sayfasina gider
      When Sag ust kisimdaki Login butonuna tiklayarak giris ekranina ulasir.
      And Email girerken @ ve . kullanmadiginda Invalid email uyarisi aldigini dogrular.
      And Password alanini bos biraktiginda Password is required uyarisi aldigini dogrular.
      And Login ekraninda iken henuz Email ve Password bilgisini girmediginde Login butonunun aktif olmadigini dogrular.