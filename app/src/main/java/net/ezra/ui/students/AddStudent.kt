package net.ezra.ui.students

import android.annotation.SuppressLint
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.*
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun AnimatedAbdominalCrunchesScreen(navController: NavHostController) {
    val crunchAnimationState = remember { CrunchAnimationState() }
    var isAnimating by remember { mutableStateOf(false) }

    Scaffold(
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                verticalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                Text(
                    text = "Abdominal Crunches",
                    style = MaterialTheme.typography.h4
                )

                CrunchAnimation(
                    modifier = Modifier
                        .size(200.dp)
                        .padding(16.dp),
                    crunchAnimationState = crunchAnimationState
                )

                Button(
                    onClick = {
                        isAnimating = !isAnimating
                        crunchAnimationState.isAnimating = isAnimating
                    }
                ) {
                    Text(if (isAnimating) "Stop Animation" else "Start Animation")
                }
            }
        }
    )
}

@Composable
fun CrunchAnimation(
    modifier: Modifier = Modifier,
    crunchAnimationState: CrunchAnimationState
) {
    val crunchOffset by animateDpAsState(
        targetValue = if (crunchAnimationState.isAnimating) 50.dp else 0.dp,
        tween(
            durationMillis = 1000,
            delayMillis = 0,
            easing = LinearEasing
        )
    )

    Canvas(
        modifier = modifier
            .animateContentSize()
            .offset(x = crunchOffset)
    ) {
        drawCircle(
            color = Color.Blue,
            radius = 50f,
            center = Offset(100f, 100f)
        )
    }
}

class CrunchAnimationState {
    var isAnimating by mutableStateOf(false)
}







