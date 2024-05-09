@ApiUS_10

@ApiAdminBilal
    Feature: Districts Controller
      Scenario: TC01 | Il id'yle ilçeleri gorüntüleme testi
        Given Ilceleri goruntulemek icin url belirlenir
        When Get Ilceler icin GET request gonderilir ve response alinir
        Then Get Ilceler icin Status kodunun 200 oldugu dogrulanir
        And Get Ilceler icin Response body dogrulanir

      @ApiAdminBilal
      Scenario: TC02 | Butun ilçeleri gorüntüleme testi
        Given Butun ilceleri goruntulemek icin url belirlenir
        When Get Butun ilceler icin GET request gonderilir ve Response body dogrulanir


