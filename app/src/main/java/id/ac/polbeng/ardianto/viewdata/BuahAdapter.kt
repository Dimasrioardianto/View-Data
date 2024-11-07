package id.ac.polbeng.ardianto.viewdata

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import id.ac.polbeng.ardianto.viewdata.databinding.ListItemBinding

class BuahAdapter (
    private val dataBuah: Array<String>,
    private val dataGambar: Array<Int>) : RecyclerView.Adapter<BuahAdapter.BuahHolder>() {
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BuahHolder {
            val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return BuahHolder(binding)
        }

        override fun onBindViewHolder(holder: BuahHolder, position: Int) {
            holder.binding.tvNamaBuah.text = dataBuah.get(position)
            holder.binding.imgBuah.setImageResource(dataGambar[position])
        }

        override fun getItemCount(): Int = dataBuah.size

        inner class BuahHolder(val binding: ListItemBinding):
            RecyclerView.ViewHolder(binding.root)
    }
