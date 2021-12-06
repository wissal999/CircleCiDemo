package com.example.circlecidemo;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {


    @Test
    public void sommeval() {
        assertEquals(9,MainActivity.Somme(5,4));
    }
}