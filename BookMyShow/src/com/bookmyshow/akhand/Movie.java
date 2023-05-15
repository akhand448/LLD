package com.bookmyshow.akhand;

public class Movie {
    int movieId;
    String movieName;
    int movieDuration;
    
    public Movie(int id, String movieName,int duration){
        this.movieId=id;
        this.movieName=movieName;
        this.movieDuration=duration;
    }

    String getMovieName(){
        return this.movieName;
    }

    int getMovieId(){
        return this.movieId;
    }

    public int getMovieDuration(){
        return this.movieDuration;
    }

}
