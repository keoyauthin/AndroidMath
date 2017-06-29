package com.imago.mobile.android_maths.functions;

/**
 * Created by 9405943B on 28/06/2017.
 */

public abstract class Loi_Probabilite  {
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

    abstract Double Proba(double k);

    abstract String Proba();

    abstract String Repartition_Function();

    Double Somme_Proba(double k){
        repartition_function = 0;
        for(double i =0 ; i<=k;i++){
            repartition_function += Proba(i);
        }
        return repartition_function;
    }

    Double Factorielle(double n){
        return n <= 1 ? 1 : n * Factorielle(n-1);
    }

    String To_String(Double double_value){
        return String.valueOf(double_value);
    }

}
