package com.uv.asana

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.uv.asana.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        updateUI(1)
        binding.imageView.setOnClickListener {
            updateUI(1)
        }
        binding.imageView2.setOnClickListener {
            updateUI(2)
        }
        binding.imageView3.setOnClickListener {
            updateUI(3)
        }
        binding.imageView4.setOnClickListener {
            updateUI(4)
        }
    }
    fun updateUI(pose_num: Int){
        val UIupdates = when(pose_num){
            1 -> UIElements(R.drawable.y_pose_1, R.string.pose_1_name, R.string.pose_1_desc) //not imp to write, as it is covered in else
            2 -> UIElements(R.drawable.y_pose_2, R.string.pose_2_name, R.string.pose_2_desc)
            3 -> UIElements(R.drawable.y_pose_3, R.string.pose_3_name, R.string.pose_3_desc)
            4 -> UIElements(R.drawable.y_pose_4, R.string.pose_4_name, R.string.pose_4_desc)
            else -> UIElements(R.drawable.y_pose_1, R.string.pose_1_name, R.string.pose_1_desc)
        }
        binding.imageView5.setImageResource(UIupdates.YogaImageResource)
        binding.textView.setText(UIupdates.YogaNameResource)
        binding.text2.setText(UIupdates.YogaDescResource)
    }

}