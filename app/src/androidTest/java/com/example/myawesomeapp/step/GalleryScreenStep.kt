package com.example.myawesomeapp.step

import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.action.ViewActions.swipeUp
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.isDisplayed
import com.example.myawesomeapp.element.GalleryElement

class GalleryScreenStep {
    private val galleryElement = GalleryElement()

    fun interactWithGalleryItem(position: String, performClick: Boolean = false) {
        val item = galleryElement.galleryItemList(position)
        item.check(matches(isDisplayed()))
        if (performClick) item.perform(click())
    }

    fun swipeGalleryRecycleView() {
        galleryElement.galleryRecycleView()
            .check(matches(isDisplayed()))
            .perform(swipeUp())
    }
}