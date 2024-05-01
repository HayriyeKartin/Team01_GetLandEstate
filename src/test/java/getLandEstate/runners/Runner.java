package getLandEstate.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) //Cucumber ile junit'in entegre olmasını sağlayan scenario çalıştırıcı notasyon
@CucumberOptions( //bu notasyon sayesinde hangi scenario'ları çalıştıracağımızı ve hangi raporları alacağımızı belirtiriz

        plugin = {
                "pretty",
                "html:target/default-cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml"
        },
        features = "src/test/resources/features/ui_features", // çalıştırılacak features'ın yolunu gösteriyoruz
        glue = {"getLandEstate/stepDefinitions/ui_stepDefinition", "getLandEstate/hooks"}, // senaryo ile methodları birbirine yapıştırıyoruz
  

        tags = "", // hangi senaryoyu çalıştırmak istediğimizi belirtiyoruz


        dryRun = false, //--> eğer true seçilirse scenario'ları çalıştırmadan feature file'da eksik step definition'ların
        //olup olmadığını kontrol eder ve browser'ı çalıştırmaz
        monochrome = false
)
public class Runner {
}