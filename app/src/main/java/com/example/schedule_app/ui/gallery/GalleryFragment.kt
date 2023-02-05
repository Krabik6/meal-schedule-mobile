package com.example.schedule_app.ui.gallery

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.SearchView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.schedule_app.databinding.FragmentGalleryBinding
import com.example.schedule_app.databinding.FragmentRecipesListBinding

class GalleryFragment : Fragment() {

private var _binding: FragmentRecipesListBinding? = null
  // This property is only valid between onCreateView and
  // onDestroyView.
  private val binding get() = _binding!!

  override fun onCreateView(
    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
  ): View {
    val galleryViewModel =
            ViewModelProvider(this).get(GalleryViewModel::class.java)

    _binding = FragmentRecipesListBinding.inflate(inflater, container, false)
    val root: View = binding.root

    val textView: SearchView = binding.searchView
    galleryViewModel.text.observe(viewLifecycleOwner) {
      textView.queryHint = it
    }
    return root
  }

override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}