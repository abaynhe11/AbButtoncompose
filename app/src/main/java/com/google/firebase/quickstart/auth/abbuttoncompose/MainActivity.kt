package com.google.firebase.quickstart.auth.abbuttoncompose

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.firebase.quickstart.auth.abbuttoncompose.ui.theme.AbButtonComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
               Column(
                   verticalArrangement = Arrangement.SpaceBetween,
                   horizontalAlignment = Alignment.CenterHorizontally,
                   modifier = Modifier
                       .fillMaxSize()

               )
               {
                   ButtonDemo()
               }
        }
    }

    @Composable
    fun ButtonDemo() {

        val context = LocalContext.current

        Button(onClick = {
            Toast.makeText(context, "Clicked on Button", Toast.LENGTH_SHORT).show()
        }
        )
        {
            Text("Standard")
        }


        Button( onClick = { Toast.makeText(context, "Can't Clicked on this Button", Toast.LENGTH_SHORT).show()
            },
            enabled = false
        ) {
            Text("Disabled Button")
        }



        TextButton(onClick = {
            Toast.makeText(context, "Clicked on Text Button", Toast.LENGTH_SHORT).show()
        })
        {
            Text("  Text  ")
        }

        OutlinedButton(onClick = { Toast.makeText(context,"Clicked on Outlined Button", Toast.LENGTH_SHORT).show() })
        {
            Text("Outlined Button")
        }

        IconButton(onClick = {Toast.makeText(context,"Clicked on Icon Button", Toast.LENGTH_SHORT).show() })
        {
            Icon (Icons.Filled.Refresh,
                contentDescription = "Refresh Button",
                tint = Color.DarkGray,
                modifier = Modifier
                    .size(80.dp)
            )

        }

        Button(onClick = {
            Toast.makeText(context, "Clicked on Custom Button", Toast.LENGTH_SHORT).show()
        },
            contentPadding = PaddingValues(16.dp),
            border = BorderStroke(10.dp, Color.Black),
            colors = ButtonDefaults.textButtonColors(
                backgroundColor = Color.DarkGray,
                contentColor = Color.White
            )
        ) {
            Text("Add To Cart",
                style = MaterialTheme.typography.h3,
                modifier = Modifier.padding(5.dp)
            )
        }


        Button(onClick = {
            Toast.makeText(context, "Clicked on Button with Shape", Toast.LENGTH_SHORT).show()
        },
            shape = CutCornerShape(10.dp),
            contentPadding = PaddingValues(16.dp),
            border = BorderStroke(10.dp, Color.Black),
            colors = ButtonDefaults.textButtonColors(
                backgroundColor = Color.DarkGray,
                contentColor = Color.White
            )
        ) {
            Text("Add To Cart",
                style = MaterialTheme.typography.h3,
                modifier = Modifier.padding(5.dp)
            )
        }

        Button(onClick = {
            Toast.makeText(context, "Circle button Clicked", Toast.LENGTH_SHORT).show()
            },
            shape = CircleShape

        )
        {
            Text("Circle Button")
        }


    }


}