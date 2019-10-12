package com.example.jmeterpractice;

import androidx.test.rule.ActivityTestRule;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static java.lang.Thread.sleep;
import static org.junit.Assert.*;

public class MainActivityTest {
    public ActivityTestRule<MainActivity>activityTestrules=new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void mytest() throws InterruptedException {
       activityTestrules.launchActivity(null);
        onView(withId(R.id.textview)).check(matches(withText("Hellookkkkk!")));
        onView(withId(R.id.button)).perform(click());
       sleep(3000);
    }
}