package com.co.sophos.tasks.ninecycle.indicateddatenine;

import com.co.sophos.userinterface.testpage.TestPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IndicateDateNineTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        String initialD = "25/05/2023";

        LocalDate initialDate = LocalDate.parse(initialD, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        int sumDays = 71;

        LocalDate dateResult = initialDate.plusDays(sumDays);

        String dateFinalResult = dateResult.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Result Date" + dateFinalResult);

        actor.attemptsTo(
                Enter.theValue(dateFinalResult).into(TestPageInterface.INPUT_DATE)
        );
    }
    public static IndicateDateNineTask on(){
        return instrumented(IndicateDateNineTask.class);
    }
}
