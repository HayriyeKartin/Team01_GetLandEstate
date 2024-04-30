@US016
Feature:Admin rapor olusturabilmeli

  Background:
    Given kullanici URL e gider
    When login butonuna tiklar
    And Email ve password bilgileri ile login olur
    And Reports tiklar



  Scenario:TC_01 Acılan pencerede ADVERTS basligi altındaki Start Date,End Date,Category,Advert Type,Status seceneklerini ile islem yapar

    And Acilan pencerede ADVERTS basligi altindaki Start Date,End Date,Category,Advert Type,Status seceneklerini doldurur
    And Adverts excel ikonuna tiklar
    Then Success mesajinin geldigini dogrular
    And Sayfadan logout butonuna tiklar
    And Sayfadan cikis yapar

  Scenario: TC_02 Popüler ilanların raporunu olusturur

    And MOST POPULAR PROPERTIES altindaki Amount secegini secer
    And Amount excel ikonuna tiklar
    Then Success mesajinin geldigini dogrular
    And Sayfadan logout butonuna tiklar
    And Sayfadan cikis yapar


  Scenario: TC_03 Kullanıcı bilgilerine göre rapor olusturur

    And USERS altindaki Role secegini secer
    And User excel ikonuna tiklar
    Then Error mesajinin geldigini dogrular
    And Sayfadan logout butonuna tiklar
    And Sayfadan cikis yapar


  Scenario: TC_04 Tur isteklerine (TOUR REQUESTS) göre rapor olusturur

    And TOUR REQUESTS altindaki Start Date,End Date, Status secegini doldurur
    And Tour requests excel ikonuna tiklar
    Then Success mesajinin geldigini dogrular
    And Sayfadan logout butonuna tiklar
    And Sayfadan cikis yapar