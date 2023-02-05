package com.example.schedule_app.ui.fragments.login.up

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.schedule_app.R
import com.example.schedule_app.databinding.FragmentSignupBinding
import com.example.schedule_app.ui.fragments.login.`in`.LoginFragment

class SignupFragment : Fragment() {
    private var _binding: FragmentSignupBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
//        val recipesListViewModel =
//            ViewModelProvider(this).get(RecipesListViewModel::class.java)

        _binding = FragmentSignupBinding.inflate(inflater, container, false)
        val root: View = binding.root

//        val textView: SearchView = binding.searchView
//        recipesListViewModel.text.observe(viewLifecycleOwner) {
//            textView.queryHint = it
//
//        }
        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
//        val signupButton : Button = binding.SignupButton
        binding.LoginButton.setOnClickListener{
            val fragment = LoginFragment()


            val transaction = fragmentManager?.beginTransaction()
            transaction?.replace(R.id.fragmentContainerView, fragment)?.commit()
        }
    }

    companion object{
        @JvmStatic
        fun newInstance() = SignupFragment()
    }



    }

