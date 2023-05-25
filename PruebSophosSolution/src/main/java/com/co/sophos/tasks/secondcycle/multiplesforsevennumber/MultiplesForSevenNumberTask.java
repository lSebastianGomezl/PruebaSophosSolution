package com.co.sophos.tasks.secondcycle.multiplesforsevennumber;

import com.co.sophos.tasks.multiplesoffournumber.MultiplesFourNumberTest;
import com.co.sophos.userinterface.secondcycle.SecondCycleInterface;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.util.ArrayList;
import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class MultiplesForSevenNumberTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        List<Integer> multiplesFour = new ArrayList<>();

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(130);
        numbers.add(176);
        numbers.add(40);
        numbers.add(166);
        numbers.add(88);
        numbers.add(189);
        numbers.add(193);
        numbers.add(195);
        numbers.add(62);
        numbers.add(10);
        numbers.add(18);
        numbers.add(105);
        numbers.add(72);

        for (int i = 0 ; i < numbers.size();i++){
            if (numbers.get(i) % 7 == 0) {
                multiplesFour.add(numbers.get(i));
            }
        }

        for (int i = 0 ; i < multiplesFour.size();i++){
            System.out.println(multiplesFour.get(i));
            switch (multiplesFour.get(i)){
                case 130:
                    actor.wasAbleTo(
                            Click.on(SecondCycleInterface.CHECKBOX_130)
                    );
                    break;
                case 176:
                    actor.wasAbleTo(
                            Click.on(SecondCycleInterface.CHECKBOX_176)
                    );
                    break;
                case 40:
                    actor.wasAbleTo(
                            Click.on(SecondCycleInterface.CHECKBOX_40)
                    );
                    break;
                case 166:
                    actor.wasAbleTo(
                            Click.on(SecondCycleInterface.CHECKBOX_166)
                    );
                    break;
                case 88:
                    actor.wasAbleTo(
                            Click.on(SecondCycleInterface.CHECKBOX_88)
                    );
                    break;
                case 189:
                    actor.wasAbleTo(
                            Click.on(SecondCycleInterface.CHECKBOX_189)
                    );
                    break;
                case 193:
                    actor.wasAbleTo(
                            Click.on(SecondCycleInterface.CHECKBOX_193)
                    );
                    break;
                case 195:
                    actor.wasAbleTo(
                            Click.on(SecondCycleInterface.CHECKBOX_195)
                    );
                    break;
                case 62:
                    actor.wasAbleTo(
                            Click.on(SecondCycleInterface.CHECKBOX_62)
                    );
                    break;
                case 10:
                    actor.wasAbleTo(
                            Click.on(SecondCycleInterface.CHECKBOX_10)
                    );
                    break;

                case 18:
                    actor.wasAbleTo(
                            Click.on(SecondCycleInterface.CHECKBOX_18)
                    );
                    break;
                case 105:
                    actor.wasAbleTo(
                            Click.on(SecondCycleInterface.CHECKBOX_105)
                    );
                    break;
                case 72:
                    actor.wasAbleTo(
                            Click.on(SecondCycleInterface.CHECKBOX_72)
                    );
                    break;
            }
        }

    }
    public static MultiplesForSevenNumberTask on(){
        return instrumented(MultiplesForSevenNumberTask.class);
    }
    }

