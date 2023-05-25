package com.co.sophos.stepdefinitions.sixcycle;

import com.co.sophos.questions.fivecycle.FiveCycleQuestion;
import com.co.sophos.tasks.fivecycle.completoperationfive.CompletOperationFiveTask;
import com.co.sophos.tasks.fivecycle.indiquedcouncil.IndiquedCouncilFiveTask;
import com.co.sophos.tasks.fivecycle.multiplecyclefive.MultipleCycleFiveTask;
import com.co.sophos.tasks.fivecycle.operationfirstfive.OperationFirstFiveTask;
import com.co.sophos.tasks.fourcycle.firstoperation.FirstOperationFourTask;
import com.co.sophos.tasks.fourcycle.indiquedfigure.IndicatedFigureTask;
import com.co.sophos.tasks.fourcycle.multipleeight.MultupleEightTask;
import com.co.sophos.tasks.fourcycle.writelettery.WriteLetterYTask;
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
import com.co.sophos.tasks.sixcycle.indiquedfigure.IndicatedFigureSixTask;
import com.co.sophos.tasks.sixcycle.multipleeghtsix.MultipleSixCycletask;
import com.co.sophos.tasks.sixcycle.operationsecondsixcycle.OperationSecondSixCycle;
import com.co.sophos.tasks.sixcycle.operationsixcycle.OperationFirstSixCycle;
import com.co.sophos.tasks.threecycle.completfirstoperation.CompletFirstOperationTask;
import com.co.sophos.tasks.threecycle.completsecondoperation.CompleteSecondOperationTask;
import com.co.sophos.tasks.threecycle.indicatedatethree.ThreeIndicateDateTask;
import com.co.sophos.tasks.threecycle.multiplesthreecycle.MultiplesNumberThreeCycle;
import com.co.sophos.tasks.writeletter.WriteLetterTask;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Click;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class SixCycleStepDefinition {



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
                ClickBtnSendTask.on(),
                CompletFirstOperationTask.on(),
                CompleteSecondOperationTask.on(),
                ThreeIndicateDateTask.on(),
                MultiplesNumberThreeCycle.on(),
                ClickBtnSendTask.on(),
                IndicatedFigureTask.on(),
                FirstOperationFourTask.result(),
                WriteLetterYTask.on(),
                MultupleEightTask.on(),
                ClickBtnSendTask.on(),
                OperationFirstFiveTask.on(),
                CompletOperationFiveTask.on(),
                IndiquedCouncilFiveTask.on(),
                MultipleCycleFiveTask.on(),
                ClickBtnSendTask.on()
        );
    }

    @When("^he writes how many animals there are$")
    public void heWritesHowManyAnimalsThereAre() {
        Sebastian.wasAbleTo(
                IndicatedFigureSixTask.on()
        );
    }

    @When("^he shows me the numbers that are multiples$")
    public void heShowsMeTheNumbersThatAreMultiples() {
        Sebastian.wasAbleTo(
                MultipleSixCycletask.on()
        );
    }

    @When("^the indicates the complete the operation$")
    public void theIndicatesTheCompleteTheOperation() {
        Sebastian.wasAbleTo(
                OperationFirstSixCycle.on()
        );
    }

    @When("^the indicates the complete second operation$")
    public void theIndicatesTheCompleteSecondOperation() {
        Sebastian.wasAbleTo(
                OperationSecondSixCycle.on()
        );
    }

    @When("^the click on the send button$")
    public void theClickOnTheSendButton() {
        Sebastian.wasAbleTo(
                ClickBtnSendTask.on()
        );
    }

    @Then("^he should see that he's in the six out of ten$")
    public void heShouldSeeThatHeSInTheSixOutOfTen() {
       // System.out.println("El titulo que el actor el titulo Se encuentra en el ciclo 6 de 10 : \n " + FiveCycleQuestion.fiveCycleSuccessful().answeredBy(Sebastian));

    }


}
