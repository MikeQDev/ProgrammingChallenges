package nameandinitials;

public class NameAndInitials {
    public static void main(String[] args) {
        String firstName="Michael",middleName="something",lastName="something";
        char firstInitial=firstName.charAt(0),middleInitial=middleName.charAt(0),lastInitial=lastName.charAt(0);
        
        System.out.println("Your full name is "+firstName+" "+middleName
                +" "+lastName+"\nYour initials are "+firstInitial+middleInitial+lastInitial+".");
    }
}
