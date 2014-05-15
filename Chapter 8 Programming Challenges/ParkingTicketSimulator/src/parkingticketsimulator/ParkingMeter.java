package parkingticketsimulator;

class ParkingMeter {
    private ParkedCar c;
    public ParkingMeter(ParkedCar car){
        c = new ParkedCar(car);
    }
    public int getMinutes(){
        return c.getMinutes();
    }
}
