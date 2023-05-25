package com.co.sophos.questions.threecycle;

import com.co.sophos.userinterface.testpage.TestPageInterface;
import com.co.sophos.userinterface.threecycle.ThreeCycleInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class ThreeCycleQuestion {

    public static Question<String> threeCycleSuccessful(){
        return actor -> TextContent.of(ThreeCycleInterface.CHANGE_CICLO_FOUR).viewedBy(actor).asString();
    }
}
