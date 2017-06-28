package com.imago.mobile.android_maths.functions;

/**
 * Created by 9405943B on 28/06/2017.
 */

public abstract class Math_Functions {

    /**
     * Arrondit un nombre et reourne le résulat.
     *
     * @param number  Nombre à arrondir
     * @param nbapVig Nombres de chiffres après la virgule
     * @return Résultat
     */
    double Round_Double(double number, double nbapVig)
    {
        return(double)((int)(number * Math.pow(10,nbapVig) + .5)) / Math.pow(10,nbapVig);
    }
}
