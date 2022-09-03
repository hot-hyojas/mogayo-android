package com.example.mogayo_android.info

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.example.mogayo_android.R
import com.example.mogayo_android.databinding.FragmentInfoBinding

class InfoFragment : Fragment() {

    private var _binding: FragmentInfoBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentInfoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val modalBottomSheet = ModalBottomSheet()
        modalBottomSheet.setStyle(DialogFragment.STYLE_NORMAL, R.style.AppBottomSheetDialogTheme)
        modalBottomSheet.show(requireActivity().supportFragmentManager, ModalBottomSheet.TAG)
    }

    override fun onDestroyView() {
        _binding = null
        super.onDestroyView()
    }

}