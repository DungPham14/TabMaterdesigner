package com.example.cpu0131.tabmaterdesigner.extras;

import com.android.volley.RequestQueue;

import org.json.JSONObject;

import java.util.ArrayList;

import com.example.cpu0131.tabmaterdesigner.database.DBMovies;
import com.example.cpu0131.tabmaterdesigner.json.Endpoints;
import com.example.cpu0131.tabmaterdesigner.json.Parser;
import com.example.cpu0131.tabmaterdesigner.json.Requestor;
import com.example.cpu0131.tabmaterdesigner.materialtest.MyApplication;
import com.example.cpu0131.tabmaterdesigner.pojo.Movie;

/**
 * Created by Windows on 02-03-2015.
 */
public class MovieUtils {
    public static ArrayList<Movie> loadBoxOfficeMovies(RequestQueue requestQueue) {
        JSONObject response = Requestor.requestMoviesJSON(requestQueue, Endpoints.getRequestUrlBoxOfficeMovies(30));
        ArrayList<Movie> listMovies = Parser.parseMoviesJSON(response);
        MyApplication.getWritableDatabase().insertMovies(DBMovies.BOX_OFFICE, listMovies, true);
        return listMovies;
    }

    public static ArrayList<Movie> loadUpcomingMovies(RequestQueue requestQueue) {
        JSONObject response = Requestor.requestMoviesJSON(requestQueue, Endpoints.getRequestUrlUpcomingMovies(30));
        ArrayList<Movie> listMovies = Parser.parseMoviesJSON(response);
        MyApplication.getWritableDatabase().insertMovies(DBMovies.UPCOMING, listMovies, true);
        return listMovies;
    }
}
