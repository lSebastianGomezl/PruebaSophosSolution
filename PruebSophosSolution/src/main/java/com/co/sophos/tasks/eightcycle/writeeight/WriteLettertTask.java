package com.co.sophos.tasks.eightcycle.writeeight;

import com.co.sophos.userinterface.testpage.TestPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class WriteLettertTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        StringBuilder letter = new StringBuilder();
        for (int i = 0; i < 271; i++){
            letter.append("t");
        }
        String letters = letter.toString();
        System.out.println(letters);
        actor.attemptsTo(
                Enter.theValue(letters).into(TestPageInterface.TEXT_AREA)
        );
    }
    public static WriteLettertTask on(){
        return instrumented(WriteLettertTask.class);
    }
}
