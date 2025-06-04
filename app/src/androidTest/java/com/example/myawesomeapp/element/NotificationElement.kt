package com.example.myawesomeapp.element

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText

class NotificationElement {
    fun notificationText(notificationText: String): ViewInteraction =
        onView(withText(notificationText))

    fun notificationPopup(): ViewInteraction =
        onView(withId(com.google.android.material.R.id.snackbar_text))
}