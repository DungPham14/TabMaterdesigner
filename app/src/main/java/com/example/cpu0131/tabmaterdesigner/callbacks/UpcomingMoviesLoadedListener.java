package com.example.cpu0131.tabmaterdesigner.callbacks;

import com.example.cpu0131.tabmaterdesigner.pojo.Movie;

import java.util.ArrayList;


/**
 * Created by Windows on 13-04-2015.
 */
public interface UpcomingMoviesLoadedListener {
    public void onUpcomingMoviesLoaded(ArrayList<Movie> listMovies);
}
