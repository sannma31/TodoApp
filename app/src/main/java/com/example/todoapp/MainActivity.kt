package com.example.todoapp

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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.material3.Button
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.Alignment
import com.example.todoapp.ui.theme.TodoAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TodoAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Title(title = "Todoリスト")

                        AddTodoList(
                            onClick = {
                                print("これから追加していく")
                            }
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun Title(title: String) {
    Text(
        text = "$title!", fontSize = 25.sp
    )
}

@Composable
fun AddTodoList(onClick: () -> Unit) {
    Button(onClick = onClick) {
        Text("Todo追加")
    }
}

//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    TodoAppTheme {
//    }
//}
