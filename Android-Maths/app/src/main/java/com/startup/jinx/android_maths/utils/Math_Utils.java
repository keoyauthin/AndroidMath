package com.startup.jinx.android_maths.utils;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/**
 * Created by Mégane Vilain on 05/05/2017.
 * Classe contenant des fonctions pour intéragir avec l'interface graphique.
 * Project Utils-Math
 * @author Mégane Vilain
 *
 */
public class Math_Utils {

    /**
     * Fait disparaire le clavier.
     *
     * @param context Contexte de l'application
     * @param view    Vue
     */
    public static void hideKeyboard(Context context, View view) {
        InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
