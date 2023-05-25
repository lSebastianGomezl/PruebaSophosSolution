package com.co.sophos.tasks.fivecycle.indiquedcouncil;

import com.co.sophos.userinterface.fivecycle.FiveCycleInterface;
import com.co.sophos.userinterface.fourcycle.FourCycleInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IndiquedCouncilFiveTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Enter.theValue("10").into(FourCycleInterface.INPUT_NUMBER_FOUR_CYCLE)
        );
    }
    public static IndiquedCouncilFiveTask on(){
        return instrumented(IndiquedCouncilFiveTask.class);
    }
}
