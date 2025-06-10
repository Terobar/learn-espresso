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
    fun toolbarMenuButton(): ViewInteraction =
        onView(
            withContentDescription(R.string.navigation_drawer_open)
        )

    fun toolbarMenuHeading(): ViewInteraction =
        onView(
            allOf(
                withText(R.string.menu_home),
                isDescendantOfA(withId(R.id.toolbar))
            )
        )

    fun toolbarMenuOptionsButton(): ViewInteraction =
        onView(
            withContentDescription(R.string.action_settings)
        )

    fun toolbarTitle(title: String): ViewInteraction =
        onView(
            allOf(
                withText(title),
                isDescendantOfA(withId(R.id.toolbar))
            )
        )
}