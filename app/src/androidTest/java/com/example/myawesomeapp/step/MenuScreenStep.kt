package com.example.myawesomeapp.step

import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.MenuScreenElement

class MenuScreenStep {
    private val slideshowButton = MenuScreenElement()
    private val menuElement = MenuScreenElement()

    fun clickOnHomeButton() {
        menuElement.homeButton()
            .check(matches(isDisplayed()))
            .perform(click())
    }

    fun checkMenuElementsAreDisplayed() {
        menuElement.userPicture().check(matches(isDisplayed()))
        menuElement.userName().check(matches(isDisplayed()))
        menuElement.userEmail().check(matches(isDisplayed()))
        menuElement.homeButton().check(matches(isDisplayed()))
        menuElement.galleryButton().check(matches(isDisplayed()))
        menuElement.slideshowButton().check(matches(isDisplayed()))
    }

    fun clickOnSlideshowButton() {
        slideshowButton.slideshowButton()
            .check(matches(isDisplayed()))
            .perform(click())
    }
}