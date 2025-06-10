package com.example.myawesomeapp.step

import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.swipeUp
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.GalleryElement

class GalleryScreenStep {
    private val galleryElement = GalleryElement()

    fun checkGalleryRecycleViewIsDisplayed() {
        galleryElement.galleryRecycleView()
            .check(matches(isDisplayed()))
    } //Лучше объединить в один метод принимающий параметр позиции

    fun clickGalleryItemAtPosition(position: String) {
        galleryElement.galleryItemList(position)
            .check(matches(isDisplayed()))
            .perform(click())
    } //Лучше объединить в один метод принимающий параметр позиции

    fun swipeGalleryRecycleView() {
        galleryElement.galleryRecycleView()
            .check(matches(isDisplayed()))
            .perform(swipeUp())
    }
}