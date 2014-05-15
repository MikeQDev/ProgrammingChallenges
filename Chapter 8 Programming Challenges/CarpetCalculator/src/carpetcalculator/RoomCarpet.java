package carpetcalculator;

import java.text.DecimalFormat;

class RoomCarpet {
    private RoomDimension r;
    private double cost, totalCost;
    public RoomCarpet(RoomDimension room, double c){
        cost = c;
        RoomDimension r = new RoomDimension(room);
        totalCost = cost * r.getArea();
    }
    public String toString(){
        DecimalFormat d = new DecimalFormat("$#,###,###,##0.00");
        String str = "The total cost of the carpet is "+d.format(totalCost);
        return str;
    }
}
