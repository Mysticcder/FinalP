import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import net.ezra.ui.About.SettingsScreen
import net.ezra.ui.Products.ProfileScreen

@Composable
fun WorkoutSettingsScreen(navController: NavHostController) {
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
            onClick = {
                saveWorkoutSettings(
                    workoutDuration,
                    restDuration,
                    setsCount
                )
            },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Save Settings")
        }
    }
}

private fun saveWorkoutSettings(
    workoutDuration: Int,
    restDuration: Int,
    setsCount: Int
) {
    val db = Firebase.firestore
    val settings = hashMapOf(
        "workoutDuration" to workoutDuration,
        "restDuration" to restDuration,
        "setsCount" to setsCount
    )

    db.collection("workoutSettings")
        .document("default")
        .set(settings)
        .addOnSuccessListener { documentReference ->
            // Handle success
        }
        .addOnFailureListener { e ->
            // Handle failure
        }
}



