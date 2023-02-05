package com.example.schedule_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.schedule_app.databinding.FragmentContainerViewBinding
import com.example.schedule_app.ui.fragments.login.`in`.LoginFragment

class MainActivity : AppCompatActivity() {
    val isRegistred = true
    lateinit var binding: FragmentContainerViewBinding
//    lateinit var bindingLogo: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = FragmentContainerViewBinding.inflate(layoutInflater)
        setContentView(binding.root)



        if (isRegistred){
            supportFragmentManager.beginTransaction()
                .add(R.id.fragmentContainerView, LoginFragment.newInstance())
                .commit()
        } else {
            supportFragmentManager.beginTransaction()
                .add(R.id.fragmentContainerView, LoginFragment.newInstance())
                .commit()
        }
        }




}



//        setContentView(R.layout.fragment_login)
//        val signupButton : Button = findViewById<Button>(R.id.SignupButton)
//        signupButton.setOnClickListener{
//            val intent = Intent(this, NavDrawer::class.java)
//
//            startActivity(intent)
//        }