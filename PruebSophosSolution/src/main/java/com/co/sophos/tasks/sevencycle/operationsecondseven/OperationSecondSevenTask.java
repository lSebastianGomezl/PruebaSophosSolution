package com.co.sophos.tasks.sevencycle.operationsecondseven;

import com.co.sophos.userinterface.sevencycle.SevenCycleInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OperationSecondSevenTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SevenCycleInterface.CHECK_407)

        );
    }
    public static OperationSecondSevenTask on(){
        return instrumented(OperationSecondSevenTask.class);
    }
}
