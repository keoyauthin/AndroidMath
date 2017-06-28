package com.imago.mobile.android_maths.functions;

/**
 * Created by 9405943B on 28/06/2017.
 */

public abstract class Loi_Probabilite extends Math_Functions {
    double esperance, variance, ecart_type,proba, repartition_function;
    Loi_Probabilite(){

        esperance = 0;
        variance = 0;
        ecart_type = 0;
        proba = 0;
        repartition_function = 0;
    }

    abstract String Esperance();

    abstract String Variance();

    abstract String Ecart_type();

    abstract String Proba();

    abstract Double Somme_Proba(double k);

    abstract String Repartition_Function();

    Double Factorielle(double n){
        return n <= 1 ? 1 : n * Factorielle(n-1);
    }

    String To_String(double double_value){
        return String.valueOf(double_value);
    }

}
