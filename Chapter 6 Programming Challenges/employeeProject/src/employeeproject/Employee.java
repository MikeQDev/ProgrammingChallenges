package employeeproject;

class Employee {
    private String name, department, position;
    private int idNumber;
    
    public Employee(String n, String d, String p, int i){
        name = n;
        department = d;
        position = p;
        idNumber = i;
    }
    public Employee(String n, int i){
        name = n;
        idNumber = i;
        department = "";
        position = "";
    }
    public Employee(){
        name = "";
        department = "";
        position = "";
        idNumber = 0;
    }
    public void setName(String n){
        name = n;
    }
    public void setDepartment(String d){
        department = d;
    }
    public void setPosition(String p){
        position = p;
    }
    public void setIdNumber(int i){
        idNumber = i;
    }
    public String getName(){
        return name;
    }
    public String getDepartment(){
        return department;
    }
    public String getPosition(){
        return position;
    }
    public int getIdNumber(){
        return idNumber;
    }
}

