package com.co.sophos.tasks.sevencycle.indicatedfigure;

import com.co.sophos.userinterface.sevencycle.SevenCycleInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IndiquedFigureSevenTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Enter.theValue("19").into(SevenCycleInterface.INPUT_NUMBER_SEVEN_CYCLE)
        );
    }
    public static IndiquedFigureSevenTask on(){
        return instrumented(IndiquedFigureSevenTask.class);
    }
}
