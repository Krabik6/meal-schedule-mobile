package com.example.schedule_app.ui.fragments.login.`in`

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.schedule_app.NavDrawer
import com.example.schedule_app.R
import com.example.schedule_app.databinding.FragmentLoginBinding
import com.example.schedule_app.ui.fragments.login.up.SignupFragment

class LoginFragment : Fragment() {
    private var _binding: FragmentLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentLoginBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        val signupButton : Button = binding.SignupButton
        binding.SignupButton.setOnClickListener{
            val fragment = SignupFragment()


            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainerView, fragment)?.commit()
        }

        binding.loginButton.setOnClickListener{
            val intent = Intent(activity, NavDrawer::class.java)
            startActivity(intent)
        }


    }

    companion object{
        @JvmStatic
        fun newInstance() = LoginFragment()
    }


}