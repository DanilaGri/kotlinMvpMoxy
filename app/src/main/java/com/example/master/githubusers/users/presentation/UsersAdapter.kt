package com.example.master.githubusers.users.presentation

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.master.githubusers.R
import com.example.master.githubusers.users.domain.model.User
import kotlinx.android.synthetic.main.item_user.view.*

class UsersAdapter(val items : ArrayList<User>, val context: Context) : RecyclerView.Adapter<ViewHolder>() {

    // Gets the number of animals in the list
    override fun getItemCount(): Int {
        return items.size
    }

    fun addAll(list: List<User> ){
        items.clear()
        items.addAll(list)
        notifyDataSetChanged()
    }

    // Inflates the item views
    override fun onCreateViewHolder(p0: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_user, p0, false))
    }

    // Binds each animal in the ArrayList to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.tvName.text = items[position].login ?: "Empty login"
    }
}

class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
    // Holds the TextView that will add each animal to
    val tvName: TextView = view.iu_name
}