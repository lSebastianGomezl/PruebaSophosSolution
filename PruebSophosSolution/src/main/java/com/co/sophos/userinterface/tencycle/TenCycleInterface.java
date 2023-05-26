package com.co.sophos.userinterface.tencycle;

import net.serenitybdd.screenplay.targets.Target;

public class TenCycleInterface {

    public static Target CHECK_248407 = Target.the("Select de valor de -248407")
            .locatedBy("//input[@value=\"-248407\"]");

    public static Target SELECT_RESULT = Target.the("Select ")
            .locatedBy("//select[@name=\"select\"]");

    public static Target OPTION_330953 = Target.the("Select de valor de -330953")
            .locatedBy("//option[@value=\"-330953\"]");


    public static Target INPUT_NUMBER_TEN_CYCLE = Target.the("input para el numero de erizos")
            .locatedBy("//input[@name=\"number\"]");

    public static Target CHANGE_CICLO_END = Target.the("Titulo de validacion cambio al tarcer ciclo")
            .locatedBy("//p[contains(text(), \"éxito\")]");
}
