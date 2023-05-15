import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import com.bookmyshow.akhand.Address;
import com.bookmyshow.akhand.BookMyShow;
import com.bookmyshow.akhand.Booking;
import com.bookmyshow.akhand.City;
import com.bookmyshow.akhand.Movie;
import com.bookmyshow.akhand.MovieController;
import com.bookmyshow.akhand.Payment;
import com.bookmyshow.akhand.Screen;
import com.bookmyshow.akhand.Seat;
import com.bookmyshow.akhand.Show;
import com.bookmyshow.akhand.Theatre;
import com.bookmyshow.akhand.TheatreController;

public class Main {
    public static void main(String[] args) {
        
        MovieController movieController = new MovieController();
        TheatreController theatreController = new TheatreController();
        ArrayList<Seat>seats = new ArrayList<>();
        ArrayList<Screen>screenList = new ArrayList<>();
        ArrayList<Show>shows = new ArrayList<>();
        ArrayList<Address>addresses = new ArrayList<>();

        String[] moviesNames = {"Border","Bahubali","Avengers","Shakti","Damini","Malamal Weekly","Kamal Dhamal Malamal","Saket"};
        Integer[] durations = {180,160,140,120,147,156,173,153};
        Integer[] startTimes = {10,14,18,22};
        String[] addressNames = {"Katra","Civil Lines","Polytechnic","Bellandur","naya ghat"};
        
        for(int i=0;i<8;i++){
            Movie movie = new Movie(+200, moviesNames[i],durations[i]);
            movieController.addMovies(City.values()[i%5], movie);    
        }

        for(int i=0;i<50;i++){
            Seat seat = BookMyShow.createSeat();
            seats.add(seat);
        }

        for(int i=0;i<5;i++){
            Screen screen = new Screen(i+100, seats);
            screenList.add(screen);
        }

        for(int i=0;i<8;i++){
            Show show = new Show(i+315, movieController.allMovies.get(i), screenList.get(i%5), startTimes[i%4]);
            shows.add(show);
        }

        for(int i=0;i<5;i++){
            Address address = new Address(addressNames[i],City.values()[i]);
            addresses.add(address);
        }

        for(int i=0;i<5;i++){
            Theatre theatre = new Theatre(i+413, addresses.get(i));
            theatreController.addTheatre(City.values()[i], theatre);
        }

        boolean bookingProcess = true;

        while(bookingProcess==true){

            String movieName,cityName;
            try (Scanner s = new Scanner(System.in)) {
                System.out.println("Enter movie Name: ");
                movieName = s.nextLine();
                System.out.println("Enter the city name: ");
                cityName = s.nextLine();
            }
            Movie movie = movieController.getMovieByName(movieName);
            City city=null;
            for(int i=0;i<5;i++){
                if(cityName.equals((City.values()[i]).toString())){city = City.values()[i];break;}
            }
            if(movie==null){System.out.println("No shows are available! try again.");}
            
            else if(city==null){System.out.println("sorry! no theatre is available in this city.");}
            else{
                Map<Theatre,ArrayList<Show>>showsTheatreWise = theatreController.getAllShows(movie,city);
                Iterator<Map.Entry<Theatre,ArrayList<Show>>> it = showsTheatreWise.entrySet().iterator();
                Map.Entry<Theatre,ArrayList<Show>> entry = it.next();


                ArrayList<Show> runningShows = entry.getValue();
                Show interestedShow = runningShows.get(ThreadLocalRandom.current().nextInt(0,runningShows.size()-1));
                int seatNumber = ThreadLocalRandom.current().nextInt(1,50);
                ArrayList<Integer>bookedSeats = interestedShow.getBookedSeatIds();
                if(!bookedSeats.contains(seatNumber)){
                    bookedSeats.add(seatNumber);

                    ArrayList<Seat>myBookedSeats = new ArrayList<>();
                    for(Seat screenSeat: interestedShow.getShowScreen().getSeats()){
                        if(screenSeat.getSeatId()==seatNumber){
                            myBookedSeats.add(screenSeat);
                        }
                    }
                    Payment payment=new Payment(ThreadLocalRandom.current().nextInt(324,425));
                    Booking booking = new Booking(interestedShow, myBookedSeats, payment);
                    System.out.println("Booking Successful!");
                    System.out.println("\n Movie Name: "+booking.getShow().getShowMovie());
                    System.out.println("Movie duration: "+movie.getMovieDuration());
                    System.out.println("Start Time: "+booking.getShow().getShowStartTime());
                    System.out.println("Seat Number: "+seatNumber);
                    System.out.println("Payment done: "+payment.getPaymentAmount());    
                }
            }

            char choice = 'N';
            try(Scanner ss = new Scanner(System.in)){
                System.out.println("Want to continue booking? Y/N");
                choice=ss.next().charAt(1);
            }
            bookingProcess=(choice == 'Y')?true:false;            
        }
        

    }
}