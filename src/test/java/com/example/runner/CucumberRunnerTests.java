package com.example.runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features/",
    glue = "com.example.definitions",
    plugin = {
        "pretty",
        "html:target/cucumber-reports/cucumber-report.html"
    }
)
public class CucumberRunnerTests {
    // This class serves as the entry point for running Cucumber tests.
}