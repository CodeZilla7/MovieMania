/*
 *    Copyright (C) 2018 Eton Otieno Oboch
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */

package com.edoubletech.moviemania.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.edoubletech.moviemania.R
import com.edoubletech.moviemania.viewmodels.MainViewModel
import kotlinx.android.synthetic.main.main_fragment.view.*

/**
 * This is the MainFragment that shows the popular Movies list from the API
 */
class MainFragment : Fragment() {

    private lateinit var viewModel: MainViewModel
    private val mainMovieAdapter = MainMovieAdapter()

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        val view = inflater.inflate(R.layout.main_fragment, container, false)
        view.movie_recycler_view.apply {
            setHasFixedSize(true)
            layoutManager = LinearLayoutManager(context, LinearLayout.VERTICAL, false)
            adapter = mainMovieAdapter
        }
        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(this).get(MainViewModel::class.java)

        viewModel.getPopularMovies().observe(this, Observer {
            mainMovieAdapter.submitList(it)
        })
    }
}
