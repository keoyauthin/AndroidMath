package com.imago.mobile.android_maths.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.Toast;

import com.imago.mobile.android_maths.R;
import com.imago.mobile.android_maths.widgets.NavigationDrawer;

/**
 * Created by Mégane Vilain on ${DATE}.
 * Project Utils-Math
 */

public class HomeActivity extends NavigationDrawer {

    Intent intent;
    ImageButton polynome_btn;
    ImageButton proba_btn;
    ImageButton statistique_btn;
    ImageButton matrice_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        final LayoutInflater inflater = getLayoutInflater();
        final FrameLayout container = (FrameLayout) findViewById(R.id.content_frame);
        inflater.inflate(R.layout.activity_home,container);

        setupUI();

        mNavigationView.getMenu().findItem(R.id.nav_home).setChecked(true);
    }

    @Override
    protected void setupUI() {

        polynome_btn = (ImageButton) findViewById(R.id.home_activity_polynome_btn);
        proba_btn = (ImageButton) findViewById(R.id.home_activity_proba_btn);
        statistique_btn =(ImageButton) findViewById(R.id.home_activity_statistique_btn);
        matrice_btn = (ImageButton) findViewById(R.id.home_activity_matrice_btn);

        polynome_btn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(),"Polynômes",Toast.LENGTH_SHORT);
                toast.show();
                return true;
            }
        });

        polynome_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getApplicationContext(),PolynomeActivity.class);
                startActivity(intent);
            }
        });

        proba_btn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(),"Probabilités",Toast.LENGTH_SHORT);
                toast.show();
                return true;
            }
        });

        proba_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getApplicationContext(),ProbaActivity.class);
                startActivity(intent);
            }
        });

        statistique_btn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(),"Moyenne",Toast.LENGTH_SHORT);
                toast.show();
                return true;
            }
        });

        statistique_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getApplicationContext(),StatistiqueActivity.class);
                startActivity(intent);
            }
        });

        matrice_btn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast toast = Toast.makeText(getApplicationContext(),"Matrices",Toast.LENGTH_SHORT);
                toast.show();
                return true;
            }
        });

        matrice_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getApplicationContext(),MatriceActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onResume() {
        super.onResume();  // Always call the superclass method
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}

