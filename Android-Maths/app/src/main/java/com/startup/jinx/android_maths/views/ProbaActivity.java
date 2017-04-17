package com.startup.jinx.android_maths.views;

import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.Button;

import com.startup.jinx.android_maths.R;
import com.startup.jinx.android_maths.fragment.GraphismesFragment;
import com.startup.jinx.android_maths.widgets.NavigationDrawer;
import com.startup.jinx.android_maths.fragment.OnFragmentInteractionListener;

/**
 * Created by Mégane Vilain on ${DATE}.
 * Project Utils-Math
 */

public class ProbaActivity extends NavigationDrawer implements OnFragmentInteractionListener, GraphismesFragment.GraphismesFragmentInteractionListener {


    //TODO: Regrouper en deux fragments
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mNavigationView.getMenu().findItem(R.id.digital_nav_drawer_grp_math_item_proba).setChecked(true);
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
    public void onFragmentInteraction(Uri uri) {
    }

    @Override
    public void onChangeFragment(Uri nextFragmentUri) {

        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment nextFragment = null;
        nextFragment = GraphismesFragment.newInstance();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.content_proba, nextFragment);
        fragmentTransaction.commit();
    }

    public void goToNextFragment(View view){
        onChangeFragment(Uri.parse("GraphismesFragment"));
    }
}
