package com.co.sophos.tasks.fourcycle.multipleeight;

import com.co.sophos.userinterface.fourcycle.FourCycleInterface;
import com.co.sophos.userinterface.testpage.TestPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.ArrayList;
import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class MultupleEightTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        List<Integer> multiplesFour = new ArrayList<>();

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(116);
        numbers.add(101);
        numbers.add(66);
        numbers.add(196);
        numbers.add(49);
        numbers.add(46);
        numbers.add(110);
        numbers.add(178);
        numbers.add(122);
        numbers.add(74);


        for (int i = 0 ; i < numbers.size();i++){
            if (numbers.get(i) % 8 == 0) {
                multiplesFour.add(numbers.get(i));
            }
        }

        for (int i = 0 ; i < multiplesFour.size();i++){
            switch (multiplesFour.get(i)){
                case 116:
                    actor.wasAbleTo(
                            Click.on(FourCycleInterface.CHECK_116)
                    );
                    break;
                case 101:
                    actor.wasAbleTo(
                            Click.on(FourCycleInterface.CHECK_101)
                    );
                    break;
                case 66:
                    actor.wasAbleTo(
                            Click.on(FourCycleInterface.CHECK_66)
                    );
                    break;
                case 196:
                    actor.wasAbleTo(
                            Click.on(FourCycleInterface.CHECK_196)
                    );
                    break;
                case 49:
                    actor.wasAbleTo(
                            Click.on(FourCycleInterface.CHECK_49)
                    );
                    break;
                case 46:
                    actor.wasAbleTo(
                            Click.on(FourCycleInterface.CHECK_46)
                    );
                    break;
                case 110:
                    actor.wasAbleTo(
                            Click.on(FourCycleInterface.CHECK_110)
                    );
                    break;
                case 178:
                    actor.wasAbleTo(
                            Click.on(FourCycleInterface.CHECK_178)
                    );
                    break;
                case 122:
                    actor.wasAbleTo(
                            Click.on(FourCycleInterface.CHECK_122)
                    );
                    break;
            }
        }
    }
    public static MultupleEightTask on(){
        return instrumented(MultupleEightTask.class);
    }
}
