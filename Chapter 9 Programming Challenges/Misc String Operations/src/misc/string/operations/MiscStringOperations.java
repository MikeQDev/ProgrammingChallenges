package misc.string.operations;

public class MiscStringOperations {

    public static void main(String[] args) {
        String str = "the dog jumped over the fence";
        char[] array = {'a','b','e','r','t','p'};
        System.out.println("String: "+str);
        System.out.println("Word count: "+StringOperations.WordCount(str));
        System.out.println("Replace 'the' with 'that': "+StringOperations.replaceSubstring(str, "the", "that"));
        System.out.println("List of chars: ");
        for(char a : array)
            System.out.print(a+", ");
        System.out.println("\nArray to string: "+StringOperations.arrayToString(array));
    }
}
