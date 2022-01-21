package com.example.fri1bahman

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView


class HeadFragment : Fragment(R.layout.fragment_head) {


    var heads = arrayOf(R.drawable.head1,R.drawable.head2,R.drawable.head3,
        R.drawable.head4,R.drawable.head5,R.drawable.head6,
        R.drawable.head7,R.drawable.head8,R.drawable.head9,
        R.drawable.head10,R.drawable.head11,R.drawable.head12,
    )

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<ImageView>(R.id.head_img).setOnClickListener{
            (it as ImageView).setImageResource(getHeads())
            println("true")
        }
    }
    private fun getHeads(): Int = heads[(0..11).random()]


}