package telemarketer.list;

import javax.swing.JOptionPane;

public class TelemarketerList {

    public static void main(String[] args) {
        String[] names = {"Harrison, Rose","James, Jean", "Smith, William", "Smith, Brad"};
        String[] phone = {"555-2234","555-9098","555-1785","555-9224"};
        String input = JOptionPane.showInputDialog("Enter the beginning or the last name of a person"
                + " to search for.");
        for(int i=0; i<names.length; i++){
            if(names[i].toLowerCase().startsWith(input.toLowerCase())){
                System.out.println(names[i]+": "+phone[i]);
            }
        }
        System.exit(0);
    }

}
