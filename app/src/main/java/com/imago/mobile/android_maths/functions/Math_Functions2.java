package com.imago.mobile.android_maths.functions;

/**
 * Created by Mégane Vilain on 05/05/2017.
 * Project Utils-Math
 * Classe contenant des calculs mathématiques
 * @author Mégane Vilain
 */
public class Math_Functions2 {
    /**
     * Calcule le discrimant et renvoie le résultat
     *
     * @param a  a
     * @param b  b
     * @param c  c
     * @return Résulats
     */
    public static double Delta_Second_Ordre(double a, double b, double c){

        return (b*b) - (4*a*c);
    }

    /**
     * Calcule le factorielle d'un nombre et retourne le résultat.
     *
     * @param n nombre
     * @return Résulat
     */
    public static double Factorielle(double n){

        return n <= 1 ? 1 : n * Factorielle(n-1);
    }

    public static double Ecart_Poisson(double lambda){
        return  Math.sqrt(lambda);
    }

    public static double function_Poisson(double lambda, double k){
        double resultat =0;

        resultat = Math.exp(lambda*-1) * Math.pow(lambda,k) / Factorielle(k);

        return resultat;
    }

    public static double Function_Poisson(double lambda, double k){
        double resultat = 0;

        for(int i = 0; i<=k;i++){
            resultat += function_Poisson(lambda,i);
        }

        return resultat;
    }

    /**
     * Vérifie que le minimum de l'interval saisi est inférieur à la valeur maximum.
     *
     * @param kMin the k min
     * @param kMax the k max
     * @return the boolean
     */
    public static boolean Check_Interval(double kMin, double kMax){

        if(kMin < kMax){
            return true;
        }
        else
        {
            return false;
        }

    }
    /**
     * Arrondit un nombre et reourne le résulat.
     *
     * @param number  Nombre à arrondir
     * @param nbapVig Nombres de chiffres après la virgule
     * @return Résultat
     */
    public static double Round_Double(double number, double nbapVig)
    {
        return(double)((int)(number * Math.pow(10,nbapVig) + .5)) / Math.pow(10,nbapVig);
    }
}

