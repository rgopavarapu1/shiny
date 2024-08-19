package com.api.cucumberRestAssured.cucumber.Options;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(tags="",features="src/test/java/com/api/cucumberRestAssured/features",
                    plugin="json:target/jsonReports/cucumber-report.json", 
                    glue={"stepDefinitions"}
                    )
public class TestRunner extends AbstractTestNGCucumberTests{

}
