package com.example.myawesomeapp.step

import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.ToolbarElement

class ToolbarStep {
    private val toolbarElement = ToolbarElement()

    fun clickOnMenuButton() {
        toolbarElement.menuButton()
            .check(matches(isDisplayed()))
            .perform(click())
    }

    fun checkToolbarElements() {
        toolbarElement.menuButton().check(matches(isDisplayed()))
        toolbarElement.menuHeading().check(matches(isDisplayed()))
        toolbarElement.menuOptionsButton().check(matches(isDisplayed()))
    }
}