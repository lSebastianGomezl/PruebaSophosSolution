package com.co.sophos.stepdefinitions.threecycle;

import com.co.sophos.questions.secondcycle.SecondCycleQuestion;
import com.co.sophos.questions.threecycle.ThreeCycleQuestion;
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
import com.co.sophos.tasks.threecycle.completfirstoperation.CompletFirstOperationTask;
import com.co.sophos.tasks.threecycle.completsecondoperation.CompleteSecondOperationTask;
import com.co.sophos.tasks.threecycle.indicatedatethree.ThreeIndicateDateTask;
import com.co.sophos.tasks.threecycle.multiplesthreecycle.MultiplesFourThreeCycle;
import com.co.sophos.tasks.threecycle.multiplesthreecycle.MultiplesNumberThreeCycle;
import com.co.sophos.tasks.writeletter.WriteLetterTask;
import com.co.sophos.userinterface.threecycle.ThreeCycleInterface;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class ThreeCycleStepDefinition {



    @Managed(driver = "Chrome")

    private WebDriver hisBrowser;

    private Actor Sebastian = Actor.named("Sebas");

    @Before
    public void setUp(){
        Sebastian.can(BrowseTheWeb.with(hisBrowser));
    }

    @Given("^Sebastian is on the test page\\.$")
    public void sebastianIsOnTheTestPage() {
        Sebastian.wasAbleTo(
                OpenThePageTask.open(),
                FillUserFieldTask.on(),
                FillPasswordFieldTask.on(),
                ClickBtnSendTask.on(),
                MultiplesFourNumberTest.on(),
                IndicatedDateTask.on(),
                WriteLetterTask.on(),
                OperationCompletTask.result(),
                ClickBtnSendTask.on(),
                IndicateDateSecondCycleTask.on(),
                MultiplesForSevenNumberTask.on(),
                WriteLetterSevenTask.on(),
                IndicateSequenceTask.on(),
                ClickBtnSendTask.on()

        );
    }

    @When("^he completes the mathematical operation$")
    public void heCompletesTheMathematicalOperation() {
        Sebastian.wasAbleTo(
                CompletFirstOperationTask.on()
        );
    }

    @When("^he indicates the result of the operation$")
    public void heIndicatesTheResultOfTheOperation() {
        Sebastian.wasAbleTo(
                CompleteSecondOperationTask.on()
        );
    }

    @When("^he indicates the corresponding date$")
    public void heIndicatesTheCorrespondingDate() {
        Sebastian.wasAbleTo(
                ThreeIndicateDateTask.on()
        );
    }

    @When("^he indicates the numbers that are multiples$")
    public void heIndicatesTheNumbersThatAreMultiples() {

        Sebastian.wasAbleTo(
                MultiplesNumberThreeCycle.on()
        );
        System.out.println("Entro a la tarea");


    }

    @When("^the click on the send button$")
    public void theClickOnTheSendButton() {
        Sebastian.wasAbleTo(
                ClickBtnSendTask.on()
        );
    }

    @Then("^you should see the he is in cycle four of ten$")
    public void youShouldSeeTheHeIsInCycleFourOfTen() {
        //System.out.println("El titulo que el actor el titulo Se encuentra en el ciclo 4 de 10 : \n " + ThreeCycleQuestion.threeCycleSuccessful().answeredBy(Sebastian));

    }




}
