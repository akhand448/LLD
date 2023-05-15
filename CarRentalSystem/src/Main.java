import com.carRental.akhand.VehicleInventoryManagement;
import com.carRental.akhand.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {

        //Add Stores
        String[] addresses = {"Bellandur", "Teliyarganj", "Ayodhya", "kampiyargunj","Kota","Agra","Vasant Vihar", "Malviya Nagar", "Chhawni","Chauk"};
        String[] cities = {"Bangluru","Prayagraj","Ayodhya","Gorakhpur","Kota","Agra","Delhi","Jaipur","Basti","Pratapgarh"};
        String[] states = {"Karnataka","Uttar Pradesh","Uttar Pradesh","Uttar Pradesh","Rajasthan","Uttar Pradesh","Delhi","Rajasthan","Uttar Pradesh","Uttar Pradesh"};
        int[] pinCodes = {561007,211004,251545,237212,331304,281526,101203,287212,272127,251535};

        VehicleRentalSystem vehicleRentalSystem = new VehicleRentalSystem();
        for(int i=0;i<10;i++){
            VehicleInventoryManagement vehicleInventoryManagement = new VehicleInventoryManagement();
            Location location =new Location(addresses[i],cities[i],states[i],pinCodes[i]);
            Store store = new Store(i+1000,vehicleInventoryManagement,location);
            vehicleRentalSystem.addStore(store);
        }

        // add Vehicle

        int idx=1;
        for(Store store: vehicleRentalSystem.storeList){
            for(int i=0;i<10;i++){
                LocalDate dateMnu = LocalDate.now();
                Vehicle vehicle = new Vehicle(11+idx+i,5555+idx+i,"Four Wheeler",12000+idx+i, dateMnu);
                store.vehicleInventoryManagement.addVehicle(vehicle);
            }
            idx++;
        }

        //add Users
        String[] users = {"Ram","Shyam","Mohan","Deva","Ganga","Divya","Manjari","Aditya","Gaurav","Manjeet"};
        String[] Licenses = {"IND001","IND002","IND003","IND004","IND005","IND006","IND007","IND008","IND009","IND0010"};

        idx=1;
        for(int i=0;i<10;i++){
            User user = new User(200+idx+i,users[i],Licenses[i]);
            vehicleRentalSystem.addUser(user);
            idx++;
        }

        //Test the rental System

        ArrayList<Integer>reservations = new ArrayList<Integer>();

        for(int i=0;i<30;i++){
            int magicNo = ThreadLocalRandom.current().nextInt(0,9);
            Store store = vehicleRentalSystem.storeInquiryByPinCode(pinCodes[magicNo]);
            Vehicle vehicle = vehicleRentalSystem.vehicleInquiry(store);
            if(vehicle!=null){
                LocalDateTime bookedTill = LocalDateTime.now();
                bookedTill.plusHours(8);
                int reservationId = vehicleRentalSystem.makeReservation(vehicleRentalSystem.userList.get(magicNo),vehicle,bookedTill,store);
                reservations.add(reservationId);
            }
        }


        for(int i=0;i<=reservations.size()/2;i++){
            System.out.println("\n");
            vehicleRentalSystem.checkOutReservation(reservations.get(i));
        }
    }
}