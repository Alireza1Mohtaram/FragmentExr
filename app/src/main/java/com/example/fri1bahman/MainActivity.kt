package com.example.fri1bahman

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.result.ActivityResultCallback
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContract
import androidx.fragment.app.add
import androidx.fragment.app.commit
import com.example.fri1bahman.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

   // lateinit var luncher : ActivityResultLauncher<String>
    lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding =  ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.headLayout

        supportFragmentManager.commit {
            add<HeadFragment>(R.id.head_layout)
            add<BodyFragment>(R.id.body_layout)
           add<FootFragment>(R.id.foot_layout)
            setReorderingAllowed(true)
        }



        //registerIntent()

        // binding.button.setOnClickListener{
        //    luncher.launch(null)
        // }

    }
//    fun registerIntent() {
//        var contract = object :ActivityResultContract<String,String>() {
//
//            override fun createIntent(context: Context, input: String?) =
//                Intent(this@MainActivity, SecondActivity::class.java)
//
//            override fun parseResult(resultCode: Int, intent: Intent?) =
//                intent?.getStringExtra("RES").toString() ?: "null"
//
//        }
//
//        luncher =  registerForActivityResult(
//            contract,
//            ActivityResultCallback<String>{Log.d("Callback","OK")}
//        )
//    }

}