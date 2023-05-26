package com.co.sophos.tasks.tencycle.operationsecondten.operationsecondeight;

import com.co.sophos.userinterface.eightcycle.EightCycleInterface;
import com.co.sophos.userinterface.tencycle.TenCycleInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OperationSecondTen implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TenCycleInterface.CHECK_248407)
        );
    }
    public static OperationSecondTen on(){
        return instrumented(OperationSecondTen.class);
    }
}
