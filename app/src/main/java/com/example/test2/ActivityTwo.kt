package com.example.test2

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ActivityTwo: ComponentActivity() {

    private val viewModel by viewModels<ActivtyTwoViewModel>()
    private lateinit var mRecyclerView: RecyclerView
    private var mAdapter: RecyclerViewAdapter = RecyclerViewAdapter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_two)

        mRecyclerView = findViewById(R.id.recyclerview)
        mRecyclerView.apply {
            layoutManager = LinearLayoutManager(this@ActivityTwo, RecyclerView.VERTICAL, false)
            adapter = mAdapter
        }

        fetchNewsDetails()

        viewModel.newsDetails.observe(this) {
            mAdapter.updateData(it)
        }
    }

    private fun fetchNewsDetails() {
        viewModel.getNewsDetails()
    }
}