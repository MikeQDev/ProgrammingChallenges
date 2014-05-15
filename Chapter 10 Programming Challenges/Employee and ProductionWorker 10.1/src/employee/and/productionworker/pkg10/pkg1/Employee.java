package employee.and.productionworker.pkg10.pkg1;

class Employee {
    private String eName, eNum, hireDate;
    public void setName(String n){
        eName = n;
    }
    public void setNumber(String n){
        if(n.length()!=5){
            System.out.println("Invalid employee number. Exiting program..");
            System.exit(0);
        }
        char[] numArray = n.toCharArray();
        if(!Character.isAlphabetic(numArray[4])){
            System.out.println("Invalid employee number. Exiting program..");
            System.exit(0);
        }
        if(numArray[3]!='-'){
            System.out.println("Invalid employee number. Exiting program..");
            System.exit(0);
        }
        for(int i=0; i<3; i++){
            if(!Character.isDigit(numArray[i])){
            System.out.println("Invalid employee number. Exiting program..");
            System.exit(0);
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
