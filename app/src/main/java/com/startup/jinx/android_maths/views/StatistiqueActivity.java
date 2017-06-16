package com.startup.jinx.android_maths.views;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.KeyEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.startup.jinx.android_maths.R;
import com.startup.jinx.android_maths.utils.Math_Functions;
import com.startup.jinx.android_maths.utils.Math_Utils;
import com.startup.jinx.android_maths.widgets.NavigationDrawer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Mégane Vilain on ${DATE}.
 * Project Utils-Math
 */
public class StatistiqueActivity extends NavigationDrawer {

    /**
     * Valeur à ajouter dans la liste.
     */
    EditText editText_Number;

    /**
     * Liste view comprenant toutes les valeurs.
     */
    ListView listView;

    /**
     * Valeur de la moyenne.
     */
    TextView textView_moyenne, /**
     * Valeur de l'écart type.
     */
    textView_ecarttype, /**
     * Valeur du mode.
     */
    textView_mode, /**
     * Valeur de la médiane.
     */
    textView_mediane;

    /**
     * Liste comprenant les valeurs à ajouter dans la list_view.
     */
    List<String> numbers_list_string;

    /**
     * Liste comprenant les valeurs pour la fonction de tri.
     */
    List<Double> number_list_double;


    /**
     * Boutton servant à ajouter les valeurs.
     */
    Button btnAdd;

    /**
     * Boutton servant à lancer la fonction de calcul.
     */
    Button btnCalcul;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        mNavigationView.getMenu().findItem(R.id.digital_nav_drawer_grp_math_item_stat).setChecked(true);

        editText_Number = (EditText) findViewById(R.id.editText_Number);

        listView = (ListView) findViewById(R.id.listView);

        textView_moyenne = (TextView) findViewById(R.id.textView_Moyenne_Data);
        textView_ecarttype = (TextView) findViewById(R.id.textView_ecarttype_Data);
        textView_mediane = (TextView) findViewById(R.id.textView_mediane_Data);
        textView_mode = (TextView) findViewById(R.id.textView_Mode_Data);

        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnCalcul = (Button) findViewById(R.id.btnCalcul);

        numbers_list_string = new ArrayList<String>();
        number_list_double = new ArrayList<Double>();

        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, numbers_list_string);

        listView.setAdapter(arrayAdapter);

        btnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    Double.parseDouble(editText_Number.getText().toString());
                }catch (Exception e){
                    //TODO: Bonne valeur
                    editText_Number.setError(getString(R.string.matrice_erreur));
                }
                if(editText_Number.getText().toString().equals(""))
                {
                    editText_Number.setError(getString(R.string.matrice_erreur));
                }else {
                    numbers_list_string.add(editText_Number.getText().toString());
                    arrayAdapter.notifyDataSetChanged();
                    editText_Number.setText("");
                }
            }
        });

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long l) {

                final int id_list = i;

                final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(StatistiqueActivity.this);
                alertDialogBuilder.setPositiveButton(getString(R.string.action_ok), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        numbers_list_string.remove(id_list);
                        arrayAdapter.notifyDataSetChanged();
                        Calcul();
                    }
                }).setNegativeButton(getString(R.string.action_cancel), new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                }).setMessage(getString(R.string.statistique_activity_delete_value));

                AlertDialog alertDialog = alertDialogBuilder.create();
                alertDialog.show();

                return true;
            }
        });

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                //TODO: START FOR INTENT
            }
        });

        editText_Number.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                try{
                    Double.parseDouble(editText_Number.getText().toString());
                }catch (Exception e){
                    //TODO: Bonne valeur
                    editText_Number.setError(getString(R.string.matrice_erreur));
                }
                if(editText_Number.getText().toString().equals(""))
                {
                    editText_Number.setError(getString(R.string.matrice_erreur));
                }else {
                    numbers_list_string.add(editText_Number.getText().toString());
                    arrayAdapter.notifyDataSetChanged();
                    editText_Number.setText("");
                }

                return true;
            }
        });

        btnCalcul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Math_Utils.hideKeyboard(StatistiqueActivity.this, getWindow().getDecorView().getRootView());
                Calcul();
            }
        });
    }

    /**
     * Check the state of the navigation drawer. Close it if open or go back to the main activity
     *
     */
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        assert drawer != null;
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            if (getSupportFragmentManager().getBackStackEntryCount() != 0) {
                getSupportFragmentManager().popBackStack();
            } else {
                super.onBackPressed();
            }
        }
    }


    /**
     * Calcul de la moynne, ecart-type, mode et médiane
     */
    public void Calcul(){

        double Moyenne = 0 , ecarttype =0;
        listView.getCount();

        for(int i =0; i < listView.getCount();i++){
            Moyenne = Moyenne + Double.parseDouble(numbers_list_string.get(i));
        }
        Moyenne = Moyenne / listView.getCount();
        textView_moyenne.setText(String.valueOf(Moyenne));

        for(int i =0; i < listView.getCount();i++){
            ecarttype = ecarttype + Math.pow((Double.parseDouble(numbers_list_string.get(i)) - Moyenne),2);
            if (ecarttype <0){
                ecarttype = ecarttype *-1;
            }
        }

        ecarttype = Math.sqrt(ecarttype/listView.getCount());
        textView_ecarttype.setText(String.valueOf(Math_Functions.Round_Double(ecarttype,3)));

        number_list_double = To_Double(numbers_list_string);

        number_list_double = quickSort(0, number_list_double.size() -1 , number_list_double);

        Mediane(number_list_double);

    }


    /**
     * Convertit une liste de string en liste de double.
     *
     * @param numbers_list La liste à convertir
     * @return La liste convertie
     */
    public  List<Double> To_Double(List<String> numbers_list){
        for(String s : numbers_list) number_list_double.add(Double.valueOf(s));
        return number_list_double;
    }

    /**
     * Trie une liste de nombres en utilisant l'algorithme Quick Sort.
     *
     * @param lowerIndex  L'index le plus bas du tableau
     * @param higherIndex L'index le plus haut du tableau
     * @param inputArr    Le tableau à trier
     * @return Le tableau trié
     */
    public List<Double> quickSort(int lowerIndex, int higherIndex, List<Double> inputArr) {

        int i = lowerIndex;
        int j = higherIndex;
        //TODO: PAsser commentaire en français
        // calculate pivot number, I am taking pivot as middle index number
        Double pivot = inputArr.get(lowerIndex+(higherIndex-lowerIndex)/2);
        // Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
            while (inputArr.get(i) < pivot) {
                i++;
            }
            while (inputArr.get(j) > pivot) {
                j--;
            }
            if (i <= j) {
                inputArr = exchangeNumbers(i, j, inputArr);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j, inputArr);
        if (i < higherIndex)
            quickSort(i, higherIndex, inputArr);

        return inputArr;
    }

    public void Mediane(List<Double> number_list_double){

        double mediane =0 ;

        if(number_list_double.size() / 2 == 0){
            mediane = number_list_double.get(number_list_double.size()/2);
        }else{
            mediane = number_list_double.get((number_list_double.size()+1)/2);;
        }
        textView_mode.setText(String.valueOf(Math_Functions.Round_Double(mediane,3)));

    }

    /**
     * Échange la position de deux éléments d'un tableau.
     *
     * @param i        Premier élément à échanger
     * @param j        Deuxième élément à échanger
     * @param inputArr Le tableau initial
     * @return Le tableau avec les valeurs échangés
     */
    public List<Double> exchangeNumbers(int i, int j, List<Double> inputArr) {
        Double temp = inputArr.get(i);
        inputArr.set(i, number_list_double.get(j));
        inputArr.set(j,temp);
        return  inputArr;
    }
}