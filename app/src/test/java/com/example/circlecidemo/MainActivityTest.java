package com.example.circlecidemo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
@RunWith(JUnit4.class)
public class MainActivityTest {

    private MainActivity ma;

    @Before
    public void setup ()
    {
        ma = new MainActivity();
    }

    @Test
    public void addition_isCorrect(){



        assertEquals(9,ma.Somme(5,4));

    }
}