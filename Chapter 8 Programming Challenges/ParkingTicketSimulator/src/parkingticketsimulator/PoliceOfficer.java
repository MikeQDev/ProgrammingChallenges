package parkingticketsimulator;

class PoliceOfficer {
    private String name, badge;
    public PoliceOfficer(String n, String b){
        name = n;
        badge = b;
    }
    public PoliceOfficer(PoliceOfficer obj2){
        name = obj2.name;
        badge = obj2.badge;
    }
    public String getName(){
        return name;
    }
    public String getBadge(){
        return badge;
    }
}
