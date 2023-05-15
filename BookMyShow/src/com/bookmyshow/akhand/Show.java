package com.bookmyshow.akhand;

import java.util.ArrayList;

public class Show {
    int showId;
    Movie movie;
    Screen screen;
    int startTime;
    ArrayList<Integer>bookedSeatId;
    public Show(int showId, Movie movie,Screen screen, int startTime){
        this.showId=showId;
        this.movie=movie;
        this.screen=screen;
        this.startTime=startTime;
        this.bookedSeatId=new ArrayList<Integer>();
    }

    public int getShowId(){
        return this.showId;
    }

    public Movie getShowMovie(){
        return this.movie;
    }

    public Screen getShowScreen(){
        return this.screen;
    }

    public int getShowStartTime(){
        return this.startTime;
    }

    public ArrayList<Integer> getBookedSeatIds(){
        return this.bookedSeatId;
    }
}
