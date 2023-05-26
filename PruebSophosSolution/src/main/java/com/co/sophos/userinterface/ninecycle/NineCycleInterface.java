package com.co.sophos.userinterface.ninecycle;

import net.serenitybdd.screenplay.targets.Target;

public class NineCycleInterface {

    public static Target CHECK_122 = Target.the("Select de valor de 122")
            .locatedBy("//input[@value=\"122\"]");
    public static Target CHECK_52 = Target.the("Select de valor de 122")
            .locatedBy("//input[@value=\"52\"]");
    public static Target CHECK_186 = Target.the("Select de valor de 122")
            .locatedBy("//input[@value=\"186\"]");
    public static Target CHECK_64 = Target.the("Select de valor de 122")
            .locatedBy("//input[@value=\"64\"]");
    public static Target CHECK_142 = Target.the("Select de valor de 122")
            .locatedBy("//input[@value=\"142\"]");
    public static Target CHECK_160 = Target.the("Select de valor de 122")
            .locatedBy("//input[@value=\"160\"]");
    public static Target CHECK_38 = Target.the("Select de valor de 122")
            .locatedBy("//input[@value=\"38\"]");
    public static Target CHECK_20 = Target.the("Select de valor de 122")
            .locatedBy("//input[@value=\"20\"]");
    public static Target CHECK_176 = Target.the("Select de valor de 122")
            .locatedBy("//input[@value=\"176\"]");
    public static Target CHECK_24 = Target.the("Select de valor de 122")
            .locatedBy("//input[@value=\"24\"]");

    public static Target SELECT_RESULT = Target.the("Select ")
            .locatedBy("//select[@name=\"select\"]");

    public static Target OPTION_3577303 = Target.the("Select de valor de 3577303")
            .locatedBy("//option[@value=\"3577303\"]");


    public static Target INPUT_NUMBER_NINE_CYCLE = Target.the("input para el numero de erizos")
            .locatedBy("//input[@name=\"number\"]");

    public static Target CHANGE_CICLO_TEN = Target.the("Titulo de validacion cambio al tarcer ciclo")
            .locatedBy("//p[contains(text(), \"Se encuentra en el ciclo 10 de 10\")]");
}
