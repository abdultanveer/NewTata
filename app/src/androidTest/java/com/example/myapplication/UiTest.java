package com.example.myapplication;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.matcher.ViewMatchers.withId;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class UiTest {


    @Rule
    public ActivityScenarioRule<UiTestActivity> mActivityScenarioRule =
            new ActivityScenarioRule<>(UiTestActivity.class);

    @Test
    public void testLogin() {
        //type into edittext
        onView(withId(R.id.etData))
                .perform(typeText("abdul"), closeSoftKeyboard());
        //click the button
        onView(withId(R.id.btnData)).perform(click());
        //check if the data that i typed in the edittext is reflecting in the textview
        

    }
}
