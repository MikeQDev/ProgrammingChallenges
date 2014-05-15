package ship.pkgclass.pkg10.pkg10;

public class Ship {
    private String name, year;
    public Ship(){
    }
    public Ship(String n, String y){
        name = n;
        year = y;
    }
    public void setName(String n){
        name = n;
    }
    public void setYear(String y){
        year = y;
    }
    public String getName(){
        return name;
    }
    public String getYear(){
        return year;
    }
    public String toString(){
        String str = "Ship name: "+name+"\nYear built: "+year;
        return str;
    }
}
