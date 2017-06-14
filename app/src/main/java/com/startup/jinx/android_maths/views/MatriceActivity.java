package com.startup.jinx.android_maths.views;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;

import com.startup.jinx.android_maths.R;
import com.startup.jinx.android_maths.widgets.NavigationDrawer;

/**
 * Created by Mégane Vilain on ${DATE}.
 * Project Utils-Math
 */

public class MatriceActivity extends NavigationDrawer {


    EditText Matrice1_editText1, Matrice1_editText2, Matrice1_editText3, Matrice1_editText4,
            Matrice1_editText5, Matrice1_editText6, Matrice1_editText7, Matrice1_editText8,
            Matrice1_editText9, Matrice1_editText10, Matrice1_editText11, Matrice1_editText12,
            Matrice1_editText13, Matrice1_editText14, Matrice1_editText15, Matrice1_editText16;

    EditText Matrice2_editText1, Matrice2_editText2, Matrice2_editText3, Matrice2_editText4,
            Matrice2_editText5, Matrice2_editText6, Matrice2_editText7, Matrice2_editText8,
            Matrice2_editText9, Matrice2_editText10, Matrice2_editText11, Matrice2_editText12,
            Matrice2_editText13, Matrice2_editText14, Matrice2_editText15, Matrice2_editText16;

    EditText Matrice3_editText1, Matrice3_editText2, Matrice3_editText3, Matrice3_editText4,
            Matrice3_editText5, Matrice3_editText6, Matrice3_editText7, Matrice3_editText8,
            Matrice3_editText9, Matrice3_editText10, Matrice3_editText11, Matrice3_editText12,
            Matrice3_editText13, Matrice3_editText14, Matrice3_editText15, Matrice3_editText16;

    Button btnCalcul, btnReset;

    Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mNavigationView.getMenu().findItem(R.id.digital_nav_drawer_grp_math_item_matrice).setChecked(true);

        View Matrice1 = findViewById(R.id.matrice1);
        View Matrice2 = findViewById(R.id.matrice2);
        View Matrice3 = findViewById(R.id.matrice3);

        btnCalcul = (Button) findViewById(R.id.btnCalcul);
        btnReset =(Button) findViewById(R.id.btnReset);

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

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Dialog_Order();
            }
        });


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.signe_operatoire_spinner,android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        Dialog_Order();


    }

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
                        if(spinner.getSelectedItem().toString().equals("-")){
                            Soustaction_Matrices(col, row);
                        }
                        else{
                            Addition_Matrices(col, row);
                        }
                    }
                });
            }
            if (resultCode == Activity.RESULT_CANCELED) {
            }
        }
    }

    public void Dialog_Order(){
        Intent intent = new Intent(this, Dialog_Matrice.class);
        startActivityForResult(intent,1);
    }

    private void Build_Matrice(int row, int col){

        switch (col){
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

    private void Hide_Col(int col){

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
                break;
        }

    }
    private void Hide_Row(int row){
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
                break;
        }
    }

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
        }catch (Exception e)
        {
            Matrice1_editText1.setError(getString(R.string.matrice_erreurs));
        }

    }

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
                            Matrice3_editText6.setText(String.valueOf(Double.valueOf(Matrice1_editText6.getText().toString()) + Double.valueOf(Matrice2_editText2.getText().toString())));
                            break;
                        case 3:
                            Matrice3_editText1.setText(String.valueOf(Double.valueOf(Matrice1_editText1.getText().toString()) + Double.valueOf(Matrice2_editText1.getText().toString())));
                            Matrice3_editText2.setText(String.valueOf(Double.valueOf(Matrice1_editText2.getText().toString()) + Double.valueOf(Matrice2_editText2.getText().toString())));
                            Matrice3_editText5.setText(String.valueOf(Double.valueOf(Matrice1_editText5.getText().toString()) + Double.valueOf(Matrice2_editText5.getText().toString())));
                            Matrice3_editText6.setText(String.valueOf(Double.valueOf(Matrice1_editText6.getText().toString()) + Double.valueOf(Matrice2_editText2.getText().toString())));
                            Matrice3_editText9.setText(String.valueOf(Double.valueOf(Matrice1_editText9.getText().toString()) + Double.valueOf(Matrice2_editText9.getText().toString())));
                            Matrice3_editText10.setText(String.valueOf(Double.valueOf(Matrice1_editText10.getText().toString()) + Double.valueOf(Matrice2_editText10.getText().toString())));
                            break;
                        case 4:
                            Matrice3_editText1.setText(String.valueOf(Double.valueOf(Matrice1_editText1.getText().toString()) + Double.valueOf(Matrice2_editText1.getText().toString())));
                            Matrice3_editText2.setText(String.valueOf(Double.valueOf(Matrice1_editText2.getText().toString()) + Double.valueOf(Matrice2_editText2.getText().toString())));
                            Matrice3_editText5.setText(String.valueOf(Double.valueOf(Matrice1_editText5.getText().toString()) + Double.valueOf(Matrice2_editText5.getText().toString())));
                            Matrice3_editText6.setText(String.valueOf(Double.valueOf(Matrice1_editText6.getText().toString()) + Double.valueOf(Matrice2_editText2.getText().toString())));
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
        }catch (Exception e){
            Matrice1_editText1.setError(getString(R.string.matrice_erreurs));
        }
    }
}
