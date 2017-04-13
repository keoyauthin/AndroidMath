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
import android.widget.Toast;

import com.startup.jinx.android_maths.R;
import com.startup.jinx.android_maths.views.HomeActivity;
import com.startup.jinx.android_maths.views.MatriceActivity;
import com.startup.jinx.android_maths.views.MoyenneActivity;
import com.startup.jinx.android_maths.views.PolynomeActivity;
import com.startup.jinx.android_maths.views.ProbaActivity;
import com.startup.jinx.android_maths.views.StatistiqueActivity;

/**
 * Created by Jinx on 12/04/2017.
 */

public class NavigationDrawer extends AppCompatActivity implements NavigationView
        .OnNavigationItemSelectedListener {

    protected NavigationView mNavigationView;
    protected Toolbar mToolbar;
    protected DrawerLayout mDrawerLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the correct view
        // If the fragment matches search or home, it displays digiwag_activity_wagon_search
        // Or if the fragment matches tab layout (expertise), it displays activity_main_expertise
        String activityStr = getClass().getSimpleName();

        if (activityStr.equals(HomeActivity.class.getSimpleName())) {
            setContentView(R.layout.home_activity);
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
            assert getSupportActionBar() != null;
            getSupportActionBar().setTitle(R.string.home_activity_title);

        } else if (activityStr.equals(PolynomeActivity.class.getSimpleName())) {
            setContentView(R.layout.polynome_activity);
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
            assert getSupportActionBar() != null;
            getSupportActionBar().setTitle(R.string.polynome_activity_title);

        } else if (activityStr.equals(StatistiqueActivity.class.getSimpleName())) {
            setContentView(R.layout.statistique_activity);
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
            assert getSupportActionBar() != null;
            getSupportActionBar().setTitle(R.string.statistique_activity_title);

        } else if (activityStr.equals(ProbaActivity.class.getSimpleName())) {
            setContentView(R.layout.proba_activity);
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
            assert getSupportActionBar() != null;
            getSupportActionBar().setTitle(R.string.proba_activity_title);

        } else if (activityStr.equals(MoyenneActivity.class.getSimpleName())){
            setContentView(R.layout.moyenne_activity);
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            setSupportActionBar(toolbar);
            assert getSupportActionBar() != null;
            getSupportActionBar().setTitle(R.string.moyenne_activity_title);

        }else if (activityStr.equals(MatriceActivity.class.getSimpleName())){
            setContentView(R.layout.matrice_activity);
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
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

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item){
        int id = item.getItemId();

        Intent intent;

        switch (id){
            case R.id.nav_drawer_grp_default_item_home:
                intent = new Intent(this, HomeActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
                break;
            case R.id.nav_drawer_grp_math_item_polynomes:
                intent = new Intent(this,PolynomeActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
                break;
            case R.id.digital_nav_drawer_grp_math_item_stat:
                intent = new Intent(this, StatistiqueActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
                break;
            case R.id.digital_nav_drawer_grp_math_item_proba:
                intent = new Intent(this,ProbaActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
                break;
            case R.id.digital_nav_drawer_grp_math_item_moyenne:
                intent = new Intent(this, MoyenneActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
                break;
            case R.id.digital_nav_drawer_grp_math_item_matriciel:
                intent = new Intent(this, MatriceActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
                break;
            case R.id.nav_drawer_item_communicate_item_infos:
                DialogInformations dialogInformations = new DialogInformations();
                dialogInformations.show(getFragmentManager(), "infos");
            default:
                break;

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        assert drawer != null;
        drawer.closeDrawer(GravityCompat.START);
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
