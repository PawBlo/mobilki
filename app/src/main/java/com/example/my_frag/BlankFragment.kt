package com.example.my_frag

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment


class BlankFragment : Fragment(), View.OnClickListener {
    private lateinit var btn: Button
    private lateinit var myview: View

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        myview = inflater!!.inflate(R.layout.fragment_blank, container, false)
        btn = myview.findViewById<Button>(R.id.button)
        btn.setOnClickListener(this)
        Log.d("aaa", "Jasiu")
        return myview
    }

    override fun onClick(v: View) {
        Log.d("aaa", "woda")
        when (v?.id) {
            R.id.button -> {
                Log.d("aaa", "woda")
            }

            else -> {
                Log.d("aaa", "woda")
            }
        }
    }

}