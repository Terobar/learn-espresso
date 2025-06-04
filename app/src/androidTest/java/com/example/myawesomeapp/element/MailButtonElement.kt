package com.example.myawesomeapp.element

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.example.myawesomeapp.R

class MailButtonElement {
    fun mailButton(): ViewInteraction {
        return onView(withId(R.id.fab))
    }

    fun mailButtonNotification(): ViewInteraction {
        return onView(withText("Replace with your own action"))
    }
}