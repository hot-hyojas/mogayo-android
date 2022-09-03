package com.example.mogayo_android.info

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.example.mogayo_android.R
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class ModalBottomSheet : BottomSheetDialogFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =inflater.inflate(R.layout.dialog_invite, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val bottomSheet = dialog?.findViewById<View>(com.google.android.material.R.id.design_bottom_sheet)
        val behavior = BottomSheetBehavior.from(bottomSheet!!)
        behavior.state = BottomSheetBehavior.STATE_EXPANDED

//        val modal_tvCloseToday = dialog?.findViewById<TextView>(R.id.modal_tvCloseToday)
//        val modal_tvClose = dialog?.findViewById<TextView>(R.id.modal_tvClose)
//
//        modal_tvCloseToday!!.setOnClickListener {
//            dismiss()
//        }
//
//        modal_tvClose!!.setOnClickListener {
//            dismiss()
//        }
    }

    companion object {
        const val TAG = "ModalBottomSheet"
    }
}