package com.example.facebook

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Create
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.facebook.ui.theme.FaceBookTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FaceBookTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    var postText by remember { mutableStateOf("") }
    var isExpanded by remember { mutableStateOf(false) }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        //for upper first container
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 1.dp),
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Image(
                painter = painterResource(id = R.drawable.facebook_logo),
                contentDescription = "logo",
                modifier = Modifier
                    .size(100.dp)
                    .weight(1f)
                    .padding(start = 16.dp)
            )
            Row(
                modifier = Modifier.weight(1f),
                horizontalArrangement = Arrangement.End
            ) {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = null,
                    modifier = Modifier
                        .size(50.dp)
                        .padding(end = 16.dp)
                )
                Icon(
                    imageVector = Icons.Default.MoreVert,
                    contentDescription = null,
                    modifier = Modifier
                        .size(50.dp)
                        .padding(end = 16.dp)
                )
            }
        }
        Row(modifier= Modifier.padding(bottom = 10.dp),
            horizontalArrangement = Arrangement.SpaceAround) {
            Icon(
                imageVector = Icons.Default.Home,
                contentDescription = null,
                tint= Color.Blue,
                modifier = Modifier
                    .size(30.dp)
                    .padding(end = 16.dp)
                    .weight(1f)
            )
            Icon(
                imageVector = Icons.Default.Share,
                contentDescription = null,
                tint= Color.Blue,
                modifier = Modifier
                    .size(30.dp)
                    .padding(end = 16.dp)
                    .weight(1f)
            )
            Icon(
                imageVector = Icons.Default.Notifications,
                contentDescription = null,
                tint= Color.Blue,
                modifier = Modifier
                    .size(30.dp)
                    .padding(end = 16.dp)
                    .weight(1f)
            )
            Icon(
                imageVector = Icons.Default.Menu,
                contentDescription = null,
                tint= Color.Blue,
                modifier = Modifier
                    .size(30.dp)
                    .padding(end = 16.dp)
                    .weight(1f)
            )
        }
        Divider(color = Color.LightGray, thickness = 1.dp)
        //for second container
        Row (modifier = Modifier
            .fillMaxSize()
            .padding(start = 16.dp),
            verticalAlignment = Alignment.CenterVertically){
            Image(painter = painterResource(id = R.drawable.my_photo001), contentDescription = "My Prrofile",
                modifier = Modifier
                    .size(60.dp)
                    .clip(CircleShape) // Clip the image with a circular shape
                    )
            Spacer(modifier = Modifier.width(16.dp))
            var text by remember { mutableStateOf("") }
            TextField(
                value = text,
                onValueChange = { text = it },
                label = { Text("What's on your mind?") },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(16.dp) // Add padding to the box
                            .border(
                                2.dp,
                                color = Color.LightGray,
                                shape = RoundedCornerShape(16.dp)
                            )
                            .height(50.dp)
                            .background(Color.White)
            )
        }
        Divider(color = Color.LightGray, thickness = 1.dp)
        //Third Container
        Row(modifier= Modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically) {
            Row (modifier = Modifier.weight(1f),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically){
                Icon(
                    imageVector = Icons.Default.PlayArrow,
                    contentDescription = null,
                    tint= Color.Green,
                    modifier = Modifier
                        .size(40.dp)
                        .padding(end = 5.dp)
                        )
                Text(text = "Live")
            }
            Row (modifier = Modifier.weight(1f),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically){
                Icon(
                    imageVector = Icons.Default.Star,
                    tint= Color.Blue,
                    contentDescription = null,
                    modifier = Modifier
                        .size(40.dp)
                        .padding(end = 5.dp))
                Text(text = "Star")
            }
            Row (modifier = Modifier.weight(1f),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically){
                Icon(
                    imageVector = Icons.Default.FavoriteBorder,
                    contentDescription = null,
                    tint= Color.Red,
                    modifier = Modifier
                        .size(40.dp)
                        .padding(end = 5.dp))
                Text(text = "Live")
            }
        }
        Divider(color = Color.LightGray, thickness = 1.dp,
            modifier = Modifier.padding(bottom = 10.dp))
        //Forth container
        Row(modifier= Modifier
            .fillMaxSize()
            .horizontalScroll(rememberScrollState())){
            Spacer(modifier = Modifier.width(6.dp))
            //Card-1
                Card(
                    modifier = Modifier
                        .width(115.dp)
                        .height(200.dp)
                ) {
                    Box {
                        Image(
                            painter = painterResource(id = R.drawable.my_photo001),
                            contentDescription = null,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxSize()
                                .clip(MaterialTheme.shapes.medium)
                                .alpha(0.9f),
                        )
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(8.dp),
                            verticalArrangement = Arrangement.Top,
                            horizontalAlignment = Alignment.Start
                        ){
                            Image(painter = painterResource(id = R.drawable.my_photo001), contentDescription = "My Prrofile",
                                modifier = Modifier
                                    .size(55.dp)
                                    .clip(CircleShape)
                            )
                        }
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(16.dp),
                            verticalArrangement = Arrangement.Bottom,
                            horizontalAlignment = Alignment.CenterHorizontally
                        ) {
                            // Add content such as title and description
                            Text("Subhankar", style = MaterialTheme.typography.bodySmall,
                                color=Color.White,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .padding(4.dp),
                            )
                        }
                    }
                }
            Spacer(modifier = Modifier.width(10.dp))
            //card-2
            Card(
                modifier = Modifier
                    .width(115.dp)
                    .height(200.dp)
            ) {
                Box {
                    Image(
                        painter = painterResource(id = R.drawable.images),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxSize()
                            .clip(MaterialTheme.shapes.medium)
                            .alpha(0.9f),
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(8.dp),
                        verticalArrangement = Arrangement.Top,
                        horizontalAlignment = Alignment.Start
                    ){
                        Image(painter = painterResource(id = R.drawable.download), contentDescription = "My Prrofile",
                            modifier = Modifier
                                .size(55.dp)
                                .clip(CircleShape)
                        )
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        verticalArrangement = Arrangement.Bottom,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        // Add content such as title and description
                        Text("Elon Musk", style = MaterialTheme.typography.bodySmall,
                            color=Color.White,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(4.dp),
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.width(10.dp))
            //card-3
            Card(
                modifier = Modifier
                    .width(115.dp)
                    .height(200.dp)
            ) {
                Box {
                    Image(
                        painter = painterResource(id = R.drawable.unnamed),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxSize()
                            .clip(MaterialTheme.shapes.medium)
                            .alpha(0.9f),
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(8.dp),
                        verticalArrangement = Arrangement.Top,
                        horizontalAlignment = Alignment.Start
                    ){
                        Image(painter = painterResource(id = R.drawable.ashis), contentDescription = "My Prrofile",
                            modifier = Modifier
                                .size(55.dp)
                                .clip(CircleShape)
                        )
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        verticalArrangement = Arrangement.Bottom,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        // Add content such as title and description
                        Text("Ashis", style = MaterialTheme.typography.bodySmall,
                            color=Color.White,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(4.dp),
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.width(10.dp))
            //card-4
            Card(
                modifier = Modifier
                    .width(115.dp)
                    .height(200.dp)
            ) {
                Box {
                    Image(
                        painter = painterResource(id = R.drawable.carryminati),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxSize()
                            .clip(MaterialTheme.shapes.medium)
                            .alpha(0.9f),
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(8.dp),
                        verticalArrangement = Arrangement.Top,
                        horizontalAlignment = Alignment.Start
                    ){
                        Image(painter = painterResource(id = R.drawable.carryminati), contentDescription = "My Prrofile",
                            modifier = Modifier
                                .size(55.dp)
                                .clip(CircleShape)
                        )
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        verticalArrangement = Arrangement.Bottom,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        // Add content such as title and description
                        Text("CarryMinati", style = MaterialTheme.typography.bodySmall,
                            color=Color.White,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(4.dp),
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.width(10.dp))
            //card-5
            Card(
                modifier = Modifier
                    .width(115.dp)
                    .height(200.dp)
            ) {
                Box {
                    Image(
                        painter = painterResource(id = R.drawable.my_photo001),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxSize()
                            .clip(MaterialTheme.shapes.medium)
                            .alpha(0.9f),
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(8.dp),
                        verticalArrangement = Arrangement.Top,
                        horizontalAlignment = Alignment.Start
                    ){
                        Image(painter = painterResource(id = R.drawable.my_photo001), contentDescription = "My Prrofile",
                            modifier = Modifier
                                .size(55.dp)
                                .clip(CircleShape)
                        )
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        verticalArrangement = Arrangement.Bottom,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        // Add content such as title and description
                        Text("Subhankar", style = MaterialTheme.typography.bodySmall,
                            color=Color.White,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(4.dp),
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.width(10.dp))
            //card-6
            Card(
                modifier = Modifier
                    .width(115.dp)
                    .height(200.dp)
            ) {
                Box {
                    Image(
                        painter = painterResource(id = R.drawable.my_photo001),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxSize()
                            .clip(MaterialTheme.shapes.medium)
                            .alpha(0.9f),
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(8.dp),
                        verticalArrangement = Arrangement.Top,
                        horizontalAlignment = Alignment.Start
                    ){
                        Image(painter = painterResource(id = R.drawable.my_photo001), contentDescription = "My Prrofile",
                            modifier = Modifier
                                .size(55.dp)
                                .clip(CircleShape)
                        )
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        verticalArrangement = Arrangement.Bottom,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        // Add content such as title and description
                        Text("Subhankar", style = MaterialTheme.typography.bodySmall,
                            color=Color.White,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(4.dp),
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.width(10.dp))
            //card-7
            Card(
                modifier = Modifier
                    .width(115.dp)
                    .height(200.dp)
            ) {
                Box {
                    Image(
                        painter = painterResource(id = R.drawable.my_photo001),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxSize()
                            .clip(MaterialTheme.shapes.medium)
                            .alpha(0.9f),
                    )
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(8.dp),
                        verticalArrangement = Arrangement.Top,
                        horizontalAlignment = Alignment.Start
                    ){
                        Image(painter = painterResource(id = R.drawable.my_photo001), contentDescription = "My Prrofile",
                            modifier = Modifier
                                .size(55.dp)
                                .clip(CircleShape)
                        )
                    }
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(16.dp),
                        verticalArrangement = Arrangement.Bottom,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        // Add content such as title and description
                        Text("Subhankar", style = MaterialTheme.typography.bodySmall,
                            color=Color.White,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(4.dp),
                        )
                    }
                }
            }
            }
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.carryminati),
                contentDescription = "My Profile",
                modifier = Modifier
                    .size(60.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.width(16.dp)) // Add space between the image and text
            Column(modifier = Modifier.weight(1f)) {
                Text(text = "CarryMinati", fontWeight = FontWeight.Bold)
                Row {
                    Text(text = "20m.", fontWeight = FontWeight.Normal)
                    Icon(
                        imageVector = Icons.Default.LocationOn,
                        tint= Color.Black,
                        contentDescription = null,
                        modifier = Modifier
                            .size(20.dp)
                            .padding(end = 2.dp))
                }
            }
        }
        Text(text = "Brown men like CarryMinati think cussing and using homophobic and transphobic slurs will make them reach max humor",
            modifier=Modifier.padding(start = 16.dp, end = 16.dp))
        Row(modifier= Modifier
            .fillMaxSize()
            .padding(6.dp),
        ) {
            Icon(
                imageVector = Icons.Default.Favorite,
                tint= Color.Gray,
                contentDescription = null,
                modifier = Modifier
                    .size(30.dp)
                    .padding(end = 10.dp)
                    .weight(1f))
            Icon(
                imageVector = Icons.Default.Create,
                tint= Color.Gray,
                contentDescription = null,
                modifier = Modifier
                    .size(30.dp)
                    .padding(end = 10.dp)
                    .weight(1f))
            Icon(
                imageVector = Icons.Default.Share,
                tint= Color.Gray,
                contentDescription = null,
                modifier = Modifier
                    .size(30.dp)
                    .padding(end = 10.dp)
                    .weight(1f))
        }
        Divider(color = Color.LightGray, thickness = 1.dp,
            modifier = Modifier.padding(bottom = 10.dp))
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.unnamed),
                contentDescription = "My Profile",
                modifier = Modifier
                    .size(60.dp)
                    .clip(CircleShape)
            )
            Spacer(modifier = Modifier.width(16.dp)) // Add space between the image and text
            Column(modifier = Modifier.weight(1f)) {
                Text(text = "Ashis Prank", fontWeight = FontWeight.Bold)
                Row {
                    Text(text = "3h.", fontWeight = FontWeight.Normal)
                    Icon(
                        imageVector = Icons.Default.LocationOn,
                        tint= Color.Black,
                        contentDescription = null,
                        modifier = Modifier
                            .size(20.dp)
                            .padding(end = 2.dp))
                }
            }
        }
        Image(painter = painterResource(id = R.drawable.ashis), contentDescription = "Ashis",
            modifier= Modifier.fillMaxSize())
        Row(modifier= Modifier
            .fillMaxSize()
            .padding(6.dp),
        ) {
            Icon(
                imageVector = Icons.Default.Favorite,
                tint= Color.Gray,
                contentDescription = null,
                modifier = Modifier
                    .size(30.dp)
                    .padding(end = 10.dp)
                    .weight(1f))
            Icon(
                imageVector = Icons.Default.Create,
                tint= Color.Gray,
                contentDescription = null,
                modifier = Modifier
                    .size(30.dp)
                    .padding(end = 10.dp)
                    .weight(1f))
            Icon(
                imageVector = Icons.Default.Share,
                tint= Color.Gray,
                contentDescription = null,
                modifier = Modifier
                    .size(30.dp)
                    .padding(end = 10.dp)
                    .weight(1f))
        }

    }//coloumn

    }//greetings

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FaceBookTheme {
        Greeting("Android")
    }
}
