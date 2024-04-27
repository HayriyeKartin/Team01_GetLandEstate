@US23
Feature: Kullanici (Manager) 5 farkli dilde sayfayi goruntuleyebilmelidir

  Scenario: TC01 Kullanici (Manager) sayfayi bes farkli dilde goruntuleyebilmeli
    Given kullanici web sayfasina gider
    When kullanici login butonuna tiklar
    And kullanici giris bilgileriyle login olur
    And Back to Site butonuna tiklar
    Then kullanici sayfa dilinin default olarak ingilizce oldugunu dogrular
    Then turkce dil secenegini secer ve sayfa dilinin turkce oldugunu dogrular
    Then fransizca dil secenegini secer ve sayfa dilinin fransizca oldugunu dogrular
    Then almanca dil secenegini secer ve sayfa dilinin almanca oldugunu dogrular
    Then ispanyolca dil secenegini secer ve sayfa dilinin ispanyolca oldugunu dogrular
    And sayfayi kapatir