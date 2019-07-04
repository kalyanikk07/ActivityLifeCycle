package com.example.kalyani.activitylifecycle;

import android.support.test.espresso.Espresso;
import android.support.test.espresso.ViewAction;
import android.support.test.espresso.ViewAssertion;
import android.support.test.espresso.action.ViewActions;
import android.support.test.espresso.assertion.ViewAssertions;
import android.support.test.espresso.matcher.ViewMatchers;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.view.View;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

@RunWith(AndroidJUnit4.class)
public class MainActivityEspressoTest {

    @Rule
    public ActivityTestRule<MainActivity> activitytestrule = new ActivityTestRule<>(MainActivity.class);

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void checkButton(){
    /*  Espresso.onView(ViewMatchers.withId(R.id.btn1)).perform(ViewActions.click());
      Espresso.onView(ViewMatchers.withId(R.id.btn2)).perform(ViewActions.click());*/
      Espresso.onView(ViewMatchers.withId(R.id.edit_name1))
              .perform(ViewActions.typeText("hello"),ViewActions.closeSoftKeyboard());

      Espresso.onView(ViewMatchers.withId(R.id.btn3))
              .perform(ViewActions.click());

      Espresso.onView(ViewMatchers.withId(R.id.name_text))
              .check(ViewAssertions.matches(ViewMatchers.withText("hello")));
    }

    @After
    public void tearDown() throws Exception {
    }
}