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

public class Proba_Loi_Poisson_Fragment extends Fragment {

    EditText editText_lambda;
    EditText editText_k;
    EditText editText_kMin;
    EditText editText_kMax;

    TextView textView_esperance;
    TextView textView_variance;
    TextView textView_ecarttype;
    TextView textView_function_Poisson_resulat;
    TextView textView_function_repartition_resulat;

    Button btnCalcul;

    /**
     * Instanticie le fragment.
     */
    public Proba_Loi_Poisson_Fragment(){
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

        final View view = inflater.inflate(R.layout.proba_loi_poisson_fragment,container,false);

        editText_lambda = (EditText) view.findViewById(R.id.editText_lambda);
        editText_k = (EditText) view.findViewById(R.id.editText_k);
        editText_kMin = (EditText) view.findViewById(R.id.editText_kMin);
        editText_kMax = (EditText) view.findViewById(R.id.editText_kMax);

        textView_esperance = (TextView) view.findViewById(R.id.textView_esperance_resultat);
        textView_variance = (TextView) view.findViewById(R.id.textView_variance_resultat);
        textView_ecarttype = (TextView) view.findViewById(R.id.textView_ecarttype_resultat);
        textView_function_Poisson_resulat = (TextView) view.findViewById(R.id.textView_function_Binomiale_resulat);
        textView_function_repartition_resulat = (TextView) view.findViewById(R.id.textView_function_repartion_resulat);

        btnCalcul = (Button) view.findViewById(R.id.btnCalcul);

        editText_kMax.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                Math_Utils.hideKeyboard(getContext(),view);
                Check_Values();
                return true;
            }
        });

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

    private void Check_Values(){
        double lambda = 0 , k =0 ,  kMin = 0 ,  kMax = 0;
        boolean cancel = false;

        try{
            lambda = Double.parseDouble(editText_lambda.getText().toString());
        } catch (Exception e){
            editText_lambda.setError(getString(R.string.polynome_activity_edittext_error));
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
            Function_Poisson(lambda,k, kMin,kMax);
        }

    }

    private void Function_Poisson(double lambda, double k, double kMin, double kMax){

        double fonction_repartition;

        fonction_repartition = Math_Functions.Function_Poisson(lambda,kMax) - Math_Functions.Function_Poisson(lambda,kMin-1);

        textView_esperance.setText(String.valueOf(lambda));
        textView_variance.setText(String.valueOf(lambda));
        textView_ecarttype.setText(String.valueOf(Math_Functions.Round_Double(Math_Functions.Ecart_Poisson(lambda),3)));

        textView_function_Poisson_resulat.setText(String.valueOf(Math_Functions.Round_Double(Math_Functions.function_Poisson(lambda,k),3)));
        textView_function_repartition_resulat.setText(String.valueOf(Math_Functions.Round_Double(fonction_repartition,3)));
    }
}
