package com.co.sophos.userinterface.secondcycle;

import net.serenitybdd.screenplay.targets.Target;

public class SecondCycleInterface {
    /*-------TITLE VALIDATION -------------*/
    public static Target CHANGE_CICLO_THREE = Target.the("Titulo de validacion cambio al tarcer ciclo")
            .locatedBy("//p[contains(text(), \"Se encuentra en el ciclo 3 de 10\")]");

    /*-------------Localizadores Date ----------------*/

    public static Target INPUT_DATE_TWO_CYCLE = Target.the("input de fecha segundo ciclo")
            .locatedBy("//input[@type=\"date\"]");

    public static Target TEXT_AREA_TWO_CYCLE = Target.the("text area para escribir letras")
            .locatedBy("//textarea[@type=\"text\"]");

    public static Target INPUT_NUMBER_TWO_CYCLE = Target.the("input para el numero de animales")
            .locatedBy("//input[@name=\"number\"]");

    /*---------- Check Box Multiplos de  7 ------------*/

    public static Target CHECKBOX_176 = Target.the("Check box del valor 176")
            .locatedBy("//input[@value=\"176\"]");
    public static Target CHECKBOX_40 = Target.the("Check box del valor 40")
            .locatedBy("//input[@value=\"40\"]");
    public static Target CHECKBOX_130 = Target.the("Check box del valor 130")
            .locatedBy("//input[@value=\"130\"]");
    public static Target CHECKBOX_166 = Target.the("Check box del valor 166")
            .locatedBy("//input[@value=\"166\"]");
    public static Target CHECKBOX_88 = Target.the("Check box del valor 88")
            .locatedBy("//input[@value=\"88\"]");
    public static Target CHECKBOX_189= Target.the("Check box del valor 189")
            .locatedBy("//input[@value=\"189\"]");
    public static Target CHECKBOX_193 = Target.the("Check box del valor 193")
            .locatedBy("//input[@value=\"193\"]");
    public static Target CHECKBOX_195 = Target.the("Check box del valor 195")
            .locatedBy("//input[@value=\"195\"]");
    public static Target CHECKBOX_62 = Target.the("Check box del valor 62")
            .locatedBy("//input[@value=\"62\"]");
    public static Target CHECKBOX_10 = Target.the("Check box del valor 10")
            .locatedBy("//input[@value=\"10\"]");
    public static Target CHECKBOX_18 = Target.the("Check box del valor 18")
            .locatedBy("//input[@value=\"18\"]");
    public static Target CHECKBOX_105 = Target.the("Check box del valor 105")
            .locatedBy("//input[@value=\"105\"]");
    public static Target CHECKBOX_72 = Target.the("Check box del valor 72")
            .locatedBy("//input[@value=\"72\"]");

    /*------------------ Localizador Scroll ------*/

    public static Target SCROLL= Target.the("Scroll uno")
            .locatedBy("//p[contains(text(), \"¿Cuál de estos números es múltiplo de 7?\")]");


}
