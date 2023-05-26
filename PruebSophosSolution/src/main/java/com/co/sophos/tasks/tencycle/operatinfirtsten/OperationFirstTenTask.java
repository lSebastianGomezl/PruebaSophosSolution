package com.co.sophos.tasks.tencycle.operatinfirtsten;

import com.co.sophos.userinterface.ninecycle.NineCycleInterface;
import com.co.sophos.userinterface.tencycle.TenCycleInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OperationFirstTenTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(TenCycleInterface.SELECT_RESULT),
                Click.on(TenCycleInterface.OPTION_330953)
        );
    }
    public static OperationFirstTenTask on(){
        return instrumented(OperationFirstTenTask.class);
    }
}
