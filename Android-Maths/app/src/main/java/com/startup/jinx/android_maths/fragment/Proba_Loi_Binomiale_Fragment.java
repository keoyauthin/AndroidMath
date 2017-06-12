package com.startup.jinx.android_maths.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
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

public class Proba_Loi_Binomiale_Fragment extends Fragment {

    EditText editText_n;
    EditText editText_p;
    EditText editText_k;
    EditText editText_kMin;
    EditText editText_kMax;


    TextView textView_function_Binomiale_resulat;
    TextView textView_variance;
    TextView textView_esperance;
    TextView textView_ecarttype;
    TextView textView_fuction_repartition_resulat;

    Button btnCalcul;

    /**
     * Instanticie le fragment.
     */
    public Proba_Loi_Binomiale_Fragment(){
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        final View view = inflater.inflate(R.layout.proba_loi_binomiale_fragment,container,false);

        //Initialisation des différents composants

        editText_n = (EditText) view.findViewById(R.id.editText_n);
        editText_p = (EditText) view.findViewById(R.id.editText_p);
        editText_k = (EditText) view.findViewById(R.id.editText_k);
        editText_kMin = (EditText) view.findViewById(R.id.editText_kMin);
        editText_kMax = (EditText) view.findViewById(R.id.editText_kMax);

        textView_function_Binomiale_resulat = (TextView) view.findViewById(R.id.textView_function_Binomiale_resulat);
        textView_esperance = (TextView) view.findViewById(R.id.textView_esperance_resultat);
        textView_variance = (TextView) view.findViewById(R.id.textView_variance_resultat);
        textView_ecarttype = (TextView) view.findViewById(R.id.textView_ecarttype_resultat);
        textView_fuction_repartition_resulat = (TextView) view.findViewById(R.id.textView_function_repartition_resulat);

        editText_kMax.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                Math_Utils.hideKeyboard(getContext(),view);
                Check_Values();
                return true;
            }
        });

        btnCalcul = (Button) view.findViewById(R.id.btnCalcul);

        btnCalcul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Math_Utils.hideKeyboard(getContext(),view);
                Check_Values();
            }
        });


        return view;
    }

    @Override
    public void onDetach(){
        super.onDetach();
    }

    private void Check_Values()
    {
        double n =0 ,p = 0,k = 0, kMin = 0, kMax =0 ;
        boolean cancel = false;

        try{
            n = Double.parseDouble(editText_n.getText().toString());
        } catch (Exception e){
            editText_n.setError(getString(R.string.polynome_activity_edittext_error));
            cancel = true;
        }

        try{
            p = Double.parseDouble(editText_p.getText().toString());
        } catch (Exception e){
            editText_p.setError(getString(R.string.polynome_activity_edittext_error));
            cancel = true;
        }

        try{
            k = Double.parseDouble(editText_k.getText().toString());
        } catch (Exception e){
            editText_k.setError(getString(R.string.polynome_activity_edittext_error));
            cancel = true;
        }

        try{
            kMin = Double.parseDouble(editText_kMin.getText().toString());
        } catch (Exception e){
            editText_kMin.setError(getString(R.string.polynome_activity_edittext_error));
            cancel = true;
        }

        try{
            kMax = Double.parseDouble(editText_kMax.getText().toString());
        } catch (Exception e){
            editText_kMax.setError(getString(R.string.polynome_activity_edittext_error));
            cancel = true;
        }
        if(cancel != true){
            Function_Binomiale(n,p,k, kMin,kMax);
        }

    }

    private void Function_Binomiale(double n, double p, double k , double kMin, double kMax)
    {
        double esperance, variance, ecarttype, fonction_repartition;

        esperance = Math_Functions.Esperance_Binomiale(n,p);
        variance = Math_Functions.Variance_Binomiale(esperance,p);
        ecarttype = Math_Functions.Ecart_Binomiale(variance);
        fonction_repartition = Math_Functions.Function_Binomiale(n,p,kMax) - Math_Functions.Function_Binomiale(n,p,kMin-1);

        textView_esperance.setText(String.valueOf(Math_Functions.Round_Double(esperance,3)));
        textView_variance.setText(String.valueOf(Math_Functions.Round_Double(variance,3)));
        textView_ecarttype.setText(String.valueOf(Math_Functions.Round_Double(ecarttype,3)));
        textView_function_Binomiale_resulat.setText(String.valueOf(Math_Functions.Round_Double(Math_Functions.function_Binomiale(n,p,k),3)));
        textView_fuction_repartition_resulat.setText(String.valueOf(Math_Functions.Round_Double(fonction_repartition,3)));

    }

}