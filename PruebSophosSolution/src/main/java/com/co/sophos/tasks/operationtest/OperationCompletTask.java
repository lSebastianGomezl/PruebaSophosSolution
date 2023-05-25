package com.co.sophos.tasks.operationtest;

import com.co.sophos.userinterface.testpage.TestPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.util.ArrayList;
import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OperationCompletTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        int operation = 185+116-208-117*135-276+127;
        System.out.println(operation);

        List<Integer> listResult = new ArrayList<>();

        List<Integer> numbers = new ArrayList<>();

        numbers.add(-15868);
        numbers.add(-15835);
        numbers.add(-15834);
        numbers.add(-15832);
        numbers.add(-15862);
        numbers.add(-15859);
        numbers.add(-15858);
        numbers.add(-15855);
        numbers.add(-15853);
        numbers.add(-15852);
        numbers.add(-15851);
        numbers.add(-15847);

        for (int i = 0 ; i < numbers.size();i++){
            if (numbers.get(i).equals(operation)){

            switch (operation){
                case -15868:
                    actor.attemptsTo(
                            Click.on(TestPageInterface.RESULT_15868)
                    );
                    break;
                case -15835:
                    actor.attemptsTo(
                            Click.on(TestPageInterface.RESULT_15835)
                    );
                    break;
                case -15834:
                    actor.attemptsTo(
                            Click.on(TestPageInterface.RESULT_15834)
                    );
                    break;
                case -15832:
                    actor.attemptsTo(
                            Click.on(TestPageInterface.RESULT_15832)
                    );
                    break;
                case -15862:
                    actor.attemptsTo(
                            Click.on(TestPageInterface.RESULT_15862)
                    );
                    break;
                case -15859:
                    actor.attemptsTo(
                            Click.on(TestPageInterface.RESULT_15859)
                    );
                    break;
                case -15858:
                    actor.attemptsTo(
                            Click.on(TestPageInterface.RESULT_15858)
                    );
                    break;
                case -15855:
                    actor.attemptsTo(
                            Click.on(TestPageInterface.RESULT_15855)
                    );
                    break;
                case -15853:
                    actor.attemptsTo(
                            Click.on(TestPageInterface.RESULT_15853)
                    );
                    break;
                case -15852:
                    actor.attemptsTo(
                            Click.on(TestPageInterface.RESULT_15852)
                    );
                    break;
                case -15851:
                    actor.attemptsTo(
                            Click.on(TestPageInterface.RESULT_15851)
                    );
                    break;
                case -15847:
                    actor.attemptsTo(
                            Click.on(TestPageInterface.RESULT_15847)
                    );
                    break;
            }
            }
        }
    }
    public static OperationCompletTask result(){
        return instrumented(OperationCompletTask.class);
    }
}
