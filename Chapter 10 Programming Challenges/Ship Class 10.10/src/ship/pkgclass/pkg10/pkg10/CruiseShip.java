package ship.pkgclass.pkg10.pkg10;

public class CruiseShip extends Ship{
    private int maxPass;
    public CruiseShip(String n, int m){
        setName(n);
        maxPass = m;
    }
    public CruiseShip(){
    }
    public void setMaxPass(int m){
        maxPass = m;
    }
    public int getMaxPass(){
        return maxPass;
    }
    public String toString(){
        String str = "Ship name: "+getName()+"\nMax. passangers: "+maxPass;
        return str;
    }
}
