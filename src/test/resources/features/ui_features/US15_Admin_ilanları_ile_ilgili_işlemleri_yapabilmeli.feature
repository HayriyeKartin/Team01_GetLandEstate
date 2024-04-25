@US15
Feature: Admin ilanlar ile aktif edebilmeli reddedebilmeli

  Background:
    Given  kullanici "http://www.getlandestate.com/" sitesine gider
    When giriş yap butonuna tıklar
    And admin olarak giriş yapar
  @US15TC01
  Scenario: TC01 Admin Kategori ekleyebilmeli
    And kontrol panelinden kategoriler kısmına tıklar
    And artı butonuna tıklar
    And başlık girer
    And sıra girer
    And ikon girer
    And aktif butonuna tıklar
    And oluştur butonuna tıklarbir
    And kategorinin oluştuğunu doğrular
    And Sayfayı kapatır
  @US15TC02
   Scenario: TC02 Admin Kategorileri güncelleyebilmeli
     And kontrol panelinden kategoriler kısmına tıklar
     And arama kısmına eklediği kategoriyi yazar
     And search kısmına tıklar
     And düzenle ikonuna tıklar
     And başlığı değiştirir
     And Kategori güncelle butonuna tıklar
     Then kategorinin güncellendiğii doğrular
     And Sayfayı kapatır
  @US15TC03
  Scenario: TC03 Admin Kategorileri silebilmeli
    And kontrol panelinden kategoriler kısmına tıklar
    And arama kısmına güncellediği kategoriyi yazar
    And search kısmına tıklar
    And delete ikonuna tıklar
    Then kategorinin silindiğini doğrular
    And Sayfayı kapatır
  @US15TC04
Scenario: TC04 Admin İlan türü ekleyebilmeli
  And kontrol panelinden ilan türleri kısmına tıklar
    And artı butonuna tıklar
    And başlık girer dört
    And oluştur butonuna tıklarDört
    Then ilan türünün oluştuğunu doğrular
    And Sayfayı kapatır
  @US15TC05
Scenario: TC05 Admin Tur taleplerini  görebilmeli
  And kontrol panelinden tur talepleri kısmına tıklar
  Then tur taleplerinin görüldüğünü doğrular
  @US15TC060708
Scenario Outline: TC06-TC08 Admin bilgilerini girerek kullanıcı arayabilmeli
  And kontrol panelinden kullanıcılar kısmına tıklar
  And "<bilgi>" girer
  And search butonuna tıklar
  Then kullanıcı doğrulama yapar
  And Sayfayı kapatır
  Examples:
    | bilgi |
    | Suleyman Akgun |
    | (553) 626-8378 |
    | suleymanakgun1710@gmail.com |
  @US15TC09
Scenario: TC09 Admin rol türü girerek kullanıcı arayabilmeli
  And kontrol panelinden kullanıcılar kısmına tıklar
  And rol türü girer
  And search butonuna tıklar
  Then kullanıcı doğrulama yapar admin
  And Sayfayı kapatır
  @US15TC10
Scenario: TC10 Admin kullanıcıyı güncelleyebilmeli
  And kontrol panelinden kullanıcılar kısmına tıklar
  And email girer
  And search butonuna tıklar
  And düzenle ikonuna tıklar
  And numarayı günceller
  And güncelle butonuna tıklar
  Then numaranın güncellendiğini doğrular
  And Sayfayı kapatır
  @US15TC11
 Scenario: TC11 Admin, customerı manager yapabilmeli
   And kontrol panelinden kullanıcılar kısmına tıklar
   And email girerOnbir
   And search butonuna tıklar
   And düzenle ikonuna tıklar
   And costomer rolünü manager yapar
   Then rol atama doğrulaması yapılır
   And Sayfayı kapatır
  @US15TC12
  Scenario: TC12 Admin, customeri admin yapabilmeli
    And kontrol panelinden kullanıcılar kısmına tıklar
    And email girerOniki
    And search butonuna tıklar
    And düzenle ikonuna tıklar
    And costomer rolünü admin yapar
    Then rol atama doğrulaması yapılır
    And Sayfayı kapatır
  @US15TC13
  Scenario: TC13 Admin, manageri admin yapabilmeli
    And kontrol panelinden kullanıcılar kısmına tıklar
    And email girerOnüç
    And search butonuna tıklar
    And düzenle ikonuna tıklar
    And manager rolünü admin yapar
    Then rol atama doğrulaması yapılır
    And Sayfayı kapatır
  @US15TC14
  Scenario: TC14 Admin, admini manager yapabilmeli
    And kontrol panelinden kullanıcılar kısmına tıklar
    And email girerOndört
    And search butonuna tıklar
    And düzenle ikonuna tıklar
    And admin rolünü manager yapar
    Then rol atama doğrulaması yapılır
    And Sayfayı kapatır
  @US15TC15
  Scenario: TC15 Admin, admini costomer yapabilmeli
    And kontrol panelinden kullanıcılar kısmına tıklar
    And email girerOnbeş
    And search butonuna tıklar
    And düzenle ikonuna tıklar
    And admin rolünü customer yapar
    Then rol atama doğrulaması yapılır
    And Sayfayı kapatır
  @US15TC16
  Scenario: TC16 Admin, manageri costomer yapabilmeli
    And kontrol panelinden kullanıcılar kısmına tıklar
    And email girerOnaltı
    And search butonuna tıklar
    And düzenle ikonuna tıklar
    And manager rolünü customer yapar
    Then rol atama doğrulaması yapılır
    And Sayfayı kapatır










