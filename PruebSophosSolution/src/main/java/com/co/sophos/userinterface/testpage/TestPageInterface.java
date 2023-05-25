package com.co.sophos.userinterface.testpage;

import net.serenitybdd.screenplay.targets.Target;

public class TestPageInterface {

    /*-------Localizador respuesta pregunta -----*/

    public static Target VALIDATON_TITLE = Target.the("Titulo de validacion a la pregunta Complete el siguiente formulario")
            .locatedBy("//h1[contains(text(), \"Prueba de automatización\")]");
    public static Target CHANGE_CICLO_TWO = Target.the("Titulo de validacion cambio al segundo ciclo")
            .locatedBy("//p[contains(text(), \"Se encuentra en el ciclo 3 de 10\")]");





    /*---------- Check Box Multiplos de 4 ------------*/

    public static Target CHECKBOX_75 = Target.the("Check box del valor 75")
            .locatedBy("//input[@value=\"75\"]");
    public static Target CHECKBOX_118 = Target.the("Check box del valor 118")
            .locatedBy("//input[@value=\"118\"]");
    public static Target CHECKBOX_148 = Target.the("Check box del valor 148")
            .locatedBy("//input[@value=\"148\"]");
    public static Target CHECKBOX_83 = Target.the("Check box del valor 83")
            .locatedBy("//input[@value=\"83\"]");
    public static Target CHECKBOX_193 = Target.the("Check box del valor 193")
            .locatedBy("//input[@value=\"193\"]");
    public static Target CHECKBOX_28 = Target.the("Check box del valor 28")
            .locatedBy("//input[@value=\"28\"]");
    public static Target CHECKBOX_115 = Target.the("Check box del valor 115")
            .locatedBy("//input[@value=\"115\"]");
    public static Target CHECKBOX_88 = Target.the("Check box del valor 88")
            .locatedBy("//input[@value=\"88\"]");
    public static Target CHECKBOX_182 = Target.the("Check box del valor 182")
            .locatedBy("//input[@value=\"182\"]");
    public static Target CHECKBOX_74 = Target.the("Check box del valor 74")
            .locatedBy("//input[@value=\"74\"]");
    public static Target CHECKBOX_87 = Target.the("Check box del valor 87")
            .locatedBy("//input[@value=\"87\"]");
    public static Target CHECKBOX_135 = Target.the("Check box del valor 135")
            .locatedBy("//input[@value=\"135\"]");

    /* -------------- Localizador de Write Letter R ---------*/

    public static  Target TEXT_AREA = Target.the("Espacio para escribir la cantidad de letras")
            .locatedBy("//textarea[@type=\"text\"]");

    /*--------------- Localizadores fecha correspondiente ---------------*/
    public static  Target INPUT_DATE = Target.the("Input tipo calendario")
            .locatedBy("//input[@type=\"date\"]");




    /*------------ Localizadores de result operation ------*/

    public static Target RESULT_15868 = Target.the("Select de valor de -15868")
                    .locatedBy("//option[@value=\"-15868\"]");
    public static Target RESULT_15835 = Target.the("Select de valor de -15835")
            .locatedBy("//option[@value=\"-15835\"]");
    public static Target RESULT_15834 = Target.the("Select de valor de -15834")
            .locatedBy("//option[@value=\"-15834\"]");
    public static Target RESULT_15832 = Target.the("Select de valor de -15832")
            .locatedBy("//option[@value=\"-15832\"]");
    public static Target RESULT_15862 = Target.the("Select de valor de -15862")
            .locatedBy("//option[@value=\"-15862\"]");
    public static Target RESULT_15859 = Target.the("Select de valor de -15859")
            .locatedBy("//option[@value=\"-15859\"]");
    public static Target RESULT_15858 = Target.the("Select de valor de -15858")
            .locatedBy("//option[@value=\"-15858\"]");
    public static Target RESULT_15855 = Target.the("Select de valor de -15855")
            .locatedBy("//option[@value=\"-15855\"]");
    public static Target RESULT_15853 = Target.the("Select de valor de -15853")
            .locatedBy("//option[@value=\"-15853\"]");
    public static Target RESULT_15852 = Target.the("Select de valor de -15852")
            .locatedBy("//option[@value=\"-15852\"]");
    public static Target RESULT_15851 = Target.the("Select de valor de -15851")
            .locatedBy("//option[@value=\"-15851\"]");
    public static Target RESULT_15847 = Target.the("Select de valor de -15847")
            .locatedBy("//option[@value=\"-15847\"]");

    /*----------------Localizador de boton Enviar-------------------*/

    public static Target BTN_SEND = Target.the("Boton de enviar")
            .locatedBy("//button[@type=\"submit\"]");

}
