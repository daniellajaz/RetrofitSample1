package com.example.retrofitsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.example.retrofitsample.data.RetrofitService
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val service = RetrofitService.RetrofitServiceFactory.makeRetrofitService()

        lifecycleScope.launch {
            val movies = service.listPopularMovies("43129791d8f75a33ef869384ca513ac8","es-CO")
            println(movies)
        }

        setContentView(R.layout.activity_main)
    }
}