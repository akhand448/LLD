package com.bookmyshow.akhand;

import java.util.concurrent.ThreadLocalRandom;

public class BookMyShow {
    
    MovieController movieController;
    TheatreController theatreController;

    BookMyShow(){
        movieController = new MovieController();
        theatreController = new TheatreController();
    }

    public static Seat createSeat(){
        int r = ThreadLocalRandom.current().nextInt(0,5);
        Seat seat = new Seat(100+r, r, Category.values()[r%3], 300+r*2);
        return  seat;
    }
}
