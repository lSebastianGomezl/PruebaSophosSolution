package com.co.sophos.tasks.ninecycle.writepnine;

import com.co.sophos.userinterface.testpage.TestPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class WriteLetterpTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        StringBuilder letter = new StringBuilder();
        for (int i = 0; i < 255; i++){
            letter.append("p");
        }
        String letters = letter.toString();
        System.out.println(letters);
        actor.attemptsTo(
                Enter.theValue(letters).into(TestPageInterface.TEXT_AREA)
        );
    }
    public static WriteLetterpTask on(){
        return instrumented(WriteLetterpTask.class);
    }
}
