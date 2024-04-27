package com.techafresh.timbertrack

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.techafresh.timbertrack.ui.theme.TimberTrackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TimberTrackTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val context = LocalContext.current

                    Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.CenterHorizontally){
                        Button(onClick = {
                            TimberTrack.log()
                        }) {
                            Text(text = "Default values")
                        }

                        Button(onClick = {
                            TimberTrack.log(message = "This is a logging library")
                        }) {
                            Text(text = "Custom message")
                        }

                        Button(onClick = {
                            TimberTrack.log(message = "This is a logging library", tag = "Custom Tag")
                        }) {
                            Text(text = "Custom message with tag")
                        }

                        Button(onClick = {
                            TimberTrack.log(message = "This is a logging library", showToast = true, context = context)
                        }) {
                            Text(text = "Custom message with a toast") // By default the toast is long
                        }

                        Button(onClick = {
                            // Toast Length:  Long = 1 , Short = 0 can also use numbers for "toastLength"
                            TimberTrack.log(message = "This is a logging library", showToast = true, context = context, toastLength = Toast.LENGTH_SHORT)
                        }) {
                            Text(text = "Custom message with a short toast")
                        }
                    }
                }
            }
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

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    TimberTrackTheme {
        Greeting("Android")
    }
}