package com.co.sophos.userinterface.fourcycle;

import net.serenitybdd.screenplay.targets.Target;

public class FourCycleInterface {

    public static Target INPUT_NUMBER_FOUR_CYCLE = Target.the("input para el numero de cuadros")
            .locatedBy("//input[@name=\"number\"]");

    public static Target CHANGE_CICLO_FIVE = Target.the("Titulo de validacion cambio al tarcer ciclo")
            .locatedBy("//p[contains(text(), \"Se encuentra en el ciclo 5 de 10\")]");


    /*------------ Localizadores de result operation 2 ------*/

    public static Target SELECT_RESULT = Target.the("Select ")
            .locatedBy("//select[@name=\"select\"]");
    public static Target RESULT_1610 = Target.the("Select de valor de -1610")
            .locatedBy("//option[@value=\"-1610\"]");



    public static Target CHECK_116 = Target.the("Select de valor de 116")
            .locatedBy("//input[@value=\"116\"]");
    public static Target CHECK_101 = Target.the("Select de valor de 101")
            .locatedBy("//input[@value=\"101\"]");
    public static Target CHECK_66 = Target.the("Select de valor de 66")
            .locatedBy("//input[@value=\"66\"]");
    public static Target CHECK_196 = Target.the("Select de valor de 196")
            .locatedBy("//input[@value=\"196\"]");
    public static Target CHECK_49 = Target.the("Select de valor de 49")
            .locatedBy("//input[@value=\"49\"]");
    public static Target CHECK_46 = Target.the("Select de valor de 46")
            .locatedBy("//input[@value=\"46\"]");
    public static Target CHECK_110 = Target.the("Select de valor de 110")
            .locatedBy("//input[@value=\"110\"]");
    public static Target CHECK_178 = Target.the("Select de valor de 178")
            .locatedBy("//input[@value=\"178\"]");
    public static Target CHECK_122 = Target.the("Select de valor de 122")
            .locatedBy("//input[@value=\"122\"]");




}