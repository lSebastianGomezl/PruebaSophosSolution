package com.co.sophos.tasks.indicatedate;

import com.co.sophos.userinterface.testpage.TestPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class IndicatedDateTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        String initialD = "25/05/2023";

        LocalDate initialDate = LocalDate.parse(initialD, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        int sumDays = 96;

        LocalDate dateResult = initialDate.plusDays(sumDays);

        String dateFinalResult = dateResult.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Result Date" + dateFinalResult);

        actor.attemptsTo(
                Enter.theValue(dateFinalResult).into(TestPageInterface.INPUT_DATE)
        );
    }

    public static IndicatedDateTask on(){
        return instrumented(IndicatedDateTask.class);
    }
}
