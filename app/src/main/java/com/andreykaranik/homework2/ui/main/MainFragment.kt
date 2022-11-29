package com.andreykaranik.homework2.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.andreykaranik.homework2.R
import com.andreykaranik.homework2.ServiceLocator
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainFragment : Fragment() {

    private val viewModel by viewModels<MainViewModel>()

    private val catAdapter = CatAdapter()

    private lateinit var textView : TextView
    private lateinit var button : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<RecyclerView>(R.id.recycler).apply {
            layoutManager = GridLayoutManager(context, 2)
            adapter = catAdapter
        }

        textView = view.findViewById(R.id.text)
        button = view.findViewById(R.id.button)
        button.setOnClickListener {
            getList()
        }

        getList()
    }

    fun getList() {
        viewLifecycleOwner.lifecycleScope.launch {
            button.isVisible = false
            textView.isVisible = true
            textView.text = ServiceLocator.context.getString(R.string.text_view_text)
            delay(1000)
            try {
                val list = withContext(Dispatchers.IO) { viewModel.getCats() }
                catAdapter.submitList(list)
                textView.isVisible = false
            } catch (error: Throwable) {
                textView.isVisible = false
                button.isVisible = true
                error.printStackTrace()
            }
        }
    }

}