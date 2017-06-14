package com.startup.jinx.android_maths.views;

import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.Button;

import com.startup.jinx.android_maths.R;
import com.startup.jinx.android_maths.adapter.ViewPagerAdapter;
import com.startup.jinx.android_maths.fragment.Proba_Loi_Binomiale_Fragment;
import com.startup.jinx.android_maths.fragment.Proba_Loi_Normale_Fragment;
import com.startup.jinx.android_maths.fragment.Proba_Loi_Poisson_Fragment;
import com.startup.jinx.android_maths.fragment.Proba_Loi_Uniforme_Fragment;
import com.startup.jinx.android_maths.fragment.Proba_Test_KHI_Fragment;
import com.startup.jinx.android_maths.widgets.NavigationDrawer;
import com.startup.jinx.android_maths.fragment.OnFragmentInteractionListener;

/**
 * Created by Mégane Vilain on ${DATE}.
 * Project Utils-Math
 */

public class ProbaActivity extends NavigationDrawer implements OnFragmentInteractionListener {

    // Listener
    private OnFragmentInteractionListener mListener;

    //UI elements
    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    //TODO: Regrouper en deux fragments
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mNavigationView.getMenu().findItem(R.id.digital_nav_drawer_grp_math_item_proba).setChecked(true);

        mTabLayout = (TabLayout) findViewById(R.id.proba_tablayout);
        mViewPager = (ViewPager) findViewById(R.id.proba_viewpager);

        setupViewPager(mViewPager);
        mTabLayout.setupWithViewPager(mViewPager);
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
    }

    public void goToNextFragment(View view){
       //onChangeFragment(Uri.parse("GraphismesFragment"));
    }

    private void setupViewPager(ViewPager mViewPager) {

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new Proba_Loi_Uniforme_Fragment(),"Loi Uniforme");
        adapter.addFragment(new Proba_Loi_Binomiale_Fragment(),"Loi Binomiale");
        adapter.addFragment(new Proba_Loi_Poisson_Fragment(),"Loi de Poisson");
        adapter.addFragment(new Proba_Loi_Normale_Fragment(),"Loi Normale");
        adapter.addFragment(new Proba_Test_KHI_Fragment(),"Test de KHI");

        mViewPager.setAdapter(adapter);
    }
}
