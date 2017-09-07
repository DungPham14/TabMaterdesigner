package com.example.cpu0131.tabmaterdesigner.json;


import com.example.cpu0131.tabmaterdesigner.materialtest.MyApplication;

import static com.example.cpu0131.tabmaterdesigner.extras.UrlEndpoints.URL_BOX_OFFICE;
import static com.example.cpu0131.tabmaterdesigner.extras.UrlEndpoints.URL_CHAR_AMEPERSAND;
import static com.example.cpu0131.tabmaterdesigner.extras.UrlEndpoints.URL_CHAR_QUESTION;
import static com.example.cpu0131.tabmaterdesigner.extras.UrlEndpoints.URL_PARAM_API_KEY;
import static com.example.cpu0131.tabmaterdesigner.extras.UrlEndpoints.URL_PARAM_LIMIT;
import static com.example.cpu0131.tabmaterdesigner.extras.UrlEndpoints.URL_UPCOMING;

/**
 * Created by Windows on 02-03-2015.
 */
public class Endpoints {
    public static String getRequestUrlBoxOfficeMovies(int limit) {

        return URL_BOX_OFFICE
                + URL_CHAR_QUESTION
                + URL_PARAM_API_KEY + MyApplication.API_KEY_ROTTEN_TOMATOES
                + URL_CHAR_AMEPERSAND
                + URL_PARAM_LIMIT + limit;
    }

    public static String getRequestUrlUpcomingMovies(int limit) {

        return URL_UPCOMING
                + URL_CHAR_QUESTION
                + URL_PARAM_API_KEY + MyApplication.API_KEY_ROTTEN_TOMATOES
                + URL_CHAR_AMEPERSAND
                + URL_PARAM_LIMIT + limit;
    }
}
