package com.co.sophos.tasks.fourcycle.indiquedfigure;

import com.co.sophos.userinterface.fourcycle.FourCycleInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IndicatedFigureTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Enter.theValue("8").into(FourCycleInterface.INPUT_NUMBER_FOUR_CYCLE)
        );
    }
    public static IndicatedFigureTask on(){
        return instrumented(IndicatedFigureTask.class);
    }
}
