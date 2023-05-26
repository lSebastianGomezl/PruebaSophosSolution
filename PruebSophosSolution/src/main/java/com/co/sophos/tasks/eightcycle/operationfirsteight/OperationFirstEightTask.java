package com.co.sophos.tasks.eightcycle.operationfirsteight;

import com.co.sophos.userinterface.eightcycle.EightCycleInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OperationFirstEightTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(EightCycleInterface.SELECT_RESULT),
                Click.on(EightCycleInterface.OPTION_4202016136)
        );
    }
    public static OperationFirstEightTask on(){
        return instrumented(OperationFirstEightTask.class);
    }
}
