package com.example.circlecidemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class SommeActivityTest {

  private  SommeActivity sommeActivity=null;
    @Before
    public void setUp() throws Exception {
        sommeActivity=new SommeActivity();
    }

    @After
    public void tearDown() throws Exception {
        sommeActivity=null;
    }


    @Test
    public void somme() {
        assertEquals(9,sommeActivity.Somme(5,4));
    }
}