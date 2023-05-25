package com.co.sophos.tasks.secondcycle.indicateddate;

import com.co.sophos.tasks.indicatedate.IndicatedDateTask;
import com.co.sophos.userinterface.secondcycle.SecondCycleInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IndicateDateSecondCycleTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        String initialD = "24/05/2023";

        LocalDate initialDate = LocalDate.parse(initialD, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        int sumDays = 119;

        LocalDate dateResult = initialDate.plusDays(sumDays);

        String dateFinalResult = dateResult.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        System.out.println("Result Date" + dateFinalResult);

        actor.attemptsTo(
                Enter.theValue(dateFinalResult).into(SecondCycleInterface.INPUT_DATE_TWO_CYCLE)
        );
    }

    public static IndicateDateSecondCycleTask on(){
        return instrumented(IndicateDateSecondCycleTask.class);
    }
}
