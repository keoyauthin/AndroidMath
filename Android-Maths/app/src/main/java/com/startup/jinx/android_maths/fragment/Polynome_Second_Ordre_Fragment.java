package com.startup.jinx.android_maths.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.startup.jinx.android_maths.R;


/**
 * Created by Mégane Vilain on 18/04/2017.
 * Project Utils-Math
 */

public class Polynome_Second_Ordre_Fragment extends Fragment {

    Spinner spinner;
    Spinner spinner2;

    public Polynome_Second_Ordre_Fragment(){
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.polynome_second_ordre_fragment,container,false);

        spinner = (Spinner) view.findViewById(R.id.polynome_activity_spinner);
        spinner2 = (Spinner) view.findViewById(R.id.polynome_activity_spinner2);

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this.getContext(),R.array.signe_operatoire_spinner,android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
        spinner2.setAdapter(adapter);

        return  view;
    }

    @Override
    public void onDetach(){
        super.onDetach();
    }

}
