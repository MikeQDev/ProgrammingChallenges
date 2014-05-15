package maxelementmethod;

public class MaxElementMethod {

    public static void main(String[] args) {
        int[] numbers = {1, 9, 11, 10, 4, 7, 6, 9, 2};
        System.out.println("Largest value: "+maxElement(numbers, 0, numbers[0]));
    }
    public static int maxElement(int[] array, int pos, int curHigh){
        if(pos<array.length){
            if(array[pos]>curHigh)
                curHigh = array[pos];
        return maxElement(array, pos+1, curHigh);
        }else{
            return curHigh;
        }
        
    }
}
