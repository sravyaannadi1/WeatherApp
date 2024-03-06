package com.training.weather

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.training.weather.databinding.ActivityMainBinding
import com.training.weather.databinding.ItemWeatherBinding

class HourlyInfoAdapter(private val hourinfos:ArrayList<Weather>):RecyclerView.Adapter<HourlyInfoAdapter.HourlyInfoViewholder>(){
    private lateinit var binding: ItemWeatherBinding
    override fun getItemCount()=hourinfos.size
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): HourlyInfoAdapter.HourlyInfoViewholder {
        val layoutInflater=LayoutInflater.from(parent.context)
        binding= ItemWeatherBinding.inflate(layoutInflater,parent,false)
    return HourlyInfoViewholder(binding)
    }

    override fun onBindViewHolder(holder: HourlyInfoViewholder, position: Int) {
        val item=hourinfos[position]
       holder.bind(item)
    }
    inner class HourlyInfoViewholder(val binding: ItemWeatherBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(weather: Weather){
binding.texttime.text=weather.time
            binding.texttemp.text=weather.temp
            binding.imageView2.setImageResource(weather.icon)
        }
    }
}