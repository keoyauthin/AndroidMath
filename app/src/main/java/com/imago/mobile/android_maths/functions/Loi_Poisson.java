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
        this.LAMBDA=lambda;
        this.K = k;
        this.KMIN = kMin;
        this.KMAX = kMax;
    }

    public String Esperance(){
        return To_String(Round_Double(Esperance,3));
    }

    public String Variance(){
        return To_String(Round_Double(Variance,3));
    }

    public String Ecart_type(){
        Ecart_type = Math.sqrt(Variance);
        //TODO: Vérifier formule
        return  To_String(Round_Double(Ecart_type,3));
    }

    public String Proba(){

    }

    public Double Somme_Proba(double k){

    }

    public String Repartition_Function(){

    }
}
