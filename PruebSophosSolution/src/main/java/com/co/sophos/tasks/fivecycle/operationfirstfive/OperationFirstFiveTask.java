package com.co.sophos.tasks.fivecycle.operationfirstfive;

import com.co.sophos.userinterface.fivecycle.FiveCycleInterface;
import com.co.sophos.userinterface.fourcycle.FourCycleInterface;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.util.ArrayList;
import java.util.List;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OperationFirstFiveTask implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        int operation = 183*34*198*171+107+174-210+288*86;
        System.out.println(operation);

        List<Integer> multiplesFour = new ArrayList<>();

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(210689295);
        numbers.add(210689296);
        numbers.add(210689298);
        numbers.add(210689299);
        numbers.add(210689301);
        numbers.add(210689303);
        numbers.add(210689304);
        numbers.add(210689309);
        numbers.add(210689310);
        numbers.add(210689312);
        numbers.add(210689313);
        numbers.add(210689314);
        numbers.add(210689315);
        numbers.add(210689316);
        numbers.add(210689317);
        numbers.add(210689318);
        numbers.add(210689323);
        numbers.add(210689325);
        numbers.add(210689326);
        numbers.add(210689327);
        numbers.add(210689328);
        numbers.add(210689330);
        numbers.add(210689332);
        numbers.add(210689334);


        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i).equals(operation)) {
                switch (operation) {

                    case 210689315:
                        actor.wasAbleTo(
                                Click.on(FiveCycleInterface.OPTION_210689315)
                        );
                        break;
                    case 210689295:
                        actor.wasAbleTo(
                                Click.on(FiveCycleInterface.OPTION_210689295)
                        );
                        break;
                    case 210689296:
                        actor.wasAbleTo(
                                Click.on(FiveCycleInterface.OPTION_210689296)
                        );
                        break;
                    case 210689298:
                        actor.wasAbleTo(
                                Click.on(FiveCycleInterface.OPTION_210689298)
                        );
                        break;
                    case 210689299:
                        actor.wasAbleTo(
                                Click.on(FiveCycleInterface.OPTION_210689299)
                        );
                        break;
                    case 210689301:
                        actor.wasAbleTo(
                                Click.on(FiveCycleInterface.OPTION_210689301)
                        );
                        break;
                    case 210689303:
                        actor.wasAbleTo(
                                Click.on(FiveCycleInterface.OPTION_210689303)
                        );
                        break;
                    case 210689304:
                        actor.wasAbleTo(
                                Click.on(FiveCycleInterface.OPTION_210689304)
                        );
                        break;
                    case 210689309:
                        actor.wasAbleTo(
                                Click.on(FiveCycleInterface.OPTION_210689309)
                        );
                        break;
                    case 210689310:
                        actor.wasAbleTo(
                                Click.on(FiveCycleInterface.OPTION_210689310)
                        );
                        break;
                    case 210689312:
                        actor.wasAbleTo(
                                Click.on(FiveCycleInterface.OPTION_210689312)
                        );
                        break;
                    case 210689313:
                        actor.wasAbleTo(
                                Click.on(FiveCycleInterface.OPTION_210689313)
                        );
                        break;
                    case 210689314:
                        actor.wasAbleTo(
                                Click.on(FiveCycleInterface.OPTION_210689314)
                        );
                        break;
                    case 210689316:
                        actor.wasAbleTo(
                                Click.on(FiveCycleInterface.OPTION_210689316)
                        );
                        break;
                    case 210689317:
                        actor.wasAbleTo(
                                Click.on(FiveCycleInterface.OPTION_210689317)
                        );
                        break;
                    case 210689318:
                        actor.wasAbleTo(
                                Click.on(FiveCycleInterface.OPTION_210689318)
                        );
                        break;
                    case 210689323:
                        actor.wasAbleTo(
                                Click.on(FiveCycleInterface.OPTION_210689323)
                        );
                        break;
                    case 210689325:
                        actor.wasAbleTo(
                                Click.on(FiveCycleInterface.OPTION_210689325)
                        );
                        break;
                    case 210689326:
                        actor.wasAbleTo(
                                Click.on(FiveCycleInterface.OPTION_210689326)
                        );
                        break;
                    case 210689327:
                        actor.wasAbleTo(
                                Click.on(FiveCycleInterface.OPTION_210689327)
                        );
                        break;
                    case 210689328:
                        actor.wasAbleTo(
                                Click.on(FiveCycleInterface.OPTION_210689328)
                        );
                        break;
                    case 210689330:
                        actor.wasAbleTo(
                                Click.on(FiveCycleInterface.OPTION_210689330)
                        );
                        break;
                    case 210689332:
                        actor.wasAbleTo(
                                Click.on(FiveCycleInterface.OPTION_210689332)
                        );
                        break;
                    case 210689334:
                        actor.wasAbleTo(
                                Click.on(FiveCycleInterface.OPTION_210689334)
                        );
                        break;
                }
            }
        }
    }
    public static OperationFirstFiveTask on(){
        return instrumented(OperationFirstFiveTask.class);
    }
}
