package com.example.tilltime

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.View
import android.view.WindowManager
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import com.example.tilltime.databinding.ActivitySplashBinding
import kotlinx.coroutines.delay

class SplashActivity : AppCompatActivity() {
    lateinit var binding:ActivitySplashBinding
    lateinit var handler: Handler
    val splash_screen=5000
    private lateinit var topAnimation:Animation
    private lateinit var bottomAnimation:Animation
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        window.setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN)
        getSupportActionBar()?.hide()
        binding = ActivitySplashBinding.inflate(layoutInflater)
        setContentView(binding.root)
        topAnimation=AnimationUtils.loadAnimation(this,R.anim.top_animation)
        bottomAnimation=AnimationUtils.loadAnimation(this,R.anim.bottom_animation)
        binding.splashImage.animation=topAnimation
        binding.splashText.animation=bottomAnimation
        binding.splashScript.animation=bottomAnimation
        handler= Handler(Looper.getMainLooper())
        handler.postDelayed({

            var intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        },2000)
       // binding.splashText.visibility=View.INVISIBLE
        //binding.splashImage.animate().alpha(1f).duration=2000
       /* binding.splashText.animate().alpha(1f).duration=3000
        handler= Handler(Looper.getMainLooper())
       // binding.splashText.visibility= View.VISIBLE
       // binding.splashText.visibility= View.VISIBLE
        /*binding.splashText.animate().alpha(1f).duration=2000
        handler= Handler(Looper.getMainLooper())*/
        /*handler.postDelayed({
            binding.splashImage.animate().alpha(1f)
        },1000)*/
        handler.postDelayed({

            var intent= Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        },4000)*/
    }
}