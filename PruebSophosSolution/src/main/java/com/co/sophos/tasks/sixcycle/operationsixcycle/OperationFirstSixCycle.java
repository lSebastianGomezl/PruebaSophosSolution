package com.co.sophos.tasks.sixcycle.operationsixcycle;

import com.co.sophos.userinterface.sixcycle.SixCycleInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;



import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OperationFirstSixCycle implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(
               Click.on(SixCycleInterface.CHECK_3437700)
       );
    }
    public static OperationFirstSixCycle on(){
        return instrumented(OperationFirstSixCycle.class);
    }
}
