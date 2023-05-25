package com.co.sophos.tasks.sixcycle.multipleeghtsix;

import com.co.sophos.userinterface.sixcycle.SixCycleInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class MultipleSixCycletask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SixCycleInterface.CHECK_152),
                Click.on(SixCycleInterface.CHECK_16)
        );

    }
    public static MultipleSixCycletask on(){
        return instrumented(MultipleSixCycletask.class);
    }
}
