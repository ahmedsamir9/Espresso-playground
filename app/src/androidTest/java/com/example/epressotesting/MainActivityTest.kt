package com.example.epressotesting

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.hamcrest.CoreMatchers.not
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @Rule @JvmField
    var  activityRuleTest = ActivityScenarioRule(MainActivity::class.java)
    @Test
    fun greet(){

        onView(withId(R.id.greet_button)).perform(click()).check(matches(not(isEnabled())))
        onView(withId(R.id.greeting)).check(matches(withText(R.string.hello)))
    }
}