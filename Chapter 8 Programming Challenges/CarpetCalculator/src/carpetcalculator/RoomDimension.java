package carpetcalculator;

class RoomDimension {
    private double length, width;
    public RoomDimension(double l, double w) {
        length = l;
        width = w;
    }
    public double getArea(){
        return length*width;
    }
    public RoomDimension(RoomDimension object2){
        length = object2.length;
        width = object2.width;
    }

}
