package com.co.sophos.tasks.sixcycle.operationsecondsixcycle;

import com.co.sophos.userinterface.sixcycle.SixCycleInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.util.ArrayList;
import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OperationSecondSixCycle implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        int operation = 298 * 56 * 52 * 163 + 30 * 149 - 247 - 152;
        System.out.println(operation);


        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(141451539);
        numbers.add(141451540);
        numbers.add(141451542);
        numbers.add(141451545);
        numbers.add(141451551);
        numbers.add(141451554);
        numbers.add(141451555);
        numbers.add(141451556);
        numbers.add(141451558);
        numbers.add(141451559);
        numbers.add(141451561);
        numbers.add(141451564);
        numbers.add(141451567);
        numbers.add(141451569);
        numbers.add(141451570);
        numbers.add(141451573);
        numbers.add(141451575);
        numbers.add(141451577);
        numbers.add(141451578);

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i).equals(operation)) {
                switch (operation) {

                    case 141451539:
                        actor.wasAbleTo(
                                Click.on(SixCycleInterface.CHECK_141451539)
                        );
                        break;
                    case 141451540:
                        actor.wasAbleTo(
                                Click.on(SixCycleInterface.CHECK_141451540)
                        );
                        break;
                    case 141451542:
                        actor.wasAbleTo(
                                Click.on(SixCycleInterface.CHECK_141451542)
                        );
                        break;
                    case 141451545:
                        actor.wasAbleTo(
                                Click.on(SixCycleInterface.CHECK_141451545)
                        );
                        break;
                    case 141451551:
                        actor.wasAbleTo(
                                Click.on(SixCycleInterface.CHECK_141451551)
                        );
                        break;
                    case 141451554:
                        actor.wasAbleTo(
                                Click.on(SixCycleInterface.CHECK_141451554)
                        );
                        break;
                    case 141451555:
                        actor.wasAbleTo(
                                Click.on(SixCycleInterface.CHECK_141451555)
                        );
                        break;
                    case 141451556:
                        actor.wasAbleTo(
                                Click.on(SixCycleInterface.CHECK_141451556)
                        );
                        break;
                    case 141451558:
                        actor.wasAbleTo(
                                Click.on(SixCycleInterface.CHECK_141451558)
                        );
                        break;
                    case 141451559:
                        actor.wasAbleTo(
                                Click.on(SixCycleInterface.CHECK_141451559)
                        );
                        break;
                    case 141451561:
                        actor.wasAbleTo(
                                Click.on(SixCycleInterface.CHECK_141451561)
                        );
                        break;
                    case 141451564:
                        actor.wasAbleTo(
                                Click.on(SixCycleInterface.CHECK_141451564)
                        );
                        break;
                    case 141451567:
                        actor.wasAbleTo(
                                Click.on(SixCycleInterface.CHECK_141451567)
                        );
                        break;
                    case 141451569:
                        actor.wasAbleTo(
                                Click.on(SixCycleInterface.CHECK_141451569)
                        );
                        break;
                    case 141451570:
                        actor.wasAbleTo(
                                Click.on(SixCycleInterface.CHECK_141451570)
                        );
                        break;
                    case 141451573:
                        actor.wasAbleTo(
                                Click.on(SixCycleInterface.CHECK_141451573)
                        );
                        break;
                    case 141451575:
                        actor.wasAbleTo(
                                Click.on(SixCycleInterface.CHECK_141451575)
                        );
                        break;
                    case 141451577:
                        actor.wasAbleTo(
                                Click.on(SixCycleInterface.CHECK_141451577)
                        );
                        break;
                    case 141451578:
                        actor.wasAbleTo(
                                Click.on(SixCycleInterface.CHECK_141451578)
                        );
                        break;
                }

            }
        }

        }
    public static OperationSecondSixCycle on () {
        return instrumented(OperationSecondSixCycle.class);
    }
}