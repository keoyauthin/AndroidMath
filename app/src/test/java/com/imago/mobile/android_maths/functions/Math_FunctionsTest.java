package com.imago.mobile.android_maths.functions;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Mégane Vilain on 05/05/2017.
 * Project Utils-Math
 */
public class Math_FunctionsTest {
    @Test
    public void delta() throws Exception {
        assertEquals(-59, Math_Functions2.Delta_Second_Ordre(3,5,7),0.001 );
        assertEquals(49, Math_Functions2.Delta_Second_Ordre(2,-5,-3),0.001);
        assertEquals(-4, Math_Functions2.Delta_Second_Ordre(1,-4,5),0.001);
    }

    @Test
    public void round_double() throws Exception{
        assertEquals(0.912, Math_Functions2.Round_Double(0.912385,3),0.001);
        assertEquals(5.125, Math_Functions2.Round_Double(5.1245865,3),0.001);
    }

}