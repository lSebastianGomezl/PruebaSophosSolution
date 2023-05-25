package com.co.sophos.tasks.writeletter;

import com.co.sophos.userinterface.testpage.TestPageInterface;
import net.serenitybdd.screenplay.Actor;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class WriteLetterTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        StringBuilder letter = new StringBuilder();
        for (int i = 0; i < 176; i++){
            letter.append("R");
        }
        String letters = letter.toString();
        System.out.println(letters);
        actor.attemptsTo(
                Enter.theValue(letters).into(TestPageInterface.TEXT_AREA)
        );
    }
    public static WriteLetterTask on(){
        return instrumented(WriteLetterTask.class);
    }
}
