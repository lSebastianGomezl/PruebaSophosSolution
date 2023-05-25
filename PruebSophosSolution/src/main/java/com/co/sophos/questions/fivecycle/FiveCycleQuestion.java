package com.co.sophos.questions.fivecycle;

import com.co.sophos.userinterface.fivecycle.FiveCycleInterface;
import com.co.sophos.userinterface.fourcycle.FourCycleInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class FiveCycleQuestion {

    public static Question<String> fiveCycleSuccessful(){
        return actor -> TextContent.of(FiveCycleInterface.CHANGE_CICLO_SIX).viewedBy(actor).asString();
    }
}
