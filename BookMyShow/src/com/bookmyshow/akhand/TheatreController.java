package com.bookmyshow.akhand;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class TheatreController {
    Map<City, ArrayList<Theatre>>theatreInCity;
    ArrayList<Theatre>allTheatres;

    public TheatreController(){
        this.theatreInCity = new HashMap<>();
        this.allTheatres = new ArrayList<>();
    }

    public void addTheatre(City city, Theatre newTheatre){
        ArrayList<Theatre> theatres = theatreInCity.getOrDefault(city, new ArrayList<>());
        theatres.add(newTheatre);
        allTheatres.add(newTheatre);
        theatreInCity.put(city, theatres);
    }


    public Map<Theatre, ArrayList<Show>> getAllShows(Movie movie, City city){

        Map<Theatre, ArrayList<Show>>showsInTheatre = new  HashMap<Theatre, ArrayList<Show>>();
        ArrayList<Theatre> theatres = theatreInCity.get(city);

        for(Theatre theatre: theatres){
            ArrayList<Show> giveMovieShow = new ArrayList<>();
            ArrayList<Show> shows = theatre.getShowList();

            for(Show show: shows){
                if(show.movie.getMovieId()==movie.getMovieId()){
                    giveMovieShow.add(show);
                }
            }
            if(!giveMovieShow.isEmpty()){
                showsInTheatre.put(theatre, giveMovieShow);
            }
        }
        return showsInTheatre;
    }


}
