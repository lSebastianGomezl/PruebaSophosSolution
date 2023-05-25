package com.co.sophos.questions.secondcycle;

import com.co.sophos.userinterface.testpage.TestPageInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class SecondCycleQuestion {

    public static Question<String> secondCycleSuccessful(){
        return actor -> TextContent.of(TestPageInterface.CHANGE_CICLO_TWO).viewedBy(actor).asString();
    }
}
