package com.co.sophos.stepdefinitions.secondcycle;

import com.co.sophos.questions.firstcycle.FirstCycleQuestion;
import com.co.sophos.questions.secondcycle.SecondCycleQuestion;
import com.co.sophos.tasks.indicatedate.IndicatedDateTask;
import com.co.sophos.tasks.login.ClickBtnSendTask;
import com.co.sophos.tasks.login.FillPasswordFieldTask;
import com.co.sophos.tasks.login.FillUserFieldTask;
import com.co.sophos.tasks.multiplesoffournumber.MultiplesFourNumberTest;
import com.co.sophos.tasks.openthepage.OpenThePageTask;
import com.co.sophos.tasks.operationtest.OperationCompletTask;
import com.co.sophos.tasks.secondcycle.indicateddate.IndicateDateSecondCycleTask;
import com.co.sophos.tasks.secondcycle.indicatesequence.IndicateSequenceTask;
import com.co.sophos.tasks.secondcycle.multiplesforsevennumber.MultiplesForSevenNumberTask;
import com.co.sophos.tasks.secondcycle.writeletter.WriteLetterSevenTask;
import com.co.sophos.tasks.writeletter.WriteLetterTask;
import com.co.sophos.userinterface.secondcycle.SecondCycleInterface;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class SeconCycleStepDefinition {



    @Managed(driver = "Chrome")

    private WebDriver hisBrowser;

    private Actor Sebastian = Actor.named("Sebas");

    @Before
    public void setUp(){
        Sebastian.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian is on the test page$")
    public void sebastianIsOnTheTestPage() throws InterruptedException {
        Sebastian.wasAbleTo(
                OpenThePageTask.open(),
                FillUserFieldTask.on(),
                FillPasswordFieldTask.on(),
                ClickBtnSendTask.on(),
                MultiplesFourNumberTest.on(),
                IndicatedDateTask.on(),
                WriteLetterTask.on(),
                OperationCompletTask.result(),
                ClickBtnSendTask.on()

        );
    }

    @When("^he indicates which is the corresponding date$")
    public void heIndicatesWhichIsTheCorrespondingDate() {
        Sebastian.wasAbleTo(
                IndicateDateSecondCycleTask.on()
        );

    }

    @When("^he indicates which number is a multiple of seven$")
    public void heIndicatesWhichNumberIsAMultipleOfSeven() {
        Sebastian.wasAbleTo(
                MultiplesForSevenNumberTask.on()
        );
    }

    @When("^he wrote four hundred sixty times the letter o$")
    public void heWroteFourHundredSixtyTimesTheLetterO() {
        Sebastian.wasAbleTo(
                WriteLetterSevenTask.on()
        );
    }



    @When("^he indicates how many worms there are$")
    public void heIndicatesHowManyWormsThereAre() {
        Sebastian.wasAbleTo(
                IndicateSequenceTask.on()
        );
    }

    @When("^the click on the send button$")
    public void theClickOnTheSendButton() {
        Sebastian.wasAbleTo(
                ClickBtnSendTask.on()
        );
    }

    @Then("^he should see the It is in cycle three of ten$")
    public void heShouldSeeTheItIsInCycleThreeOfTen() {
        System.out.println("El titulo que el actor el titulo Se encuentra en el ciclo 3 de 10 : \n " + SecondCycleQuestion.secondCycleSuccessful().answeredBy(Sebastian));

    }


}
