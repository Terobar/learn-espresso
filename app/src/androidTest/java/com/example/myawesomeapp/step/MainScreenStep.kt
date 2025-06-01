package com.example.myawesomeapp.step

import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.MainScreenElement

class MainScreenStep {
    private val mainElement = MainScreenElement()
    private val menuButton = MainScreenElement()

    fun checkMainScreenTextIsDisplayed() {
        mainElement.mainScreenText().check(matches(isDisplayed()))
    }

    fun clickOnMenuButton() {
        menuButton.menuButton()
            .check(matches(isDisplayed()))
            .perform(click())
    }
}