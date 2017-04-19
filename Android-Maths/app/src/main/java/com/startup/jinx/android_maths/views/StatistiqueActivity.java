package com.startup.jinx.android_maths.views;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.TabLayout;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.startup.jinx.android_maths.R;
import com.startup.jinx.android_maths.adapter.ViewPagerAdapter;
import com.startup.jinx.android_maths.fragment.OnFragmentInteractionListener;
import com.startup.jinx.android_maths.fragment.Statistique_Entree_Auto_Fragment;
import com.startup.jinx.android_maths.fragment.Statistique_Entree_Manuelle_Fragment;
import com.startup.jinx.android_maths.widgets.NavigationDrawer;

/**
 * Created by Mégane Vilain on ${DATE}.
 * Project Utils-Math
 */

public class StatistiqueActivity  extends NavigationDrawer {

    // Listener
    private OnFragmentInteractionListener mListener;

    //UI elements
    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mNavigationView.getMenu().findItem(R.id.digital_nav_drawer_grp_math_item_stat).setChecked(true);

        mTabLayout = (TabLayout) findViewById(R.id.statistique_tablayout);
        mViewPager = (ViewPager) findViewById(R.id.statistique_viewpager);

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

    private void setupViewPager(ViewPager mViewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new Statistique_Entree_Manuelle_Fragment(),"Saisie manuelle");
        adapter.addFragment(new Statistique_Entree_Auto_Fragment(),"Saisie automatique");

        mViewPager.setAdapter(adapter);
    }

}
