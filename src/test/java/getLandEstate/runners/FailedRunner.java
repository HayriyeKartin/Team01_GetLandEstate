package getLandEstate.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)//Cucumber ile junit in entegre olmasini saglayan scenario calistirici notasyon
@CucumberOptions(//bu notasyon sayesinde hangi scenariolari calistiracagimiz ve hangi raporlari alacağımızı belirtiriz

        plugin = {
                "pretty",//Console da scenariolar ile ilgili ayrintili bilgi almamizi saglar
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml",
                "rerun:TestOutput/failed_scenario.txt"//rerun plugini ile fail olan scenariolari burada belirtmis oludgumuz txt dosyasi icinde tutabiliriz
        },
        features = "@TestOutput/failed_scenario.txt",
        glue = {"getLandEstate/stepDefinitions/ui_stepDefinition","getLandEstate/hooks"},
        dryRun = false,  //==> eger true secilirse scanariolari calistirmadan feature file daki
        // eksik step defeinitonlarin olup olmadigini kontrol eder, ve browser'i calistirmaz
        monochrome = false
)
public class FailedRunner {
}

 /*
  Bu class 'ta sadece fail olan scenariolari calistiracagimiz icin feature parametresine features packagenin yolunu degil
    fail olan scenariolarimizin tutuldugu txt dosyamizin yolunu koyariz
    ve Dosya yolu belirttigimiz icin basina @ sembolu koyduk
    Sadece fail olan scenariolarimizi calistiracagi icin bu classta tags parametresine ihtiyac yoktur
 */