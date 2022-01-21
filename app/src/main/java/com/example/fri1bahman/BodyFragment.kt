package com.example.fri1bahman

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView


class BodyFragment : Fragment(R.layout.fragment_body) {

    private var bodys = arrayOf(
        R.drawable.body1 , R.drawable.body2 ,R.drawable.body3,
        R.drawable.body4,R.drawable.body5,R.drawable.body6 ,
        R.drawable.body7,R.drawable.body8,R.drawable.body9,
        R.drawable.body10,R.drawable.body11,R.drawable.body12)


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<ImageView>(R.id.body_img)?.setOnClickListener{
            (it as ImageView).setImageResource(getBodys())
            println("true")
        }
    }

    private fun getBodys(): Int = bodys[(0..11).random()]

}