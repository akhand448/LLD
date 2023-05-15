package com.bookmyshow.akhand;

import java.util.ArrayList;

public class Screen {
    int screenId;
    ArrayList<Seat>seats = new ArrayList<>();
    public Screen(int screenId,ArrayList<Seat>seats){
        this.screenId=screenId;
        this.seats=seats;
    }

    public int getScreenId(){
        return this.screenId;
    }

    public ArrayList<Seat> getSeats(){
        return this.seats;
    }
}
