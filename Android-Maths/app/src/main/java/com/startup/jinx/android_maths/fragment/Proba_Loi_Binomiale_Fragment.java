package com.startup.jinx.android_maths.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.startup.jinx.android_maths.R;

/**
 * Created by Mégane Vilain on 18/04/2017.
 * Project Utils-Math
 */

public class Proba_Loi_Binomiale_Fragment extends Fragment {
    /**
     * Instanticie le fragment.
     */
    public Proba_Loi_Binomiale_Fragment(){
        //Required empty public constructor
    }

    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onAttach(Context context){
        super.onAttach(context);
    }
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.proba_loi_binomiale_fragment,container,false);


        return view;
    }

    @Override
    public void onDetach(){
        super.onDetach();
    }

}