package com.ykalchev.computersapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.viewmodel.compose.viewModel
import coil.annotation.ExperimentalCoilApi
import coil.compose.rememberImagePainter
import com.ykalchev.computersapp.ui.theme.AppTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
@ExperimentalCoilApi
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTheme {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(32.dp)
                ) {
                    val viewModel: MainViewModel = hiltViewModel()
                    val computer = viewModel.state.value.computer
                    val isLoading = viewModel.state.value.isLoading
                    computer?.let {
                        Image(
                            painter = rememberImagePainter(
                                data = computer.imageUrl,
                                builder = { crossfade(true) }
                            ),
                            contentDescription = "Computer"
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(
                            text = computer.name,
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        Text(text = computer.description)
                        Spacer(modifier = Modifier.height(8.dp))
                    }
                    Button(
                        onClick = viewModel::getRandomComputer,
                        modifier = Modifier.align(Alignment.End)
                    ) {
                        Text(text = "Other random computer!")
                    }
                    Spacer(Modifier.height(8.dp))
                    if(isLoading) {
                        CircularProgressIndicator()
                    }
                }
            }
        }
    }
}