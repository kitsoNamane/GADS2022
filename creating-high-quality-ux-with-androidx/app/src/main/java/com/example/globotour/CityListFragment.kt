package com.example.globotour

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.globotour.databinding.FragmentCityListBinding


/**
 * A simple [Fragment] subclass.
 * Use the [CityListFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class CityListFragment : Fragment() {
    private lateinit var binding: FragmentCityListBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentCityListBinding.inflate(inflater, container, false)

        setupRecyclerView(binding)
        return binding.root
    }

    private fun setupRecyclerView(binding: FragmentCityListBinding) {
        val context = requireContext()

        val cityAdapter = CityAdapter(context, VacationSpots.cityList!!)
        val recyclerView = binding.cityRecyclerView
        recyclerView.adapter = cityAdapter
        recyclerView.setHasFixedSize(true)

        val layoutManager = LinearLayoutManager(context)
        layoutManager.orientation = RecyclerView.VERTICAL
        recyclerView.layoutManager = layoutManager
    }
}