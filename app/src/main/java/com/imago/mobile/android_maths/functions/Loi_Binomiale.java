package com.imago.mobile.android_maths.functions;

/**
 * Created by 9405943B on 28/06/2017.
 */

public class Loi_Binomiale extends Loi_Probabilite {

    double N, P, K, KMIN, KMAX, Esperance, Variance, Ecart_type, Proba, Repartition_Function;

    public Loi_Binomiale(double n, double p, double k, double kMax,double kMin){
        super();

        this.Esperance = esperance;
        this.Variance = variance;
        this.Ecart_type = ecart_type;
        this.Proba = proba;
        this.Repartition_Function = repartition_function;
        this.N=n;
        this.P = p;
        this.K = k;
        this.KMIN = kMin;
        this.KMAX = kMax; 
    }

    public String Esperance(){
        Esperance= N * P;
        return To_String(Round_Double(Esperance,3));
    }

    public String Variance(){
        Variance = Esperance * (1- P);
        return To_String(Round_Double(Variance,3));
    }

    public String Ecart_type(){
        Ecart_type = Math.sqrt(Variance);
        return To_String(Round_Double(Ecart_type,3));
    }

    public Double Proba(double k){
        Proba = Factorielle(N) / (Factorielle(k) * Factorielle(N-k)) * Math.pow(P,k) * Math.pow(1-P,N-k);
        return Proba;
    }

    public String Proba(){
        Proba = Factorielle(N) / (Factorielle(K) * Factorielle(N-K)) * Math.pow(P,K) * Math.pow(1-P,N-K);
        return To_String(Round_Double(Proba,3));
    }

    public String Repartition_Function(){

        Repartition_Function = Somme_Proba(KMAX) - Somme_Proba(KMIN-1);
        return To_String(Round_Double(Repartition_Function,3));
    }

}
