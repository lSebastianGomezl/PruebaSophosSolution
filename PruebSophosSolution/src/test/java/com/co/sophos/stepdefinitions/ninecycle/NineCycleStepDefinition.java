package com.co.sophos.stepdefinitions.ninecycle;

import com.co.sophos.questions.eightcycle.EightCycleQuestion;
import com.co.sophos.questions.ninecycle.NineCycleQuestion;
import com.co.sophos.tasks.eightcycle.indicatedfigureeight.IndiquedMouseEightTask;
import com.co.sophos.tasks.eightcycle.operationfirsteight.OperationFirstEightTask;
import com.co.sophos.tasks.eightcycle.operationsecondeight.OperationSecondEight;
import com.co.sophos.tasks.eightcycle.writeeight.WriteLettertTask;
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
import com.co.sophos.tasks.ninecycle.indicateddatenine.IndicateDateNineTask;
import com.co.sophos.tasks.ninecycle.multiplenumbernine.MultipleCycleNineTask;
import com.co.sophos.tasks.ninecycle.operationfirstnine.OperationFirstNineTask;
import com.co.sophos.tasks.ninecycle.writepnine.WriteLetterpTask;
import com.co.sophos.tasks.openthepage.OpenThePageTask;
import com.co.sophos.tasks.operationtest.OperationCompletTask;
import com.co.sophos.tasks.secondcycle.indicateddate.IndicateDateSecondCycleTask;
import com.co.sophos.tasks.secondcycle.indicatesequence.IndicateSequenceTask;
import com.co.sophos.tasks.secondcycle.multiplesforsevennumber.MultiplesForSevenNumberTask;
import com.co.sophos.tasks.secondcycle.writeletter.WriteLetterSevenTask;
import com.co.sophos.tasks.sevencycle.indicateddate.IndicateDateSevenTask;
import com.co.sophos.tasks.sevencycle.indicatedfigure.IndiquedFigureSevenTask;
import com.co.sophos.tasks.sevencycle.operationfirstseven.OperationFirstSevenTask;
import com.co.sophos.tasks.sevencycle.operationsecondseven.OperationSecondSevenTask;
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
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class NineCycleStepDefinition {



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
                ClickBtnSendTask.on(),
                IndicatedFigureSixTask.on(),
                MultipleSixCycletask.on(),
                OperationFirstSixCycle.on(),
                OperationSecondSixCycle.on(),
                ClickBtnSendTask.on(),
                IndicateDateSevenTask.on(),
                OperationSecondSevenTask.on(),
                OperationFirstSevenTask.on(),
                IndiquedFigureSevenTask.on(),
                ClickBtnSendTask.on(),
                OperationFirstEightTask.on(),
                WriteLettertTask.on(),
                IndiquedMouseEightTask.on(),
                OperationSecondEight.on(),
                ClickBtnSendTask.on()


        );
    }

    @When("^he inserts the result of the operation$")
    public void heInsertsTheResultOfTheOperation() {
        Sebastian.wasAbleTo(
                OperationFirstNineTask.on()
        );
    }

    @When("^he shows me the numbers that are multiples$")
    public void heShowsMeTheNumbersThatAreMultiples() {
        Sebastian.wasAbleTo(
                MultipleCycleNineTask.on()
        );
    }

    @When("^he puts quantity of the letter p$")
    public void hePutsQuantityOfTheLetterP() {
        Sebastian.wasAbleTo(
                WriteLetterpTask.on()
        );
    }

    @When("^he indicates which is the corresponding date$")
    public void heIndicatesWhichIsTheCorrespondingDate() {
        Sebastian.wasAbleTo(
                IndicateDateNineTask.on()
        );
    }

    @When("^the click on the send button$")
    public void theClickOnTheSendButton() {
        Sebastian.wasAbleTo(
                ClickBtnSendTask.on()
        );
    }

    @Then("^you should see that he's at nine out of ten$")
    public void youShouldSeeThatHeSAtNineOutOfTen() {
        System.out.println("El titulo que el actor el titulo Se encuentra en el ciclo 10 de 10 : \n " + NineCycleQuestion.ninetCycleSuccessful().answeredBy(Sebastian));

    }


}
