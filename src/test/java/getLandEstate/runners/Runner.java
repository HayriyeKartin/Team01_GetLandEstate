package getLandEstate.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class) //Cucumber ile junit'in entegre olmasını sağlayan scenario çalıştırıcı notasyon
@CucumberOptions( //bu notasyon sayesinde hangi scenario'ları çalıştıracağımızı ve hangi raporları alacağımızı belirtiriz

        plugin = "html:raporlar/CucumberReport.html",
        features = "src/test/resources/features",
        glue = {"getLandEstate/stepDefinitions", "getLandEstate/hooks"},

        tags = "@E2E_ContactManager",

        dryRun = false,
        monochrome = false
)
public class Runner {
}