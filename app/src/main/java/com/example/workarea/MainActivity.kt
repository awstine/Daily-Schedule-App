package com.example.workarea

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.contentColorFor
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.workarea.ui.theme.Pink40
import com.example.workarea.ui.theme.Purple40
import com.example.workarea.ui.theme.WorkAreaTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WorkAreaTheme {
                // A surface container using the 'background' color from the theme


                Scaffold(
                    topBar = {
                        TopAppBar(
                            title = {},
                            navigationIcon = {},
                        )
                    }
                ) { paddingValues ->
                    Column(
                        modifier = Modifier
                            .padding(paddingValues)
                            .fillMaxWidth()
                    ) {
                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(12.dp)
                        ) {
                            Column(
                                modifier = Modifier.fillMaxWidth(),
                                verticalArrangement = Arrangement.Center,
                                horizontalAlignment = Alignment.Start
                            ) {
                                Text(
                                    text = "Good morning, Austine",
                                    fontSize = 25.sp,
                                    fontWeight = FontWeight.Bold
                                )
                                Text(
                                    text = "We wish you have a good day",
                                    fontWeight = FontWeight.SemiBold
                                )
                            }
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth(),
                                horizontalArrangement = Arrangement.End
                            ) {
                                Icon(
                                    imageVector = Icons.Default.Search,
                                    contentDescription = "Search Icon"
                                )

                            }
                        }

                        LazyRow(
                            modifier = Modifier
                                .padding(12.dp)
                                .fillMaxWidth(),
                            contentPadding = PaddingValues(5.dp),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.spacedBy(10.dp)
                        ) {
                            item{
                                Card(
                                    modifier = Modifier
                                        .clip(RoundedCornerShape(12.dp))
                                        .height(60.dp)
                                        .width(180.dp),

                                    //adding backround color to a card
                                    colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.onTertiaryContainer)

                                ) {
                                    Box(
                                        modifier = Modifier
                                            .padding(20.dp)
                                            .fillMaxWidth()
                                            .height(35.dp)
                                            .clip(RoundedCornerShape(20.dp)),

                                           // .background(Blue),
                                        contentAlignment = Alignment.Center,
                                    ) {
                                        Text(
                                            text = "Sweet sleep",
                                            textAlign = TextAlign.Center,
                                            color = White
                                        )
                                    }
                                }

                            }
                            // Add more items here if needed
                            item {
                                Card(
                                    modifier = Modifier
                                        .clip(RoundedCornerShape(12.dp))
                                        .height(60.dp)
                                        .width(180.dp)
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .padding(20.dp)
                                            .height(35.dp)
                                            .clip(RoundedCornerShape(20.dp)),
                                        contentAlignment = Alignment.Center,
                                    ) {
                                        Text(
                                            text = "Nightmares",
                                            textAlign = TextAlign.Center
                                        )
                                    }
                                }

                            }
                            item {
                                Card(
                                    modifier = Modifier
                                        .clip(RoundedCornerShape(12.dp))
                                        .height(60.dp)
                                        .width(180.dp)
                                ) {
                                    Box(
                                        modifier = Modifier
                                            .padding(20.dp)
                                            .height(35.dp)
                                            .clip(RoundedCornerShape(20.dp)),
                                        contentAlignment = Alignment.Center,
                                    ) {
                                        Text(
                                            text = "Insomnia",
                                            textAlign = TextAlign.Center
                                        )
                                    }
                                }

                            }

                        }

                        Box(
                            modifier = Modifier
                             

                        ){
                            Card(
                                modifier = Modifier
                                    .padding(12.dp),
                            ) {
                                Column(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(12.dp),
                                    verticalArrangement = Arrangement.Center,
                                    horizontalAlignment = Alignment.Start
                                ) {
                                    Text(
                                        text = "Daily Thought",
                                        fontSize = 25.sp,
                                        fontWeight = FontWeight.Bold
                                    )
                                    Text(
                                        text = "Meditation . 3-10 min",
                                        fontWeight = FontWeight.SemiBold
                                    )
                                }
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .width(70.dp)
                                        .height(70.dp)
                                        .padding(15.dp),
                                    horizontalArrangement = Arrangement.End,
                                    verticalAlignment = Alignment.Top
                                ) {
                                    Icon(
                                        painter = painterResource(id = R.drawable.playbutton1),
                                        contentDescription = null,
                                        tint = Color.Magenta
                                    )

                                }
                            }

                        }

                        Spacer(modifier = Modifier.padding(top = 10.dp,))
                        
                        Text(text = "Featured")

                        Column(
                            modifier = Modifier
                                .fillMaxWidth()

                        ) {
                           Row(
                               modifier = Modifier
                                   .padding(12.dp)
                                   .fillMaxWidth(),
                               verticalAlignment = Alignment.CenterVertically,
                               horizontalArrangement = Arrangement.SpaceBetween
                           ) {
                               Box(
                                   modifier = Modifier
                                       .height(200.dp)
                                       .width(200.dp)

                               ) {
                                   Card(
                                       modifier = Modifier
                                           .padding(15.dp)
                                           .clip(RoundedCornerShape(8.dp))
                                           .width(100.dp)
                                           .height(80.dp),
                                   ) {
                                       Text(text = "Sleep Meditation")
                                       Icon(painter = painterResource(id = R.drawable.headphones), contentDescription = null)
                                   }
                               }
                               Box(
                                   modifier = Modifier
                                       .height(200.dp)
                                       .width(200.dp)
                               ) {
                                   Card(
                                       modifier = Modifier
                                           .padding(15.dp)
                                           .clip(RoundedCornerShape(8.dp))
                                           .width(100.dp)
                                           .height(80.dp)
                                   ) {
                                       Text(text = "Tips for sleeping")
                                       Icon(painter = painterResource(id = R.drawable.videocamera), contentDescription = null,)
                                   }
                               }
                           }
                        }
                        Row(
                            modifier = Modifier
                                .padding(12.dp)
                                .fillMaxWidth(),
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Box(
                                modifier = Modifier
                                    .height(200.dp)
                                    .width(200.dp)

                            ) {
                                Card(
                                    modifier = Modifier
                                        .padding(15.dp)
                                        .clip(RoundedCornerShape(8.dp))
                                        .width(100.dp)
                                        .height(80.dp),
                                ) {
                                    Text(text = "Sleep Meditation")
                                    Icon(painter = painterResource(id = R.drawable.headphones), contentDescription = null)
                                }
                            }
                            Box(
                                modifier = Modifier
                                    .height(200.dp)
                                    .width(200.dp)
                            ) {
                                Card(
                                    modifier = Modifier
                                        .padding(15.dp)
                                        .clip(RoundedCornerShape(8.dp))
                                        .width(100.dp)
                                        .height(80.dp)
                                ) {
                                    Text(text = "Tips for sleeping")
                                    Icon(painter = painterResource(id = R.drawable.videocamera), contentDescription = null,)
                                }
                            }
                        }


                        }
                    }
                }
            }
        }
    }

@Preview
@Composable
fun Item(
    modifier: Modifier= Modifier
        .padding(12.dp)
        .fillMaxWidth(),
) {
        Card(
            modifier = Modifier
                .clip(RoundedCornerShape(12.dp))
                .height(60.dp)
                .width(180.dp)
        ) {
            Box(
                modifier = Modifier
                    .padding(20.dp)
                    .height(35.dp)
                    .clip(RoundedCornerShape(20.dp)),
                contentAlignment = Alignment.Center,
            ) {
                Text(
                    text = "Insomnia",
                    textAlign = TextAlign.Center
                )
            }
        }

}








/*
@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .background()
    ) {

    }
    
}


@Composable
fun GreetingTopBar() {
    Box(
        modifier = Modifier
            .fillMaxWidth(),
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(8.dp)
            ) {
                Text(
                    text = "Good Morning Austine",
                    fontWeight = FontWeight.Bold,
                    color = Color.White,
                    fontSize = 20.sp,
                )
                Text(
                    text = "We wish you a good day",
                    fontSize = 15.sp,
                    color = Color.Gray
                )
                Icon(painter = painterResource(id = R.drawable.search1) ,
                    contentDescription = null,
                tint = Color.White,
                modifier = Modifier
                    .size(20.dp)
                )
            }
        }

    }
}

@Composable
fun DailyThought(
    firstText: String,
    secondText: String
) {
    Box(
        modifier = Modifier
            .clip(RoundedCornerShape(12.dp))
            .background(color = Purple40)
            .padding(15.dp)
            .fillMaxWidth()
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                verticalArrangement = Arrangement.spacedBy(5.dp)
            ) {
                Text(
                    text = firstText,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Text(
                    text = secondText,
                    fontSize = 15.sp,
                    color = Color.White
                )
            }
            Box(
                modifier = Modifier
                    .size(40.dp)
                    .clip(CircleShape)
                    .background(color = Color.Blue)
                    .padding(6.dp),
                contentAlignment = Alignment.Center
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.playbutton1),
                    contentDescription = null,
                    tint = Color.White
                )

            }
        }
    }
}


@Composable
fun TypeOfMeditation(
    listOfMed: List<MeditationType>
) {
    var ifSelected by remember {
        mutableStateOf(0)
    }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 25.dp)
    ) {
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ){
            items(listOfMed){
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(12.dp))
                        .background(
                            if (it.index == ifSelected) {
                                Color.Green
                            } else {
                                Color.LightGray
                            }
                        )
                        .clickable {
                            ifSelected = it.index
                        }
                        .padding(12.dp),
                    contentAlignment = Alignment.Center
                ) {
                   Text(
                       text = it.itemText,
                       color = Color.White,
                       fontSize = 17.sp
                   )
                }
            }
        }

    }
}


@Composable
fun FeaturedContent(
    //research this
    itemList: List<FeaturedMed>
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(15.dp)
    ) {
        Text(
            text = "Featured",
            fontSize = 27.sp,
            color = Color.White,
            fontWeight = FontWeight.Bold
        )
        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            verticalArrangement = Arrangement.spacedBy(12.dp),
            horizontalArrangement = Arrangement.spacedBy(17.dp),
        ){
            items(itemList){
                Box(
                    modifier = Modifier
                        .clip(RoundedCornerShape(12.dp))
                        .background(color = Color.Green /*it.backgroundColor*/)
                        .padding(10.dp)
                ) {
                    Column(
                        verticalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .height(140.dp)
                    ) {
                        Text(
                            text = it.itemText,
                            fontSize = 20.sp,
                            color = Color.White,
                            fontWeight = FontWeight.Bold
                        )
                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Icon(
                                painter = it.icon,
                                contentDescription = null,
                                tint = Color.White,
                                modifier = Modifier
                                    .size(24.dp)
                            )
                            Box(
                                modifier = Modifier
                                    .size(width = 60.dp, height = 30.dp)
                                    .clip(RoundedCornerShape(12.dp))
                                    .background(color = Purple40)
                                    .padding(6.dp),
                                contentAlignment = Alignment.Center
                            ) {
                                Text(
                                    text = "Start",
                                    color = Color.White
                                )

                            }
                        }
                    }
                }
            }
        }

    }
}
*/
