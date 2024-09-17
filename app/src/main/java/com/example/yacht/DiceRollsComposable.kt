package com.example.yacht

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

fun DiceRoll() {
    // Roll the Dices
    // 5 dice numbers:random pick up (range 1...6)
}

@Composable
fun DiceRolls(
    modifier: Modifier = Modifier
) {
    // ダイスの出目をrememberで保持
//    var diceNumbers = rememberSaveable {
//        mutableStateListOf(0,0,0,0,0)
//    }

    Column {
        Column(
            modifier = modifier
                .padding(16.dp)
                .weight(1f)
        ) {
            // さいころの出目を表示
//            for(num in diceNumbers) {
//                Text(text = num.toString())
//            }
            Text(text = "Text")
        }
        Column(
            modifier = modifier
                .padding(16.dp)
                .weight(1f)
                .align(Alignment.CenterHorizontally),
            verticalArrangement = Arrangement.Bottom
        ) {
            RollButton(
                diceRollsCallback = { /*TODO*/ },
                modifier = modifier
                    .padding(16.dp),
            )
        }
    }
}

@Composable
fun RollButton(
    diceRollsCallback: () -> Unit,
    modifier: Modifier = Modifier
) {
    Button(
        onClick = diceRollsCallback,
        modifier.padding(16.dp)
    ) {
        Text(text = "Roll the Dice!")
    }
}

@Preview(
    showBackground = true,
    widthDp = 797,
    heightDp = 412
)
@Composable
fun PreviewDiceRolls() {
    DiceRolls()
}

@Preview(
    showBackground = true,
)
@Composable
fun PreviewRollButton() {
    RollButton({})
}