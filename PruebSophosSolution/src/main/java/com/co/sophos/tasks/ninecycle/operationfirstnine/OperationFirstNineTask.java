package com.co.sophos.tasks.ninecycle.operationfirstnine;

import com.co.sophos.userinterface.eightcycle.EightCycleInterface;
import com.co.sophos.userinterface.ninecycle.NineCycleInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OperationFirstNineTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(NineCycleInterface.SELECT_RESULT),
                Click.on(NineCycleInterface.OPTION_3577303)
        );
    }
    public static OperationFirstNineTask on(){
        return instrumented(OperationFirstNineTask.class);
    }
}
