package com.co.sophos.tasks.threecycle.completsecondoperation;

import com.co.sophos.userinterface.testpage.TestPageInterface;
import com.co.sophos.userinterface.threecycle.ThreeCycleInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.util.ArrayList;
import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CompleteSecondOperationTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        int operation = 197+69-39-226*206+183*266;
        System.out.println(operation);


        List<Integer> numbers = new ArrayList<>();

        numbers.add(2336);
        numbers.add(2339);
        numbers.add(2346);
        numbers.add(2349);
        numbers.add(2350);
        numbers.add(2351);
        numbers.add(2331);
        numbers.add(2353);
        numbers.add(2355);
        numbers.add(2359);
        numbers.add(2363);
        numbers.add(2364);
        numbers.add(2333);
        numbers.add(2335);

        for (int i = 0 ; i < numbers.size();i++){
            if (numbers.get(i).equals(operation)){

                switch (operation){
                    case 2336:
                        actor.attemptsTo(
                                Click.on(ThreeCycleInterface.RESULT_2336)
                        );
                        break;
                    case 2339:
                        actor.attemptsTo(
                                Click.on(ThreeCycleInterface.RESULT_2339)
                        );
                        break;
                    case 2346:
                        actor.attemptsTo(
                                Click.on(ThreeCycleInterface.RESULT_2346)
                        );
                        break;
                    case 2349:
                        actor.attemptsTo(
                                Click.on(ThreeCycleInterface.RESULT_2349)
                        );
                        break;
                    case 2350:
                        actor.attemptsTo(
                                Click.on(ThreeCycleInterface.RESULT_2350)
                        );
                        break;
                    case 2351:
                        actor.attemptsTo(
                                Click.on(ThreeCycleInterface.RESULT_2351)
                        );
                        break;
                    case 2331:
                        actor.attemptsTo(
                                Click.on(ThreeCycleInterface.RESULT_2331)
                        );
                        break;
                    case 2353:
                        actor.attemptsTo(
                                Click.on(ThreeCycleInterface.RESULT_2353)
                        );
                        break;
                    case 2355:
                        actor.attemptsTo(
                                Click.on(ThreeCycleInterface.RESULT_2355)
                        );
                        break;
                    case 2359:
                        actor.attemptsTo(
                                Click.on(ThreeCycleInterface.RESULT_2359)
                        );
                        break;
                    case 2363:
                        actor.attemptsTo(
                                Click.on(ThreeCycleInterface.RESULT_2363)
                        );
                        break;
                    case 2364:
                        actor.attemptsTo(
                                Click.on(ThreeCycleInterface.RESULT_2364)
                        );
                        break;
                    case 2333:
                        actor.attemptsTo(
                                Click.on(ThreeCycleInterface.RESULT_2333)
                        );
                        break;
                    case 2335:
                        actor.attemptsTo(
                                Click.on(ThreeCycleInterface.RESULT_2335)
                        );
                        break;
                }
            }
        }
    }
    public static CompleteSecondOperationTask on(){
        return instrumented(CompleteSecondOperationTask.class);
    }
}
