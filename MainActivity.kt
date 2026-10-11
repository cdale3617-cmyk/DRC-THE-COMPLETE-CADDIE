package au.com.drc.completecaddie

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
 override fun onCreate(savedInstanceState: Bundle?) {
  super.onCreate(savedInstanceState)
  setContent {
   var tab by remember { mutableStateOf("HOME") }
   Column(Modifier.fillMaxSize().background(Color(0xFF092C23)).padding(20.dp)) {
    Text("DRC THE COMPLETE CADDIE", color = Color(0xFFD7B56D))
    Spacer(Modifier.height(20.dp))
    Text(tab, color = Color.White)
    listOf("HOME", "LIVE HOLE", "MY BAG", "GOLF LAB", "SCORECARD").forEach { item ->
     TextButton(onClick = { tab = item }) { Text(item, color = Color(0xFFD7B56D)) }
    }
    Text("Foundation build — live features not yet connected", color = Color.White)
   }
  }
 }
}
