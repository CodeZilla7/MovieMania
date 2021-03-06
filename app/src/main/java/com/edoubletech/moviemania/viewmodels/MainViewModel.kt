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

package com.edoubletech.moviemania.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.edoubletech.moviemania.data.MovieRepository
import com.edoubletech.moviemania.data.model.Movie

/**
 * This ViewModel holds the data from the API by calling methods from the Repository and sends it
 * to the View. It also helps to survive configuration changes.
 */
class MainViewModel : ViewModel() {

    private val repository = MovieRepository()

    fun getPopularMovies(): LiveData<List<Movie>> {
        return repository.getPopularMovies()
    }
}
