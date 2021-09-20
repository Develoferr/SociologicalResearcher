package com.tutorial.registrodesuperheroes

import android.graphics.Bitmap
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tutorial.registrodesuperheroes.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    companion object{
        const val SUPERHERO_KEY = "superhero"
        const val BITMAP_KEY = "bitmap"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val bundle = intent.extras!!
        val superhero = bundle.getParcelable<SuperHero>(SUPERHERO_KEY)!!
        binding.superhero = superhero

        val bitmap = bundle.getParcelable<Bitmap>(BITMAP_KEY)!!
        binding.detailHeroImage.setImageBitmap(bitmap)
    }
}