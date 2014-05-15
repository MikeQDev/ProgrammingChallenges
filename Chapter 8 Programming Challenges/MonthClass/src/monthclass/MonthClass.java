package monthclass;

public class MonthClass {

    public static void main(String[] args) {
        Month m = new Month(5);
        Month b = new Month("FEBRUARY");
        
        System.out.println(m.getMonthName()+" = Month "+m.getMonthNumber());
        System.out.println(b.getMonthName()+" = Month "+b.getMonthNumber());
        
        if(m.lessThan(b)){
            System.out.println(m.getMonthName()+" is less than "+b.getMonthName());
        }else{
            System.out.println(b.getMonthName()+" is less than "+m.getMonthName());
        }
        
    }

}
