package com.bookmyshow.akhand;

import java.util.ArrayList;

public class Theatre {
    int theatreId;
    Address theatreAddress;
    ArrayList<Screen>screenList;
    ArrayList<Show>showsList;

    public Theatre(int theatreId,Address theatreAddress){
        this.theatreId=theatreId;
        this.theatreAddress=theatreAddress;
        this.screenList=new ArrayList<Screen>();
        this.showsList=new ArrayList<Show>();
    }

    public void addScreen(Screen screen){this.screenList.add(screen);}
    public void addShow(Show show){this.showsList.add(show);}

    public int getTheatreId(){
        return this.theatreId;
    }

    public Address getTheatreAddress(){
        return this.theatreAddress;
    }

    public ArrayList<Screen> getScreenList(){
        return this.screenList;
    }

    public ArrayList<Show> getShowList(){
        return this.showsList;
    }
}
