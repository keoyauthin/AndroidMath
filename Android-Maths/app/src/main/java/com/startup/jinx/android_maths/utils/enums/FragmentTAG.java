package com.startup.jinx.android_maths.utils.enums;

/**
 * Created by Mégane Vilain on 18/04/2017.
 * Project Utils-Math
 * Contient les tags des différents fragments de l'application.
 */
public enum FragmentTAG {

    /**
     * Polynome second ordre fragment tag.
     */
    POLYNOME_SECOND_ORDRE("POLYNOME_SECON_ORDRE"),

    /**
     * Polynome troisieme ordre fragment tag.
     */
    POLYNOME_TROISIEME_ORDRE("POLYNOME_TROISIEME_ORDRE");

    /**
     * @param Tag
     */
    private String tag;

    FragmentTAG(String tag) {
        this.tag = tag;
    }

    /**
     * Gets tag.
     *
     * @return Tag
     */
    public String getTag() {
        return tag;
    }
}
