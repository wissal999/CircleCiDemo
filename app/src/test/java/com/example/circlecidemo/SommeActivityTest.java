package com.example.circlecidemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SommeActivityTest {

    private final SommeActivity sommeActivity=new SommeActivity();


    @Test
    public void somme() {
        assertEquals(9,sommeActivity.Somme(5,4));
    }
}