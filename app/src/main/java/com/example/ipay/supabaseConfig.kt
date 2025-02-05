package com.example.ipay

import io.github.jan.supabase.SupabaseClient

object SupabaseConfig {
    val client = SupabaseClient.create(
        supabaseUrl = "https://uolhdugnwprlmihmpdab.supabase.co",
        supabaseKey = "YOUR_PUBLIC_ANON_KEY"  // Replace this with your actual public anon key from Supabase
    )
}
