package id.ac.polbeng.ardianto.viewdata

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.ac.polbeng.ardianto.viewdata.databinding.ActivityDetailBuahBinding

class DetailBuahActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBuahBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBuahBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //membuat variabel
        var namaBuah = intent.getStringExtra("nama")
        var image = intent.getIntExtra("gambar",0)
        //menangkap data intent dan di set ke layout
        binding.tvNamaBuah.text = namaBuah
        binding.imgBuah.setImageResource(image)
    }
}