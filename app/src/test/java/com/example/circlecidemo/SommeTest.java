package com.example.circlecidemo;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
@RunWith(JUnit4.class)
public class SommeTest {
private Somme Somme=new Somme();


    @Test
    public void Sommeval() {
        assertEquals(9,Somme.Sommeval(5,4));
    }
}