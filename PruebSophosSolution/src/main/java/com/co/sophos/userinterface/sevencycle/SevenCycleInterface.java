package com.co.sophos.userinterface.sevencycle;

import net.serenitybdd.screenplay.targets.Target;

public class SevenCycleInterface {

    public static Target CHECK_407 = Target.the("Select de valor de 407")
            .locatedBy("//input[@value=\"407\"]");

    public static Target CHECK_42 = Target.the("Select de valor de 42")
            .locatedBy("//input[@value=\"42\"]");
    public static Target CHECK_91 = Target.the("Select de valor de 91")
            .locatedBy("//input[@value=\"91\"]");
    public static Target CHECK_98 = Target.the("Select de valor de 98")
            .locatedBy("//input[@value=\"98\"]");

    public static Target CHECK_147 = Target.the("Select de valor de 42")
            .locatedBy("//input[@value=\"147\"]");
    public static Target CHECK_188 = Target.the("Select de valor de 91")
            .locatedBy("//input[@value=\"188\"]");
    public static Target CHECK_182 = Target.the("Select de valor de 98")
            .locatedBy("//input[@value=\"182\"]");

    public static Target INPUT_NUMBER_SEVEN_CYCLE = Target.the("input para el numero de erizos")
            .locatedBy("//input[@name=\"number\"]");

    public static Target CHANGE_CICLO_EIGHT = Target.the("Titulo de validacion cambio al tarcer ciclo")
            .locatedBy("//p[contains(text(), \"Se encuentra en el ciclo 8 de 10\")]");
}
