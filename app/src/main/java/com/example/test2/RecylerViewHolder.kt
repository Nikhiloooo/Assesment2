package com.example.test2

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RecycleViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var textViewTitle: TextView = itemView.findViewById<TextView>(R.id.textViewTitle)
    var textViewDescription: TextView = itemView.findViewById<TextView>(R.id.textViewDescription)
    var textViewSource: TextView = itemView.findViewById<TextView>(R.id.textViewSource)

}
