package kr.ac.kumoh.ce.s20190757.s23w11layout

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kr.ac.kumoh.ce.s20190757.s23w11layout.ui.theme.S23W11LayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyLinearLayout()
        }
    }
}

@Composable
fun MyApp() {
    S23W11LayoutTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.background
        ) {
            Greeting("안녕하세요")
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Composable
fun MyLinearLayout() {
    Column {
        Row {
            Text(
                text = "안녕하세요",
                modifier = Modifier.background(Color.Yellow).padding(8.dp))
            Text(
                "컴퓨터공학과",
                modifier = Modifier.background(Color.Cyan).padding(8.dp))
        }
        Row {
            Text(
                "금오공과대학교",
                modifier = Modifier.background(Color.Magenta).padding(8.dp))
            Text(
                "나는 누구인가",
                color = Color.White,
                modifier = Modifier.background(Color.Black).padding(8.dp))
        }
    }
}