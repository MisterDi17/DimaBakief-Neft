package com.example.dimabakief_neft

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class WorkersFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_guide, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        initializeAdapter(view.findViewById(R.id.rvGuide))
    }
    private fun initializeAdapter( recyclerView: RecyclerView){
        val manager = Manager()
        if()
        recyclerView.adapter = AdapterGuide(manager.getAllWorkers())
    }
}