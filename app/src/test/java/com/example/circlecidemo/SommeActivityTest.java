package com.example.circlecidemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
@RunWith(JUnit4.class)
public class SommeActivityTest {
    private final SommeActivity Somme=new SommeActivity();
    @Test
    public void somme() {
        assertEquals(9,Somme.Somme(5,4));
    }
}