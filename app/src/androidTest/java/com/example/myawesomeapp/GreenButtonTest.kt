package com.example.myawesomeapp

import androidx.test.core.app.ActivityScenario
import com.example.myawesomeapp.step.MainScreenStep
import com.example.myawesomeapp.step.NotificationStep
import org.junit.After
import org.junit.Before
import org.junit.Test

class ThirdTest {
    private lateinit var scenario: ActivityScenario<MainActivity>

    private val main = MainScreenStep()
    private val notification = NotificationStep()

    @Before
    fun setup() {
        scenario = ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun greenButtonCheck() {
        main.checkMainScreenTextIsDisplayed()
        main.clickOnMailButton()
        notification.checkNotificationPopupIsDisplayed()
        notification.swipeNotificationPopup()
        Thread.sleep(1000)
        notification.checkNotificationPopupIsNotDisplayed()
    }

    @After
    fun tearDown() {
        scenario.close()
    }
}