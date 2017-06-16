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

    /**
     * Calcule l'espérance d'une variable aléatoire et retourne le résultat.
     *
     * @param n Nombres d'expèriences réalisées
     * @param p Probabilités de succès
     * @return Résultat
     */
    public static double Esperance_Binomiale(double n, double p)
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
    public static double Variance_Binomiale(double esperance, double p)
    {
        return esperance * (1-p);
    }

    /**
     * Calcule l'écart type d'une variable aléatoire et retourne le résultat.
     *
     * @param variance Variance_Binomiale
     * @return Résultat
     */
    public static double Ecart_Binomiale(double variance){
        return Math.sqrt(variance);
    }

    public static double function_Binomiale(double n, double p , double k)
    {
        double resulat =0;

        resulat = Factorielle(n) / (Factorielle(k)*Factorielle(n-k)) * Math.pow(p,k) * Math.pow(1-p,n-k);
        return resulat;
    }

    public static double Function_Binomiale(double n, double p, double k)
    {
        double resultat = 0;

        for(int i = 0; i<=k;i++){
            resultat += function_Binomiale(n,p,i);
        }

        return resultat;
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

