package com.example.mogayo_android.chat

import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.mogayo_android.R
import com.example.mogayo_android.databinding.ActivityChatBinding
import com.juhwan.anyang_yi.present.config.BaseActivity

class ChatActivity : BaseActivity<ActivityChatBinding>(R.layout.activity_chat) {
    //private val viewModel: NoticeViewModel by viewModels()
    private lateinit var chatAdapter: ChatAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    private fun initView() {
        binding.rvChatMessage.layoutManager = LinearLayoutManager(this)
        chatAdapter = ChatAdapter()
        binding.rvChatMessage.adapter = chatAdapter
    }
}