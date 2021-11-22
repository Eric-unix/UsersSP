package com.example.userssp

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.userssp.databinding.ItemUserBinding

class UserAdapter (private val users: List<User>,private val listener:OnClickListener): RecyclerView.Adapter<UserAdapter.ViewHoler>(){

    private lateinit var context: Context

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHoler {
        context=parent.context

        val view = LayoutInflater.from(context).inflate(R.layout.item_user, parent, false)
        return ViewHoler(view)
    }

    override fun onBindViewHolder(holder: ViewHoler, position: Int) {
        val user = users.get(position)


        with(holder){
            setListener(user,position+1)
            binding.tvOrder.text = (position+1).toString()
            binding.tvName.text = user.getFulname()
            Glide.with(context)
                .load(user.url)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop()
                .circleCrop()
                .into(binding.imgPhoto)
        }
    }

    override fun getItemCount(): Int = users.size

    inner class ViewHoler(view: View): RecyclerView.ViewHolder(view){
        val binding= ItemUserBinding.bind(view)

        fun setListener(user:User, position:Int){
            binding.root.setOnClickListener{listener.onClick(user,position)}
        }

    }
}