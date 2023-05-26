package com.co.sophos.questions.tencycle;

import com.co.sophos.userinterface.ninecycle.NineCycleInterface;
import com.co.sophos.userinterface.tencycle.TenCycleInterface;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.TextContent;

public class TenCycleQuestion {

    public static Question<String> ninetCycleSuccessful(){
        return actor -> TextContent.of(TenCycleInterface.CHANGE_CICLO_END).viewedBy(actor).asString();
    }
}
