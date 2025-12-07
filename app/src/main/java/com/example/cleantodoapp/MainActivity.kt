package com.example.cleantodoapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import com.example.cleantodoapp.presentation.TodoViewModel
import com.example.cleantodoapp.ui.theme.CleanTodoAppTheme
import com.example.cleantodoapp.uiscreens.TodoScreen

class MainActivity : ComponentActivity() {

    // ✅ proper name + type
    private val todoViewModel: TodoViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            CleanTodoAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    // ✅ correct parameter name & variable
                    TodoScreen(todoViewModel = todoViewModel)
                }
            }
        }
    }
}
