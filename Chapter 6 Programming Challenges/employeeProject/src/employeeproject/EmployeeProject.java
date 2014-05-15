package employeeproject;

public class EmployeeProject {

    public static void main(String[] args) {
        String e1Name, e2Name, e3Name, e1Dept, e2Dept, e3Dept, e1Pos, e2Pos, e3Pos;
        int e1id, e2id, e3id;
        Employee e1 = new Employee("Susan Meyers","Accounting","Vice President",47899);
        Employee e2 = new Employee("Mark Jones","IT","Programmer",39119);
        Employee e3 = new Employee("Joy Rogers","Manufacturing","Engineer",81774);
        
        e1Name=e1.getName();
        e2Name=e2.getName();
        e3Name=e3.getName();
        
        e1Dept=e1.getDepartment();
        e2Dept=e2.getDepartment();
        e3Dept=e3.getDepartment();
        
        e1Pos=e1.getPosition();
        e2Pos=e2.getPosition();
        e3Pos=e3.getPosition();
        
        e1id=e1.getIdNumber();
        e2id=e2.getIdNumber();
        e3id=e3.getIdNumber();
        
        System.out.println("Name\t\tID Number\tDepartment\tPosition");
        System.out.println("---------------------------------------------------------------");
        System.out.println(e1Name+"\t"+e1id+"\t\t"+e1Dept+"\t"+e1Pos);
        System.out.println(e2Name+"\t"+e2id+"\t\t"+e2Dept+"\t\t"+e2Pos);
        System.out.println(e3Name+"\t"+e3id+"\t\t"+e3Dept+"\t"+e3Pos);
        
    }

}
