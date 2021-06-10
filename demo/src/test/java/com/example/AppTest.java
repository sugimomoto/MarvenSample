package com.example;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void test_Culc_Plus()
    {
        Culc cul = new Culc();

        Integer expect = 5;
        Integer actual = cul.Plus(2, 3);

        assertEquals(expect, actual);

    }


}
