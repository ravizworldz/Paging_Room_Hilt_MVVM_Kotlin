package com.demo.paging3withroom

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.paging.PagingDataAdapter
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.demo.paging3withroom.db.CharacterData

class RecyclerViewAdapter(): PagingDataAdapter<CharacterData, RecyclerViewAdapter.MyViewHolder>(DiffUtilCallback()) {
    override fun onBindViewHolder(holder: RecyclerViewAdapter.MyViewHolder, position: Int) {
       holder.bind(getItem(position)!!)
    }

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): RecyclerViewAdapter.MyViewHolder {
       val inflater =  LayoutInflater.from(parent.context).inflate(R.layout.layout_recycler_row, parent, false)

        return MyViewHolder(inflater)
    }

    class MyViewHolder(view: View): RecyclerView.ViewHolder(view) {
        val textViewName: TextView = view.findViewById(R.id.textViewName)

        fun bind(characterData: CharacterData) {
            textViewName.text = characterData.name
        }
    }

    class  DiffUtilCallback: DiffUtil.ItemCallback<CharacterData>() {
        override fun areItemsTheSame(oldItem: CharacterData, newItem: CharacterData): Boolean {
            return oldItem.name == newItem.name
        }

        override fun areContentsTheSame(oldItem: CharacterData, newItem: CharacterData): Boolean {
            return oldItem.name == newItem.name
                    && oldItem.name == newItem.name
        }

    }

}