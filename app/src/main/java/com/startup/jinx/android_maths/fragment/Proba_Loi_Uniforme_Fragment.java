package com.startup.jinx.android_maths.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.startup.jinx.android_maths.R;
import com.startup.jinx.android_maths.utils.Math_Functions;
import com.startup.jinx.android_maths.utils.Math_Utils;

/**
 * Created by Mégane Vilain on 18/04/2017.
 * Project Utils-Math
 */


/**
 * Instanticie le fragment.
 */
public class Proba_Loi_Uniforme_Fragment extends Fragment {

    /**
     * Valeur de l'espérance.
     */
    TextView textView_esperance, /**
     * Valeur de la variance.
     */
    textView_variance, /**
     * Résulat de la fonction de probabilité.
     */
    textView_proba;

    /**
     * Nombre de valeurs possible.
     */
    EditText editText_n, /**
     * Valuer minimal de l'interval.
     */
    editText_a, /**
     * Valeur maximal de l'interval.
     */
    editText_b;

    /**
     * Boutton pour calculer la loi uniforme discrète.
     */
    Button btn_discrete, /**
     * Boutton pour calculer la loi uniforme continue.
     */
    btn_continue;

    /**
     * Instantiates a new Proba loi uniforme fragment.
     */
    public Proba_Loi_Uniforme_Fragment(){
        //Required empty public constructor
    }

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){

        final View view = inflater.inflate(R.layout.proba_loi_uniforme_fragment,container,false);

        textView_esperance = (TextView) view.findViewById(R.id.textView_esperance_data);
        textView_variance = (TextView) view.findViewById(R.id.textView_variance_data);
        textView_proba = (TextView) view.findViewById(R.id.textView_proba_data);

        btn_continue = (Button) view.findViewById(R.id.btn_continue);
        btn_discrete = (Button) view.findViewById(R.id.btn_discrete);

        editText_n = (EditText) view.findViewById(R.id.editText_n);
        editText_a = (EditText) view.findViewById(R.id.editText_a);
        editText_b = (EditText) view.findViewById(R.id.editText_b);

        btn_continue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Loi_Continue();
                Math_Utils.hideKeyboard(getContext(),view);
            }
        });

        btn_discrete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Loi_discrete();
                Math_Utils.hideKeyboard(getContext(),view);
            }
        });


        return view;
    }

    @Override
    public void onDetach(){
        super.onDetach();
    }

    /**
     * Calcul de la loi discrète.
     */
    public void Loi_discrete(){

        double n=0, esperance =0, variance =0, proba=0;
        boolean cancel = false;

        try{
            n = Double.parseDouble(editText_n.getText().toString());
        }catch (Exception e){
            editText_n.setError(getString(R.string.error_input));
            cancel = true;
        }
        if(cancel != true){
            esperance = (n+1)/2;
            variance = (Math.pow(n,2)-1)/12;
            proba = 1/n;

            textView_esperance.setText(String.valueOf(Math_Functions.Round_Double(esperance,3)));
            textView_variance.setText(String.valueOf(Math_Functions.Round_Double(variance,3)));
            textView_proba.setText(String.valueOf(Math_Functions.Round_Double(proba,3)));
        }

    }

    /**
     * Calcul de la loi continue
     */
    public void Loi_Continue(){

        double a=0, b=0, esperance =0, variance =0, proba=0;
        boolean cancel = false;

        try {
            a = Double.parseDouble(editText_a.getText().toString());
        }catch (Exception e){
            editText_a.setError(getString(R.string.error_input));
        }
        if(cancel != true ){
            try {
                b = Double.parseDouble(editText_b.getText().toString());
            }catch (Exception e){
                editText_b.setError(getString(R.string.error_input));
            }
        }
        if (!Math_Functions.Check_Interval(a,b)){
            editText_a.setError(getString(R.string.proba_interval_error));
            editText_b.setError(getString(R.string.proba_interval_error));
            cancel = true;
        }
        if(cancel != true){

            esperance = (a+b) /2;
            variance = ((Math.pow(b-a,2)-1)/12);
            proba = (1/(b-a));

            textView_esperance.setText(String.valueOf(Math_Functions.Round_Double(esperance,3)));
            textView_variance.setText(String.valueOf(Math_Functions.Round_Double(variance,3)));
            textView_proba.setText(String.valueOf(Math_Functions.Round_Double(proba,3)));
        }
    }
}
