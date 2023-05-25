package com.co.sophos.stepdefinitions.test;

import com.co.sophos.questions.firstcycle.FirstCycleQuestion;
import com.co.sophos.tasks.indicatedate.IndicatedDateTask;
import com.co.sophos.tasks.login.ClickBtnSendTask;
import com.co.sophos.tasks.login.FillPasswordFieldTask;
import com.co.sophos.tasks.login.FillUserFieldTask;
import com.co.sophos.tasks.multiplesoffournumber.MultiplesFourNumberTest;
import com.co.sophos.tasks.openthepage.OpenThePageTask;
import com.co.sophos.tasks.operationtest.OperationCompletTask;
import com.co.sophos.tasks.writeletter.WriteLetterTask;
import com.co.sophos.userinterface.testpage.TestPageInterface;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class TestStepDefinition {



    @Managed(driver = "Chrome")

    private WebDriver hisBrowser;

    private Actor Sebastian = Actor.named("Sebas");

    @Before
    public void setUp(){
        Sebastian.can(BrowseTheWeb.with(hisBrowser));
    }


    @Given("^Sebastian is on the test page$")
    public void sebastianIsOnTheTestPage() {
        Sebastian.wasAbleTo(
                OpenThePageTask.open(),
                FillUserFieldTask.on(),
                FillPasswordFieldTask.on(),
                ClickBtnSendTask.on()
        );
    }

    @When("^He selects the numbers that are multiples of four$")
    public void heSelectsTheNumbersThatAreMultiplesOfFour() {
        Sebastian.wasAbleTo(
                MultiplesFourNumberTest.on()
        );
    }

    @When("^he indicates which is the corresponding date$")
    public void heIndicatesWhichIsTheCorrespondingDate() {
        Sebastian.wasAbleTo(
                IndicatedDateTask.on()
        );
    }

    @When("^he writes one hundred and seventy six times the letter R$")
    public void heWritesOneHundredAndSeventySixTimesTheLetterR() {
        Sebastian.wasAbleTo(
                WriteLetterTask.on()
        );
    }


    @When("^he completes the mathematical operation$")
    public void heCompletesTheMathematicalOperation() {
        Sebastian.wasAbleTo(
                OperationCompletTask.result()
        );
    }

    @When("^he clicks on the send button$")
    public void heClicksOnTheSendButton() {
        Sebastian.wasAbleTo(
                ClickBtnSendTask.on()
        );
    }

    @Then("^he should see the Se encuentra en el ciclo 2 de 10$")
    public void heShouldSeeTheSeEncuentraEnElCiclo2De10() {
        System.out.println("El titulo que el actor el titulo Se encuentra en el ciclo 2 de 10 : \n " + FirstCycleQuestion.fistCycleSuccessful().answeredBy(Sebastian));
    }

}
