package com.example.circlecidemo;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainActivityTest {
    private ActivityTestRule<MainActivity> activityTestRule=new ActivityTestRule<MainActivity>(MainActivity.class);
    private MainActivity mainActivity=null;
    @Before
    public void setUp() throws Exception {
        mainActivity=activityTestRule.getActivity();
    }

    @After
    public void tearDown() throws Exception {
        mainActivity=null;
    }

    @Test
    public void somme() {
        assertEquals(9,mainActivity.Somme(5,4));
    }
}