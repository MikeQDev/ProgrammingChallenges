package excption.project;

class Employee {
    private String eName, eNum, hireDate;
    public void setName(String n){
        eName = n;
    }
    public void setNumber(String n) throws InvalidEmployeeNumber{
        if(n.length()!=5){
            throw new InvalidEmployeeNumber();
        }
        char[] numArray = n.toCharArray();
        if(!Character.isAlphabetic(numArray[4])){
            throw new InvalidEmployeeNumber();
        }
        if(numArray[3]!='-'){
            throw new InvalidEmployeeNumber();
        }
        for(int i=0; i<3; i++){
            if(!Character.isDigit(numArray[i])){
                throw new InvalidEmployeeNumber();
            }
        }
        eNum = n;
    }
    public void setHireDate(String d){
        if(d.length() != 10){
            System.out.println("Invalid hiring date. Exiting program..");
            System.exit(0);
        }
        if(d.charAt(2)!='/'){
            System.out.println("Invalid hiring date. Exiting program..");
            System.exit(0);            
        }
        if(d.charAt(5)!='/'){
            System.out.println("Invalid hiring date. Exiting program..");
            System.exit(0);
        }
        for(int i=0; i<2; i++){
            if(!Character.isDigit(d.charAt(i))){
                System.out.println("Invalid hiring date. Exiting program..");
                System.exit(0);
            }
        }
        for(int i=3; i<5; i++){
            if(!Character.isDigit(d.charAt(i))){
                System.out.println("Invalid hiring date. Exiting program..");
                System.exit(0);
            }
        }
        for(int i=6; i<d.length(); i++){
            if(!Character.isDigit(d.charAt(i))){
                System.out.println("Invalid hiring date. Exiting program..");
                System.exit(0);
            }
        }
        
        hireDate = d;
    }
    public String getName(){
        return eName;
    }
    public String getNumber(){
        return eNum;
    }
    public String getHireDate(){
        return hireDate;
    }
}
