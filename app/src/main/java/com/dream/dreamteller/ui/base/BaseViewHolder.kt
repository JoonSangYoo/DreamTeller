package com.dream.dreamteller.ui.base

import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import com.dream.dreamteller.BR

class BaseViewHolder<T>(private val binding: ViewDataBinding): RecyclerView.ViewHolder(binding.root) {

    fun bind(item: T) {
       // binding.setVariable(BR.item, item)
      //  binding.executePendingBindings()
    }

}