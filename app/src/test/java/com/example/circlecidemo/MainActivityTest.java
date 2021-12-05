package com.example.circlecidemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {
    private MainActivity mainActivity;
    @Before
    public void setUp() throws Exception {
        mainActivity=new MainActivity();
    }

    @After
    public void tearDown() throws Exception {
        mainActivity=null;
    }

    @Test
    public void sommeval() {
        assertEquals(9,mainActivity.Somme(5,4));
    }
}