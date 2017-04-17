package com.startup.jinx.android_maths.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.startup.jinx.android_maths.R;

/**
 * Created by Mégane Vilain on 13/04/2017.
 * Project Utils-Math
 */

public class GraphismesFragment extends Fragment {

    private GraphismesFragmentInteractionListener graphismesFragmentInteractionListener;

    public GraphismesFragment () {
        // Required empty public constructor
    }

    public static GraphismesFragment newInstance() {
        GraphismesFragment fragment = new GraphismesFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if(context instanceof OnFragmentInteractionListener) {
            graphismesFragmentInteractionListener = (GraphismesFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString() + "must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.graphismesfragment,container,false);

        return view;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        graphismesFragmentInteractionListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface GraphismesFragmentInteractionListener extends OnFragmentInteractionListener {
    }
}
