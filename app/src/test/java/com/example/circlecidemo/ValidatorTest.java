package com.example.circlecidemo;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorTest {


    private final Validator validator=new Validator();
    private final MainActivity mainActivity=new MainActivity();

    @Test
    public void Somme()
    {
        assertEquals(9,mainActivity.Somme(5,4));
    }
}
