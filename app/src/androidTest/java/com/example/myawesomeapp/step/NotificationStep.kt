package com.example.myawesomeapp.step

import androidx.test.espresso.action.ViewActions.swipeRight
import androidx.test.espresso.assertion.ViewAssertions.doesNotExist
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.NotificationElement

class NotificationStep {
    private val notificationElement = NotificationElement()

    fun checkNotificationPopupIsDisplayed() {
        notificationElement.notificationPopup().check(matches(isDisplayed()))
    }

    fun swipeNotificationPopup() {
        notificationElement.notificationPopup().perform(swipeRight())
    }

    fun checkNotificationPopupIsNotDisplayed() {
        notificationElement.notificationPopup().check(doesNotExist())
    }
}