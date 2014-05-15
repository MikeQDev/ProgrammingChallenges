package ismembermethod;

import java.util.*;

public class IsMemberMethod {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char again;
        int[] numbers = {1,4,6,8,14,16,17,19,24,29,32,33,38,42,49,52};
        readNumbers(numbers);
        do{
            System.out.print("Enter number to search for: ");
            int searchVal = Integer.parseInt(s.nextLine());
            
            if(isMember(numbers, searchVal, 0, numbers.length))
                System.out.println(searchVal+" is a member.");
            else
                System.out.println(searchVal+" is not a member.");
            
            System.out.print("Search another number? (Y/N): ");
            again = Character.toUpperCase(s.nextLine().charAt(0));
        }while(again=='Y');
    }
    public static boolean isMember(int[] array, int search, int first, int last){
        if(first>last)
            return false;
        int middle = (first+last)/2;
        if(array[middle]==search)
            return true;
        else if(array[middle]>search)
            return isMember(array, search, first, middle-1);
        else
            return isMember(array, search, middle+1, last);
    }
    public static void readNumbers(int[] array){
        System.out.print("Numbers: ");
        for(int i:array)
            System.out.print(i+" ");
        System.out.println();
    }
}
