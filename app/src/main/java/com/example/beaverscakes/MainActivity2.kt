package com.example.beaverscakes

import android.app.DownloadManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import okhttp3.OkHttpClient
import okhttp3.Request

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val client = OkHttpClient()

        val request = Request.Builder()
            .url("https://cafe-cookies.p.rapidapi.com/")
            .get()
            .addHeader("x-rapidapi-host", "cafe-cookies.p.rapidapi.com")
            .addHeader("x-rapidapi-key", "undefined")
            .build()

        val response = client.newCall(request).execute()
    }
}