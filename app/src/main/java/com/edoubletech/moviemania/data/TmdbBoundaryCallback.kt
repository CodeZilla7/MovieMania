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

package com.edoubletech.moviemania.data

import androidx.paging.PagedList
import com.edoubletech.moviemania.data.api.MovieService
import com.edoubletech.moviemania.data.model.Movie

/**
 * This is a boundary callback used by the Paging library to signal when a PagedList has reached the
 * end of available data.
 */
class TmdbBoundaryCallback(
        private val service: MovieService) : PagedList.BoundaryCallback<Movie>() {

    override fun onZeroItemsLoaded() {
    }

    override fun onItemAtEndLoaded(itemAtEnd: Movie) {

    }

    private fun requestAndSaveData() {
    }
}