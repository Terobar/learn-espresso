package com.example.myawesomeapp.element

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.ViewInteraction
import androidx.test.espresso.matcher.ViewMatchers.isDescendantOfA
import androidx.test.espresso.matcher.ViewMatchers.withContentDescription
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import com.example.myawesomeapp.R
import org.hamcrest.core.AllOf.allOf

class ToolbarElement {
    fun menuButton(): ViewInteraction =
        onView(
            withContentDescription("Open navigation drawer")
        )

    fun menuHeading(): ViewInteraction =
        onView(
            allOf(
                withText(R.string.menu_home),
                isDescendantOfA(withId(R.id.toolbar))
            )
        )
    fun menuOptionsButton(): ViewInteraction =
        onView(
            withContentDescription("More options")
        )
}