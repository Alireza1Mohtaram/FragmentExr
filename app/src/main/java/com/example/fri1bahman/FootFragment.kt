package com.example.fri1bahman

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

class FootFragment : Fragment(R.layout.fragment_foot) {

    var foots = arrayOf(
        R.drawable.legs1, R.drawable.legs2, R.drawable.legs3,
        R.drawable.legs4, R.drawable.legs5, R.drawable.legs6,
        R.drawable.legs7, R.drawable.legs8, R.drawable.legs9,
        R.drawable.legs10, R.drawable.legs11, R.drawable.legs12,
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<ImageView>(R.id.foot_img)?.setOnClickListener {
            (it as ImageView).setImageResource(getBodys())
        }
    }

    private fun getBodys(): Int = foots[(0..11).random()]

}