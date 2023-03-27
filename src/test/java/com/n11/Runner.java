package com.n11;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/",
        glue = "com/n11/functions",
        tags = "@n11LoginFavoriteDelete",
        plugin = {"html:target/site/cucumber-pretty","json:target/cucumber.json"},
        dryRun = false
)
public class Runner {

}
