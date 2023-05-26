package com.co.sophos.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(

        features = "src/test/resources/feature/tencycle.feature",
        glue = "com.co.sophos.stepdefinitions.tencycle",
        tags = "@AnswerCycleTenCorrectly",
        snippets = SnippetType.CAMELCASE
)
public class TenCycleRunner {
}
