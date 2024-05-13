package net.ezra.ui.contact

import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun ChestWorkoutScreen(rememberNavController: NavHostController) {
    val chestExercises = listOf(
        "Barbell Bench Press" to "Lie on a flat bench and grip the barbell slightly wider than shoulder-width. Lower the bar to your chest, then press it back up.",
        "Dumbbell Flyes" to "Lie on a flat bench with dumbbells in hand. Lower the dumbbells to your sides with slightly bent elbows, then raise them back up.",
        "Incline Bench Press" to "Similar to the barbell bench press, but performed on an inclined bench. Targets the upper chest.",
        "Decline Bench Press" to "Similar to the barbell bench press, but performed on a declined bench. Targets the lower chest.",
        "Push-ups" to "Start in a plank position with hands slightly wider than shoulder-width. Lower your body until your chest nearly touches the ground, then push back up.",
        "Cable Crossover" to "Stand in the center of cable stations with handles attached. Bring your hands together in front of your body, then return to the starting position."
        // Add more exercises as needed
    )

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Chest Workout") },
                backgroundColor = Color.Blue
            )
        },
        content = {
            ChestExerciseList(chestExercises)
        }
    )
}

@Composable
fun ChestExerciseList(chestExercises: List<Pair<String, String>>) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        items(chestExercises) { (exercise, description) ->
            ChestExerciseItem(exercise, description)
        }
    }
}

@Composable
fun ChestExerciseItem(exercise: String, description: String) {
    var expanded by remember { mutableStateOf(false) }

    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 8.dp)
            .clickable { expanded = !expanded },
        elevation = 8.dp
    ) {
        Column(
            modifier = Modifier
                .padding(16.dp)
        ) {
            Text(
                text = exercise,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            )
            if (expanded) {
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = description,
                    fontSize = 14.sp
                )
            }
        }
    }
}


@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun PreviewLight() {
    ChestWorkoutScreen(rememberNavController())
}

