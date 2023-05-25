package com.co.sophos.tasks.threecycle.multiplesthreecycle;


import com.co.sophos.userinterface.threecycle.ThreeCycleInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.util.ArrayList;
import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class MultiplesFourThreeCycle implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        List<Integer> multiplesFour = new ArrayList<>();

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(22);
        numbers.add(169);
        numbers.add(77);
        numbers.add(125);
        numbers.add(175);
        numbers.add(34);
        numbers.add(37);
        numbers.add(146);
        numbers.add(111);
        numbers.add(182);
        numbers.add(42);
        numbers.add(118);
        numbers.add(119);
        numbers.add(134);

        for (int i = 0 ; i < numbers.size();i++){
            if (numbers.get(i) % 4 == 0) {
                multiplesFour.add(numbers.get(i));
            }
        }

        for (int i = 0 ; i < multiplesFour.size();i++){
            System.out.println(multiplesFour.get(i));
            switch (multiplesFour.get(i)){
                case 22:
                    actor.wasAbleTo(
                            Click.on(ThreeCycleInterface.CHECKBOX_22)
                    );
                    break;
                case 169:
                    actor.wasAbleTo(
                            Click.on(ThreeCycleInterface.CHECKBOX_169)
                    );
                    break;
                case 77:
                    actor.wasAbleTo(
                            Click.on(ThreeCycleInterface.CHECKBOX_77)
                    );
                    break;
                case 125:
                    actor.wasAbleTo(
                            Click.on(ThreeCycleInterface.CHECKBOX_125)
                    );
                    break;
                case 175:
                    actor.wasAbleTo(
                            Click.on(ThreeCycleInterface.CHECKBOX_175)
                    );
                    break;
                case 34:
                    actor.wasAbleTo(
                            Click.on(ThreeCycleInterface.CHECKBOX_34)
                    );
                    break;
                case 37:
                    actor.wasAbleTo(
                            Click.on(ThreeCycleInterface.CHECKBOX_37)
                    );
                    break;
                case 146:
                    actor.wasAbleTo(
                            Click.on(ThreeCycleInterface.CHECKBOX_146)
                    );
                    break;
                case 111:
                    actor.wasAbleTo(
                            Click.on(ThreeCycleInterface.CHECKBOX_111)
                    );
                    break;
                case 182:
                    actor.wasAbleTo(
                            Click.on(ThreeCycleInterface.CHECKBOX_182)
                    );
                    break;

                case 42:
                    actor.wasAbleTo(
                            Click.on(ThreeCycleInterface.CHECKBOX_42)
                    );
                    break;
                case 118:
                    actor.wasAbleTo(
                            Click.on(ThreeCycleInterface.CHECKBOX_118)
                    );
                    break;
                case 119:
                    actor.wasAbleTo(
                            Click.on(ThreeCycleInterface.CHECKBOX_119)
                    );
                    break;
                case 134:
                    actor.wasAbleTo(
                            Click.on(ThreeCycleInterface.CHECKBOX_134)
                    );
                    break;
            }
        }

    }
    public static MultiplesFourThreeCycle in(){
        return instrumented(MultiplesFourThreeCycle.class);
    }
}
