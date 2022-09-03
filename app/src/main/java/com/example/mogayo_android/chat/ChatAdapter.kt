package com.example.mogayo_android.chat

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.mogayo_android.data.model.Temp
import com.example.mogayo_android.databinding.ItemChatMessageBinding

class ChatAdapter : RecyclerView.Adapter<ChatAdapter.ChatViewHolder>() {
    private val items = ArrayList<Temp>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) : ChatViewHolder {
        val binding = ItemChatMessageBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ChatViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(holder: ChatViewHolder, position: Int) {
        holder.bind(items[position])
    }

    fun setList(ariNotice: List<Temp>) {
        items.addAll(ariNotice)
        notifyDataSetChanged()
    }

    inner class ChatViewHolder(private val binding: ItemChatMessageBinding):RecyclerView.ViewHolder(binding.root){
        fun bind(temp: Temp){
//            binding.ari = ari
//
//            binding.layoutNotice.setOnClickListener {
//                var goPage = Intent(it.context, WebViewActivity::class.java)
//                goPage.putExtra("url", ari.link)
//                it.context.startActivity(goPage)
//            }
        }
    }
}