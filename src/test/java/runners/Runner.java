package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "./src/test/resources/features", //feature folder path
        glue = "stepdefinitions",// stepdefinition PATH
        tags= "@tesla or @iphone",
        dryRun = true
)
public class Runner {
    //Test case will be run
    //Bu sinif Test caseleri RUN etmek icin kullanilir
//Ve konfigurasyonlar icin kullanilir
}
