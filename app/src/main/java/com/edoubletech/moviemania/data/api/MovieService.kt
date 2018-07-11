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

package com.edoubletech.moviemania.data.api

import com.edoubletech.moviemania.data.model.Movie
import com.edoubletech.moviemania.data.model.MovieResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

/**
 * This interface is a service used by retrofit to enable us to hit different endpoints of the API
 * using annotated methods.
 */
interface MovieService {

    @GET("movie/popular")
    fun getPopularMovies(): Call<MovieResponse>

    @GET("movie/top_rated")
    fun getTopRatedMovies(): Call<MovieResponse>

    @GET("movie/{movie_id}")
    fun getSingleMovieDetails(@Path("movie_id") movieId: Int): Call<Movie>

    @GET("search/movie?")
    fun searchForMovies(@Query("query") queryString: String): Call<MovieResponse>

}