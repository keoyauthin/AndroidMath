package com.startup.jinx.android_maths.activities;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.Spinner;
import android.widget.Toast;

import com.startup.jinx.android_maths.R;
import com.startup.jinx.android_maths.functions.Math_Functions;
import com.startup.jinx.android_maths.functions.Math_Utils;
import com.startup.jinx.android_maths.widgets.Dialog_Matrice;
import com.startup.jinx.android_maths.widgets.NavigationDrawer;

/**
 * Created by Mégane Vilain on ${DATE}.
 * Project Utils-Math
 */
public class MatriceActivity extends NavigationDrawer {


    /**
     * The Matrice 1 edit text 1.
     */
    EditText Matrice1_editText1, /**
     * The Matrice 1 edit text 2.
     */
    Matrice1_editText2, /**
     * The Matrice 1 edit text 3.
     */
    Matrice1_editText3, /**
     * The Matrice 1 edit text 4.
     */
    Matrice1_editText4,
    /**
     * The Matrice 1 edit text 5.
     */
    Matrice1_editText5, /**
     * The Matrice 1 edit text 6.
     */
    Matrice1_editText6, /**
     * The Matrice 1 edit text 7.
     */
    Matrice1_editText7, /**
     * The Matrice 1 edit text 8.
     */
    Matrice1_editText8,
    /**
     * The Matrice 1 edit text 9.
     */
    Matrice1_editText9, /**
     * The Matrice 1 edit text 10.
     */
    Matrice1_editText10, /**
     * The Matrice 1 edit text 11.
     */
    Matrice1_editText11, /**
     * The Matrice 1 edit text 12.
     */
    Matrice1_editText12,
    /**
     * The Matrice 1 edit text 13.
     */
    Matrice1_editText13, /**
     * The Matrice 1 edit text 14.
     */
    Matrice1_editText14, /**
     * The Matrice 1 edit text 15.
     */
    Matrice1_editText15, /**
     * The Matrice 1 edit text 16.
     */
    Matrice1_editText16;

    /**
     * The Matrice 2 edit text 1.
     */
    EditText Matrice2_editText1, /**
     * The Matrice 2 edit text 2.
     */
    Matrice2_editText2, /**
     * The Matrice 2 edit text 3.
     */
    Matrice2_editText3, /**
     * The Matrice 2 edit text 4.
     */
    Matrice2_editText4,
    /**
     * The Matrice 2 edit text 5.
     */
    Matrice2_editText5, /**
     * The Matrice 2 edit text 6.
     */
    Matrice2_editText6, /**
     * The Matrice 2 edit text 7.
     */
    Matrice2_editText7, /**
     * The Matrice 2 edit text 8.
     */
    Matrice2_editText8,
    /**
     * The Matrice 2 edit text 9.
     */
    Matrice2_editText9, /**
     * The Matrice 2 edit text 10.
     */
    Matrice2_editText10, /**
     * The Matrice 2 edit text 11.
     */
    Matrice2_editText11, /**
     * The Matrice 2 edit text 12.
     */
    Matrice2_editText12,
    /**
     * The Matrice 2 edit text 13.
     */
    Matrice2_editText13, /**
     * The Matrice 2 edit text 14.
     */
    Matrice2_editText14, /**
     * The Matrice 2 edit text 15.
     */
    Matrice2_editText15, /**
     * The Matrice 2 edit text 16.
     */
    Matrice2_editText16;

    /**
     * The Matrice 3 edit text 1.
     */
    EditText Matrice3_editText1, /**
     * The Matrice 3 edit text 2.
     */
    Matrice3_editText2, /**
     * The Matrice 3 edit text 3.
     */
    Matrice3_editText3, /**
     * The Matrice 3 edit text 4.
     */
    Matrice3_editText4,
    /**
     * The Matrice 3 edit text 5.
     */
    Matrice3_editText5, /**
     * The Matrice 3 edit text 6.
     */
    Matrice3_editText6, /**
     * The Matrice 3 edit text 7.
     */
    Matrice3_editText7, /**
     * The Matrice 3 edit text 8.
     */
    Matrice3_editText8,
    /**
     * The Matrice 3 edit text 9.
     */
    Matrice3_editText9, /**
     * The Matrice 3 edit text 10.
     */
    Matrice3_editText10, /**
     * The Matrice 3 edit text 11.
     */
    Matrice3_editText11, /**
     * The Matrice 3 edit text 12.
     */
    Matrice3_editText12,
    /**
     * The Matrice 3 edit text 13.
     */
    Matrice3_editText13, /**
     * The Matrice 3 edit text 14.
     */
    Matrice3_editText14, /**
     * The Matrice 3 edit text 15.
     */
    Matrice3_editText15, /**
     * The Matrice 3 edit text 16.
     */
    Matrice3_editText16;

    /**
     * Matrice_Inverce edit text 1.
     */

    EditText Matrice_Inverce_editText1,
    /**
     * Matrice_Inverce edit text 2.
     */
    Matrice_Inverce_editText2,
    /**
     * Matrice_Inverce edit text 3.
     */
    Matrice_Inverce_editText3, /**
     * Matrice_Inverce edit text 4.
     */
    Matrice_Inverce_editText4,
    /**
     * Matrice_Inverce edit text 5.
     */
    Matrice_Inverce_editText5, /**
     * Matrice_Inverce edit text 6.
     */
    Matrice_Inverce_editText6, /**
     * Matrice_Inverce edit text 7.
     */
    Matrice_Inverce_editText7, /**
     * Matrice_Inverce edit text 8.
     */
    Matrice_Inverce_editText8,
    /**
     * Matrice_Inverce edit text 9.
     */
    Matrice_Inverce_editText9, /**
     * Matrice_Inverce edit text 10.
     */
    Matrice_Inverce_editText10, /**
     * Matrice_Inverce edit text 11.
     */
    Matrice_Inverce_editText11, /**
     * Matrice_Inverceedit text 12.
     */
    Matrice_Inverce_editText12,
    /**
     * Matrice_Inverce edit text 13.
     */
    Matrice_Inverce_editText13, /**
     * Matrice_Inverce edit text 14.
     */
    Matrice_Inverce_editText14, /**
     * Matrice_Inverce edit text 15.
     */
    Matrice_Inverce_editText15, /**
     * Matrice_Inverce edit text 16.
     */
    Matrice_Inverce_editText16;

    /**
     * Boutton pour effectuer l'opération.
     */
    Button btnCalcul;

    /**
     * Boutton pour calculer l'inverse de la matrice.
     */
    Button btnInverce;

    /**
     * The Spinner.
     */
    Spinner spinner;

    /**
     * The Matrice 1.
     */
    View Matrice1;

    /**
     * The Matrice 2.
     */
    View Matrice2;

    /**
     * The Matrice 3.
     */
    View Matrice3;

    /**
     * The Matrice inverce.
     */
    View Matrice_Inverce;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        final LayoutInflater inflater = getLayoutInflater();
        final FrameLayout container = (FrameLayout) findViewById(R.id.content_frame);
        inflater.inflate(R.layout.activity_matrice,container);

        setupUI();
        mNavigationView.getMenu().findItem(R.id.nav_matrice).setChecked(true);
    }

    @Override
    protected void setupUI(){
        Matrice1 = findViewById(R.id.matrice1);
        Matrice2 = findViewById(R.id.matrice2);
        Matrice3 = findViewById(R.id.matrice3);
        Matrice_Inverce = findViewById(R.id.matrice_inverse);

        btnCalcul = (Button) findViewById(R.id.btnCalcul);
        btnInverce = (Button) findViewById(R.id.btnInverce);

        spinner = (Spinner) findViewById(R.id.matrice_activity_spinner);

        Matrice1_editText1 = (EditText) Matrice1.findViewById(R.id.editText1);
        Matrice1_editText2 = (EditText) Matrice1.findViewById(R.id.editText2);
        Matrice1_editText3 = (EditText) Matrice1.findViewById(R.id.editText3);
        Matrice1_editText4 = (EditText) Matrice1.findViewById(R.id.editText4);
        Matrice1_editText5 = (EditText) Matrice1.findViewById(R.id.editText5);
        Matrice1_editText6 = (EditText) Matrice1.findViewById(R.id.editText6);
        Matrice1_editText7 = (EditText) Matrice1.findViewById(R.id.editText7);
        Matrice1_editText8 = (EditText) Matrice1.findViewById(R.id.editText8);
        Matrice1_editText9 = (EditText) Matrice1.findViewById(R.id.editText9);
        Matrice1_editText10 = (EditText) Matrice1.findViewById(R.id.editText10);
        Matrice1_editText11 = (EditText) Matrice1.findViewById(R.id.editText11);
        Matrice1_editText12 = (EditText) Matrice1.findViewById(R.id.editText12);
        Matrice1_editText13 = (EditText) Matrice1.findViewById(R.id.editText13);
        Matrice1_editText14 = (EditText) Matrice1.findViewById(R.id.editText14);
        Matrice1_editText15 = (EditText) Matrice1.findViewById(R.id.editText15);
        Matrice1_editText16 = (EditText) Matrice1.findViewById(R.id.editText16);

        Matrice2_editText1 = (EditText) Matrice2.findViewById(R.id.editText1);
        Matrice2_editText2 = (EditText) Matrice2.findViewById(R.id.editText2);
        Matrice2_editText3 = (EditText) Matrice2.findViewById(R.id.editText3);
        Matrice2_editText4 = (EditText) Matrice2.findViewById(R.id.editText4);
        Matrice2_editText5 = (EditText) Matrice2.findViewById(R.id.editText5);
        Matrice2_editText6 = (EditText) Matrice2.findViewById(R.id.editText6);
        Matrice2_editText7 = (EditText) Matrice2.findViewById(R.id.editText7);
        Matrice2_editText8 = (EditText) Matrice2.findViewById(R.id.editText8);
        Matrice2_editText9 = (EditText) Matrice2.findViewById(R.id.editText9);
        Matrice2_editText10 = (EditText) Matrice2.findViewById(R.id.editText10);
        Matrice2_editText11 = (EditText) Matrice2.findViewById(R.id.editText11);
        Matrice2_editText12 = (EditText) Matrice2.findViewById(R.id.editText12);
        Matrice2_editText13 = (EditText) Matrice2.findViewById(R.id.editText13);
        Matrice2_editText14 = (EditText) Matrice2.findViewById(R.id.editText14);
        Matrice2_editText15 = (EditText) Matrice2.findViewById(R.id.editText15);
        Matrice2_editText16 = (EditText) Matrice2.findViewById(R.id.editText16);

        Matrice3_editText1 = (EditText) Matrice3.findViewById(R.id.editText1);
        Matrice3_editText2 = (EditText) Matrice3.findViewById(R.id.editText2);
        Matrice3_editText3 = (EditText) Matrice3.findViewById(R.id.editText3);
        Matrice3_editText4 = (EditText) Matrice3.findViewById(R.id.editText4);
        Matrice3_editText5 = (EditText) Matrice3.findViewById(R.id.editText5);
        Matrice3_editText6 = (EditText) Matrice3.findViewById(R.id.editText6);
        Matrice3_editText7 = (EditText) Matrice3.findViewById(R.id.editText7);
        Matrice3_editText8 = (EditText) Matrice3.findViewById(R.id.editText8);
        Matrice3_editText9 = (EditText) Matrice3.findViewById(R.id.editText9);
        Matrice3_editText10 = (EditText) Matrice3.findViewById(R.id.editText10);
        Matrice3_editText11 = (EditText) Matrice3.findViewById(R.id.editText11);
        Matrice3_editText12 = (EditText) Matrice3.findViewById(R.id.editText12);
        Matrice3_editText13 = (EditText) Matrice3.findViewById(R.id.editText13);
        Matrice3_editText14 = (EditText) Matrice3.findViewById(R.id.editText14);
        Matrice3_editText15 = (EditText) Matrice3.findViewById(R.id.editText15);
        Matrice3_editText16 = (EditText) Matrice3.findViewById(R.id.editText16);

        Matrice_Inverce_editText1 = (EditText) Matrice_Inverce.findViewById(R.id.editText1);
        Matrice_Inverce_editText2 = (EditText) Matrice_Inverce.findViewById(R.id.editText2);
        Matrice_Inverce_editText3 = (EditText) Matrice_Inverce.findViewById(R.id.editText3);
        Matrice_Inverce_editText4 = (EditText) Matrice_Inverce.findViewById(R.id.editText4);
        Matrice_Inverce_editText5 = (EditText) Matrice_Inverce.findViewById(R.id.editText5);
        Matrice_Inverce_editText6 = (EditText) Matrice_Inverce.findViewById(R.id.editText6);
        Matrice_Inverce_editText7 = (EditText) Matrice_Inverce.findViewById(R.id.editText7);
        Matrice_Inverce_editText8 = (EditText) Matrice_Inverce.findViewById(R.id.editText8);
        Matrice_Inverce_editText9 = (EditText) Matrice_Inverce.findViewById(R.id.editText9);
        Matrice_Inverce_editText10 = (EditText) Matrice_Inverce.findViewById(R.id.editText10);
        Matrice_Inverce_editText11 = (EditText) Matrice_Inverce.findViewById(R.id.editText11);
        Matrice_Inverce_editText12 = (EditText) Matrice_Inverce.findViewById(R.id.editText12);
        Matrice_Inverce_editText13 = (EditText) Matrice_Inverce.findViewById(R.id.editText13);
        Matrice_Inverce_editText14 = (EditText) Matrice_Inverce.findViewById(R.id.editText14);
        Matrice_Inverce_editText15 = (EditText) Matrice_Inverce.findViewById(R.id.editText15);
        Matrice_Inverce_editText16 = (EditText) Matrice_Inverce.findViewById(R.id.editText16);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.signe_operatoire_spinner,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        Dialog_Order();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {

        if (requestCode == 1) {
            if(resultCode == Activity.RESULT_OK) {
                final int row = Integer.valueOf(data.getStringExtra("row"));
                final int col = Integer.valueOf(data.getStringExtra("col"));


                Build_Matrice(row, col);

                btnCalcul.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Math_Utils.hideKeyboard(MatriceActivity.this);
                        if(spinner.getSelectedItem().toString().equals("-")){
                            Soustaction_Matrices(col, row);
                        }
                        else{
                            Addition_Matrices(col, row);
                        }
                    }
                });

                btnInverce.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Math_Utils.hideKeyboard(MatriceActivity.this);
                        Inverce_Matrix(row, col);
                    }
                });
            }
            if (resultCode == Activity.RESULT_CANCELED) {

                final int row = 4;
                final int col = 4;
                Build_Matrice(row, col);

                btnCalcul.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Math_Utils.hideKeyboard(MatriceActivity.this);
                        if(spinner.getSelectedItem().toString().equals("-")){
                            Soustaction_Matrices(col, row);
                        }
                        else{
                            Addition_Matrices(col, row);
                        }
                    }
                });

                btnInverce.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Math_Utils.hideKeyboard(MatriceActivity.this);
                        Inverce_Matrix(row, col);
                    }
                });
            }
        }
    }

    /**
     * Dialog order.
     */
    public void Dialog_Order(){
        Intent intent = new Intent(this, Dialog_Matrice.class);
        startActivityForResult(intent,1);
    }

    /**
     * Constuit la matrice en fonction du nombre de lignes et de colonnes selectionnés .
     *
     * @param row Lignes
     * @param col Colonnes
     */
    public void Build_Matrice(int row, int col){

        switch (row){
            case 1:
                Hide_Row(2);
                Hide_Row(3);
                Hide_Row(4);
                break;
            case 2:
                Hide_Row(3);
                Hide_Row(4);
                break;
            case 3:
                Hide_Row(4);
                break;
            case 4:
                break;

        }

        switch (col){
            case 1:
                Hide_Col(2);
                Hide_Col(3);
                Hide_Col(4);
                break;
            case 2:
                Hide_Col(3);
                Hide_Col(4);
                break;
            case 3:
                Hide_Col(4);
                break;
            case 4:
                break;

        }

    }

    /**
     * Cache une colonne des matrices .
     *
     * @param col La colonne à cacher
     */
    public void Hide_Col(int col){

        switch (col){
            case 1:
                Matrice1_editText1.setVisibility(View.INVISIBLE);
                Matrice1_editText5.setVisibility(View.INVISIBLE);
                Matrice1_editText9.setVisibility(View.INVISIBLE);
                Matrice1_editText13.setVisibility(View.INVISIBLE);

                Matrice2_editText1.setVisibility(View.INVISIBLE);
                Matrice2_editText5.setVisibility(View.INVISIBLE);
                Matrice2_editText9.setVisibility(View.INVISIBLE);
                Matrice2_editText13.setVisibility(View.INVISIBLE);

                Matrice3_editText1.setVisibility(View.INVISIBLE);
                Matrice3_editText5.setVisibility(View.INVISIBLE);
                Matrice3_editText9.setVisibility(View.INVISIBLE);
                Matrice3_editText13.setVisibility(View.INVISIBLE);

                Matrice_Inverce_editText1.setVisibility(View.INVISIBLE);
                Matrice_Inverce_editText5.setVisibility(View.INVISIBLE);
                Matrice_Inverce_editText9.setVisibility(View.INVISIBLE);
                Matrice_Inverce_editText13.setVisibility(View.INVISIBLE);

                break;
            case 2:
                Matrice1_editText2.setVisibility(View.INVISIBLE);
                Matrice1_editText6.setVisibility(View.INVISIBLE);
                Matrice1_editText10.setVisibility(View.INVISIBLE);
                Matrice1_editText14.setVisibility(View.INVISIBLE);

                Matrice2_editText2.setVisibility(View.INVISIBLE);
                Matrice2_editText6.setVisibility(View.INVISIBLE);
                Matrice2_editText10.setVisibility(View.INVISIBLE);
                Matrice2_editText14.setVisibility(View.INVISIBLE);

                Matrice3_editText2.setVisibility(View.INVISIBLE);
                Matrice3_editText6.setVisibility(View.INVISIBLE);
                Matrice3_editText10.setVisibility(View.INVISIBLE);
                Matrice3_editText14.setVisibility(View.INVISIBLE);

                Matrice_Inverce_editText2.setVisibility(View.INVISIBLE);
                Matrice_Inverce_editText6.setVisibility(View.INVISIBLE);
                Matrice_Inverce_editText10.setVisibility(View.INVISIBLE);
                Matrice_Inverce_editText14.setVisibility(View.INVISIBLE);

                break;
            case 3:
                Matrice1_editText3.setVisibility(View.INVISIBLE);
                Matrice1_editText7.setVisibility(View.INVISIBLE);
                Matrice1_editText11.setVisibility(View.INVISIBLE);
                Matrice1_editText15.setVisibility(View.INVISIBLE);

                Matrice2_editText3.setVisibility(View.INVISIBLE);
                Matrice2_editText7.setVisibility(View.INVISIBLE);
                Matrice2_editText11.setVisibility(View.INVISIBLE);
                Matrice2_editText15.setVisibility(View.INVISIBLE);

                Matrice3_editText3.setVisibility(View.INVISIBLE);
                Matrice3_editText7.setVisibility(View.INVISIBLE);
                Matrice3_editText11.setVisibility(View.INVISIBLE);
                Matrice3_editText15.setVisibility(View.INVISIBLE);

                Matrice_Inverce_editText3.setVisibility(View.INVISIBLE);
                Matrice_Inverce_editText7.setVisibility(View.INVISIBLE);
                Matrice_Inverce_editText11.setVisibility(View.INVISIBLE);
                Matrice_Inverce_editText15.setVisibility(View.INVISIBLE);

                break;
            case 4:
                Matrice1_editText4.setVisibility(View.INVISIBLE);
                Matrice1_editText8.setVisibility(View.INVISIBLE);
                Matrice1_editText12.setVisibility(View.INVISIBLE);
                Matrice1_editText16.setVisibility(View.INVISIBLE);

                Matrice2_editText4.setVisibility(View.INVISIBLE);
                Matrice2_editText8.setVisibility(View.INVISIBLE);
                Matrice2_editText12.setVisibility(View.INVISIBLE);
                Matrice2_editText16.setVisibility(View.INVISIBLE);

                Matrice3_editText4.setVisibility(View.INVISIBLE);
                Matrice3_editText8.setVisibility(View.INVISIBLE);
                Matrice3_editText12.setVisibility(View.INVISIBLE);
                Matrice3_editText16.setVisibility(View.INVISIBLE);

                Matrice_Inverce_editText4.setVisibility(View.INVISIBLE);
                Matrice_Inverce_editText8.setVisibility(View.INVISIBLE);
                Matrice_Inverce_editText12.setVisibility(View.INVISIBLE);
                Matrice_Inverce_editText16.setVisibility(View.INVISIBLE);

                break;
        }

    }

    /**
     * Cache une ligne des matrices.
     *
     * @param row La ligne à cacher
     */
    public void Hide_Row(int row){
        switch (row){
            case 1:
                Matrice1_editText1.setVisibility(View.INVISIBLE);
                Matrice1_editText2.setVisibility(View.INVISIBLE);
                Matrice1_editText3.setVisibility(View.INVISIBLE);
                Matrice1_editText4.setVisibility(View.INVISIBLE);

                Matrice2_editText1.setVisibility(View.INVISIBLE);
                Matrice2_editText2.setVisibility(View.INVISIBLE);
                Matrice2_editText3.setVisibility(View.INVISIBLE);
                Matrice2_editText4.setVisibility(View.INVISIBLE);

                Matrice3_editText1.setVisibility(View.INVISIBLE);
                Matrice3_editText2.setVisibility(View.INVISIBLE);
                Matrice3_editText3.setVisibility(View.INVISIBLE);
                Matrice3_editText4.setVisibility(View.INVISIBLE);

                Matrice_Inverce_editText1.setVisibility(View.INVISIBLE);
                Matrice_Inverce_editText2.setVisibility(View.INVISIBLE);
                Matrice_Inverce_editText3.setVisibility(View.INVISIBLE);
                Matrice_Inverce_editText4.setVisibility(View.INVISIBLE);
                break;
            case 2:
                Matrice1_editText5.setVisibility(View.INVISIBLE);
                Matrice1_editText6.setVisibility(View.INVISIBLE);
                Matrice1_editText7.setVisibility(View.INVISIBLE);
                Matrice1_editText8.setVisibility(View.INVISIBLE);

                Matrice2_editText5.setVisibility(View.INVISIBLE);
                Matrice2_editText6.setVisibility(View.INVISIBLE);
                Matrice2_editText7.setVisibility(View.INVISIBLE);
                Matrice2_editText8.setVisibility(View.INVISIBLE);

                Matrice3_editText5.setVisibility(View.INVISIBLE);
                Matrice3_editText6.setVisibility(View.INVISIBLE);
                Matrice3_editText7.setVisibility(View.INVISIBLE);
                Matrice3_editText8.setVisibility(View.INVISIBLE);

                Matrice_Inverce_editText5.setVisibility(View.INVISIBLE);
                Matrice_Inverce_editText6.setVisibility(View.INVISIBLE);
                Matrice_Inverce_editText7.setVisibility(View.INVISIBLE);
                Matrice_Inverce_editText8.setVisibility(View.INVISIBLE);

                break;
            case 3:
                Matrice1_editText9.setVisibility(View.INVISIBLE);
                Matrice1_editText10.setVisibility(View.INVISIBLE);
                Matrice1_editText11.setVisibility(View.INVISIBLE);
                Matrice1_editText12.setVisibility(View.INVISIBLE);

                Matrice2_editText9.setVisibility(View.INVISIBLE);
                Matrice2_editText10.setVisibility(View.INVISIBLE);
                Matrice2_editText11.setVisibility(View.INVISIBLE);
                Matrice2_editText12.setVisibility(View.INVISIBLE);

                Matrice3_editText9.setVisibility(View.INVISIBLE);
                Matrice3_editText10.setVisibility(View.INVISIBLE);
                Matrice3_editText11.setVisibility(View.INVISIBLE);
                Matrice3_editText12.setVisibility(View.INVISIBLE);

                Matrice_Inverce_editText9.setVisibility(View.INVISIBLE);
                Matrice_Inverce_editText10.setVisibility(View.INVISIBLE);
                Matrice_Inverce_editText11.setVisibility(View.INVISIBLE);
                Matrice_Inverce_editText12.setVisibility(View.INVISIBLE);

                break;
            case 4:
                Matrice1_editText13.setVisibility(View.INVISIBLE);
                Matrice1_editText14.setVisibility(View.INVISIBLE);
                Matrice1_editText15.setVisibility(View.INVISIBLE);
                Matrice1_editText16.setVisibility(View.INVISIBLE);

                Matrice2_editText13.setVisibility(View.INVISIBLE);
                Matrice2_editText14.setVisibility(View.INVISIBLE);
                Matrice2_editText15.setVisibility(View.INVISIBLE);
                Matrice2_editText16.setVisibility(View.INVISIBLE);

                Matrice3_editText13.setVisibility(View.INVISIBLE);
                Matrice3_editText14.setVisibility(View.INVISIBLE);
                Matrice3_editText15.setVisibility(View.INVISIBLE);
                Matrice3_editText16.setVisibility(View.INVISIBLE);

                Matrice_Inverce_editText13.setVisibility(View.INVISIBLE);
                Matrice_Inverce_editText14.setVisibility(View.INVISIBLE);
                Matrice_Inverce_editText15.setVisibility(View.INVISIBLE);
                Matrice_Inverce_editText16.setVisibility(View.INVISIBLE);

                break;
        }
    }

    /**
     * Soustaction de deux matrices.
     *
     * @param col Nombre de colonnes des matrices
     * @param row Nombre de lignes des matrices
     */
    public void Soustaction_Matrices(int col, int row){
        try {
            switch (col) {
                case 1:
                    switch (row) {
                        case 1:
                            Matrice3_editText1.setText(String.valueOf(Double.valueOf(Matrice1_editText1.getText().toString()) - Double.valueOf(Matrice2_editText1.getText().toString())));
                            break;
                        case 2:
                            Matrice3_editText1.setText(String.valueOf(Double.valueOf(Matrice1_editText1.getText().toString()) - Double.valueOf(Matrice2_editText1.getText().toString())));
                            Matrice3_editText5.setText(String.valueOf(Double.valueOf(Matrice1_editText5.getText().toString()) - Double.valueOf(Matrice2_editText5.getText().toString())));
                            break;
                        case 3:
                            Matrice3_editText1.setText(String.valueOf(Double.valueOf(Matrice1_editText1.getText().toString()) - Double.valueOf(Matrice2_editText1.getText().toString())));
                            Matrice3_editText5.setText(String.valueOf(Double.valueOf(Matrice1_editText5.getText().toString()) - Double.valueOf(Matrice2_editText5.getText().toString())));
                            Matrice3_editText9.setText(String.valueOf(Double.valueOf(Matrice1_editText9.getText().toString()) - Double.valueOf(Matrice2_editText9.getText().toString())));
                            break;
                        case 4:
                            Matrice3_editText1.setText(String.valueOf(Double.valueOf(Matrice1_editText1.getText().toString()) - Double.valueOf(Matrice2_editText1.getText().toString())));
                            Matrice3_editText5.setText(String.valueOf(Double.valueOf(Matrice1_editText5.getText().toString()) - Double.valueOf(Matrice2_editText5.getText().toString())));
                            Matrice3_editText9.setText(String.valueOf(Double.valueOf(Matrice1_editText9.getText().toString()) - Double.valueOf(Matrice2_editText9.getText().toString())));
                            Matrice3_editText13.setText(String.valueOf(Double.valueOf(Matrice1_editText13.getText().toString()) - Double.valueOf(Matrice2_editText13.getText().toString())));
                            break;
                    }
                    break;
                case 2:
                    switch (row) {
                        case 1:
                            Matrice3_editText1.setText(String.valueOf(Double.valueOf(Matrice1_editText1.getText().toString()) - Double.valueOf(Matrice2_editText1.getText().toString())));
                            Matrice3_editText2.setText(String.valueOf(Double.valueOf(Matrice1_editText2.getText().toString()) - Double.valueOf(Matrice2_editText2.getText().toString())));
                            break;
                        case 2:
                            Matrice3_editText1.setText(String.valueOf(Double.valueOf(Matrice1_editText1.getText().toString()) - Double.valueOf(Matrice2_editText1.getText().toString())));
                            Matrice3_editText2.setText(String.valueOf(Double.valueOf(Matrice1_editText2.getText().toString()) - Double.valueOf(Matrice2_editText2.getText().toString())));
                            Matrice3_editText5.setText(String.valueOf(Double.valueOf(Matrice1_editText5.getText().toString()) - Double.valueOf(Matrice2_editText5.getText().toString())));
                            Matrice3_editText6.setText(String.valueOf(Double.valueOf(Matrice1_editText6.getText().toString()) - Double.valueOf(Matrice2_editText2.getText().toString())));
                            break;
                        case 3:
                            Matrice3_editText1.setText(String.valueOf(Double.valueOf(Matrice1_editText1.getText().toString()) - Double.valueOf(Matrice2_editText1.getText().toString())));
                            Matrice3_editText2.setText(String.valueOf(Double.valueOf(Matrice1_editText2.getText().toString()) - Double.valueOf(Matrice2_editText2.getText().toString())));
                            Matrice3_editText5.setText(String.valueOf(Double.valueOf(Matrice1_editText5.getText().toString()) - Double.valueOf(Matrice2_editText5.getText().toString())));
                            Matrice3_editText6.setText(String.valueOf(Double.valueOf(Matrice1_editText6.getText().toString()) - Double.valueOf(Matrice2_editText2.getText().toString())));
                            Matrice3_editText9.setText(String.valueOf(Double.valueOf(Matrice1_editText9.getText().toString()) - Double.valueOf(Matrice2_editText9.getText().toString())));
                            Matrice3_editText10.setText(String.valueOf(Double.valueOf(Matrice1_editText10.getText().toString()) - Double.valueOf(Matrice2_editText10.getText().toString())));
                            break;
                        case 4:
                            Matrice3_editText1.setText(String.valueOf(Double.valueOf(Matrice1_editText1.getText().toString()) - Double.valueOf(Matrice2_editText1.getText().toString())));
                            Matrice3_editText2.setText(String.valueOf(Double.valueOf(Matrice1_editText2.getText().toString()) - Double.valueOf(Matrice2_editText2.getText().toString())));
                            Matrice3_editText5.setText(String.valueOf(Double.valueOf(Matrice1_editText5.getText().toString()) - Double.valueOf(Matrice2_editText5.getText().toString())));
                            Matrice3_editText6.setText(String.valueOf(Double.valueOf(Matrice1_editText6.getText().toString()) - Double.valueOf(Matrice2_editText2.getText().toString())));
                            Matrice3_editText9.setText(String.valueOf(Double.valueOf(Matrice1_editText9.getText().toString()) - Double.valueOf(Matrice2_editText9.getText().toString())));
                            Matrice3_editText10.setText(String.valueOf(Double.valueOf(Matrice1_editText10.getText().toString()) - Double.valueOf(Matrice2_editText10.getText().toString())));
                            Matrice3_editText13.setText(String.valueOf(Double.valueOf(Matrice1_editText13.getText().toString()) - Double.valueOf(Matrice2_editText13.getText().toString())));
                            Matrice3_editText14.setText(String.valueOf(Double.valueOf(Matrice1_editText14.getText().toString()) - Double.valueOf(Matrice2_editText14.getText().toString())));
                            break;
                    }
                    break;
                case 3:
                    switch (row) {
                        case 1:
                            Matrice3_editText1.setText(String.valueOf(Double.valueOf(Matrice1_editText1.getText().toString()) - Double.valueOf(Matrice2_editText1.getText().toString())));
                            Matrice3_editText2.setText(String.valueOf(Double.valueOf(Matrice1_editText2.getText().toString()) - Double.valueOf(Matrice2_editText2.getText().toString())));
                            Matrice3_editText3.setText(String.valueOf(Double.valueOf(Matrice1_editText3.getText().toString()) - Double.valueOf(Matrice2_editText3.getText().toString())));
                            break;
                        case 2:
                            Matrice3_editText1.setText(String.valueOf(Double.valueOf(Matrice1_editText1.getText().toString()) - Double.valueOf(Matrice2_editText1.getText().toString())));
                            Matrice3_editText2.setText(String.valueOf(Double.valueOf(Matrice1_editText2.getText().toString()) - Double.valueOf(Matrice2_editText2.getText().toString())));
                            Matrice3_editText3.setText(String.valueOf(Double.valueOf(Matrice1_editText3.getText().toString()) - Double.valueOf(Matrice2_editText3.getText().toString())));
                            Matrice3_editText5.setText(String.valueOf(Double.valueOf(Matrice1_editText5.getText().toString()) - Double.valueOf(Matrice2_editText5.getText().toString())));
                            Matrice3_editText6.setText(String.valueOf(Double.valueOf(Matrice1_editText6.getText().toString()) - Double.valueOf(Matrice2_editText6.getText().toString())));
                            Matrice3_editText7.setText(String.valueOf(Double.valueOf(Matrice1_editText7.getText().toString()) - Double.valueOf(Matrice2_editText7.getText().toString())));
                            break;
                        case 3:
                            Matrice3_editText1.setText(String.valueOf(Double.valueOf(Matrice1_editText1.getText().toString()) - Double.valueOf(Matrice2_editText1.getText().toString())));
                            Matrice3_editText2.setText(String.valueOf(Double.valueOf(Matrice1_editText2.getText().toString()) - Double.valueOf(Matrice2_editText2.getText().toString())));
                            Matrice3_editText3.setText(String.valueOf(Double.valueOf(Matrice1_editText3.getText().toString()) - Double.valueOf(Matrice2_editText3.getText().toString())));
                            Matrice3_editText5.setText(String.valueOf(Double.valueOf(Matrice1_editText5.getText().toString()) - Double.valueOf(Matrice2_editText5.getText().toString())));
                            Matrice3_editText6.setText(String.valueOf(Double.valueOf(Matrice1_editText6.getText().toString()) - Double.valueOf(Matrice2_editText6.getText().toString())));
                            Matrice3_editText7.setText(String.valueOf(Double.valueOf(Matrice1_editText7.getText().toString()) - Double.valueOf(Matrice2_editText7.getText().toString())));
                            Matrice3_editText9.setText(String.valueOf(Double.valueOf(Matrice1_editText9.getText().toString()) - Double.valueOf(Matrice2_editText9.getText().toString())));
                            Matrice3_editText10.setText(String.valueOf(Double.valueOf(Matrice1_editText10.getText().toString()) - Double.valueOf(Matrice2_editText10.getText().toString())));
                            Matrice3_editText11.setText(String.valueOf(Double.valueOf(Matrice1_editText11.getText().toString()) - Double.valueOf(Matrice2_editText11.getText().toString())));
                            break;
                        case 4:
                            Matrice3_editText1.setText(String.valueOf(Double.valueOf(Matrice1_editText1.getText().toString()) - Double.valueOf(Matrice2_editText1.getText().toString())));
                            Matrice3_editText2.setText(String.valueOf(Double.valueOf(Matrice1_editText2.getText().toString()) - Double.valueOf(Matrice2_editText2.getText().toString())));
                            Matrice3_editText3.setText(String.valueOf(Double.valueOf(Matrice1_editText3.getText().toString()) - Double.valueOf(Matrice2_editText3.getText().toString())));
                            Matrice3_editText5.setText(String.valueOf(Double.valueOf(Matrice1_editText5.getText().toString()) - Double.valueOf(Matrice2_editText5.getText().toString())));
                            Matrice3_editText6.setText(String.valueOf(Double.valueOf(Matrice1_editText6.getText().toString()) - Double.valueOf(Matrice2_editText6.getText().toString())));
                            Matrice3_editText7.setText(String.valueOf(Double.valueOf(Matrice1_editText7.getText().toString()) - Double.valueOf(Matrice2_editText7.getText().toString())));
                            Matrice3_editText9.setText(String.valueOf(Double.valueOf(Matrice1_editText9.getText().toString()) - Double.valueOf(Matrice2_editText9.getText().toString())));
                            Matrice3_editText10.setText(String.valueOf(Double.valueOf(Matrice1_editText10.getText().toString()) - Double.valueOf(Matrice2_editText10.getText().toString())));
                            Matrice3_editText11.setText(String.valueOf(Double.valueOf(Matrice1_editText11.getText().toString()) - Double.valueOf(Matrice2_editText11.getText().toString())));
                            Matrice3_editText13.setText(String.valueOf(Double.valueOf(Matrice1_editText13.getText().toString()) - Double.valueOf(Matrice2_editText13.getText().toString())));
                            Matrice3_editText14.setText(String.valueOf(Double.valueOf(Matrice1_editText14.getText().toString()) - Double.valueOf(Matrice2_editText14.getText().toString())));
                            Matrice3_editText15.setText(String.valueOf(Double.valueOf(Matrice1_editText15.getText().toString()) - Double.valueOf(Matrice2_editText15.getText().toString())));
                            break;
                    }
                    break;
                case 4:
                    switch (row) {
                        case 1:
                            Matrice3_editText1.setText(String.valueOf(Double.valueOf(Matrice1_editText1.getText().toString()) - Double.valueOf(Matrice2_editText1.getText().toString())));
                            Matrice3_editText2.setText(String.valueOf(Double.valueOf(Matrice1_editText2.getText().toString()) - Double.valueOf(Matrice2_editText2.getText().toString())));
                            Matrice3_editText3.setText(String.valueOf(Double.valueOf(Matrice1_editText3.getText().toString()) - Double.valueOf(Matrice2_editText3.getText().toString())));
                            Matrice3_editText4.setText(String.valueOf(Double.valueOf(Matrice1_editText4.getText().toString()) - Double.valueOf(Matrice2_editText4.getText().toString())));
                            break;
                        case 2:
                            Matrice3_editText1.setText(String.valueOf(Double.valueOf(Matrice1_editText1.getText().toString()) - Double.valueOf(Matrice2_editText1.getText().toString())));
                            Matrice3_editText2.setText(String.valueOf(Double.valueOf(Matrice1_editText2.getText().toString()) - Double.valueOf(Matrice2_editText2.getText().toString())));
                            Matrice3_editText3.setText(String.valueOf(Double.valueOf(Matrice1_editText3.getText().toString()) - Double.valueOf(Matrice2_editText3.getText().toString())));
                            Matrice3_editText4.setText(String.valueOf(Double.valueOf(Matrice1_editText4.getText().toString()) - Double.valueOf(Matrice2_editText4.getText().toString())));
                            Matrice3_editText5.setText(String.valueOf(Double.valueOf(Matrice1_editText5.getText().toString()) - Double.valueOf(Matrice2_editText5.getText().toString())));
                            Matrice3_editText6.setText(String.valueOf(Double.valueOf(Matrice1_editText6.getText().toString()) - Double.valueOf(Matrice2_editText6.getText().toString())));
                            Matrice3_editText7.setText(String.valueOf(Double.valueOf(Matrice1_editText7.getText().toString()) - Double.valueOf(Matrice2_editText7.getText().toString())));
                            Matrice3_editText8.setText(String.valueOf(Double.valueOf(Matrice1_editText8.getText().toString()) - Double.valueOf(Matrice2_editText8.getText().toString())));
                            break;
                        case 3:
                            Matrice3_editText1.setText(String.valueOf(Double.valueOf(Matrice1_editText1.getText().toString()) - Double.valueOf(Matrice2_editText1.getText().toString())));
                            Matrice3_editText2.setText(String.valueOf(Double.valueOf(Matrice1_editText2.getText().toString()) - Double.valueOf(Matrice2_editText2.getText().toString())));
                            Matrice3_editText3.setText(String.valueOf(Double.valueOf(Matrice1_editText3.getText().toString()) - Double.valueOf(Matrice2_editText3.getText().toString())));
                            Matrice3_editText4.setText(String.valueOf(Double.valueOf(Matrice1_editText4.getText().toString()) - Double.valueOf(Matrice2_editText4.getText().toString())));
                            Matrice3_editText5.setText(String.valueOf(Double.valueOf(Matrice1_editText5.getText().toString()) - Double.valueOf(Matrice2_editText5.getText().toString())));
                            Matrice3_editText6.setText(String.valueOf(Double.valueOf(Matrice1_editText6.getText().toString()) - Double.valueOf(Matrice2_editText6.getText().toString())));
                            Matrice3_editText7.setText(String.valueOf(Double.valueOf(Matrice1_editText7.getText().toString()) - Double.valueOf(Matrice2_editText7.getText().toString())));
                            Matrice3_editText8.setText(String.valueOf(Double.valueOf(Matrice1_editText8.getText().toString()) - Double.valueOf(Matrice2_editText8.getText().toString())));
                            Matrice3_editText9.setText(String.valueOf(Double.valueOf(Matrice1_editText9.getText().toString()) - Double.valueOf(Matrice2_editText9.getText().toString())));
                            Matrice3_editText10.setText(String.valueOf(Double.valueOf(Matrice1_editText10.getText().toString()) - Double.valueOf(Matrice2_editText10.getText().toString())));
                            Matrice3_editText12.setText(String.valueOf(Double.valueOf(Matrice1_editText12.getText().toString()) - Double.valueOf(Matrice2_editText12.getText().toString())));
                            Matrice3_editText11.setText(String.valueOf(Double.valueOf(Matrice1_editText11.getText().toString()) - Double.valueOf(Matrice2_editText11.getText().toString())));
                            break;
                        case 4:
                            Matrice3_editText1.setText(String.valueOf(Double.valueOf(Matrice1_editText1.getText().toString()) - Double.valueOf(Matrice2_editText1.getText().toString())));
                            Matrice3_editText2.setText(String.valueOf(Double.valueOf(Matrice1_editText2.getText().toString()) - Double.valueOf(Matrice2_editText2.getText().toString())));
                            Matrice3_editText3.setText(String.valueOf(Double.valueOf(Matrice1_editText3.getText().toString()) - Double.valueOf(Matrice2_editText3.getText().toString())));
                            Matrice3_editText4.setText(String.valueOf(Double.valueOf(Matrice1_editText4.getText().toString()) - Double.valueOf(Matrice2_editText4.getText().toString())));
                            Matrice3_editText5.setText(String.valueOf(Double.valueOf(Matrice1_editText5.getText().toString()) - Double.valueOf(Matrice2_editText5.getText().toString())));
                            Matrice3_editText6.setText(String.valueOf(Double.valueOf(Matrice1_editText6.getText().toString()) - Double.valueOf(Matrice2_editText6.getText().toString())));
                            Matrice3_editText7.setText(String.valueOf(Double.valueOf(Matrice1_editText7.getText().toString()) - Double.valueOf(Matrice2_editText7.getText().toString())));
                            Matrice3_editText8.setText(String.valueOf(Double.valueOf(Matrice1_editText8.getText().toString()) - Double.valueOf(Matrice2_editText8.getText().toString())));
                            Matrice3_editText9.setText(String.valueOf(Double.valueOf(Matrice1_editText9.getText().toString()) - Double.valueOf(Matrice2_editText9.getText().toString())));
                            Matrice3_editText10.setText(String.valueOf(Double.valueOf(Matrice1_editText10.getText().toString()) - Double.valueOf(Matrice2_editText10.getText().toString())));
                            Matrice3_editText11.setText(String.valueOf(Double.valueOf(Matrice1_editText11.getText().toString()) - Double.valueOf(Matrice2_editText11.getText().toString())));
                            Matrice3_editText12.setText(String.valueOf(Double.valueOf(Matrice1_editText12.getText().toString()) - Double.valueOf(Matrice2_editText12.getText().toString())));
                            Matrice3_editText13.setText(String.valueOf(Double.valueOf(Matrice1_editText13.getText().toString()) - Double.valueOf(Matrice2_editText13.getText().toString())));
                            Matrice3_editText14.setText(String.valueOf(Double.valueOf(Matrice1_editText14.getText().toString()) - Double.valueOf(Matrice2_editText14.getText().toString())));
                            Matrice3_editText15.setText(String.valueOf(Double.valueOf(Matrice1_editText15.getText().toString()) - Double.valueOf(Matrice2_editText15.getText().toString())));
                            Matrice3_editText16.setText(String.valueOf(Double.valueOf(Matrice1_editText16.getText().toString()) - Double.valueOf(Matrice2_editText16.getText().toString())));
                            break;
                    }
                    break;
            }
            Matrice3.setVisibility(View.VISIBLE);
            btnInverce.setVisibility(View.VISIBLE);
        }catch (Exception e)
        {
            Matrice1_editText1.setError(getString(R.string.matrice_erreurs));
        }

    }

    /**
     * Aditionne deux matrices .
     *
     * @param col Nombre de colonnes des matrices
     * @param row Nombre de lignes des matrices
     */
    public void Addition_Matrices(int col, int row) {

        try{

            switch (col) {
                case 1:
                    switch (row) {
                        case 1:
                            Matrice3_editText1.setText(String.valueOf(Double.valueOf(Matrice1_editText1.getText().toString()) + Double.valueOf(Matrice2_editText1.getText().toString())));
                            break;
                        case 2:
                            Matrice3_editText1.setText(String.valueOf(Double.valueOf(Matrice1_editText1.getText().toString()) + Double.valueOf(Matrice2_editText1.getText().toString())));
                            Matrice3_editText5.setText(String.valueOf(Double.valueOf(Matrice1_editText5.getText().toString()) + Double.valueOf(Matrice2_editText5.getText().toString())));
                            break;
                        case 3:
                            Matrice3_editText1.setText(String.valueOf(Double.valueOf(Matrice1_editText1.getText().toString()) + Double.valueOf(Matrice2_editText1.getText().toString())));
                            Matrice3_editText5.setText(String.valueOf(Double.valueOf(Matrice1_editText5.getText().toString()) + Double.valueOf(Matrice2_editText5.getText().toString())));
                            Matrice3_editText9.setText(String.valueOf(Double.valueOf(Matrice1_editText9.getText().toString()) + Double.valueOf(Matrice2_editText9.getText().toString())));
                            break;
                        case 4:
                            Matrice3_editText1.setText(String.valueOf(Double.valueOf(Matrice1_editText1.getText().toString()) + Double.valueOf(Matrice2_editText1.getText().toString())));
                            Matrice3_editText5.setText(String.valueOf(Double.valueOf(Matrice1_editText5.getText().toString()) + Double.valueOf(Matrice2_editText5.getText().toString())));
                            Matrice3_editText9.setText(String.valueOf(Double.valueOf(Matrice1_editText9.getText().toString()) + Double.valueOf(Matrice2_editText9.getText().toString())));
                            Matrice3_editText13.setText(String.valueOf(Double.valueOf(Matrice1_editText13.getText().toString()) + Double.valueOf(Matrice2_editText13.getText().toString())));
                            break;
                    }
                    break;
                case 2:
                    switch (row) {
                        case 1:
                            Matrice3_editText1.setText(String.valueOf(Double.valueOf(Matrice1_editText1.getText().toString()) + Double.valueOf(Matrice2_editText1.getText().toString())));
                            Matrice3_editText2.setText(String.valueOf(Double.valueOf(Matrice1_editText2.getText().toString()) + Double.valueOf(Matrice2_editText2.getText().toString())));
                            break;
                        case 2:
                            Matrice3_editText1.setText(String.valueOf(Double.valueOf(Matrice1_editText1.getText().toString()) + Double.valueOf(Matrice2_editText1.getText().toString())));
                            Matrice3_editText2.setText(String.valueOf(Double.valueOf(Matrice1_editText2.getText().toString()) + Double.valueOf(Matrice2_editText2.getText().toString())));
                            Matrice3_editText5.setText(String.valueOf(Double.valueOf(Matrice1_editText5.getText().toString()) + Double.valueOf(Matrice2_editText5.getText().toString())));
                            Matrice3_editText6.setText(String.valueOf(Double.valueOf(Matrice1_editText6.getText().toString()) + Double.valueOf(Matrice2_editText6.getText().toString())));
                            break;
                        case 3:
                            Matrice3_editText1.setText(String.valueOf(Double.valueOf(Matrice1_editText1.getText().toString()) + Double.valueOf(Matrice2_editText1.getText().toString())));
                            Matrice3_editText2.setText(String.valueOf(Double.valueOf(Matrice1_editText2.getText().toString()) + Double.valueOf(Matrice2_editText2.getText().toString())));
                            Matrice3_editText5.setText(String.valueOf(Double.valueOf(Matrice1_editText5.getText().toString()) + Double.valueOf(Matrice2_editText5.getText().toString())));
                            Matrice3_editText6.setText(String.valueOf(Double.valueOf(Matrice1_editText6.getText().toString()) + Double.valueOf(Matrice2_editText6.getText().toString())));
                            Matrice3_editText9.setText(String.valueOf(Double.valueOf(Matrice1_editText9.getText().toString()) + Double.valueOf(Matrice2_editText9.getText().toString())));
                            Matrice3_editText10.setText(String.valueOf(Double.valueOf(Matrice1_editText10.getText().toString()) + Double.valueOf(Matrice2_editText10.getText().toString())));
                            break;
                        case 4:
                            Matrice3_editText1.setText(String.valueOf(Double.valueOf(Matrice1_editText1.getText().toString()) + Double.valueOf(Matrice2_editText1.getText().toString())));
                            Matrice3_editText2.setText(String.valueOf(Double.valueOf(Matrice1_editText2.getText().toString()) + Double.valueOf(Matrice2_editText2.getText().toString())));
                            Matrice3_editText5.setText(String.valueOf(Double.valueOf(Matrice1_editText5.getText().toString()) + Double.valueOf(Matrice2_editText5.getText().toString())));
                            Matrice3_editText6.setText(String.valueOf(Double.valueOf(Matrice1_editText6.getText().toString()) + Double.valueOf(Matrice2_editText6.getText().toString())));
                            Matrice3_editText9.setText(String.valueOf(Double.valueOf(Matrice1_editText9.getText().toString()) + Double.valueOf(Matrice2_editText9.getText().toString())));
                            Matrice3_editText10.setText(String.valueOf(Double.valueOf(Matrice1_editText10.getText().toString()) + Double.valueOf(Matrice2_editText10.getText().toString())));
                            Matrice3_editText13.setText(String.valueOf(Double.valueOf(Matrice1_editText13.getText().toString()) + Double.valueOf(Matrice2_editText13.getText().toString())));
                            Matrice3_editText14.setText(String.valueOf(Double.valueOf(Matrice1_editText14.getText().toString()) + Double.valueOf(Matrice2_editText14.getText().toString())));
                            break;
                    }
                    break;
                case 3:
                    switch (row) {
                        case 1:
                            Matrice3_editText1.setText(String.valueOf(Double.valueOf(Matrice1_editText1.getText().toString()) + Double.valueOf(Matrice2_editText1.getText().toString())));
                            Matrice3_editText2.setText(String.valueOf(Double.valueOf(Matrice1_editText2.getText().toString()) + Double.valueOf(Matrice2_editText2.getText().toString())));
                            Matrice3_editText3.setText(String.valueOf(Double.valueOf(Matrice1_editText3.getText().toString()) + Double.valueOf(Matrice2_editText3.getText().toString())));
                            break;
                        case 2:
                            Matrice3_editText1.setText(String.valueOf(Double.valueOf(Matrice1_editText1.getText().toString()) + Double.valueOf(Matrice2_editText1.getText().toString())));
                            Matrice3_editText2.setText(String.valueOf(Double.valueOf(Matrice1_editText2.getText().toString()) + Double.valueOf(Matrice2_editText2.getText().toString())));
                            Matrice3_editText3.setText(String.valueOf(Double.valueOf(Matrice1_editText3.getText().toString()) + Double.valueOf(Matrice2_editText3.getText().toString())));
                            Matrice3_editText5.setText(String.valueOf(Double.valueOf(Matrice1_editText5.getText().toString()) + Double.valueOf(Matrice2_editText5.getText().toString())));
                            Matrice3_editText6.setText(String.valueOf(Double.valueOf(Matrice1_editText6.getText().toString()) + Double.valueOf(Matrice2_editText6.getText().toString())));
                            Matrice3_editText7.setText(String.valueOf(Double.valueOf(Matrice1_editText7.getText().toString()) + Double.valueOf(Matrice2_editText7.getText().toString())));
                            break;
                        case 3:
                            Matrice3_editText1.setText(String.valueOf(Double.valueOf(Matrice1_editText1.getText().toString()) + Double.valueOf(Matrice2_editText1.getText().toString())));
                            Matrice3_editText2.setText(String.valueOf(Double.valueOf(Matrice1_editText2.getText().toString()) + Double.valueOf(Matrice2_editText2.getText().toString())));
                            Matrice3_editText3.setText(String.valueOf(Double.valueOf(Matrice1_editText3.getText().toString()) + Double.valueOf(Matrice2_editText3.getText().toString())));
                            Matrice3_editText5.setText(String.valueOf(Double.valueOf(Matrice1_editText5.getText().toString()) + Double.valueOf(Matrice2_editText5.getText().toString())));
                            Matrice3_editText6.setText(String.valueOf(Double.valueOf(Matrice1_editText6.getText().toString()) + Double.valueOf(Matrice2_editText6.getText().toString())));
                            Matrice3_editText7.setText(String.valueOf(Double.valueOf(Matrice1_editText7.getText().toString()) + Double.valueOf(Matrice2_editText7.getText().toString())));
                            Matrice3_editText9.setText(String.valueOf(Double.valueOf(Matrice1_editText9.getText().toString()) + Double.valueOf(Matrice2_editText9.getText().toString())));
                            Matrice3_editText10.setText(String.valueOf(Double.valueOf(Matrice1_editText10.getText().toString()) + Double.valueOf(Matrice2_editText10.getText().toString())));
                            Matrice3_editText11.setText(String.valueOf(Double.valueOf(Matrice1_editText11.getText().toString()) + Double.valueOf(Matrice2_editText11.getText().toString())));
                            break;
                        case 4:
                            Matrice3_editText1.setText(String.valueOf(Double.valueOf(Matrice1_editText1.getText().toString()) + Double.valueOf(Matrice2_editText1.getText().toString())));
                            Matrice3_editText2.setText(String.valueOf(Double.valueOf(Matrice1_editText2.getText().toString()) + Double.valueOf(Matrice2_editText2.getText().toString())));
                            Matrice3_editText3.setText(String.valueOf(Double.valueOf(Matrice1_editText3.getText().toString()) + Double.valueOf(Matrice2_editText3.getText().toString())));
                            Matrice3_editText5.setText(String.valueOf(Double.valueOf(Matrice1_editText5.getText().toString()) + Double.valueOf(Matrice2_editText5.getText().toString())));
                            Matrice3_editText6.setText(String.valueOf(Double.valueOf(Matrice1_editText6.getText().toString()) + Double.valueOf(Matrice2_editText6.getText().toString())));
                            Matrice3_editText7.setText(String.valueOf(Double.valueOf(Matrice1_editText7.getText().toString()) + Double.valueOf(Matrice2_editText7.getText().toString())));
                            Matrice3_editText9.setText(String.valueOf(Double.valueOf(Matrice1_editText9.getText().toString()) + Double.valueOf(Matrice2_editText9.getText().toString())));
                            Matrice3_editText10.setText(String.valueOf(Double.valueOf(Matrice1_editText10.getText().toString()) + Double.valueOf(Matrice2_editText10.getText().toString())));
                            Matrice3_editText11.setText(String.valueOf(Double.valueOf(Matrice1_editText11.getText().toString()) + Double.valueOf(Matrice2_editText11.getText().toString())));
                            Matrice3_editText13.setText(String.valueOf(Double.valueOf(Matrice1_editText13.getText().toString()) + Double.valueOf(Matrice2_editText13.getText().toString())));
                            Matrice3_editText14.setText(String.valueOf(Double.valueOf(Matrice1_editText14.getText().toString()) + Double.valueOf(Matrice2_editText14.getText().toString())));
                            Matrice3_editText15.setText(String.valueOf(Double.valueOf(Matrice1_editText15.getText().toString()) + Double.valueOf(Matrice2_editText15.getText().toString())));
                            break;
                    }
                    break;
                case 4:
                    switch (row) {
                        case 1:
                            Matrice3_editText1.setText(String.valueOf(Double.valueOf(Matrice1_editText1.getText().toString()) + Double.valueOf(Matrice2_editText1.getText().toString())));
                            Matrice3_editText2.setText(String.valueOf(Double.valueOf(Matrice1_editText2.getText().toString()) + Double.valueOf(Matrice2_editText2.getText().toString())));
                            Matrice3_editText3.setText(String.valueOf(Double.valueOf(Matrice1_editText3.getText().toString()) + Double.valueOf(Matrice2_editText3.getText().toString())));
                            Matrice3_editText4.setText(String.valueOf(Double.valueOf(Matrice1_editText4.getText().toString()) + Double.valueOf(Matrice2_editText4.getText().toString())));
                            break;
                        case 2:
                            Matrice3_editText1.setText(String.valueOf(Double.valueOf(Matrice1_editText1.getText().toString()) + Double.valueOf(Matrice2_editText1.getText().toString())));
                            Matrice3_editText2.setText(String.valueOf(Double.valueOf(Matrice1_editText2.getText().toString()) + Double.valueOf(Matrice2_editText2.getText().toString())));
                            Matrice3_editText3.setText(String.valueOf(Double.valueOf(Matrice1_editText3.getText().toString()) + Double.valueOf(Matrice2_editText3.getText().toString())));
                            Matrice3_editText4.setText(String.valueOf(Double.valueOf(Matrice1_editText4.getText().toString()) + Double.valueOf(Matrice2_editText4.getText().toString())));
                            Matrice3_editText5.setText(String.valueOf(Double.valueOf(Matrice1_editText5.getText().toString()) + Double.valueOf(Matrice2_editText5.getText().toString())));
                            Matrice3_editText6.setText(String.valueOf(Double.valueOf(Matrice1_editText6.getText().toString()) + Double.valueOf(Matrice2_editText6.getText().toString())));
                            Matrice3_editText7.setText(String.valueOf(Double.valueOf(Matrice1_editText7.getText().toString()) + Double.valueOf(Matrice2_editText7.getText().toString())));
                            Matrice3_editText8.setText(String.valueOf(Double.valueOf(Matrice1_editText8.getText().toString()) + Double.valueOf(Matrice2_editText8.getText().toString())));
                            break;
                        case 3:
                            Matrice3_editText1.setText(String.valueOf(Double.valueOf(Matrice1_editText1.getText().toString()) + Double.valueOf(Matrice2_editText1.getText().toString())));
                            Matrice3_editText2.setText(String.valueOf(Double.valueOf(Matrice1_editText2.getText().toString()) + Double.valueOf(Matrice2_editText2.getText().toString())));
                            Matrice3_editText3.setText(String.valueOf(Double.valueOf(Matrice1_editText3.getText().toString()) + Double.valueOf(Matrice2_editText3.getText().toString())));
                            Matrice3_editText4.setText(String.valueOf(Double.valueOf(Matrice1_editText4.getText().toString()) + Double.valueOf(Matrice2_editText4.getText().toString())));
                            Matrice3_editText5.setText(String.valueOf(Double.valueOf(Matrice1_editText5.getText().toString()) + Double.valueOf(Matrice2_editText5.getText().toString())));
                            Matrice3_editText6.setText(String.valueOf(Double.valueOf(Matrice1_editText6.getText().toString()) + Double.valueOf(Matrice2_editText6.getText().toString())));
                            Matrice3_editText7.setText(String.valueOf(Double.valueOf(Matrice1_editText7.getText().toString()) + Double.valueOf(Matrice2_editText7.getText().toString())));
                            Matrice3_editText8.setText(String.valueOf(Double.valueOf(Matrice1_editText8.getText().toString()) + Double.valueOf(Matrice2_editText8.getText().toString())));
                            Matrice3_editText9.setText(String.valueOf(Double.valueOf(Matrice1_editText9.getText().toString()) + Double.valueOf(Matrice2_editText9.getText().toString())));
                            Matrice3_editText10.setText(String.valueOf(Double.valueOf(Matrice1_editText10.getText().toString()) + Double.valueOf(Matrice2_editText10.getText().toString())));
                            Matrice3_editText12.setText(String.valueOf(Double.valueOf(Matrice1_editText12.getText().toString()) + Double.valueOf(Matrice2_editText12.getText().toString())));
                            Matrice3_editText11.setText(String.valueOf(Double.valueOf(Matrice1_editText11.getText().toString()) + Double.valueOf(Matrice2_editText11.getText().toString())));
                            break;
                        case 4:
                            Matrice3_editText1.setText(String.valueOf(Double.valueOf(Matrice1_editText1.getText().toString()) + Double.valueOf(Matrice2_editText1.getText().toString())));
                            Matrice3_editText2.setText(String.valueOf(Double.valueOf(Matrice1_editText2.getText().toString()) + Double.valueOf(Matrice2_editText2.getText().toString())));
                            Matrice3_editText3.setText(String.valueOf(Double.valueOf(Matrice1_editText3.getText().toString()) + Double.valueOf(Matrice2_editText3.getText().toString())));
                            Matrice3_editText4.setText(String.valueOf(Double.valueOf(Matrice1_editText4.getText().toString()) + Double.valueOf(Matrice2_editText4.getText().toString())));
                            Matrice3_editText5.setText(String.valueOf(Double.valueOf(Matrice1_editText5.getText().toString()) + Double.valueOf(Matrice2_editText5.getText().toString())));
                            Matrice3_editText6.setText(String.valueOf(Double.valueOf(Matrice1_editText6.getText().toString()) + Double.valueOf(Matrice2_editText6.getText().toString())));
                            Matrice3_editText7.setText(String.valueOf(Double.valueOf(Matrice1_editText7.getText().toString()) + Double.valueOf(Matrice2_editText7.getText().toString())));
                            Matrice3_editText8.setText(String.valueOf(Double.valueOf(Matrice1_editText8.getText().toString()) + Double.valueOf(Matrice2_editText8.getText().toString())));
                            Matrice3_editText9.setText(String.valueOf(Double.valueOf(Matrice1_editText9.getText().toString()) + Double.valueOf(Matrice2_editText9.getText().toString())));
                            Matrice3_editText10.setText(String.valueOf(Double.valueOf(Matrice1_editText10.getText().toString()) + Double.valueOf(Matrice2_editText10.getText().toString())));
                            Matrice3_editText11.setText(String.valueOf(Double.valueOf(Matrice1_editText11.getText().toString()) + Double.valueOf(Matrice2_editText11.getText().toString())));
                            Matrice3_editText12.setText(String.valueOf(Double.valueOf(Matrice1_editText12.getText().toString()) + Double.valueOf(Matrice2_editText12.getText().toString())));
                            Matrice3_editText13.setText(String.valueOf(Double.valueOf(Matrice1_editText13.getText().toString()) + Double.valueOf(Matrice2_editText13.getText().toString())));
                            Matrice3_editText14.setText(String.valueOf(Double.valueOf(Matrice1_editText14.getText().toString()) + Double.valueOf(Matrice2_editText14.getText().toString())));
                            Matrice3_editText15.setText(String.valueOf(Double.valueOf(Matrice1_editText15.getText().toString()) + Double.valueOf(Matrice2_editText15.getText().toString())));
                            Matrice3_editText16.setText(String.valueOf(Double.valueOf(Matrice1_editText16.getText().toString()) + Double.valueOf(Matrice2_editText16.getText().toString())));
                            break;
                    }
                    break;
            }
            Matrice3.setVisibility(View.VISIBLE);
            btnInverce.setVisibility(View.VISIBLE);
        }catch (Exception e){
            Matrice1_editText1.setError(getString(R.string.matrice_erreurs));
        }
    }

    public void Inverce_Matrix(double row, double col){
        if(row != col || row == 1){
            Toast toast = Toast.makeText(getApplicationContext(),getString(R.string.matrice_inverce_error),Toast.LENGTH_LONG);
            toast.show();
        }else{
            Matrice_Inverce.setVisibility(View.VISIBLE);
            if(row == 2){
                Inverce_Matrix_Order_two();
            }else if(row == 3){
                Inverce_Matrix_Order_three();
            }
        }

    }

    /**
     * Calcule l'inverce d'une matrice de second ordre ordre.
     */
    public void Inverce_Matrix_Order_two()
    {
        double determinant,a,b,c,d;

        a = Double.parseDouble(Matrice3_editText1.getText().toString());
        b = Double.parseDouble(Matrice3_editText2.getText().toString());
        c = Double.parseDouble(Matrice3_editText5.getText().toString());
        d = Double.parseDouble(Matrice3_editText6.getText().toString());

        determinant = a*d - b*c;

        if(determinant != 0){
            Matrice_Inverce_editText1.setText(String.valueOf(Math_Functions.Round_Double(  (1/determinant) * d,2  )));
            Matrice_Inverce_editText2.setText(String.valueOf(Math_Functions.Round_Double(  (1/determinant) * (b*-1),2  )));
            Matrice_Inverce_editText5.setText(String.valueOf(Math_Functions.Round_Double(  (1/determinant) * (c*-1),2  )));
            Matrice_Inverce_editText6.setText(String.valueOf(Math_Functions.Round_Double(  (1/determinant) * a,2  )));
        }else{
            Toast toast = Toast.makeText(getApplicationContext(),getString(R.string.matrice_inverce_determinant_error),Toast.LENGTH_LONG);
            toast.show();
        }


    }

    public void Inverce_Matrix_Order_three(){
        double determinant, a,b,c,d,e,f,g,h,i;
        a = Double.parseDouble(Matrice3_editText1.getText().toString());
        b = Double.parseDouble(Matrice3_editText2.getText().toString());
        c = Double.parseDouble(Matrice3_editText3.getText().toString());
        d = Double.parseDouble(Matrice3_editText5.getText().toString());
        e = Double.parseDouble(Matrice3_editText6.getText().toString());
        f = Double.parseDouble(Matrice3_editText7.getText().toString());
        g = Double.parseDouble(Matrice3_editText9.getText().toString());
        h = Double.parseDouble(Matrice3_editText10.getText().toString());
        i = Double.parseDouble(Matrice3_editText11.getText().toString());

        determinant = a * (e*i - f*h) - ( b* (d*i - g*f)) + ( c * (d*h - g*e) ) ;
        if(determinant != 0){
            Matrice_Inverce_editText1.setText(String.valueOf(Math_Functions.Round_Double(  (1/determinant)  * (e*i - f*h) ,2)));
            Matrice_Inverce_editText2.setText(String.valueOf(Math_Functions.Round_Double(  (1/determinant)  *( (b*i - h*c) *-1) ,2)));
            Matrice_Inverce_editText3.setText(String.valueOf(Math_Functions.Round_Double(  (1/determinant)  * (f*b - e*c) ,2)));
            Matrice_Inverce_editText5.setText(String.valueOf(Math_Functions.Round_Double(  (1/determinant)  *( (d*i - f*g) *-1) ,2)));
            Matrice_Inverce_editText6.setText(String.valueOf(Math_Functions.Round_Double(  (1/determinant)  * (a*i - g*c) ,2)));
            Matrice_Inverce_editText7.setText(String.valueOf(Math_Functions.Round_Double(  (1/determinant)  *( (a*f - d*c) *-1)  ,2)));
            Matrice_Inverce_editText9.setText(String.valueOf(Math_Functions.Round_Double(  (1/determinant)  * (d*h - g*e) ,2)));
            Matrice_Inverce_editText10.setText(String.valueOf(Math_Functions.Round_Double(  (1/determinant)  *( (a*h - g*b) *-1) ,2)));
            Matrice_Inverce_editText11.setText(String.valueOf(Math_Functions.Round_Double(  (1/determinant)  * (a*e - b*d) ,2)));
        }else{
            Toast toast = Toast.makeText(getApplicationContext(),getString(R.string.matrice_inverce_determinant_error),Toast.LENGTH_LONG);
            toast.show();
        }

    }

}
