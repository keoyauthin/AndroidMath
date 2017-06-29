package com.imago.mobile.android_maths.functions;

import android.app.Activity;
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
     * @param activity Activité en cours lors de l'appel de la fonction
     */
    public static void hideKeyboard(final Activity activity) {
        final InputMethodManager inputMethodManager = (InputMethodManager) activity
                .getSystemService(Activity.INPUT_METHOD_SERVICE);
        if (activity.getCurrentFocus() != null) {
            inputMethodManager.hideSoftInputFromWindow(activity.getCurrentFocus().getWindowToken
                    (), 0);
        }
    }

    /**
     * Arrondit un nombre et reourne le résulat.
     *
     * @param number  Nombre à arrondir
     * @param nbapVig Nombres de chiffres après la virgule
     * @return Résultat
     */
    public static double Round_Double(double number, double nbapVig)
    {
        return(double)((int)(number * Math.pow(10,nbapVig) + .5)) / Math.pow(10,nbapVig);
    }
}
