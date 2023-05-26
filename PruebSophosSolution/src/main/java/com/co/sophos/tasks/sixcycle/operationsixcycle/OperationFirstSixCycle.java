package com.co.sophos.tasks.sixcycle.operationsixcycle;

import com.co.sophos.userinterface.fivecycle.FiveCycleInterface;
import com.co.sophos.userinterface.sixcycle.SixCycleInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;


import java.util.ArrayList;
import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OperationFirstSixCycle implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        int operation = 180 * 88 * 217 + 280 - 161 + 261 + 168 - 125;
        System.out.println(operation);

        List<Integer> multiplesFour = new ArrayList<>();

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(3437697);
        numbers.add(3437698);
        numbers.add(3437699);
        numbers.add(3437700);
        numbers.add(3437702);
        numbers.add(3437703);
        numbers.add(3437706);
        numbers.add(3437707);
        numbers.add(3437712);
        numbers.add(3437714);
        numbers.add(3437683);
        numbers.add(3437717);
        numbers.add(3437718);
        numbers.add(3437687);
        numbers.add(3437719);
        numbers.add(3437690);
        numbers.add(3437692);


        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i).equals(operation)) {
                switch (operation) {

                    case 3437697:
                        actor.wasAbleTo(
                                Click.on(SixCycleInterface.CHECK_3437697)
                        );
                        break;
                    case 3437698:
                        actor.wasAbleTo(
                                Click.on(SixCycleInterface.CHECK_3437698)
                        );
                        break;
                    case 3437699:
                        actor.wasAbleTo(
                                Click.on(SixCycleInterface.CHECK_3437699)
                        );
                        break;
                    case 3437700:
                        actor.wasAbleTo(
                                Click.on(SixCycleInterface.CHECK_3437700)
                        );
                        break;
                    case 3437702:
                        actor.wasAbleTo(
                                Click.on(SixCycleInterface.CHECK_3437702)
                        );
                        break;
                    case 3437703:
                        actor.wasAbleTo(
                                Click.on(SixCycleInterface.CHECK_3437703)
                        );
                        break;
                    case 3437706:
                        actor.wasAbleTo(
                                Click.on(SixCycleInterface.CHECK_3437706)
                        );
                        break;
                    case 3437707:
                        actor.wasAbleTo(
                                Click.on(SixCycleInterface.CHECK_3437707)
                        );
                        break;
                    case 3437712:
                        actor.wasAbleTo(
                                Click.on(SixCycleInterface.CHECK_3437712)
                        );
                        break;
                    case 3437714:
                        actor.wasAbleTo(
                                Click.on(SixCycleInterface.CHECK_3437714)
                        );
                        break;
                    case 3437683:
                        actor.wasAbleTo(
                                Click.on(SixCycleInterface.CHECK_3437683)
                        );
                        break;
                    case 3437717:
                        actor.wasAbleTo(
                                Click.on(SixCycleInterface.CHECK_3437717)
                        );
                        break;
                    case 3437718:
                        actor.wasAbleTo(
                                Click.on(SixCycleInterface.CHECK_3437718)
                        );
                        break;
                    case 3437687:
                        actor.wasAbleTo(
                                Click.on(SixCycleInterface.CHECK_3437687)
                        );
                        break;
                    case 3437719:
                        actor.wasAbleTo(
                                Click.on(SixCycleInterface.CHECK_3437719)
                        );
                        break;
                    case 3437690:
                        actor.wasAbleTo(
                                Click.on(SixCycleInterface.CHECK_3437690)
                        );
                        break;
                    case 3437692:
                        actor.wasAbleTo(
                                Click.on(SixCycleInterface.CHECK_3437692)
                        );
                        break;

                }

            }

            }

        }
    public static OperationFirstSixCycle on () {
        return instrumented(OperationFirstSixCycle.class);
    }
}