package com.startup.jinx.android_maths.views;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import com.startup.jinx.android_maths.R;
import com.startup.jinx.android_maths.widgets.NavigationDrawer;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by Mégane Vilain on ${DATE}.
 * Project Utils-Math
 */

public class MoyenneActivity extends NavigationDrawer {

    EditText editText_Number;

    ListView listView;

    TextView textView_moyenne, textView_ecarttype, textView_mode, textView_mediane;

    List<String> numbers_list;


    Button btnAdd;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mNavigationView.getMenu().findItem(R.id.digital_nav_drawer_grp_math_item_moyenne).setChecked(true);

        editText_Number = (EditText) findViewById(R.id.editText_Number);

        listView = (ListView) findViewById(R.id.listView);

        textView_moyenne = (TextView) findViewById(R.id.textView_Moyenne_Data);
        textView_ecarttype = (TextView) findViewById(R.id.textView_ecarttype_resultat);
        textView_mediane = (TextView) findViewById(R.id.textView_mediane_Data);
        textView_mode = (TextView) findViewById(R.id.textView_Mode_Data);

        btnAdd = (Button) findViewById(R.id.btnAdd);

        numbers_list = new ArrayList<String>();

        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, numbers_list);

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
                    numbers_list.add(editText_Number.getText().toString());
                    arrayAdapter.notifyDataSetChanged();
                    Calcul();
                }
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

    public void Calcul(){
        double Moyenne = 0;
        listView.getCount();

        for(int i =0; i < listView.getCount();i++){
            Moyenne = Moyenne + Double.parseDouble(numbers_list.get(i));
        }
        Moyenne = Moyenne / listView.getCount();
        textView_moyenne.setText(String.valueOf(Moyenne));
    }
}
