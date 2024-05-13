package net.ezra.ui.shop


import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_MIT
import net.ezra.navigation.ROUTE_PROFILE
import net.ezra.navigation.ROUTE_SERVICES
import net.ezra.navigation.ROUTE_SHOP
import net.ezra.navigation.ROUTE_SIGNUP


@Composable
fun ShopScreen(navController: NavHostController) {
    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
    ) {
        item {
            Column {

                Row {
                    Text(
                        text = "Beginner",
                        fontFamily = FontFamily.SansSerif, fontWeight = FontWeight.W500,fontSize = 27.sp
                    )
                }



                Card(
                    modifier = Modifier
                        .size(width = 500.dp, height = 120.dp)
                    .fillMaxWidth()
                        .padding(top = 6.dp)
                        .wrapContentHeight(align = Alignment.Top)
                        .clickable {
                            navController.navigate(ROUTE_MIT) {
                                popUpTo(ROUTE_SHOP) { inclusive = true }
                            }
                        },
                    shape = RoundedCornerShape(15.dp)

                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.img_23),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.matchParentSize()
                        )
                        Row(
//                                    modifier = Modifier
//                                        .fillMaxWidth(),
                            horizontalArrangement = Arrangement.End,
                            verticalAlignment = Alignment.Bottom
                        ) {
                            Text(
                                text = "ABS", color = Color.White,
                                fontSize = 25.sp
                            )
                            Spacer(modifier = Modifier.height(6.dp))


                        }

                    }


                }
            }

            Spacer(modifier = Modifier.height(15.dp))


            Column {

                Card(
                    modifier = Modifier
                        .size(width = 500.dp, height = 120.dp)

                        .fillMaxWidth()
                        .padding(top = 6.dp)
                        .wrapContentHeight(align = Alignment.Top)
                        .clickable {
                            navController.navigate(ROUTE_MIT) {
                                popUpTo(ROUTE_SHOP) { inclusive = true }
                            }
                        },
                    shape = RoundedCornerShape(15.dp)

                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.img_36),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.matchParentSize()
                        )
                        Row(

//                                    modifier = Modifier
//                                        .fillMaxWidth(),
                            horizontalArrangement = Arrangement.End,
                            verticalAlignment = Alignment.Bottom
                        ) {
                            Text(
                                text = "CHEST", color = Color.White,
                                fontSize = 25.sp
                            )
                            Spacer(modifier = Modifier.height(6.dp))


                        }

                    }


                }
            }

            Spacer(modifier = Modifier.height(15.dp))


            Column {

                Card(
                    modifier = Modifier
                        .size(width = 500.dp, height = 120.dp)

                        .fillMaxWidth()
                        .padding(top = 6.dp)
                        .wrapContentHeight(align = Alignment.Top)
                        .clickable {
                            navController.navigate(ROUTE_MIT) {
                                popUpTo(ROUTE_SHOP) { inclusive = true }
                            }
                        },
                    shape = RoundedCornerShape(15.dp)

                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.img_26),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.matchParentSize()
                        )
                        Row(
//                                    modifier = Modifier
//                                        .fillMaxWidth(),
                            horizontalArrangement = Arrangement.End,
                            verticalAlignment = Alignment.Bottom
                        ) {
                            Text(
                                text = "ARM", color = Color.Black,
                                fontSize = 25.sp
                            )
                            Spacer(modifier = Modifier.height(6.dp))


                        }

                    }


                }
            }

            Spacer(modifier = Modifier.height(15.dp))


            Column {

                Card(
                    modifier = Modifier
                        .size(width = 500.dp, height = 120.dp)

                        .fillMaxWidth()
                        .padding(top = 6.dp)
                        .wrapContentHeight(align = Alignment.Top)
                        .clickable {
                            navController.navigate(ROUTE_MIT) {
                                popUpTo(ROUTE_SHOP) { inclusive = true }
                            }
                        },
                    shape = RoundedCornerShape(15.dp)

                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.img_25),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.matchParentSize()
                        )
                        Row(
//                                    modifier = Modifier
//                                        .fillMaxWidth(),
                            horizontalArrangement = Arrangement.End,
                            verticalAlignment = Alignment.Bottom
                        ) {
                            Text(
                                text = "LEG", color = Color.White,
                                fontSize = 25.sp
                            )
                            Spacer(modifier = Modifier.height(6.dp))


                        }

                    }


                }
            }



            Spacer(modifier = Modifier.height(15.dp))


            
            Spacer(modifier = Modifier.height(10.dp))

            Row {
                Text(text = "Intermediate", fontSize = 27.sp,
                    fontFamily = FontFamily.SansSerif, fontWeight = FontWeight.W500)

            }


            Spacer(modifier = Modifier.height(10.dp))


            Column {

                Card(
                    modifier = Modifier
                        .size(width = 500.dp, height = 120.dp)
                         .fillMaxWidth()
                        .padding(top = 6.dp)
                        .wrapContentHeight(align = Alignment.Top)
                        .clickable {
                            navController.navigate(ROUTE_MIT) {
                                popUpTo(ROUTE_SHOP) { inclusive = true }
                            }
                        },

                    shape = RoundedCornerShape(15.dp)

                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.img_28),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.matchParentSize()
                        )
                        Row(

//                                    modifier = Modifier
//                                        .fillMaxWidth(),
                            horizontalArrangement = Arrangement.End,
                            verticalAlignment = Alignment.Bottom

                        ) {

                            Text(
                                text = "ABS INTERMEDIATE", color = Color.White,
                                fontSize = 25.sp

                            )
                            Spacer(modifier = Modifier.height(6.dp))


                        }

                    }


                }
            }



            Spacer(modifier = Modifier.height(10.dp))


            Column {

                Card(
                    modifier = Modifier

                        .size(width = 500.dp, height = 120.dp)
                        .fillMaxWidth()
                        .padding(top = 6.dp)
                        .wrapContentHeight(align = Alignment.Top)
                        .clickable {
                            navController.navigate(ROUTE_MIT) {
                                popUpTo(ROUTE_SHOP) { inclusive = true }
                            }
                        },
                    shape = RoundedCornerShape(15.dp)

                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.img_34),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.matchParentSize()
                        )
                        Row(
//                                    modifier = Modifier
//                                        .fillMaxWidth(),
                            horizontalArrangement = Arrangement.End,
                            verticalAlignment = Alignment.Bottom
                        ) {
                            Text(
                                text = "CHEST INTERMEDIATE", color = Color.Black,
                                fontSize = 25.sp
                            )
                            Spacer(modifier = Modifier.height(6.dp))


                        }

                    }


                }
            }


            Spacer(modifier = Modifier.height(10.dp))


            Column {

                Card(
                    modifier = Modifier

                        .size(width = 500.dp, height = 120.dp)
                        .fillMaxWidth()
                        .padding(top = 6.dp)
                        .wrapContentHeight(align = Alignment.Top)
                        .clickable {
                            navController.navigate(ROUTE_MIT) {
                                popUpTo(ROUTE_SHOP) { inclusive = true }
                            }
                        },
                    shape = RoundedCornerShape(15.dp)

                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.img_27),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.matchParentSize()
                        )
                        Row(
//                                    modifier = Modifier
//                                        .fillMaxWidth(),
                            horizontalArrangement = Arrangement.End,
                            verticalAlignment = Alignment.Bottom
                        ) {
                            Text(
                                text = "ARM INTERMEDIATE", color = Color.White,
                                fontSize = 25.sp
                            )
                            Spacer(modifier = Modifier.height(6.dp))


                        }

                    }


                }
            }

            Spacer(modifier = Modifier.height(10.dp))

            Column {

                Card(
                    modifier = Modifier
                        .size(width = 500.dp, height = 120.dp)
                        .fillMaxWidth()
                        .padding(top = 6.dp)
                        .wrapContentHeight(align = Alignment.Top)
                        .clickable {
                            navController.navigate(ROUTE_MIT) {
                                popUpTo(ROUTE_SHOP) { inclusive = true }
                            }
                        },
                    shape = RoundedCornerShape(15.dp)

                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.img_33),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.matchParentSize()
                        )
                        Row(
//                                    modifier = Modifier
//                                        .fillMaxWidth(),
                            horizontalArrangement = Arrangement.End,
                            verticalAlignment = Alignment.Bottom
                        ) {
                            Text(
                                text = "LEG INTERMEDIATE", color = Color.Black,
                                fontSize = 25.sp
                            )
                            Spacer(modifier = Modifier.height(6.dp))


                        }

                    }


                }
            }

            Spacer(modifier = Modifier.height(10.dp))


            Row {
                Text(text = "Advanced",
                    fontWeight = FontWeight.W500,
                    fontFamily = FontFamily.SansSerif, fontSize = 27.sp)
            }

            Spacer(modifier = Modifier.height(10.dp))

            Column {

                Card(
                    modifier = Modifier
                        .size(width = 500.dp, height = 120.dp)
                        .fillMaxWidth()
                        .padding(top = 6.dp)
                        .wrapContentHeight(align = Alignment.Top)
                        .clickable {
                            navController.navigate(ROUTE_MIT) {
                                popUpTo(ROUTE_SHOP) { inclusive = true }
                            }
                        },
                    shape = RoundedCornerShape(15.dp)

                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.img_32),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.matchParentSize()
                        )
                        Row(
//                                    modifier = Modifier
//                                        .fillMaxWidth(),
                            horizontalArrangement = Arrangement.End,
                            verticalAlignment = Alignment.Bottom
                        ) {
                            Text(
                                text = "ABS ADVANCED", color = Color.Black,
                                fontSize = 25.sp, textAlign = TextAlign.End
                            )
                            Spacer(modifier = Modifier.height(6.dp))


                        }

                    }


                }
            }



            Spacer(modifier = Modifier.height(10.dp))

            Column {

                Card(
                    modifier = Modifier
                        .size(width = 500.dp, height = 120.dp)
                        .fillMaxWidth()
                        .padding(top = 6.dp)
                        .wrapContentHeight(align = Alignment.Top)
                        .clickable {
                            navController.navigate(ROUTE_MIT) {
                                popUpTo(ROUTE_SHOP) { inclusive = true }
                            }
                        },
                    shape = RoundedCornerShape(15.dp)

                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.img_30),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.matchParentSize()
                        )
                        Row(
//                                    modifier = Modifier
//                                        .fillMaxWidth(),
                            horizontalArrangement = Arrangement.End,
                            verticalAlignment = Alignment.Bottom
                        ) {
                            Text(
                                text = "CHEST ADVANCED", color = Color.Black,
                                fontSize = 25.sp, textAlign = TextAlign.End
                            )
                            Spacer(modifier = Modifier.height(6.dp))


                        }

                    }


                }
            }



            Spacer(modifier = Modifier.height(10.dp))

            Column {

                Card(
                    modifier = Modifier
                        .size(width = 500.dp, height = 120.dp)
                        .fillMaxWidth()
                        .padding(top = 6.dp)
                        .wrapContentHeight(align = Alignment.Top)
                        .clickable {
                            navController.navigate(ROUTE_MIT) {
                                popUpTo(ROUTE_SHOP) { inclusive = true }
                            }
                        },
                    shape = RoundedCornerShape(15.dp)

                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.img_31),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.matchParentSize()
                        )
                        Row(
//                                    modifier = Modifier
//                                        .fillMaxWidth(),
                            horizontalArrangement = Arrangement.End,
                            verticalAlignment = Alignment.Bottom
                        ) {
                            Text(
                                text = "ARM ADVANCED", color = Color.White,
                                fontSize = 25.sp, textAlign = TextAlign.End
                            )
                            Spacer(modifier = Modifier.height(6.dp))


                        }

                    }


                }
            }


            Spacer(modifier = Modifier.height(10.dp))

            Column {

                Card(
                    modifier = Modifier
                        .size(width = 500.dp, height = 120.dp)
                        .fillMaxWidth()
                        .padding(top = 6.dp)
                        .wrapContentHeight(align = Alignment.Top)
                        .clickable {
                            navController.navigate(ROUTE_MIT) {
                                popUpTo(ROUTE_SHOP) { inclusive = true }
                            }
                        },
                    shape = RoundedCornerShape(15.dp)

                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.img_29),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.matchParentSize()
                        )
                        Row(
//                                    modifier = Modifier
//                                        .fillMaxWidth(),
                            horizontalArrangement = Arrangement.End,
                            verticalAlignment = Alignment.Bottom
                        ) {
                            Text(
                                text = "LEG ADVANCED", color = Color.Black,
                                fontSize = 25.sp, textAlign = TextAlign.End
                            )
                            Spacer(modifier = Modifier.height(6.dp))


                        }

                    }


                }
            }





        }


    }
}

@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    ShopScreen(rememberNavController())
}
