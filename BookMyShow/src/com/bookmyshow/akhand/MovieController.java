package com.bookmyshow.akhand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MovieController {
    Map<City, ArrayList<Movie>>moviesInCity;
    public ArrayList<Movie>allMovies;

    public MovieController(){
        this.moviesInCity=new HashMap<City, ArrayList<Movie>>();
        this.allMovies = new ArrayList<Movie>();
    }

    public void addMovies(City city,Movie movie){
        
        ArrayList<Movie>movies = moviesInCity.getOrDefault(city, new ArrayList<>());
        movies.add(movie);
        moviesInCity.put(city, movies);
        allMovies.add(movie);
    }


    public ArrayList<Movie> getMoviesByCity(City city){
        ArrayList<Movie> movies = moviesInCity.get(city);
        return movies;
    }

    public Movie getMovieByName(String movieName){

        for(Movie movie: allMovies){
            if((movie.getMovieName()).equals(movieName)){
                return movie;
            }
        }
        return null;
    }

}
