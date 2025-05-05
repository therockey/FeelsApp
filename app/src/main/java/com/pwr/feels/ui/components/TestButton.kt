package com.pwr.feels.ui.components

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun TestButton(onClick: () -> Unit) {
    Button(onClick) {
        Text("TestButton")
    }
}