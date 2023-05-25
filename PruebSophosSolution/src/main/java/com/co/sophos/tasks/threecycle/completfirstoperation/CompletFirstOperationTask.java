package com.co.sophos.tasks.threecycle.completfirstoperation;

import com.co.sophos.userinterface.testpage.TestPageInterface;
import com.co.sophos.userinterface.threecycle.ThreeCycleInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.util.ArrayList;
import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CompletFirstOperationTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        int operation = 174*216+246*51*133-153+51*263;
        System.out.println(operation);

        List<Integer> listResult = new ArrayList<>();

        List<Integer> numbers = new ArrayList<>();


        numbers.add(1719444);
        numbers.add(1719445);
        numbers.add(1719447);
        numbers.add(1719449);
        numbers.add(1719451);
        numbers.add(1719455);
        numbers.add(1719457);
        numbers.add(1719458);
        numbers.add(1719459);
        numbers.add(1719460);
        numbers.add(1719461);
        numbers.add(1719462);
        numbers.add(1719463);
        numbers.add(1719467);
        numbers.add(1719470);
        numbers.add(1719472);
        numbers.add(1719473);
        numbers.add(1719476);
        numbers.add(1719479);
        numbers.add(1719480);

        for (int i = 0 ; i < numbers.size();i++){
            if (numbers.get(i).equals(operation)){

                switch (operation){
                    case 1719444:
                        actor.attemptsTo(
                                Click.on(ThreeCycleInterface.CHECKBOX_1719444)
                        );
                        break;
                    case 1719445:
                        actor.attemptsTo(
                                Click.on(ThreeCycleInterface.CHECKBOX_1719445)
                        );
                        break;
                    case 1719447:
                        actor.attemptsTo(
                                Click.on(ThreeCycleInterface.CHECKBOX_1719447)
                        );
                        break;
                    case 1719449:
                        actor.attemptsTo(
                                Click.on(ThreeCycleInterface.CHECKBOX_1719449)
                        );
                        break;
                    case 1719451:
                        actor.attemptsTo(
                                Click.on(ThreeCycleInterface.CHECKBOX_1719451)
                        );
                        break;
                    case 1719455:
                        actor.attemptsTo(
                                Click.on(ThreeCycleInterface.CHECKBOX_1719455)
                        );
                        break;
                    case 1719457:
                        actor.attemptsTo(
                                Click.on(ThreeCycleInterface.CHECKBOX_1719457)
                        );
                        break;
                    case 1719458:
                        actor.attemptsTo(
                                Click.on(ThreeCycleInterface.CHECKBOX_1719458)
                        );
                        break;
                    case 1719459:
                        actor.attemptsTo(
                                Click.on(ThreeCycleInterface.CHECKBOX_1719459)
                        );
                        break;
                    case 1719460:
                        actor.attemptsTo(
                                Click.on(ThreeCycleInterface.CHECKBOX_1719460)
                        );
                        break;
                    case 1719461:
                        actor.attemptsTo(
                                Click.on(ThreeCycleInterface.CHECKBOX_1719461)
                        );
                        break;
                    case 1719462:
                        actor.attemptsTo(
                                Click.on(ThreeCycleInterface.CHECKBOX_1719462)
                        );
                        break;
                    case 1719463:
                        actor.attemptsTo(
                                Click.on(ThreeCycleInterface.CHECKBOX_1719463)
                        );
                        break;
                    case 1719467:
                        actor.attemptsTo(
                                Click.on(ThreeCycleInterface.CHECKBOX_1719467)
                        );
                        break;
                    case 1719470:
                        actor.attemptsTo(
                                Click.on(ThreeCycleInterface.CHECKBOX_1719470)
                        );
                        break;
                    case 1719472:
                        actor.attemptsTo(
                                Click.on(ThreeCycleInterface.CHECKBOX_1719472)
                        );
                        break;
                    case 1719473:
                        actor.attemptsTo(
                                Click.on(ThreeCycleInterface.CHECKBOX_1719473)
                        );
                        break;
                    case 1719476:
                        actor.attemptsTo(
                                Click.on(ThreeCycleInterface.CHECKBOX_1719476)
                        );
                        break;
                    case 1719479:
                        actor.attemptsTo(
                                Click.on(ThreeCycleInterface.CHECKBOX_1719479)
                        );
                        break;
                    case 1719480:
                        actor.attemptsTo(
                                Click.on(ThreeCycleInterface.CHECKBOX_1719480)
                        );
                        break;
                }
            }
        }
    }
    public static CompletFirstOperationTask on(){
        return instrumented(CompletFirstOperationTask.class);
    }
}
