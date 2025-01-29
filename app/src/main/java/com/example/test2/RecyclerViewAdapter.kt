package com.example.test2

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewAdapter(activtyTwo: ActivityTwo) : RecyclerView.Adapter<RecycleViewHolder>() {


    private var NewsModelList = listOf<NewsModel>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecycleViewHolder {
        Log.e("Adapter viewType", viewType.toString())
        val mContext = parent.context
        val layoutInflater = LayoutInflater.from(mContext)
        val view = layoutInflater.inflate(R.layout.recyclerview_row, parent, false)
        return RecycleViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecycleViewHolder, position: Int) {
        Log.e("Adapter position", position.toString())

        val NewsModel = NewsModelList[position]
        holder.textViewTitle.text = NewsModel.newsTitle
        holder.textViewDescription.text = NewsModel.newsDescription
        holder.textViewSource.text = NewsModel.newsSource
    }

    override fun getItemCount(): Int {
        return NewsModelList.size
    }

    fun updateData(newsModel: List<NewsModel>) {
        NewsModelList = newsModel
        notifyDataSetChanged()
    }

}