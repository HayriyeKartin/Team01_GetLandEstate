@US01
Feature:Customer sayfaya kayıt olabilmelidir.

  Background:
    Given Kullanici getLandEstate sayfasina gider
    And Kullanici register butonuna tiklar


  @B6
  Scenario:TC01 Kullanici( Customer) Olusturma


    When Kullanici first name girer
    And Kullanici last name girer
    And Kullanici phone girer
    And Kullanici email girer
    And Kullanici password girer
    And Kullanici confirm password girer
    And Terms of Use ve Privacy Policy checkbox'ı  secer
    And Kullanici kayit icin register butonuna tiklar
    Then Your registration has been completed successfully. yazisini dogrulayin
    And sayfayi kapatir

  @B7
  Scenario Outline:TC02 Kullanici( Customer), zorunlu alanlari boş birakirsa kayit işlemi gerceklesmemeli

    When first name "<first_name>" girer
    And last name "<last_name>" girer
    And phone "<phone>" girer
    And email "<email>" girer
    And password "<password>" girer
    And confirm password "<confirm_password>" girer
    And Terms of Use ve Privacy Policy checkbox'ı  secer
    Then Zorunlu alanlar bos birakildigi icin register butonu aktif olmamali
    And sayfayi kapatir
    Examples:
      | first_name | last_name | phone          | email        | password | confirm_password |
      |            | Kerim     | (564) 291-5798 | kerim@al.com | Kerim23. | Kerim23.         |
      | Aslan      |           | (564) 231-5388 | kerim@al.com | Kerim23. | Kerim23.         |
      | Aslan      | Kerim     |                | kerim@al.com | Kerim23. | Kerim23.         |
      | Aslan      | Kerim     | (584) 231-5158 |              | Kerim23. | Kerim23.         |
      | Aslan      | Kerim     | (564) 291-5788 | kerim@al.com |          | Kerim23.         |
      | Aslan      | Kerim     | (574) 231-5188 | kerim@al.com | Kerim23. |                  |

  @B8
  Scenario:TC03 Kullanici( Customer),okuma metni checkbox'ı işaretlemezse kayit işlemi gerceklesmemeli

    When Kullanici first name girer
    And Kullanici last name girer
    And Kullanici phone girer
    And Kullanici email girer
    And Kullanici password girer
    And Kullanici confirm password girer
    And Terms of Use ve Privacy Policy checkbox'ı  secili olmasin
    Then Register butonu aktif olmamali
    And sayfayi kapatir

  @B9
  Scenario Outline:TC04 Kullanici( Customer), olumsuz password işlemleri

    When Kullanici first name girer
    And Kullanici last name girer
    And Kullanici phone girer
    And Kullanici email girer
    And Kullanici password "<password>" girer
    And Kullanici confirm "<confirm_password>" girer
    And Terms of Use ve Privacy Policy checkbox'ı  secer
    Then Register butonu aktif olmamali
    And sayfayi kapatir
    Examples:
      | password                        | confirm_password                |
      | SlvlE2.                         | SlvlE2.                         |
      | e2f1e2f1.                       | e2f1e2f1.                       |
      | ZBA2023.                        | ZBA2023.                        |
      | Bbkmn...                        | Bbkmn...                        |
      | Strm0207                        | Strm0207                        |
      | 123456789Abcdefdghiljklmnoprst. | 123456789Abcdefdghiljklmnoprst. |

  @B10
  Scenario:TC05 Kullanici( Customer),"@" karakterini girmezse kayit işlemi gerceklesmemeli

    When Kullanici first name girer
    And Kullanici last name girer
    And Kullanici phone girer
    And Kullanici email'e @ karakteri olmadan  girer
    And Kullanici password girer
    And Kullanici confirm password girer
    And Terms of Use ve Privacy Policy checkbox'ı  secer
    Then Register butonu aktif olmamali
    And sayfayi kapatir

  @B11
  Scenario:TC06 Kullanici( Customer),"." karakterini girmezse kayit işlemi gerceklesmemeli

    When Kullanici first name girer
    And Kullanici last name girer
    And Kullanici phone girer
    And Kullanici email'e . isareti olmadan  girer
    And Kullanici password girer
    And Kullanici confirm password girer
    And Terms of Use ve Privacy Policy checkbox'ı  secer
    Then Register butonu aktif olmamali
    And sayfayi kapatir

