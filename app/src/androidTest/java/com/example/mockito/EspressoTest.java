package com.example.mockito;

import androidx.test.espresso.action.ViewActions;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.rule.ActivityTestRule;

import com.example.mockito.login.LoginActivity;

import junit.extensions.ActiveTestSuite;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.closeSoftKeyboard;
import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class EspressoTest {

    @Rule
    public ActivityTestRule<LoginActivity> mainActivityActiveTestRule=
            new ActivityTestRule<>(LoginActivity.class);

    @Test
    public void contrasenyaAdmin(){
        onView(withId(R.id.edUser)).perform(typeText("fran"),ViewActions.closeSoftKeyboard());
        onView(withId(R.id.edPass)).perform(typeText("fr"),ViewActions.closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());
        //onView(withId(R.id.resPassw)).check(matches(withText("fran")));
    }
    @Test
    public void contrasenyaErronea(){
        onView(withId(R.id.edUser)).perform(typeText("fran"),ViewActions.closeSoftKeyboard());
        onView(withId(R.id.edPass)).perform(typeText("contrasenyaErronea"),ViewActions.closeSoftKeyboard());
        onView(withId(R.id.button)).perform(click());
    }
}