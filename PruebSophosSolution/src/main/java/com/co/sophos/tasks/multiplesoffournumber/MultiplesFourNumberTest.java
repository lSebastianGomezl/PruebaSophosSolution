package com.co.sophos.tasks.multiplesoffournumber;

import com.co.sophos.userinterface.testpage.TestPageInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.util.ArrayList;
import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class MultiplesFourNumberTest implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        List<Integer> multiplesFour = new ArrayList<>();

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(75);
        numbers.add(118);
        numbers.add(148);
        numbers.add(83);
        numbers.add(193);
        numbers.add(28);
        numbers.add(115);
        numbers.add(88);
        numbers.add(182);
        numbers.add(74);
        numbers.add(87);
        numbers.add(135);

        for (int i = 0 ; i < numbers.size();i++){
            if (numbers.get(i) % 4 == 0) {
                multiplesFour.add(numbers.get(i));
            }
        }

        for (int i = 0 ; i < multiplesFour.size();i++){
            switch (multiplesFour.get(i)){
                case 75:
                    actor.wasAbleTo(
                            Click.on(TestPageInterface.CHECKBOX_75)
                    );
                    break;
                case 74:
                    actor.wasAbleTo(
                            Click.on(TestPageInterface.CHECKBOX_74)
                    );
                    break;
                case 83:
                    actor.wasAbleTo(
                            Click.on(TestPageInterface.CHECKBOX_83)
                    );
                    break;
                case 87:
                    actor.wasAbleTo(
                            Click.on(TestPageInterface.CHECKBOX_87)
                    );
                    break;
                case 88:
                    actor.wasAbleTo(
                            Click.on(TestPageInterface.CHECKBOX_88)
                    );
                    break;
                case 118:
                    actor.wasAbleTo(
                            Click.on(TestPageInterface.CHECKBOX_118)
                    );
                    break;
                case 148:
                    actor.wasAbleTo(
                            Click.on(TestPageInterface.CHECKBOX_148)
                    );
                    break;
                case 193:
                    actor.wasAbleTo(
                            Click.on(TestPageInterface.CHECKBOX_193)
                    );
                    break;
                case 28:
                    actor.wasAbleTo(
                            Click.on(TestPageInterface.CHECKBOX_28)
                    );
                    break;
                case 115:
                    actor.wasAbleTo(
                            Click.on(TestPageInterface.CHECKBOX_115)
                    );
                    break;

                case 182:
                    actor.wasAbleTo(
                            Click.on(TestPageInterface.CHECKBOX_182)
                    );
                    break;
                case 135:
                    actor.wasAbleTo(
                            Click.on(TestPageInterface.CHECKBOX_135)
                    );
                    break;
            }
        }

    }
    public static MultiplesFourNumberTest on(){
        return instrumented(MultiplesFourNumberTest.class);
    }
}
