package com.example.myawesomeapp

import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.myawesomeapp.step.MainScreenStep
import com.example.myawesomeapp.step.NotificationStep
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MailButtonTestTest {
    private lateinit var scenario: ActivityScenario<MainActivity>

    private val main = MainScreenStep()
    private val mailButton = NotificationStep()

    @Before
    fun setup() {
        scenario = ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun mailButtonCheck() {
        main.checkMainScreenTextIsDisplayed()
        mailButton.checkMailButtonIsDisplayed()
        mailButton.clickMailButton()
        mailButton.checkMailButtonNotificationIsDisplayed()
        mailButton.swipeMailButtonNotification()
    }

    @After
    fun tearDown() {
        scenario.close()
    }
}