package com.r03m.mkii.screens

import android.annotation.SuppressLint
import android.content.res.Configuration
import android.view.View
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.r03m.mkii.R
import com.r03m.mkii.navigation.AppNavigation
import com.r03m.mkii.navigation.AppScreens
import com.r03m.mkii.ui.theme.MKIITheme

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun FirstScreen(navController: NavController) {
    Scaffold(topBar = {
        TopAppBar({
            Text(text = "First Screen")
        })
    }) {
        BodyContent(navController)
    }
}

@Composable
fun BodyContent(navController: NavController) {
    Column(

        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(text = "Hi! Navigation")
        Button(onClick = {
            navController.navigate(route = AppScreens.SecondScreen.route + "/This is a params")
        }) {
            Text(text = "Go")
        }
//        MyMessages(message)

    }

}

data class MyMessage(val title: String, val body: String)

private val message: List<MyMessage> = listOf(
    MyMessage("H1! R03M 0", "Dev, Iusto ut eos sit kasd duis eos lorem accusam et ut."),
    MyMessage(
        "H1! R03M 1",
        "Dev, Iusto ut eos sit kasd duis eos lorem accusam et ut. Ipsum ipsum duis luptatum est delenit clita ea aliquyam diam clita amet no justo consetetur sit in. "
    ),
    MyMessage(
        "H1! R03M 2",
        "Dev, Iusto ut eos sit kasd duis eos lorem accusam et ut. Ipsum ipsum duis luptatum est delenit clita ea aliquyam diam clita amet no justo consetetur sit in. "
    ),
    MyMessage(
        "H1! R03M 3",
        "Dev, Iusto ut eos sit kasd duis eos lorem accusam et ut. Ipsum ipsum duis luptatum est delenit clita ea aliquyam diam clita amet no justo consetetur sit in. "
    ),
    MyMessage(
        "H1! R03M 4",
        "Dev, Iusto ut eos sit kasd duis eos lorem accusam et ut. Ipsum ipsum duis luptatum est delenit clita ea aliquyam diam clita amet no justo consetetur sit in. "
    ),
    MyMessage(
        "H1! R03M 5",
        "Dev, Iusto ut eos sit kasd duis eos lorem accusam et ut. Ipsum ipsum duis luptatum est delenit clita ea aliquyam diam clita amet no justo consetetur sit in. "
    ),
    MyMessage(
        "H1! R03M 6",
        "Dev, Iusto ut eos sit kasd duis eos lorem accusam et ut. Ipsum ipsum duis luptatum est delenit clita ea aliquyam diam clita amet no justo consetetur sit in. "
    ),
    MyMessage(
        "H1! R03M 8",
        "Dev, Iusto ut eos sit kasd duis eos lorem accusam et ut. Ipsum ipsum duis luptatum est delenit clita ea aliquyam diam clita amet no justo consetetur sit in. "
    ),
    MyMessage(
        "H1! R03M 9",
        "Dev, Iusto ut eos sit kasd duis eos lorem accusam et ut. Ipsum ipsum duis luptatum est delenit clita ea aliquyam diam clita amet no justo consetetur sit in. "
    ),
    MyMessage(
        "H1! R03M 7",
        "Dev, Iusto ut eos sit kasd duis eos lorem accusam et ut. Ipsum ipsum duis luptatum est delenit clita ea aliquyam diam clita amet no justo consetetur sit in. "
    ),
    MyMessage(
        "H1! R03M 10",
        "Dev, Iusto ut eos sit kasd duis eos lorem accusam et ut. Ipsum ipsum duis luptatum est delenit clita ea aliquyam diam clita amet no justo consetetur sit in. "
    ),
    MyMessage(
        "H1! R03M 11",
        "Dev, Iusto ut eos sit kasd duis eos lorem accusam et ut. Ipsum ipsum duis luptatum est delenit clita ea aliquyam diam clita amet no justo consetetur sit in. "
    ),
    MyMessage(
        "H1! R03M 12",
        "Dev, Iusto ut eos sit kasd duis eos lorem accusam et ut. Ipsum ipsum duis luptatum est delenit clita ea aliquyam diam clita amet no justo consetetur sit in. "
    ),
    MyMessage(
        "H1! R03M 13",
        "Dev, Iusto ut eos sit kasd duis eos lorem accusam et ut. Ipsum ipsum duis luptatum est delenit clita ea aliquyam diam clita amet no justo consetetur sit in. "
    ),
    MyMessage(
        "H1! R03M 14",
        "Dev, Iusto ut eos sit kasd duis eos lorem accusam et ut. Ipsum ipsum duis luptatum est delenit clita ea aliquyam diam clita amet no justo consetetur sit in. "
    ),
    MyMessage(
        "H1! R03M 15",
        "Dev, Iusto ut eos sit kasd duis eos lorem accusam et ut. Ipsum ipsum duis luptatum est delenit clita ea aliquyam diam clita amet no justo consetetur sit in. "
    ),
)

@Composable
fun MyMessages(message: List<MyMessage>) {
    LazyColumn {
        items(message) { message ->
            MyComponent(message)
        }
    }
}

@Composable
fun MyComponent(message: MyMessage) {
    Row(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.background)
            .padding(8.dp)
    ) {
        MyImg()
        MyTexts(message)
    }
}

@Composable
fun MyImg() {
    Image(
        painterResource(R.drawable.ic_launcher_foreground), contentDescription = "Test",
        modifier = Modifier
            .clip(CircleShape)
            .background(MaterialTheme.colorScheme.primary)
            .size(64.dp)
    )
}


@Composable
fun MyTexts(message: MyMessage) {
    var expanded by remember { mutableStateOf(false) }

    Column(modifier = Modifier
        .padding(start = 8.dp)
        .clickable {
            expanded = !expanded
        }) {
        MyText(text = message.title, MaterialTheme.colorScheme.primary)
        Spacer(modifier = Modifier.height(8.dp))
        MyText(
            text = message.body,
            MaterialTheme.colorScheme.onBackground,
            if (expanded) Int.MAX_VALUE else 1
        )
    }
}

@Composable
fun MyText(text: String, color: Color, lines: Int = Int.MAX_VALUE) {
    Text(text, color = color, maxLines = lines)
}

//    @Preview(showSystemUi = true)
@Preview(showSystemUi = true, uiMode = Configuration.UI_MODE_NIGHT_YES)
@Composable
fun PreviewTexts() {
    MKIITheme {
        AppNavigation()
//            MyMessages(message)
    }
}
