package com.example.dota.util.extentions

import androidx.annotation.LayoutRes
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.example.dota.util.delegates.FragmentBindingDelegate

fun <T : ViewDataBinding> Fragment.dataBinding(@LayoutRes layout: Int) =
    FragmentBindingDelegate<T>(this, layout)