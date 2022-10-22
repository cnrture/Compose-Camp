package com.canerture.tiptimeapp

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performTextInput
import com.canerture.tiptimeapp.ui.theme.TipTimeAppTheme
import org.junit.Rule
import org.junit.Test

class TipUITests {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun calculate_20_percent_tip() {
        composeTestRule.setContent {
            TipTimeAppTheme {
                TipTimeScreen()
            }
        }
        composeTestRule.onNodeWithText("Cost of Service").performTextInput("10")
        composeTestRule.onNodeWithText("Tip (%)").performTextInput("20")
        composeTestRule.onNodeWithText("Tip Amount: $2.00").assertExists()
    }
}