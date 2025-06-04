package com.example.myawesomeapp.step

import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.swipeRight
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.MailButtonElement
import com.example.myawesomeapp.element.NotificationElement

class NotificationStep {
    private val notificationElement = NotificationElement()
    private val mailButtonElement = MailButtonElement()

    fun checkMailButtonNotificationIsDisplayed(){
        mailButtonElement.mailButtonNotification()
            .check(matches(isDisplayed()))
    }

    fun swipeMailButtonNotification(){
        mailButtonElement.mailButtonNotification()
            .check(matches(isDisplayed()))
            .perform(swipeRight())
    }

    fun checkGalleryNotificationTextIsDisplayed(position: String) {
        notificationElement.notificationText("Item #$position clicked successfully!")
            .check(matches(isDisplayed()))
    }

    fun swipeGalleryNotificationPopup() {
        notificationElement.notificationPopup()
            .check(matches(isDisplayed()))
            .perform(swipeRight())
    }

    fun checkMailButtonIsDisplayed(){
        mailButtonElement.mailButton()
            .check(matches(isDisplayed()))
    }

    fun clickMailButton(){
        mailButtonElement.mailButton()
            .check(matches(isDisplayed()))
            .perform(click())
    }
}