package com.imago.mobile.android_maths.widgets;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.imago.mobile.android_maths.R;
import com.imago.mobile.android_maths.activities.HomeActivity;
import com.imago.mobile.android_maths.activities.MatriceActivity;
import com.imago.mobile.android_maths.activities.PolynomeActivity;
import com.imago.mobile.android_maths.activities.ProbaActivity;
import com.imago.mobile.android_maths.activities.StatistiqueActivity;

/**
 * Created by Mégane Vilain on 12/04/2017.
 * Permet de gérer les interactions avec le navigation drawer.
 */
public abstract class NavigationDrawer extends AppCompatActivity  {

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

    /**
     * Drawer toogle
     */
    protected ActionBarDrawerToggle mDrawerToggle;

    /**
     * Tag
     */
    protected String mTag;

    /**
     * Affiche la vue correspondant à l'activité en cours.
     *
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_drawer);

        // Set log TAG
        mTag = this.getClass().getSimpleName();

        // Set a Toolbar to replace the ActionBar.
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(mToolbar);

        // Find drawer view
        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        mDrawerToggle = setupDrawerToggle();

        // Tie DrawerLayout events to the ActionBarToggle
        mDrawerLayout.addDrawerListener(mDrawerToggle);

        // Find navigation drawer view
        mNavigationView = (NavigationView) findViewById(R.id.nav_view);

        // Setup navigation drawer view
        setupDrawerContent(mNavigationView);

    }

    private ActionBarDrawerToggle setupDrawerToggle() {
        // NOTE: Make sure you pass in a valid toolbar reference.  ActionBarDrawToggle() does not
        // require it  and will not render the hamburger icon without it.
        return new ActionBarDrawerToggle(this, mDrawerLayout, mToolbar, R.string
                .nav_drawer_open, R.string.nav_drawer_close);
    }

    private void setupDrawerContent(NavigationView navigationView){
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                if (mDrawerToggle.onOptionsItemSelected(item)) {
                    return true;
                }

                int id = item.getItemId();

                switch (id){
                    case R.id.nav_home:
                        startHomeActivity();

                        break;
                    case R.id.nav_polynome:
                        startPolynomeActivity();

                        break;
                    case R.id.nav_proba:
                        startProbaActivity();

                        break;
                    case R.id.nav_stat:
                        startStatActivity();

                        break;
                    case R.id.nav_matrice:
                        startMatriceActivity();

                        break;
                    default:
                        break;
                }

                DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
                drawer.closeDrawer(GravityCompat.START);

                return true;
            }
        });
    }

    private void startHomeActivity(){
        final Intent intent = new Intent(this, HomeActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(intent);
    }

    private void startPolynomeActivity(){
        final Intent intent = new Intent(this, PolynomeActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP );
        startActivity(intent);
    }

    private void startProbaActivity(){
        final Intent intent = new Intent(this,ProbaActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP );
        startActivity(intent);
    }

    private void startStatActivity(){
        final Intent intent = new Intent(this, StatistiqueActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    private void startMatriceActivity(){
        final Intent intent = new Intent(this, MatriceActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        startActivity(intent);
    }

    /**
     * Setup UI references
     */
    protected abstract void setupUI();

    // `onPostCreate` called when activity start-up is complete after `onStart()`
    // NOTE 1: Make sure to override the method with only a single `Bundle` argument
    // Note 2: Make sure you implement the correct `onPostCreate(Bundle savedInstanceState)`
    // method.
    // There are 2 signatures and only `onPostCreate(Bundle state)` shows the hamburger icon.
    @Override
    protected void onPostCreate(Bundle savedInstanceState) {
        super.onPostCreate(savedInstanceState);
        // Sync the toggle state after onRestoreInstanceState has occurred.
        mDrawerToggle.syncState();
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            Intent intent = new Intent(this, HomeActivity.class);
            startActivity(intent);
        }
    }
}
