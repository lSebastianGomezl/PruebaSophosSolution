package com.co.sophos.questions.ninecycle;

import com.co.sophos.userinterface.eightcycle.EightCycleInterface;
import com.co.sophos.userinterface.ninecycle.NineCycleInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class NineCycleQuestion {

    public static Question<String> ninetCycleSuccessful(){
        return actor -> TextContent.of(NineCycleInterface.CHANGE_CICLO_TEN).viewedBy(actor).asString();
    }
}
