package com.example.scoretime.ui.screens

import androidx.compose.foundation.background
import com.example.scoretime.ui.screens.util.PlannerTopBar
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Build
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Face
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.DrawerState
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.scoretime.R


@Composable
fun TelaTres(drawerState: DrawerState) {
    Scaffold(
        topBar = { PlannerTopBar(drawerState) },
        content = { padding -> ConteudoPrincipal(padding) },
        bottomBar = { BottomAppBarMinima() }
    )
}

@Composable
private fun BottomAppBarMinima() {
    BottomAppBar(
        containerColor = Color(0xFFBA4141)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Histórico",
                color = Color.White,
                fontSize = 40.sp,
                fontWeight = FontWeight(600)
            )
        }

    }
}



@Composable
private fun ConteudoPrincipal(padding: PaddingValues) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            modifier = Modifier.padding(40.dp),
            text = "Últimas partidas",
            fontSize = 40.sp
        )
        Box(
            modifier = Modifier
                .width(250.dp)
                .height(100.dp)
                .background(Color(0xFFF17070)),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.cartas),
                    contentDescription = "Cartas de baralho",
                    modifier = Modifier.size(40.dp),
                    tint = Color.White
                )

                Text(
                    text = "Resultado: 3 - 1",
                    color = Color.White,
                    fontSize = 24.sp

                )
            }
        }
        Box(
            modifier = Modifier
                .width(250.dp)
                .height(100.dp)
                .background(Color(0xFFF17070)),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.bola),
                    contentDescription = "Bola de futebol",
                    modifier = Modifier.size(40.dp),
                    tint = Color.White
                )

                Text(
                    text = "Resultado: 2 - 3",
                    color = Color.White,
                    fontSize = 24.sp

                )
            }
        }
        Box(
            modifier = Modifier
                .width(250.dp)
                .height(100.dp)
                .background(Color(0xFFF17070)),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.raquete),
                    contentDescription = "raquete",
                    modifier = Modifier.size(40.dp),
                    tint = Color.White
                )

                Text(
                    text = "Resultado: 3 - 0",
                    color = Color.White,
                    fontSize = 24.sp

                )
            }
        }
        Box(
            modifier = Modifier
                .width(250.dp)
                .height(100.dp)
                .background(Color(0xFFF17070)),
            contentAlignment = Alignment.Center
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.cartas),
                    contentDescription = "Cartas de baralho",
                    modifier = Modifier.size(40.dp),
                    tint = Color.White
                )

                Text(
                    text = "Resultado: 0 - 3",
                    color = Color.White,
                    fontSize = 24.sp

                )
            }
        }

    }
}
