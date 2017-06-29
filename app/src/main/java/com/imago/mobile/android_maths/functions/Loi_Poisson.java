package com.imago.mobile.android_maths.functions;

/**
 * Created by 9405943B on 28/06/2017.
 */

public class Loi_Poisson extends Loi_Probabilite {

    double LAMBDA, K, KMIN, KMAX, Esperance, Variance, Ecart_type, Proba, Repartition_Function;

    public Loi_Poisson(double lambda, double k, double kMin, double kMax){
        super();
        this.Esperance = lambda;
        this.Variance = lambda;
        this.Ecart_type = ecart_type;
        this.Proba = proba;
        this.Repartition_Function = repartition_function;
        this.LAMBDA = lambda;
        this.K = k;
        this.KMIN = kMin;
        this.KMAX = kMax;
    }

    public String Esperance(){
        return To_String(Math_Utils.Round_Double(Esperance,3));
    }

    public String Variance(){
        return To_String(Math_Utils.Round_Double(Variance,3));
    }

    public String Ecart_type(){
        Ecart_type = Math.sqrt(Variance);
        return  To_String(Math_Utils.Round_Double(Ecart_type,3));
    }

    public Double Proba(double k){
        Proba = Math.exp(LAMBDA*-1) * Math.pow(LAMBDA,k) / Factorielle(k);
        return Proba;
    }

    public String Proba(){
        Proba = Math.exp(LAMBDA*-1) * Math.pow(LAMBDA,K) / Factorielle(K);
        return To_String(Math_Utils.Round_Double(Proba,3));
    }

    public String Repartition_Function(){
        Repartition_Function = Somme_Proba(KMAX) - Somme_Proba(KMIN-1);
        return To_String(Math_Utils.Round_Double(Repartition_Function,3));
    }
}
