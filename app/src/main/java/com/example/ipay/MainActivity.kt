package com.example.ipay

import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import io.github.jan.supabase.SupabaseClient
import io.github.jan.supabase.postgrest.Postgrest
import kotlinx.serialization.Serializable

// Initialize Supabase Client
val supabase = SupabaseClient.create(
    supabaseUrl = "https://uolhdugnwprlmihmpdab.supabase.co",
    supabaseKey = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6InVvbGhkdWdud3BybG1paG1wZGFiIiwicm9sZSI6ImFub24iLCJpYXQiOjE3Mzg2NTgwNzQsImV4cCI6MjA1NDIzNDA3NH0.nFMzgIIi2Sl32SR-diOaaKt4IDnXUvIj-rVzXROOvBk"
) {
    install(Postgrest)
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    LoadNetlifyApp()
                }
            }
        }
    }
}

@Composable
fun LoadNetlifyApp() {
    AndroidView(factory = { context ->
        WebView(context).apply {
            webViewClient = WebViewClient()
            settings.javaScriptEnabled = true
            loadUrl("https://thriving-mermaid-f5673a.netlify.app")  // Your Netlify app URL
        }
    })
}
