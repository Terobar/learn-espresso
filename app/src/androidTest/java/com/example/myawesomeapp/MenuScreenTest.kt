package com.example.myawesomeapp

import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.myawesomeapp.step.MainScreenStep
import com.example.myawesomeapp.step.MenuScreenStep
import com.example.myawesomeapp.step.ToolbarStep
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class SecondTest {
    private lateinit var scenario: ActivityScenario<MainActivity>

    private val menu = MenuScreenStep()
    private val main = MainScreenStep()
    private val toolbar = ToolbarStep()

    @Before
    fun setup() {
        scenario = ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun checkMenuScreen() {
        toolbar.checkToolbarElements()
        toolbar.clickOnMenuButton()
        menu.checkMenuElementsAreDisplayed()
        menu.clickOnHomeButton()
        main.checkMainScreenTextIsDisplayed()
    }

    @After
    fun tearDown() {
        scenario.close()
    }
}