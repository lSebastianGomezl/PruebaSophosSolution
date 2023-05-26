package com.co.sophos.tasks.sixcycle.multipleeghtsix;

import com.co.sophos.userinterface.fourcycle.FourCycleInterface;
import com.co.sophos.userinterface.sixcycle.SixCycleInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.util.ArrayList;
import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class MultipleSixCycletask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        List<Integer> multiplesFour = new ArrayList<>();

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(142);
        numbers.add(51);
        numbers.add(12);
        numbers.add(159);
        numbers.add(152);
        numbers.add(33);
        numbers.add(94);
        numbers.add(41);
        numbers.add(58);
        numbers.add(187);
        numbers.add(153);
        numbers.add(97);
        numbers.add(30);
        numbers.add(86);
        numbers.add(102);
        numbers.add(137);
        numbers.add(84);
        numbers.add(16);
        numbers.add(93);


        for (int i = 0 ; i < numbers.size();i++){
            if (numbers.get(i) % 8 == 0) {
                multiplesFour.add(numbers.get(i));
            }
        }

        for (int i = 0 ; i < multiplesFour.size();i++){
            switch (multiplesFour.get(i)){
                case 142:
                    actor.wasAbleTo(
                            Click.on(SixCycleInterface.CHECK_142)
                    );
                    break;
                case 51:
                    actor.wasAbleTo(
                            Click.on(SixCycleInterface.CHECK_51)
                    );
                    break;
                case 12:
                    actor.wasAbleTo(
                            Click.on(SixCycleInterface.CHECK_12)
                    );
                    break;
                case 159:
                    actor.wasAbleTo(
                            Click.on(SixCycleInterface.CHECK_159)
                    );
                    break;
                case 152:
                    actor.wasAbleTo(
                            Click.on(SixCycleInterface.CHECK_152)
                    );
                    break;
                case 33:
                    actor.wasAbleTo(
                            Click.on(SixCycleInterface.CHECK_33)
                    );
                case 94:
                    actor.wasAbleTo(
                            Click.on(SixCycleInterface.CHECK_94)
                    );
                    break;
                case 41:
                    actor.wasAbleTo(
                            Click.on(SixCycleInterface.CHECK_41)
                    );
                    break;
                case 58:
                    actor.wasAbleTo(
                            Click.on(SixCycleInterface.CHECK_58)
                    );
                    break;
                case 187:
                    actor.wasAbleTo(
                            Click.on(SixCycleInterface.CHECK_187)
                    );
                    break;
                case 153:
                    actor.wasAbleTo(
                            Click.on(SixCycleInterface.CHECK_153)
                    );
                    break;
                case 97:
                    actor.wasAbleTo(
                            Click.on(SixCycleInterface.CHECK_97)
                    );
                    break;
                case 30:
                    actor.wasAbleTo(
                            Click.on(SixCycleInterface.CHECK_30)
                    );
                    break;
                case 86:
                    actor.wasAbleTo(
                            Click.on(SixCycleInterface.CHECK_86)
                    );
                    break;
                case 112:
                    actor.wasAbleTo(
                            Click.on(SixCycleInterface.CHECK_102)
                    );
                    break;
                case 137:
                    actor.wasAbleTo(
                            Click.on(SixCycleInterface.CHECK_137)
                    );
                    break;
                case 84:
                    actor.wasAbleTo(
                            Click.on(SixCycleInterface.CHECK_84)
                    );
                    break;
                case 16:
                    actor.wasAbleTo(
                            Click.on(SixCycleInterface.CHECK_16)
                    );
                    break;
                case 93:
                    actor.wasAbleTo(
                            Click.on(SixCycleInterface.CHECK_93)
                    );
                    break;
            }
        }

    }
    public static MultipleSixCycletask on(){
        return instrumented(MultipleSixCycletask.class);
    }
}
