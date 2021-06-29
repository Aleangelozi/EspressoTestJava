package com.aleangelozi.espressotestjava;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class MainActivityInstrumentationTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityTestRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void validateEditText() {
        typing();
        onView(withId(R.id.etInput)).check(matches(withText("Hello")));
    }

    @Test
    public void validateTextView() {
        typing();
        onView(withId(R.id.textView)).check(matches(withText("Hello")));
    }

    private void typing() {
        onView(withId(R.id.etInput)).perform(typeText("Hello"));
    }
}

