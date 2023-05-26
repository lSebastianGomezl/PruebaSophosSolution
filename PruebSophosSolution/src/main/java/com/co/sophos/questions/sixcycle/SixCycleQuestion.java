package com.co.sophos.questions.sixcycle;

import com.co.sophos.userinterface.fivecycle.FiveCycleInterface;
import com.co.sophos.userinterface.sixcycle.SixCycleInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class SixCycleQuestion {

    public static Question<String> sixCycleSuccessful(){
        return actor -> TextContent.of(SixCycleInterface.CHANGE_CICLO_SEVEN).viewedBy(actor).asString();
    }
}
