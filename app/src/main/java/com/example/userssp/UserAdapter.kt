package com.example.userssp

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.userssp.databinding.ItemUserBinding

class UserAdapter (private val users: List<User>): RecyclerView.Adapter<UserAdapter.ViewHoler>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHoler {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHoler, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    inner class ViewHoler(view: View): RecyclerView.ViewHolder(view){
        val binding= ItemUserBinding.bind(view)

    }
}