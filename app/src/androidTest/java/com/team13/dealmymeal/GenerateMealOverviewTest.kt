package com.team13.dealmymeal

import android.content.Context
import androidx.room.Room
import com.team13.dealmymeal.data.DBManager
import org.junit.Before
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class GenerateMealOverviewTest {

    @Before
    fun setUp() {
        onView(ViewMatchers.withId(R.id.history_button)).perform(ViewActions.click())
    }

}