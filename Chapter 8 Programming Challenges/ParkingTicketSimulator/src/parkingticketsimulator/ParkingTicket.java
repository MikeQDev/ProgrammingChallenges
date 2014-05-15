package parkingticketsimulator;

import java.text.DecimalFormat;

class ParkingTicket {
    private ParkedCar c;
    private PoliceOfficer o;
    private ParkingMeter m;
    private double fine=0;
    private int minutes;
    public ParkingTicket(String ma, String mo, String co, String l, int mi){
        c = new ParkedCar(ma, mo, co, l, mi);
        o = new PoliceOfficer("John Smith","304FE");
        m = new ParkingMeter(c);
        minutes = mi;
        fine = 25+(((m.getMinutes()/60)-1)*10);
    }
    public String toString(){
        DecimalFormat d = new DecimalFormat("$#,###,##0.00");
        String str;
        str = "Make: "+c.getMake()+"\nModel: "+c.getModel()+"\nColor: "+c.getColor()+"\nLicense Number: "+c.getLicenseNum()+
                "\nFine: "+d.format(fine)+"\nOfficer Name: "+o.getName()+" (Badge #"+o.getBadge()+")";
        return str;
    }
    public int getMinutes(){
        return minutes;
    }
}
