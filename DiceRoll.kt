package com.example.diceroller

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.diceroller.ui.theme.DiceRollerTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DiceRollerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    DiceWhithButtonAndImage(
                        modifier = Modifier.padding(innerPadding)

                    )
                }
            }
        }
    }
}






@Composable
fun DiceWhithButtonAndImage(modifier: Modifier = Modifier) {
    Column {
        Image(painter= painterResource(R.drawable.dice_1),contentDescription = null)
        Button(
            onClick =
        ){
            Text(text = stringResource(R.string.roll),fontSize = 24.sp)
        }

    }
}


