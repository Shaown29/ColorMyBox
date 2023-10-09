package com.example.myown

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.myown.ui.theme.MyOwnTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            setContentView(R.layout.activity_main)
            val boxOne = findViewById<TextView>(R.id.text_box_one)
            val boxTwo = findViewById<TextView>(R.id.text_box_two)
            val boxthree = findViewById<TextView>(R.id.text_box_three)
            val boxFour = findViewById<TextView>(R.id.text_box_four)
            val boxFive = findViewById<TextView>(R.id.text_box_five)
            // Now we will set the box click effect
            boxOne.setOnClickListener { makecolor(it) }
            boxTwo.setOnClickListener { makecolor(it) }
            boxthree.setOnClickListener { makecolor(it) }
            boxFour.setOnClickListener { makecolor(it) }
            boxFive.setOnClickListener { makecolor(it) }
            MyOwnTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}
private fun makecolor(view: View){
    when(view.id){
        R.id.text_box_one -> view.setBackgroundResource(R.color.green)
        R.id.text_box_two -> view.setBackgroundResource(R.color.brown)
        R.id.text_box_three -> view.setBackgroundResource(R.color.red)
        R.id.text_box_four -> view.setBackgroundResource(R.color.yellow)
        R.id.text_box_five -> view.setBackgroundResource(R.color.blue)
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyOwnTheme {
        Greeting("Android")
    }
}