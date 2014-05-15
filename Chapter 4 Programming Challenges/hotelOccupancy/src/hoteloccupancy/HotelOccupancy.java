package hoteloccupancy;

import java.text.DecimalFormat;
import java.util.Scanner;

public class HotelOccupancy {
    
    public static void main(String[] args) {
        DecimalFormat formatter = new DecimalFormat("##.#");
        Scanner keyboard = new Scanner(System.in);
        int floors, rooms, occupiedRooms, totalRooms=0, totalOccupiedRooms=0;
        
        
        do{
            System.out.print("Enter amount of floors in a hotel: ");
            floors=keyboard.nextInt();
            
        }while(floors<1);
        
        for(int i=1; i<=floors; i++){
            do{
                System.out.print("Enter the total amount of rooms on floor "+i+" (10+): ");
                rooms=keyboard.nextInt();
            }while(rooms<10);
            
            System.out.print("Enter the amount of occupied rooms on floor "+i+": ");
            occupiedRooms=keyboard.nextInt();
            if(rooms<occupiedRooms){
                System.out.println("Cannot have more occupied rooms than total rooms!"
                        +" Exiting program.");
                System.exit(0);
            }
            totalRooms+=rooms;
            totalOccupiedRooms+=occupiedRooms;
        }
        int totalVacant=totalRooms-totalOccupiedRooms;
        double occupancyRate=100*((double)(totalOccupiedRooms)/(double)(totalRooms));
        
        System.out.println("Total rooms: "+totalRooms);
        System.out.println("Total occupied rooms: "+totalOccupiedRooms);
        System.out.println("Vacant rooms: "+totalVacant);
        System.out.println("Occupancy rate: "+formatter.format(occupancyRate)+"%");
        
    }

}
