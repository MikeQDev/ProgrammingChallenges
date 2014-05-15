package personalinformationproject;

class Data {
    private String name, address, phone;
    private int age;
    
    public Data(String n, String a, String p, int ag){
        name = n;
        address = a;
        phone = p;
        age = ag;
    }
    
    public Data(){
        name="";
        address="";
        phone="";
        age=0;
    }
    
    public void setName(String n){
        name = n;
    }
    public void setAddress(String a){
        address = a;
    }
    public void setPhone(String p){
        phone = p;
    }
    public void setAge(int a){
        age = a;
    }
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getPhone(){
        return phone;
    }
    public int getAge(){
        return age;
    }
}