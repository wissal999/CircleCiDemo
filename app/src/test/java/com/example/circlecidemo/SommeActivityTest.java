package com.example.circlecidemo;

import org.junit.Test;

import static org.junit.Assert.*;

public class SommeActivityTest {
public SommeActivity sommeActivity=new SommeActivity();
    @Test
    public void Somme()
    {
        assertEquals(15,sommeActivity.Somme(5,4));
    }
}