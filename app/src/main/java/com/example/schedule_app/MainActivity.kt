package com.example.schedule_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.schedule_app.databinding.FragmentContainerViewBinding
import com.example.schedule_app.ui.fragments.login.FragmentMainLogin
import com.example.schedule_app.ui.fragments.login.`in`.LoginFragment

class MainActivity : AppCompatActivity() {
    val isRegistred = false
    lateinit var binding: FragmentContainerViewBinding
//    lateinit var bindingLogo: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        if (isRegistred) {
            val intent = Intent(this, NavDrawer::class.java)
            startActivity(intent)
        }

        super.onCreate(savedInstanceState)
        binding = FragmentContainerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)
        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentContainerView, FragmentMainLogin.newInstance())
            .commit()


    }
}