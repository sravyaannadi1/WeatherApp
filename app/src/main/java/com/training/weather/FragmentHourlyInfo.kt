package com.training.weather

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.training.weather.databinding.FragmentHourlyInfoBinding


class FragmentHourlyInfo : Fragment() {
    private lateinit var binding: FragmentHourlyInfoBinding
    private val hourlyInfo=ArrayList<Weather>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding= FragmentHourlyInfoBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val recyclerView = binding.recyclerView
        val span = 1
        recyclerView.layoutManager =
            GridLayoutManager(requireContext(), 1, GridLayoutManager.HORIZONTAL, false)
        val weatherList=ArrayList<Weather>().apply {
           add(
                Weather(
                    time = "10 am",
                    temp = "22'",
                    icon = R.drawable.icon1
                ))
            add(
                Weather(
                    time = "11 am",
                    temp = "23'",
                    icon = R.drawable.icon2
                )
            )
            add(
                Weather(
                    time = "12 pm",
                    temp = "21'",
                    icon = R.drawable.icon3
                )
            )
            add(
                Weather(
                    time = "1 pm",
                    temp = "24'",
                    icon = R.drawable.icon4
                )
            )
           add(
                Weather(
                    time = "10 am",
                    temp = "22'",
                    icon = R.drawable.icon1
                )
            )
           add(
                Weather(
                    time = "11 am",
                    temp = "23'",
                    icon = R.drawable.icon2
                )
            )
            add(
                Weather(
                    time = "12 pm",
                    temp = "21'",
                    icon = R.drawable.icon3
                )
            )
            add(
                Weather(
                    time = "1 pm",
                    temp = "24'",
                    icon = R.drawable.icon4
                )
            )
           add(
                Weather(
                    time = "2 pm",
                    temp = "22'",
                    icon = R.drawable.icon1
                )
            )
            add(
                Weather(
                    time = "3 pm",
                    temp = "23'",
                    icon = R.drawable.icon2
                )
            )
            add(
                Weather(
                    time = "4 pm",
                    temp = "21'",
                    icon = R.drawable.icon3
                )
            )
           add(
                Weather(
                    time = "5 pm",
                    temp = "24'",
                    icon = R.drawable.icon4
                )
            )
          add(
                Weather(
                    time = "6 pm",
                    temp = "22'",
                    icon = R.drawable.icon1
                )
            )
           add(
                Weather(
                    time = "7 pm",
                    temp = "23'",
                    icon = R.drawable.icon2
                )
            )
            add(
                Weather(
                    time = "8 pm",
                    temp = "21'",
                    icon = R.drawable.icon3
                )
            )
           add(
                Weather(
                    time = "9 pm",
                    temp = "24'",
                    icon = R.drawable.icon4
                )
            )

        }
        val adapter = HourlyInfoAdapter(weatherList)
        recyclerView.adapter = adapter
    }
}