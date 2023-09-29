package ph.edu.uic.register_trondillo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import ph.edu.uic.register_trondillo.databinding.ActivityMainBinding
import java.text.NumberFormat


class Tiptime : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_tiptime)
    }

    fun calculateTip(){

        }

    }
