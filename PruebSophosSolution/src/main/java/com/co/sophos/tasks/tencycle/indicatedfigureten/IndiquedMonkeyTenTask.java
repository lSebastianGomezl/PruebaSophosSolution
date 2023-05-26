package com.co.sophos.tasks.tencycle.indicatedfigureten;

import com.co.sophos.userinterface.fourcycle.FourCycleInterface;
import com.co.sophos.userinterface.tencycle.TenCycleInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IndiquedMonkeyTenTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.wasAbleTo(
                Enter.theValue("8").into(TenCycleInterface.INPUT_NUMBER_TEN_CYCLE)
        );
    }
    public static IndiquedMonkeyTenTask on(){
        return instrumented(IndiquedMonkeyTenTask.class);
    }
}
