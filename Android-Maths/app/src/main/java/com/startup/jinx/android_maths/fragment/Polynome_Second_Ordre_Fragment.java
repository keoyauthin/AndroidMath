package com.startup.jinx.android_maths.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;

import com.startup.jinx.android_maths.R;
import com.startup.jinx.android_maths.utils.Math_Functions;
import com.startup.jinx.android_maths.utils.Math_Utils;


/**
 * Created by Mégane Vilain on 18/04/2017.
 * Project Utils-Math
 */
public class Polynome_Second_Ordre_Fragment extends Fragment {

    /**
     * Spinner signe opératoire
     */
    Spinner spinner;
    /**
     * Spinner signe opératoire.
     */
    Spinner spinner2;
    /**
     * Boutton Calcul.
     */
    Button Calculbtn;
    /**
     * Valeur de a.
     */
    EditText Edit_a, /**
     * Valeur de b.
     */
    Edit_b, /**
     * Valeur de c.
     */
    Edit_c;
    /**
     * Racine X1.
     */
    TextView resulat_X1, /**
     * Racine X2.
     */
    resultat_X2, /**
     * Opération pour calculer Delta_Second_Ordre.
     */
    delta_ope, /**
     * Discrimant.
     */
    delta_resultat, /**
     * Polynome factorisé.
     */
    factorisation_resultat;
    /**
     * Linear layout delta.
     */
    LinearLayout linearLayoutDelta, /**
     * The Linear layout resultats.
     */
    linearLayoutResultats, /**
     * Polynome second ordre factorisation.
     */
    linearLayoutFactorisation;

    /**
     * Instanticie le fragment.
     */
    public Polynome_Second_Ordre_Fragment(){
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
    {
        final View view = inflater.inflate(R.layout.polynome_second_ordre_fragment,container,false);

        //Initialisation des différents composants

        spinner = (Spinner) view.findViewById(R.id.polynome_activity_spinner);
        spinner2 = (Spinner) view.findViewById(R.id.polynome_activity_spinner2);

        Calculbtn = (Button) view.findViewById(R.id.polynome_activity_Calcul_btn);

        Edit_a = (EditText) view.findViewById(R.id.polynome_second_ordre_a);
        Edit_b = (EditText) view.findViewById(R.id.polynome_second_ordre_b);
        Edit_c = (EditText) view.findViewById(R.id.polynome_second_ordre_c);

        resulat_X1 = (TextView) view.findViewById(R.id.polynome_second_ordre_resultat_X1);
        resultat_X2 = (TextView) view.findViewById(R.id.polynome_second_ordre_resultat_X2);
        resultat_X2 = (TextView) view.findViewById(R.id.polynome_second_ordre_resultat_X2);
        delta_ope = (TextView) view.findViewById(R.id.polynome_second_ordre_delta_ope);
        delta_resultat = (TextView) view.findViewById(R.id.polynome_second_ordre_delta_resultat);
        factorisation_resultat = (TextView) view.findViewById(R.id.polynome_second_ordre_factorisation_resultat);


        linearLayoutDelta = (LinearLayout) view.findViewById(R.id.polynome_second_ordre_delta);
        linearLayoutResultats = (LinearLayout) view.findViewById(R.id.polynome_second_ordre_resultats);
        linearLayoutFactorisation = (LinearLayout) view.findViewById(R.id.polynome_second_ordre_factorisation);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this.getContext(),R.array.signe_operatoire_spinner,android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner.setAdapter(adapter);
        spinner2.setAdapter(adapter);

        //Execute la fonction de calcul en cas de validation de l'utilisateur
        Edit_c.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                Math_Utils.hideKeyboard(getContext(),view);
                Check_Values();
                return true;
            }
        });
        //Execute la fonction de calcul en cas d'appui sur le bouton
        Calculbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Math_Utils.hideKeyboard(getContext(),view);
                Check_Values();
            }
        });

        return  view;
    }

    @Override
    public void onDetach(){
        super.onDetach();
    }

    /**
     * Vérifie les valeurs saisies par l'utilisateur.
     *
     */
    public void Check_Values()
    {
        double a =1;
        double b =1;
        double c =1;

        try {
            if (!Edit_a.getText().toString().isEmpty()) {
                a = Double.parseDouble(Edit_a.getText().toString());
            }
        } catch (Exception e){
            Edit_a.setError(getString(R.string.polynome_activity_edittext_error));
        }

        try{
            if (!Edit_b.getText().toString().isEmpty()) {
                b = Double.parseDouble(Edit_b.getText().toString());
            }
        } catch (Exception e){
            Edit_b.setError(getString(R.string.polynome_activity_edittext_error));
        }

        try {
            if (!Edit_c.getText().toString().isEmpty()) {
                c = Double.parseDouble(Edit_c.getText().toString());
            }
        } catch (Exception e){
            Edit_c.setError(getString(R.string.polynome_activity_edittext_error));
        }

        //Changement de signe si le signe opératoire est négatif
        if(spinner.getSelectedItem().toString().equals("-")){
            b= b*-1;
        }

        if (spinner2.getSelectedItem().toString().equals("-")){
            c = c*-1;
        }

        Polynome_Second_Degre(a,b,c);
    }

    /**
     * Résolution du polynome de second degré.
     *
     * @param a a
     * @param b b
     * @param c c
     */
    public void Polynome_Second_Degre(double a , double b, double c)
    {
        double X1,X2, delta;

        linearLayoutDelta.setVisibility(View.GONE);
        linearLayoutResultats.setVisibility(View.VISIBLE);
        linearLayoutFactorisation.setVisibility(View.VISIBLE);

        if(a==0){
            X1 = (a-c) /b;
            //TODO: Ajouter String + paramètres
            resulat_X1.setText("X1 = " + String.valueOf(Math_Functions.Round_Double(X1,3)));
        }else
        {
            delta = Math_Functions.Delta_Second_Ordre(a,b,c);

            linearLayoutDelta.setVisibility(View.VISIBLE);

            delta_ope.setText("Delta_Second_Ordre = " + String.valueOf(b) +"² +  4 x " + String.valueOf(a) + " x " +String.valueOf(c) );
            //delta_ope.setText(getString(R.string.polynome_activity_delta_delta_ope), b, a ,c);

            delta_resultat.setVisibility(View.VISIBLE);
            delta_resultat.setText("Delta_Second_Ordre = " + String.valueOf(Math_Functions.Round_Double(delta,3)));
            if(delta == 0){
                X1 = ((b*-1)+Math.sqrt(delta)) / (2*a);
                resulat_X1.setText("X1= " + String.valueOf(Math_Functions.Round_Double(X1,3)));
                factorisation_resultat.setText("P(X) = " + String.valueOf(a) + "( x - " + String.valueOf(Math_Functions.Round_Double(X1,3)) + " )");
            }
            else if (delta > 0){
                X1 = ((b*-1) + Math.sqrt(delta)) / (2*a);
                X2 = ((b*-1) - Math.sqrt(delta)) / (2*a);
                resulat_X1.setText("X1= " + String.valueOf(Math_Functions.Round_Double(X1,3)));
                resultat_X2.setText("X2= " + String.valueOf(Math_Functions.Round_Double(X2,3)));
                factorisation_resultat.setText("P(X) = " + String.valueOf(a) + "( x - (" + String.valueOf(Math_Functions.Round_Double(X1,3)) + " ))( x - (" + String.valueOf(Math_Functions.Round_Double(X2,3)) + "))" );
            }
            else if (delta <0){
                ////Pas de solutions possibles
                resulat_X1.setText(R.string.polynome_activity_zero_solution);
            }
        }
    }
}
