package com.startup.jinx.android_maths.activities;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.widget.FrameLayout;

import com.startup.jinx.android_maths.R;
import com.startup.jinx.android_maths.adapter.ViewPagerAdapter;
import com.startup.jinx.android_maths.fragment.Polynome_Second_Ordre_Fragment;
import com.startup.jinx.android_maths.fragment.Polynome_Troisieme_Ordre_Fragment;
import com.startup.jinx.android_maths.widgets.NavigationDrawer;

/**
 * Created by Mégane Vilain on ${DATE}.
 * Project Utils-Math
 */

public class PolynomeActivity extends NavigationDrawer  {


    //UI elements
    private TabLayout mTabLayout;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        final LayoutInflater inflater = getLayoutInflater();
        final FrameLayout container = (FrameLayout) findViewById(R.id.content_frame);
        inflater.inflate(R.layout.activity_polynome,container);

        setupUI();
        mNavigationView.getMenu().findItem(R.id.nav_polynome).setChecked(true);
    }

    @Override
    protected void setupUI(){
        mTabLayout = (TabLayout) findViewById(R.id.polynome_tablayout);
        mViewPager = (ViewPager) findViewById(R.id.polynome_viewpager);

        setupViewPager(mViewPager);
        mTabLayout.setupWithViewPager(mViewPager);
    }


    private void setupViewPager(ViewPager mViewPager) {

        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(new Polynome_Second_Ordre_Fragment(),"Second Ordre");
        adapter.addFragment(new Polynome_Troisieme_Ordre_Fragment(),"Troisième Ordre");

        mViewPager.setAdapter(adapter);
    }
}
