package com.startup.jinx.android_maths.utils;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mégane Vilain on 05/05/2017.
 * Project Utils-Math
 */
public class Math_FunctionsTest {
    @Test
    public void delta() throws Exception {
        assertEquals(-59,Math_Functions.Delta(3,5,7),0.001 );
        assertEquals(49,Math_Functions.Delta(2,-5,-3),0.001);
        assertEquals(-4,Math_Functions.Delta(1,-4,5),0.001);
    }

    @Test
    public void factorielle() throws Exception {
        assertEquals(120, Math_Functions.Factorielle(5),0.001);
    }

    @Test
    public void esperance() throws Exception {
        assertEquals(25,Math_Functions.Esperance(5,5),00.1);
    }

    @Test
    public void variance() throws Exception {
        assertEquals(-100,Math_Functions.Variance(25,5),0.001);
    }

    @Test
    public void ecart() throws Exception {
        assertEquals(10,Math_Functions.Ecart(100),0.001);
    }

    @Test
    public void round_double() throws Exception{
        assertEquals(0.912,Math_Functions.Round_Doucle(0.912385,3),0.001);
        assertEquals(5.125,Math_Functions.Round_Doucle(5.1245865,3),0.001);
    }

}