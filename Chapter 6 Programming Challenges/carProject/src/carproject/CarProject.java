package carproject;

public class CarProject {

    public static void main(String[] args) {
        Car myCar = new Car(1998, "Civic");
        int carSpeed, times=5;
        
        System.out.println("Accelerating "+times+" times..");
        
        for(int x=1; x<=times; x++){
            myCar.accelerate();
        }
        carSpeed = myCar.getSpeed();        
        System.out.println("Current speed: "+carSpeed); 
        
        System.out.println("Braking "+times+" times..");
        
        for(int x=1; x<=times; x++){
            myCar.brake();
        }
        carSpeed = myCar.getSpeed();
        System.out.println("Current speed: "+carSpeed);
    }

}
