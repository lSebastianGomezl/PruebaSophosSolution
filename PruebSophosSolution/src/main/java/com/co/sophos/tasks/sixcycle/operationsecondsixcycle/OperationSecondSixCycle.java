package com.co.sophos.tasks.sixcycle.operationsecondsixcycle;

import com.co.sophos.userinterface.sixcycle.SixCycleInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OperationSecondSixCycle implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(
               Click.on(SixCycleInterface.SELECT)
       );

        actor.attemptsTo(
                Click.on(SixCycleInterface.OPTION_141451559)
        );
    }
    public static OperationSecondSixCycle on(){
        return instrumented(OperationSecondSixCycle.class);
    }
}
