package com.co.sophos.tasks.ninecycle.multiplenumbernine;

import com.co.sophos.userinterface.fivecycle.FiveCycleInterface;
import com.co.sophos.userinterface.ninecycle.NineCycleInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class MultipleCycleNineTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Click.on(NineCycleInterface.CHECK_122),
                Click.on(NineCycleInterface.CHECK_52),
                Click.on(NineCycleInterface.CHECK_186),
                Click.on(NineCycleInterface.CHECK_64),
                Click.on(NineCycleInterface.CHECK_142),
                Click.on(NineCycleInterface.CHECK_160),
                Click.on(NineCycleInterface.CHECK_38),
                Click.on(NineCycleInterface.CHECK_20),
                Click.on(NineCycleInterface.CHECK_176),
                Click.on(NineCycleInterface.CHECK_24)

        );

    }
    public static MultipleCycleNineTask on(){
        return instrumented(MultipleCycleNineTask.class);
    }


}
