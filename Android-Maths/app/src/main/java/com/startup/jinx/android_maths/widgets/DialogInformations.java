package com.startup.jinx.android_maths.widgets;

import android.annotation.SuppressLint;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;

import com.startup.jinx.android_maths.R;

/**
 * Created by Mégane Vilain on 13/04/2017.
 * Project Utils-Math
 */

public class DialogInformations extends DialogFragment {

    DialogInterface.OnClickListener onClickListener;

    @SuppressLint("InflateParams")
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        // Get the layout inflater
        LayoutInflater inflater = getActivity().getLayoutInflater();

        // Inflate and set the layout for the dialog
        // Pass null as the parent view because its going in the dialog layout
        //builder.setView(inflater.inflate(R.layout.dialog_infos, null)).setNeutralButton(getString(R.string.action_ok), (dialogInterface, i) -> {});

        builder.setView(inflater.inflate(R.layout.dialog_infos, null)).setNeutralButton(getString(R.string.action_ok),onClickListener );

        return builder.create();
    }
    //TODO: Mauvias item checked
}
