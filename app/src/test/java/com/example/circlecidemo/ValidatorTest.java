package com.example.circlecidemo;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidatorTest {


    private final Validator validator=new Validator();


    @Test
    public void Somme()
    {
        assertEquals(9,MainActivity.Somme(5,4));
    }
}
