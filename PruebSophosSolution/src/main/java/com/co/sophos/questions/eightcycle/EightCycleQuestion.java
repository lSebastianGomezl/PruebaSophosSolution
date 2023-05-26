package com.co.sophos.questions.eightcycle;

import com.co.sophos.userinterface.eightcycle.EightCycleInterface;
import com.co.sophos.userinterface.sevencycle.SevenCycleInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class EightCycleQuestion {

    public static Question<String> eightCycleSuccessful(){
        return actor -> TextContent.of(EightCycleInterface.CHANGE_CICLO_NINE).viewedBy(actor).asString();
    }
}
