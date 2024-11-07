package id.ac.polbeng.ardianto.viewdata

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import id.ac.polbeng.ardianto.viewdata.databinding.ActivityListviewBinding
import java.util.Arrays

class ListviewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityListviewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListviewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var dataArray: Array<String> = resources.getStringArray(R.array.jurusan)
        Arrays.sort(dataArray)
        var adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, dataArray)
        binding.listView.adapter = adapter
    }
}