@APIUS04
Feature: API Advert Types Controller Testleri

  @ApiManagerGulsum #POST#
  Scenario: TC01 | POST Advert Type Testi
    Given Create Advert Type icin URL duzenlenir
    And Create Advert Type icin payload duzenlenir
    When Create Advert Type icin POST request gonderilir ve Response alinir
    Then Create Advert Type icin Status kodunun 200 oldugu dogrulanir
    And Create Advert Type icin Response body dogrulanir

  @ApiManagerGulsum #GET#
  Scenario: TC02 | Get Advert Type Testi
    Given Get Advert Type icin URL duzenlenir
    And Get Advert Type icin expected data duzenlenir
    When Get Advert Type icin GET request gonderilir ve Response alinir
    Then Get Advert Type icin Status kodunun 200 oldugu dogrulanir
    And Get Advert Type icin Response body dogrulanir

  @ApiManagerGulsum #PUT#
  Scenario: TC03 | Put Advert Type Testi
    Given Put Advert Type icin URL duzenlenir
    And Put Advert Type icin payload duzenlenir
    When Put Advert Type icin PUT request gonderilir ve Response alinir
    Then Put Advert Type icin Status kodunun 200 oldugu dogrulanir
    And Put Advert Type icin Response body dogrulanir

  @ApiManagerGulsum #DELETE# silme isleminde bug oldugu icin bilerek fail aldım#
  Scenario: TC04 | Delete Advert Type Testi
    Given Delete Advert Types icin URL duzenlenir
    When Delete Advert Types icin DELETE request gonderilir ve Response alinir
    Then Delete Advert Types icin Status kodunun 200 oldugu dogrulanir




