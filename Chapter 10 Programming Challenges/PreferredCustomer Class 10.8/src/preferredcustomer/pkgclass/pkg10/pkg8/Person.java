package preferredcustomer.pkgclass.pkg10.pkg8;

class Person {
    private String name, address, phone;
    public Person(){
    }
    public Person(String n, String a, String p){
        name = n;
        address = a;
        phone = p;
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
    public String getName(){
        return name;
    }
    public String getAddress(){
        return address;
    }
    public String getPhone(){
        return phone;
    }
}
