package com.co.sophos.tasks.fivecycle.multiplecyclefive;

import com.co.sophos.userinterface.fivecycle.FiveCycleInterface;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;



import static net.serenitybdd.screenplay.Tasks.instrumented;

public class MultipleCycleFiveTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Click.on(FiveCycleInterface.CHECK_184),
                Click.on(FiveCycleInterface.CHECK_112)
        );

    }
    public static MultipleCycleFiveTask on(){
        return instrumented(MultipleCycleFiveTask.class);
    }


}
