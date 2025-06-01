package com.example.myawesomeapp

import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.myawesomeapp.step.MainScreenStep
import com.example.myawesomeapp.step.MenuScreenStep
import com.example.myawesomeapp.step.SlideshowScreenStep
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class SlideshowTest {
    private lateinit var scenario: ActivityScenario<MainActivity>

    private val menu = MainScreenStep()
    private val slideshowButton = MenuScreenStep()
    private val slideshowScreenText = SlideshowScreenStep()

    @Before
    fun setup() {
        scenario = ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun checkSlideshowScreen() {
        menu.clickOnMenuButton()
        slideshowButton.clickOnSlideshowButton()
        slideshowScreenText.checkSlideshowScreenTextIsDisplayed()
    }

    @After
    fun tearDown() {
        scenario.close()
    }
}