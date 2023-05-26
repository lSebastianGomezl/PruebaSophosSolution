package com.co.sophos.userinterface.eightcycle;

import net.serenitybdd.screenplay.targets.Target;

public class EightCycleInterface {

    public static Target CHECK_14 = Target.the("Select de valor de 14")
            .locatedBy("//input[@value=\"14\"]");
    public static Target SELECT_RESULT = Target.the("Select ")
            .locatedBy("//select[@name=\"select\"]");

    public static Target OPTION_4202016136 = Target.the("Select de valor de 210933315")
            .locatedBy("//option[@value=\"4202016136\"]");


    public static Target INPUT_NUMBER_EIGHT_CYCLE = Target.the("input para el numero de erizos")
            .locatedBy("//input[@name=\"number\"]");

    public static Target CHANGE_CICLO_NINE = Target.the("Titulo de validacion cambio al tarcer ciclo")
            .locatedBy("//p[contains(text(), \"Se encuentra en el ciclo 9 de 10\")]");
}
