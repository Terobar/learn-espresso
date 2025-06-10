package com.example.myawesomeapp.step

import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.ToolbarElement

class ToolbarStep {
    private val toolbarElement = ToolbarElement()

    fun clickOnToolbarMenuButton(){
        toolbarElement.toolbarMenuButton()
            .check(matches(isDisplayed()))
            .perform(click())
    }

    fun checkToolbarMenuButtonIsDisplayed() {
        toolbarElement.toolbarMenuButton()
            .check(matches(isDisplayed()))
    }

    fun checkToolbarMenuOptionsButtonIsDisplayed() {
        toolbarElement.toolbarMenuOptionsButton()
            .check(matches(isDisplayed()))
    }

    fun checkToolbarTitle(title: String) {
        toolbarElement.toolbarTitle(title)
            .check(matches(isDisplayed()))
    }
}