package net.ezra.ui.Products

import android.annotation.SuppressLint
import android.content.Intent
import androidx.activity.ComponentActivity
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Button
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.IconButton
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_ABOUT
import net.ezra.navigation.ROUTE_ADD_STUDENTS
import net.ezra.navigation.ROUTE_EVENING
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MIT
import net.ezra.navigation.ROUTE_PROFILE
import net.ezra.navigation.ROUTE_SHOP


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ProfileScreen(navController: NavHostController) {

    Scaffold(

        topBar = {
            TopAppBar(
                title = {
                    Row() {

                    }
                },

                navigationIcon = {
                    IconButton(onClick = {  navController.navigate(net.ezra.navigation.ROUTE_SERVICES) {
                        popUpTo(ROUTE_PROFILE) { inclusive = true }
                    }}) {
                        Icon(Icons.Filled.ArrowBack, "backIcon",
                            tint = Color.Black)








                    }

                }

                ,

                actions = {

                },

                backgroundColor = Color.Transparent





            )
        },

        content = {

            Box(
                Modifier.fillMaxSize()
            ) {

                Image(
                    painter = painterResource(id = R.drawable.img_2), contentDescription = "",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxSize()
                )

            }

            Column (
                Modifier
                    .fillMaxSize()
                    .padding(20.dp)
            ) {

                Spacer(modifier = Modifier.height(50.dp))

                Column (
                    Modifier.fillMaxWidth()
                ) {

                    Row (
                        Modifier.fillMaxWidth()
                    ) {

                        Icon(Icons.Default.Person, contentDescription = null,
                            tint = Color.Black)

                        Spacer(modifier = Modifier.width(20.dp))

                        Text(text = "Profile",
                            color = Color.Black,
                            fontSize = 20.sp,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ROUTE_ADD_STUDENTS) {
                                        popUpTo(ROUTE_PROFILE) { inclusive = true }
                                    }
                                })

                    }
                    Spacer(modifier = Modifier.height(20.dp))

                    Row (
                        Modifier.fillMaxWidth()
                    ) {

                        Icon(Icons.Default.AccountCircle, contentDescription = null,
                            tint = Color.Black)

                        Spacer(modifier = Modifier.width(20.dp))

                        Text(text = "General Settings",
                            color = Color.Black,
                            fontSize = 20.sp,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ROUTE_EVENING) {
                                        popUpTo(ROUTE_PROFILE) { inclusive = true }
                                    }

                                }) }
                    Spacer(modifier = Modifier.height(20.dp))

                    Row (Modifier.fillMaxWidth()
                    ) {

                        Icon(Icons.Default.Settings, contentDescription = null,
                            tint = Color.Black)

                        Spacer(modifier = Modifier.width(20.dp))

                        Text(text = "Workout Settings",
                            color = Color.Black,
                            fontSize = 20.sp,
                            modifier = Modifier
                                .clickable {
                                    navController.navigate(ROUTE_ABOUT) {
                                        popUpTo(ROUTE_PROFILE) { inclusive = true }
                                    }
                                })

                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Row (Modifier.fillMaxWidth()
                    ) {

                        Icon(Icons.Default.Person, contentDescription = null,
                            tint = Color.Black)

                        Spacer(modifier = Modifier.width(20.dp))

//                        Text(text = "Language Options",
//                            color = Color.Black,
//                            fontSize = 20.sp,
//                            modifier = Modifier
//                                .clickable {
//
//
//                                })

                        LanguageOptionButton()

                    }


                    Spacer(modifier = Modifier.height(20.dp))

                    Row (Modifier.fillMaxWidth()
                    ) {

                        Icon(Icons.Default.Share, contentDescription = null,
                            tint = Color.Black)

                        Spacer(modifier = Modifier.width(20.dp))

//                        Text(text = "Share with Friends",
//                            color = Color.Black,
//                            fontSize = 20.sp,
//                            modifier = Modifier
//                                .clickable {
//
//
//                                })

                        ShareButton()

                    }












                }

            }

        }

    )





















}


@Preview(showBackground = true)
@Composable
fun PreviewLight() {
    ProfileScreen(rememberNavController())
}


// Define your supported languages
val supportedLanguages = listOf("English", "Spanish", "French")

@Composable
fun LanguageOptionButton() {
    var selectedLanguage by remember { mutableStateOf(supportedLanguages[0]) }

    Column(
        modifier = Modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Dropdown menu to select language
        DropdownMenu(
            expanded = false, // Change to true when button is clicked
            onDismissRequest = { /* Dismiss dropdown menu */ }
        ) {
            supportedLanguages.forEach { language ->
                DropdownMenuItem(onClick = {
                    selectedLanguage = language
                }) {
                    Text(text = language)
                }
            }
        }

        Text(text = "Language Options",fontSize = 20.sp, modifier = Modifier.clickable {  selectedLanguage = if (selectedLanguage == supportedLanguages[0]) {
            supportedLanguages[1]
        } else {
            supportedLanguages[0]
        }})
//        Button(onClick = {
//            // Toggle dropdown menu when button is clicked
//            // For simplicity, this toggles between true and false
//            selectedLanguage = if (selectedLanguage == supportedLanguages[0]) {
//                supportedLanguages[1]
//            } else {
//                supportedLanguages[0]
//            }
//        }) {
//            Text(text = "Select Language: $selectedLanguage")
//        }
    }
}



@Composable
fun ShareButton() {
    val context = LocalContext.current
    val activity = (context as? ComponentActivity)
    val shareIntent = remember {
        Intent(Intent.ACTION_SEND).apply {
            type = "text/plain"
            putExtra(Intent.EXTRA_TEXT, "Check out this awesome app!")
        }
    }

    val launcher = rememberLauncherForActivityResult(ActivityResultContracts.StartActivityForResult()) { _ ->
        // Do something after the activity is finished (optional)
    }

    Text(text = "share",fontSize = 20.sp, modifier = Modifier.clickable {activity?.startActivity(Intent.createChooser(shareIntent, "Share Via"))
    })

//    Button(onClick = {
//        // Start the activity to share the app
//        activity?.startActivity(Intent.createChooser(shareIntent, "Share Via"))
//    }) {
//        Text(text = "Share App")
//    }
}

