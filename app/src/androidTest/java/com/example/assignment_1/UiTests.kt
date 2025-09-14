package com.example.assignment_1
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.espresso.assertion.ViewAssertions.matches
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith




@RunWith(AndroidJUnit4::class)
class UiTests {

    @get:Rule
    val activityRule = ActivityScenarioRule(searchpage::class.java) // 👈 start from SearchPage

    // ✅ Test 1: Press homeIcon → opens FeedPage
    @Test
    fun testHomeIconOpensFeedPage() {
        onView(withId(R.id.homeIcon)).perform(click())   // button in searchpage.xml
        onView(withId(R.id.feedpage1)).check(matches(isDisplayed())) // root of feedpage.xml
    }

    // ✅ Test 2: From FeedPage, press messageIcon → opens ChatList
    @Test
    fun testMessageIconOpensChatList() {
        // First go to FeedPage
        onView(withId(R.id.homeIcon)).perform(click())

        // Then click messageIcon in feedpage.xml
        onView(withId(R.id.messageIcon)).perform(click())

        // Verify ChatList is displayed
        onView(withId(R.id.chatlist)).check(matches(isDisplayed()))
    }
}
