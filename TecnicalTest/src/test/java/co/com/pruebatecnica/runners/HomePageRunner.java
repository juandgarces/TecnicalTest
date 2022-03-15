package co.com.pruebatecnica.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/homepagevalidation.feature",
        glue = "co.com.pruebatecnica.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class HomePageRunner {
}

