package com.kirill.sportseverywhere_mobile.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.RadioButton
import androidx.compose.material3.RadioButtonDefaults
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@Composable
fun CustomTextField() {
    val input_data = remember { mutableStateOf("") }

    TextField(
        value = input_data.value,
        onValueChange = {
            input_data.value = it
        },
        label = {}
    )
}

@Composable
fun CustomRadioGroup() {
    val radio_buttons = listOf(0, 1, 2)
    val selected_button = remember {
        mutableStateOf(radio_buttons.first())
    }
    Column {
        radio_buttons.forEach { idx ->

            val is_selected = idx == selected_button.value

            val colors =
                RadioButtonDefaults.colors()

            RadioButton(
                colors = colors,
                selected = is_selected,
                onClick = {}
            )
        }
    }
}