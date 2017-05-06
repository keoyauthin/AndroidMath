package com.startup.jinx.android_maths.utils;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * Created by Mégane Vilain on 05/05/2017.
 * Project Utils-Math
 * Classe contenant des calculs mathématiques
 * @author Mégane Vilain
 */
public class Math_Functions {
    /**
     * Calcule le discrimant et renvoie le résultat
     *
     * @param a  a
     * @param b  b
     * @param c  c
     * @return Résulats
     */
    public static double Delta(double a,double b,double c){

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

    /**
     * Calcule l'espérance d'une variable aléatoire et retourne le résultat.
     *
     * @param n Nombres d'expèriences réalisées
     * @param p Probabilités de succès
     * @return Résultat
     */
    public static double Esperance(double n, double p)
    {
        return n*p;
    }

    /**
     * Calcul la variance d'une variable aléatoire et retourne le résultat.
     *
     * @param esperance L'espérance
     * @param p         Probabilités de succès
     * @return Résulat
     */
    public static double Variance(double esperance, double p)
    {
        return esperance * (1-p);
    }

    /**
     * Calcule l'écart type d'une variable aléatoire et retourne le résultat.
     *
     * @param variance Variance
     * @return Résultat
     */
    public static double Ecart(double variance){
        return Math.sqrt(variance);
    }

    /**
     * Arrondit un nombre et reourne le résulat.
     *
     * @param number  Nombre à arrondir
     * @param nbapVig Nombres de chiffres après la virgule
     * @return Résultat
     */
    public static double Round_Doucle(double number, double nbapVig)
    {
        return(double)((int)(number * Math.pow(10,nbapVig) + .5)) / Math.pow(10,nbapVig);
    }
}

