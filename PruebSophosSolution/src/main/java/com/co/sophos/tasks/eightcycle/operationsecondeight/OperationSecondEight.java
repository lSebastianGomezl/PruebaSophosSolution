package com.co.sophos.tasks.eightcycle.operationsecondeight;

import com.co.sophos.tasks.sevencycle.operationfirstseven.OperationFirstSevenTask;
import com.co.sophos.userinterface.eightcycle.EightCycleInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OperationSecondEight implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(EightCycleInterface.CHECK_14)
        );
    }
    public static OperationSecondEight on(){
        return instrumented(OperationSecondEight.class);
    }
}
