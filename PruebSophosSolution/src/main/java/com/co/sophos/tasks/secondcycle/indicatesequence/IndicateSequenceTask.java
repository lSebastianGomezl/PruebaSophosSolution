package com.co.sophos.tasks.secondcycle.indicatesequence;

import com.co.sophos.userinterface.secondcycle.SecondCycleInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IndicateSequenceTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("8").into(SecondCycleInterface.INPUT_NUMBER_TWO_CYCLE)
        );
    }
    public static IndicateSequenceTask on(){
        return instrumented(IndicateSequenceTask.class);
    }
}
