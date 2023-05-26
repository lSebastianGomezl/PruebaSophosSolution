package com.co.sophos.questions.sevencycle;

import com.co.sophos.userinterface.sevencycle.SevenCycleInterface;
import com.co.sophos.userinterface.sixcycle.SixCycleInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class SevenCycleQuestion {

    public static Question<String> sevenCycleSuccessful(){
        return actor -> TextContent.of(SevenCycleInterface.CHANGE_CICLO_EIGHT).viewedBy(actor).asString();
    }
}
