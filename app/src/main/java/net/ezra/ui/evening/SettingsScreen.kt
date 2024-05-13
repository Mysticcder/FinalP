package net.ezra.ui.evening

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun WorkoutSettingsScreen(navHostController: NavHostController) {
    var workoutDuration by remember { mutableStateOf(30) }
    var restDuration by remember { mutableStateOf(10) }
    var setsCount by remember { mutableStateOf(3) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        TextField(
            value = workoutDuration.toString(),
            onValueChange = { workoutDuration = it.toIntOrNull() ?: 0 },
            label = { Text("Workout Duration (seconds)") },
            keyboardOptions = KeyboardOptions.Default.copy(
                imeAction = ImeAction.Done,
                keyboardType = KeyboardType.Number
            ),
            keyboardActions = KeyboardActions(
                onDone = { /* Handle Done action if needed */ }
            ),
            modifier = Modifier.fillMaxWidth()
        )

        TextField(
            value = restDuration.toString(),
            onValueChange = { restDuration = it.toIntOrNull() ?: 0 },
            label = { Text("Rest Duration (seconds)") },
            keyboardOptions = KeyboardOptions.Default.copy(
                imeAction = ImeAction.Done,
                keyboardType = KeyboardType.Number
            ),
            keyboardActions = KeyboardActions(
                onDone = { /* Handle Done action if needed */ }
            ),
            modifier = Modifier.fillMaxWidth()
        )

        TextField(
            value = setsCount.toString(),
            onValueChange = { setsCount = it.toIntOrNull() ?: 0 },
            label = { Text("Number of Sets") },
            keyboardOptions = KeyboardOptions.Default.copy(
                imeAction = ImeAction.Done,
                keyboardType = KeyboardType.Number
            ),
            keyboardActions = KeyboardActions(
                onDone = { /* Handle Done action if needed */ }
            ),
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { /* Save button action */ },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text("Save Settings")
        }


    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    WorkoutSettingsScreen(rememberNavController())
}

