package ship.pkgclass.pkg10.pkg10;

class CargoShip extends Ship{
    private int capacity;
    public CargoShip(String n, int c){
        setName(n);
        capacity = c;
    }
    public CargoShip(){
    }
    public void setCapacity(int c){
        capacity = c;
    }
    public int getCapacity(){
        return capacity;
    }
    public String toString(){
        String str="Name: "+getName()+"\nWeight capacity: "+capacity;
        return str;
    }
}
