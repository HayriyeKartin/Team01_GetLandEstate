@us13API

Feature:us13 API feature

  Scenario:us13 Get Cities Controller
    Given UserOnÜç Giriş bilgileri alınır
    When UserOnÜç GET Cities icin URL duzenlenir
    And UserOnÜç Beklenen veriler duzenlenir
    When UserOnÜç GET Cities Request sorgusu yapilir
    Then UserOnÜç Veriler dogrulanir