package com.example.userssp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.userssp.databinding.ItemUserBinding

class UserAdapter (private val users: List<User>): RecyclerView.Adapter<UserAdapter.ViewHoler>(){

    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHoler {
        context=parent.context

        val view = LayoutInflater.from(context).inflate(R.layout.item_user, parent, false)
        return ViewHoler(view)
    }

    override fun onBindViewHolder(holder: ViewHoler, position: Int) {
        val user = users.get(position)

        with(holder){
            binding.tvOrder.text = user.id.toString()
            binding.tvName.text = user.name
        }
    }

    override fun getItemCount(): Int = users.size

    inner class ViewHoler(view: View): RecyclerView.ViewHolder(view){
        val binding= ItemUserBinding.bind(view)

    }
}