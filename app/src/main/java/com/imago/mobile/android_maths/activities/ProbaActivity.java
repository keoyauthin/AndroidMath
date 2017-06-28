package com.startup.jinx.android_maths.activities;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;

import com.startup.jinx.android_maths.R;
import com.startup.jinx.android_maths.adapter.ViewPagerAdapter;
import com.startup.jinx.android_maths.fragment.Proba_Loi_Binomiale_Fragment;
import com.startup.jinx.android_maths.fragment.Proba_Loi_Normale_Fragment;
import com.startup.jinx.android_maths.fragment.Proba_Loi_Poisson_Fragment;
import com.startup.jinx.android_maths.fragment.Proba_Loi_Uniforme_Fragment;
import com.startup.jinx.android_maths.fragment.Proba_Test_KHI_Fragment;
import com.startup.jinx.android_maths.widgets.NavigationDrawer;

/**
 * Created by Mégane Vilain on ${DATE}.
 * Project Utils-Math
 */

public class ProbaActivity extends NavigationDrawer {


    //UI elements
    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    //TODO: Regrouper en deux fragments
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        final LayoutInflater inflater = getLayoutInflater();
        final FrameLayout container = (FrameLayout) findViewById(R.id.content_frame);
        inflater.inflate(R.layout.activity_proba,container);

        setupUI();
        mNavigationView.getMenu().findItem(R.id.nav_proba).setChecked(true);
    }

    @Override
    protected void setupUI(){
        mTabLayout = (TabLayout) findViewById(R.id.proba_tablayout);
        mViewPager = (ViewPager) findViewById(R.id.proba_viewpager);

        setupViewPager(mViewPager);
        mTabLayout.setupWithViewPager(mViewPager);

        Intent intent = getIntent();
        if(intent != null){
            String intent_ecart_type = intent.getStringExtra("ecart-type");
        }
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
