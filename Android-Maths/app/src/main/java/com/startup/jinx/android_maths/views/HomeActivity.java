package com.startup.jinx.android_maths.views;

import android.os.Bundle;

import com.startup.jinx.android_maths.R;
import com.startup.jinx.android_maths.widgets.NavigationDrawer;

/**
 * Created by Mégane Vilain on ${DATE}.
 * Project Utils-Math
 */

public class HomeActivity extends NavigationDrawer {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mNavigationView.getMenu().findItem(R.id.digital_nav_drawer_grp_math_item_matriciel).setCheckable(true);
        mNavigationView.getMenu().findItem(R.id.nav_drawer_grp_default_item_home).setChecked(true);
    }




}
