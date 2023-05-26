package com.co.sophos.tasks.tencycle.writeyten;

import com.co.sophos.userinterface.testpage.TestPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class WriteLetteryTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        StringBuilder letter = new StringBuilder();
        for (int i = 0; i < 253; i++){
            letter.append("y");
        }
        String letters = letter.toString();
        System.out.println(letters);
        actor.attemptsTo(
                Enter.theValue(letters).into(TestPageInterface.TEXT_AREA)
        );
    }
    public static WriteLetteryTask on(){
        return instrumented(WriteLetteryTask.class);
    }
}
