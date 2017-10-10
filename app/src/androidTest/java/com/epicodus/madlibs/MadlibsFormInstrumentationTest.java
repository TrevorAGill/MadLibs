package com.epicodus.madlibs;


import android.support.test.rule.ActivityTestRule;

import org.junit.Rule;
import org.junit.Test;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;

public class MadlibsFormInstrumentationTest {
    @Rule
    public ActivityTestRule<MadlibsForm> activityTestRule =
            new ActivityTestRule<>(MadlibsForm.class);

    @Test
    public void validateEditText() {
        onView(withId(R.id.noun1)).perform(typeText("test"))
                .check(matches(withText("test")));
    }
}
