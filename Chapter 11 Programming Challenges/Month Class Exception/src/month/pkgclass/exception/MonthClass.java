package month.pkgclass.exception;

import javax.swing.JOptionPane;

public class MonthClass {

    public static void main(String[] args) throws Exception{
        
        try{
            String input = JOptionPane.showInputDialog("Enter a month number");
            Month m = new Month(Integer.parseInt(input));
            System.out.println("Month: "+m.getMonthName());
        }catch(InvalidMonth e){
            System.out.println(e.getMessage());
        }
            System.exit(0);
    }
}
