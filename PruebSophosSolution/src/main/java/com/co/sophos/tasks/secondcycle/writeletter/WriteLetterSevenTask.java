package com.co.sophos.tasks.secondcycle.writeletter;

import com.co.sophos.userinterface.secondcycle.SecondCycleInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class WriteLetterSevenTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        StringBuilder letter = new StringBuilder();
        for (int i = 0; i < 446; i++){
            letter.append("o");
        }
        String letters = letter.toString();
        System.out.println(letters);
        actor.attemptsTo(
                Enter.theValue(letters).into(SecondCycleInterface.TEXT_AREA_TWO_CYCLE)
        );
    }
    public static WriteLetterSevenTask on(){
        return instrumented(WriteLetterSevenTask.class);
    }
}
