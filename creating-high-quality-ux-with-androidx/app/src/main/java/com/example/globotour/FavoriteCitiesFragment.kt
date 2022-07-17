package com.example.globotour

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.globotour.databinding.FragmentCityListBinding
import com.example.globotour.databinding.FragmentFavoriteCitiesBinding

/**
 * A simple [Fragment] subclass.
 * Use the [FavoriteCitiesFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class FavoriteCitiesFragment : Fragment() {
    private lateinit var binding: FragmentFavoriteCitiesBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentFavoriteCitiesBinding.inflate(inflater, container, false)
        return binding.root
    }
}