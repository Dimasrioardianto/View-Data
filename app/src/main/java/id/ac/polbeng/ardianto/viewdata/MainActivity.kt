package id.ac.polbeng.ardianto.viewdata

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.ac.polbeng.ardianto.viewdata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnViewList.setOnClickListener {
            startActivity(
                Intent(
                    applicationContext,
                    ListviewActivity::class.java
                )
            )
        }

        binding.btnRecylerView.setOnClickListener {
            startActivity(
                Intent(
                    applicationContext,
                    RecylerActivity::class.java))
        }
    }
}