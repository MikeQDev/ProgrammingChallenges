package ship.pkgclass.pkg10.pkg10;

public class ShipClass1010 {

    public static void main(String[] args) {
        Ship[] s = new Ship[2];
        
        s[0] = new CruiseShip("Cruiser",1250);
        s[1] = new CargoShip("Cargo",3000);
        
        for(Ship c : s){
            System.out.println(c);
        }
    }
}
