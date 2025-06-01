package com.example.myawesomeapp.element

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.withId

class NotificationElement {
    fun notificationPopup(): ViewInteraction =
        onView(
            withId(com.google.android.material.R.id.snackbar_text)
        )
}