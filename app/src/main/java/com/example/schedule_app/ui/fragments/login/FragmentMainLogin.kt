package com.example.schedule_app.ui.fragments.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.schedule_app.R
import com.example.schedule_app.databinding.FragmentMainLoginBinding
import com.example.schedule_app.ui.fragments.login.`in`.LoginFragment
import com.example.schedule_app.ui.fragments.login.up.SignupFragment

class FragmentMainLogin : Fragment() {
    private var _binding: FragmentMainLoginBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        _binding = FragmentMainLoginBinding.inflate(inflater, container, false)
        val root: View = binding.root
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        val signupButton : Button = binding.SignupButton
        binding.mainLoginButton.setOnClickListener{
            val loginFragment = LoginFragment()


            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainerView, loginFragment)?.commit()
        }

        binding.mainSignupButton.setOnClickListener{
            val signupFragment = SignupFragment()


            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainerView, signupFragment)?.commit()
        }


    }

    companion object{
        @JvmStatic
        fun newInstance() = FragmentMainLogin()
    }
}