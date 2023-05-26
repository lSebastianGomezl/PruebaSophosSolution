package com.co.sophos.tasks.sevencycle.operationfirstseven;

import com.co.sophos.userinterface.sevencycle.SevenCycleInterface;
import cucumber.api.java.eo.Se;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OperationFirstSevenTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SevenCycleInterface.CHECK_42),
                Click.on(SevenCycleInterface.CHECK_98),
                Click.on(SevenCycleInterface.CHECK_91),
                Click.on(SevenCycleInterface.CHECK_147)

        );
    }
    public static OperationFirstSevenTask on(){
        return instrumented(OperationFirstSevenTask.class);
    }
}
