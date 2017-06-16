package com.startup.jinx.android_maths.widgets;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.app.NavUtils;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

import com.startup.jinx.android_maths.R;
import com.startup.jinx.android_maths.views.HomeActivity;
import com.startup.jinx.android_maths.views.MatriceActivity;
import com.startup.jinx.android_maths.views.StatistiqueActivity;
import com.startup.jinx.android_maths.views.PolynomeActivity;
import com.startup.jinx.android_maths.views.ProbaActivity;

/**
 * Created by Mégane Vilain on 12/04/2017.
 * Permet de gérer les interactions avec le navigation drawer.
 */
public abstract class NavigationDrawer extends AppCompatActivity implements NavigationView
        .OnNavigationItemSelectedListener {

    /**
     * Navigation view.
     */
    protected NavigationView mNavigationView;
    /**
     * toolbar.
     */
    protected Toolbar mToolbar;
    /**
     * Drawer layout.
     */
    protected DrawerLayout mDrawerLayout;

    //TODO:ADD FLAGS

    /**
     * Affiche la vue correspondant à l'activité en cours.
     *
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /**
         * Nom de l'activité en cours
         */

        String activityStr = getClass().getSimpleName();

        if (activityStr.equals(HomeActivity.class.getSimpleName())) {
            setContentView(R.layout.home_activity);
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            toolbar.setTitleTextColor(0xFFFFFFFF);
            setSupportActionBar(toolbar);
            assert getSupportActionBar() != null;
            getSupportActionBar().setTitle(R.string.home_activity_title);

        } else if (activityStr.equals(PolynomeActivity.class.getSimpleName())) {
            setContentView(R.layout.polynome_activity);
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            toolbar.setTitleTextColor(0xFFFFFFFF);
            setSupportActionBar(toolbar);
            assert getSupportActionBar() != null;
            getSupportActionBar().setTitle(R.string.polynome_activity_title);

        } else if (activityStr.equals(ProbaActivity.class.getSimpleName())) {
            setContentView(R.layout.proba_activity);
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            toolbar.setTitleTextColor(0xFFFFFFFF);
            setSupportActionBar(toolbar);
            assert getSupportActionBar() != null;
            getSupportActionBar().setTitle(R.string.proba_activity_title);

        } else if (activityStr.equals(StatistiqueActivity.class.getSimpleName())){
            setContentView(R.layout.moyenne_activity);
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            toolbar.setTitleTextColor(0xFFFFFFFF);
            setSupportActionBar(toolbar);
            assert getSupportActionBar() != null;
            getSupportActionBar().setTitle(R.string.statistique_activity_title);

        }else if (activityStr.equals(MatriceActivity.class.getSimpleName())){
            setContentView(R.layout.statistique_activity);
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            toolbar.setTitleTextColor(0xFFFFFFFF);
            setSupportActionBar(toolbar);
            assert getSupportActionBar() != null;
            getSupportActionBar().setTitle(R.string.matrice_activity_title);
        }

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);


        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle mActionBarDrawerToggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.nav_drawer_open,R.string.nav_drawer_close) {
            @Override
            public void onDrawerOpened (View view){
                super.onDrawerOpened(view);
            }

            @Override
            public void onDrawerClosed(View view){
                super.onDrawerClosed(view);
            }
        };
        assert drawerLayout != null;
        drawerLayout.addDrawerListener(mActionBarDrawerToggle);
        mActionBarDrawerToggle.syncState();

        mNavigationView = (NavigationView) findViewById(R.id.nav_view);
        assert mNavigationView != null;
        mNavigationView.setNavigationItemSelectedListener(this);

    }

    /**
     * Se déclenche à la sélection d'un item.
     *
     */

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item){
        /**
         * Id de l'iem sélectionné
         */
        int id = item.getItemId();

        Intent intent;

        switch (id){
            case R.id.nav_drawer_grp_default_item_home:
                intent = new Intent(this, HomeActivity.class);
                startActivity(intent);
                break;
            case R.id.nav_drawer_grp_math_item_polynomes:
                intent = new Intent(this,PolynomeActivity.class);
                startActivity(intent);
                break;
            case R.id.digital_nav_drawer_grp_math_item_proba:
                intent = new Intent(this,ProbaActivity.class);
                startActivity(intent);
                break;
            case R.id.digital_nav_drawer_grp_math_item_stat:
                intent = new Intent(this, StatistiqueActivity.class);
                startActivity(intent);
                break;
            case R.id.digital_nav_drawer_grp_math_item_matrice:
                intent = new Intent(this, MatriceActivity.class);
                startActivity(intent);
                break;
            default:
                break;

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        assert drawer != null;
        drawer.closeDrawer(GravityCompat.START);

        // Arrête les activites au fur et a mesure sauf l'activité home
        if(this.getClass() != HomeActivity.class)
        {
            finish();
        }
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
