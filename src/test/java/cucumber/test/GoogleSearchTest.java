package cucumber.test;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/Cucumber/Features/", // ścieżkę gdzie umieściłeś pliki z historyjkami.
        plugin = {"pretty","html:out"})


public class GoogleSearchTest {

}
