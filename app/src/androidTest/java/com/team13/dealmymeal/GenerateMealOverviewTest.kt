package com.team13.dealmymeal

import androidx.recyclerview.widget.RecyclerView
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewAssertion
import androidx.test.espresso.action.ViewActions
import androidx.test.espresso.assertion.ViewAssertions
import androidx.test.espresso.matcher.ViewMatchers
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.team13.dealmymeal.ui.history.HistoryAdapter
import com.team13.dealmymeal.ui.overview.MealOverviewAdapter
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class GenerateMealOverviewTest {


    @get:Rule
    val activityRule: ActivityScenarioRule<MainActivity>
            = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun setUp() {
        onView(ViewMatchers.withId(R.id.history_button)).perform(ViewActions.click())
        Thread.sleep(500)
    }

    @Test
    fun openHistory() {
        onView(ViewMatchers.withId(R.id.history_button)).perform(ViewActions.click())
        Thread.sleep(500)
        onView(ViewMatchers.withText("Item 1")).check(ViewAssertions.matches(ViewMatchers.isDisplayed()))
    }
}