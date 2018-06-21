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

package com.edoubletech.moviemania.data.dao

import androidx.lifecycle.LiveData
import androidx.paging.DataSource
import com.edoubletech.moviemania.data.model.MovieResponse

abstract class MovieDao : BaseDao<MovieResponse> {

    abstract fun getMovieById(movieId: Int): LiveData<MovieResponse>

    abstract fun getPopularMovies(): DataSource.Factory<Int, MovieResponse>

    abstract fun getTopRatedMovies(): DataSource.Factory<Int, MovieResponse>
}