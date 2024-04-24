@US19
Feature: US19 Get Land Estate Contact

  Scenario: TC01 Kullanıcılar sayfadan mesaj gönderebilmeli (Contact) Positive
    Given   kullanici web sayfasina gider
    When contact butonuna tiklar
    And Kullanici istenilen bilgileri girer {String} {String} {String} {String}
    And   "I'm a not a robot" kutusuna tiklar
    And send butonuna tıklar
    Then Mesajın gönderildigi dogrulanır


  Scenario: TC02 Kullanıcılar sayfadan mesaj gönderebilmeli (Contact) Negative 1
    Given  kullanici web sayfasina gider
    When contact butonuna tiklar
    Then firstName alanina 2 karakterden kucuk deger girer ve At least 2 characters uyarisinin alindigini dogrular
    And lastName alanina 2 karakterden kucuk deger girer ve At least 2 characters uyarisinin alinigini dogrular
    And "@" ve "." isareti kullanilmadan email girilmeli ve Invalid email uyarisinin alindigini dogrular



  Scenario: TC03  Kullanıcılar sayfadan mesaj gönderebilmeli (Contact) Negative 2
    Given kullanici web sayfasina gider
    When contact butonuna tiklar
    Then "@" isareti kullanilmadan email girilmeli ve Invalid email uyarisinin alindigini dogrular



  Scenario: TC04  Kullanıcılar sayfadan mesaj gönderebilmeli (Contact) Negative 3
    Given kullanici web sayfasina gider
    When contact butonuna tiklar
    Then "." işareti kullanilmadan email girilmeli ve Invalid email uyarisinin alindigini dogrular
