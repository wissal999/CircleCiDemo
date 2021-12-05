package com.example.circlecidemo;



import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SommeActivityTest {
    public ActivityTestRule<SommeActivity>activityTestRule=new ActivityTestRule<>(SommeActivity.class);
    private SommeActivity sommeActivity;
    @Before
    public void setUp() throws Exception {
       sommeActivity=activityTestRule.getActivity();
    }

    @After
    public void tearDown() throws Exception {
        sommeActivity=null;
    }
    @Test
    public void Somme()
    {
        assertEquals(15,sommeActivity.Somme(5,4));
    }
}