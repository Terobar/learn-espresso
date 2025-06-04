package com.example.myawesomeapp

import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.myawesomeapp.step.GalleryScreenStep
import com.example.myawesomeapp.step.MenuScreenStep
import com.example.myawesomeapp.step.NotificationStep
import com.example.myawesomeapp.step.ToolbarStep
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class GalleryTest {
    private lateinit var scenario: ActivityScenario<MainActivity>

    private val toolbar = ToolbarStep()
    private val menu = MenuScreenStep()
    private val gallery = GalleryScreenStep()
    private val notification = NotificationStep()

    @Before
    fun setup() {
        scenario = ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun checkNotificationOnGalleryScreen(){
        toolbar.clickOnToolbarMenuButton()
        menu.clickMenuGalleryButton()
        toolbar.checkToolbarMenuButtonIsDisplayed()
        toolbar.checkHomeToolbarIsDisplayed()
        toolbar.checkToolbarMenuOptionsButtonIsDisplayed()
        toolbar.checkGalleryToolbarIsDisplayed()
        gallery.checkGalleryRecycleViewIsDisplayed()
        gallery.clickGalleryItemListFirstPosition()
        notification.checkGalleryNotificationTextIsDisplayed("1")
        notification.swipeGalleryNotificationPopup()
        gallery.swipeGalleryRecycleView()
        gallery.clickGalleryItemListTenthPosition()
        notification.checkGalleryNotificationTextIsDisplayed("10")
    }

    @After
    fun tearDown() {
        scenario.close()
    }
}