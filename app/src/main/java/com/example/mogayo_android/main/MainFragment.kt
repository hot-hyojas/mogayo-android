package com.example.mogayo_android.main

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.mogayo_android.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.etMainQuestion.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {

            }

            override fun onTextChanged(str: CharSequence?, p1: Int, p2: Int, count: Int) {
                var input = str ?: ""

                if (input.length <= 150) {
                    binding.tvMainCount.text = "${input.length} / 150"
                } else {
                    binding.etMainQuestion.setText(binding.etMainQuestion.text.substring(0, 150))
                    binding.etMainQuestion.setSelection(binding.etMainQuestion.text.length)
                }
            }

            override fun afterTextChanged(p0: Editable?) {

            }
        })
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

}