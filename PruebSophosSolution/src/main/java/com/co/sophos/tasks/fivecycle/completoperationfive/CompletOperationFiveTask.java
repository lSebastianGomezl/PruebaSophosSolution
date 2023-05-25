package com.co.sophos.tasks.fivecycle.completoperationfive;

import com.co.sophos.userinterface.fivecycle.FiveCycleInterface;
import com.co.sophos.userinterface.testpage.TestPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.util.ArrayList;
import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CompletOperationFiveTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        int operation = 287-242*35+22*140-121;
        System.out.println(operation);

        List<Integer> listResult = new ArrayList<>();

        List<Integer> numbers = new ArrayList<>();

        numbers.add(-5215);
        numbers.add(-5213);
        numbers.add(-5244);
        numbers.add(-5211);
        numbers.add(-5210);
        numbers.add(-5241);
        numbers.add(-5242);
        numbers.add(-5205);
        numbers.add(-5227);
        numbers.add(-5224);
        numbers.add(-5223);


        for (int i = 0 ; i < numbers.size();i++){
            if (numbers.get(i).equals(operation)){

                switch (operation){
                    case -5215:
                        actor.attemptsTo(
                                Click.on(FiveCycleInterface.CHECK_5215)
                        );
                        break;
                    case -5213:
                        actor.attemptsTo(
                                Click.on(FiveCycleInterface.CHECK_5213)
                        );
                        break;
                    case -5244:
                        actor.attemptsTo(
                                Click.on(FiveCycleInterface.CHECK_5244)
                        );
                        break;
                    case -5211:
                        actor.attemptsTo(
                                Click.on(FiveCycleInterface.CHECK_5211)
                        );
                        break;
                    case -5210:
                        actor.attemptsTo(
                                Click.on(FiveCycleInterface.CHECK_5210)
                        );
                        break;
                    case -5241:
                        actor.attemptsTo(
                                Click.on(FiveCycleInterface.CHECK_5241)
                        );
                        break;
                    case -5242:
                        actor.attemptsTo(
                                Click.on(FiveCycleInterface.CHECK_5242)
                        );
                        break;
                    case -5205:
                        actor.attemptsTo(
                                Click.on(FiveCycleInterface.CHECK_5205)
                        );
                        break;
                    case -5227:
                        actor.attemptsTo(
                                Click.on(FiveCycleInterface.CHECK_5227)
                        );
                        break;
                    case -5224:
                        actor.attemptsTo(
                                Click.on(FiveCycleInterface.CHECK_5224)
                        );
                        break;
                    case -5223:
                        actor.attemptsTo(
                                Click.on(FiveCycleInterface.CHECK_5223)
                        );
                        break;
                }
            }
        }
    }
    public static CompletOperationFiveTask on(){
        return instrumented(CompletOperationFiveTask.class);
    }
}
