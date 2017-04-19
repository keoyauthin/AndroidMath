package com.startup.jinx.android_maths.utils.enums;

/**
 * Created by Mégane Vilain on 18/04/2017.
 * Project Utils-Math
 */

public enum FragmentTAG {

    POLYNOME_SECOND_ORDRE("POLYNOME_SECON_ORDRE"),POLYNOME_TROISIEME_ORDRE("POLYNOME_TROISIEME_ORDRE");

    private String tag;

    FragmentTAG(String tag) {
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }
}
