package com.co.sophos.questions.firstcycle;

import com.co.sophos.userinterface.testpage.TestPageInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class FirstCycleQuestion {

    public static Question<String> fistCycleSuccessful(){
        return actor -> TextContent.of(TestPageInterface.CHANGE_CICLO_TWO).viewedBy(actor).asString();
    }
}
