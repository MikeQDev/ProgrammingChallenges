package carproject;

class Car {
    private int yearModel, speed;
    private String make;
    public Car(int y, String m){
        yearModel = y;
        make = m;
        speed = 0;
    }
    public String getMake(){
        return make;
    }
    public int getYearModel(){
        return yearModel;
    }
    public int getSpeed(){
        return speed;
    }
    public void accelerate(){
        speed+=5;
    }
    public void brake(){
        speed-=5;
    }
}
