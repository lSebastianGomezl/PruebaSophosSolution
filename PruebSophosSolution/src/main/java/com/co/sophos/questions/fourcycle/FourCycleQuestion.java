package com.co.sophos.questions.fourcycle;

import com.co.sophos.userinterface.fourcycle.FourCycleInterface;
import com.co.sophos.userinterface.threecycle.ThreeCycleInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class FourCycleQuestion {

    public static Question<String> fourCycleSuccessful(){
        return actor -> TextContent.of(FourCycleInterface.CHANGE_CICLO_FIVE).viewedBy(actor).asString();
    }
}
