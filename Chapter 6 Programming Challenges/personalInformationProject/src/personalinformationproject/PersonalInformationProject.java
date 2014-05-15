package personalinformationproject;

public class PersonalInformationProject {

    public static void main(String[] args) {
        String p1Name, p2Name, p3Name, p1Add, p2Add, p3Add, p1Phone, p2Phone, p3Phone;
        int p1Age, p2Age, p3Age;
        Data person1 = new Data("Matt","656 Orange St.","(203)123-4567",18);
        Data person2 = new Data("Sally","84 Red Ave.","(203)643-1564",25);
        Data person3 = new Data("Jim","256 Main St.","(203)854-8644",22);
        
        p1Name = person1.getName();
        p1Add = person1.getAddress();
        p1Phone = person1.getPhone();
        p1Age = person1.getAge();
        
        p2Name = person2.getName();
        p2Add = person2.getAddress();
        p2Phone = person2.getPhone();
        p2Age = person2.getAge();
        
        p3Name = person3.getName();
        p3Add = person3.getAddress();
        p3Phone = person3.getPhone();
        p3Age = person3.getAge();
        
        System.out.println("Name\t\tAddress\t\tPhone\t\tAge");
        System.out.println("----------------------------------------------------");
        
        System.out.println(p1Name+"\t\t"+p1Add+"\t"+p1Phone+"\t"+p1Age);
        System.out.println(p2Name+"\t\t"+p2Add+"\t"+p2Phone+"\t"+p2Age);
        System.out.println(p3Name+"\t\t"+p3Add+"\t"+p3Phone+"\t"+p3Age);
        
        
    }

}
