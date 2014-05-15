package parkingticketsimulator;

class ParkedCar {
    private String make, model, color, licenseNum, name, badge;
    private int mins;
    public ParkedCar(){
    }
    public ParkedCar(String ma, String mo, String co, String l, int mi){
        make=ma;
        model=mo;
        color=co;
        licenseNum=l;
        mins=mi;
    }
    public void setMake(String m){
        make=m;
    }
    public void setModel(String m){
        model=m;
    }
    public void setColor(String c){
        color=c;
    }
    public void setLicenseNum(String l){
        licenseNum=l;
    }
    public void setMinutes(int m){
        mins=m;
    }
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public String getLicenseNum(){
        return licenseNum;
    }
    public int getMinutes(){
        return mins;
    }
    public int getHours(){
        return mins/60;
    }
    public String toString(){
        String str;
        str = "Make: "+make+"\nModel: "+model+"\nColor: "+color+"\nLicense Plate: "+licenseNum+"\nMinutes parked: "+mins;
        return str;
    }
    public ParkedCar(ParkedCar object2){
        make=object2.make;
        model=object2.model;
        color=object2.color;
        licenseNum=object2.licenseNum;
        mins=object2.mins;
    }
}
