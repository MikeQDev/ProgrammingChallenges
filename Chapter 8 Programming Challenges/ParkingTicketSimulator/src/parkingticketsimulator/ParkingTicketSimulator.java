package parkingticketsimulator;

public class ParkingTicketSimulator {

    public static void main(String[] args) {
        ParkingTicket t = new ParkingTicket("Honda","Civic","Green","649-F95",260);
        if(t.getMinutes()>=60)
            System.out.println(t);
        else
            System.out.println("No tickets assigned.");
    }

}
